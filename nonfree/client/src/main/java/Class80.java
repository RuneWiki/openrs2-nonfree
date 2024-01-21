import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class80 {

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	private int anInt3759 = -1;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	private int anInt3762 = 0;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!th;")
	private Class82 aClass82_16 = new Class82();

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Z")
	public boolean aBoolean288 = false;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	private final int anInt3757;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "[Lclient!oc;")
	private Class1_Sub16[] aClass1_Sub16Array1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	private final int anInt3756;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(III)V")
	public Class80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3757 = arg1;
		this.aClass1_Sub16Array1 = new Class1_Sub16[arg1];
		this.anInt3756 = arg0;
		this.anIntArrayArray36 = new int[arg0][arg2];
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public void method2739() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3756; local13++) {
			this.anIntArrayArray36[local13] = null;
		}
		this.aClass1_Sub16Array1 = null;
		this.anIntArrayArray36 = null;
		this.aClass82_16.method2847();
		this.aClass82_16 = null;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)[[I")
	public int[][] method2740() {
		if (this.anInt3756 != this.anInt3757) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3756; local21++) {
			this.aClass1_Sub16Array1[local21] = Static68.aClass1_Sub16_1;
		}
		return this.anIntArrayArray36;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)[I")
	public int[] method2742(@OriginalArg(1) int arg0) {
		if (this.anInt3757 == this.anInt3756) {
			this.aBoolean288 = this.aClass1_Sub16Array1[arg0] == null;
			this.aClass1_Sub16Array1[arg0] = Static68.aClass1_Sub16_1;
			return this.anIntArrayArray36[arg0];
		} else if (this.anInt3756 == 1) {
			this.aBoolean288 = arg0 != this.anInt3759;
			this.anInt3759 = arg0;
			return this.anIntArrayArray36[0];
		} else {
			@Pc(41) Class1_Sub16 local41 = this.aClass1_Sub16Array1[arg0];
			if (this.aBoolean288 = local41 == null) {
				if (this.anInt3762 >= this.anInt3756) {
					@Pc(65) Class1_Sub16 local65 = (Class1_Sub16) this.aClass82_16.method2858();
					local41 = new Class1_Sub16(arg0, local65.anInt3237);
					this.aClass1_Sub16Array1[local65.anInt3232] = null;
					local65.method3056();
				} else {
					local41 = new Class1_Sub16(arg0, this.anInt3762);
					this.anInt3762++;
				}
				this.aClass1_Sub16Array1[arg0] = local41;
			}
			this.aClass82_16.method2856(local41);
			return this.anIntArrayArray36[local41.anInt3237];
		}
	}
}
