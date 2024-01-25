import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class152 {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	private int anInt3924 = 0;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	private int anInt3923 = -1;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!gca;")
	private Class111 aClass111_19 = new Class111();

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Z")
	public boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
	private final int anInt3926;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	private final int anInt3921;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[Lclient!eca;")
	private Class1_Sub19[] aClass1_Sub19Array1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
	public Class152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3926 = arg1;
		this.anInt3921 = arg0;
		this.anIntArrayArray16 = new int[this.anInt3921][arg2];
		this.aClass1_Sub19Array1 = new Class1_Sub19[this.anInt3926];
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public void method3213() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3921; local13++) {
			this.anIntArrayArray16[local13] = null;
		}
		this.anIntArrayArray16 = null;
		this.aClass1_Sub19Array1 = null;
		this.aClass111_19.method2555();
		this.aClass111_19 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)[[I")
	public int[][] method3215() {
		if (this.anInt3921 != this.anInt3926) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3921; local21++) {
			this.aClass1_Sub19Array1[local21] = Static399.aClass1_Sub19_1;
		}
		return this.anIntArrayArray16;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)[I")
	public int[] method3216(@OriginalArg(0) int arg0) {
		if (this.anInt3926 == this.anInt3921) {
			this.aBoolean282 = this.aClass1_Sub19Array1[arg0] == null;
			this.aClass1_Sub19Array1[arg0] = Static399.aClass1_Sub19_1;
			return this.anIntArrayArray16[arg0];
		} else if (this.anInt3921 == 1) {
			this.aBoolean282 = arg0 != this.anInt3923;
			this.anInt3923 = arg0;
			return this.anIntArrayArray16[0];
		} else {
			@Pc(68) Class1_Sub19 local68 = this.aClass1_Sub19Array1[arg0];
			if (local68 == null) {
				this.aBoolean282 = true;
				if (this.anInt3924 < this.anInt3921) {
					local68 = new Class1_Sub19(arg0, this.anInt3924);
					this.anInt3924++;
				} else {
					@Pc(99) Class1_Sub19 local99 = (Class1_Sub19) this.aClass111_19.method2544();
					local68 = new Class1_Sub19(arg0, local99.anInt1822);
					this.aClass1_Sub19Array1[local99.anInt1823] = null;
					local99.method7908();
				}
				this.aClass1_Sub19Array1[arg0] = local68;
			} else {
				this.aBoolean282 = false;
			}
			this.aClass111_19.method2549(local68);
			return this.anIntArrayArray16[local68.anInt1822];
		}
	}
}
