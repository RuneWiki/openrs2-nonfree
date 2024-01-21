import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	private int anInt9 = -1;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	private int anInt7 = 0;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!bd;")
	private Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Z")
	public boolean aBoolean2 = false;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private final int anInt10;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "[Lclient!sh;")
	private Class3_Sub23[] aClass3_Sub23Array1;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	private final int anInt11;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10 = arg1;
		this.aClass3_Sub23Array1 = new Class3_Sub23[this.anInt10];
		this.anInt11 = arg0;
		this.anIntArrayArray1 = new int[this.anInt11][arg2];
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public void method7() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt11; local3++) {
			this.anIntArrayArray1[local3] = null;
		}
		this.anIntArrayArray1 = null;
		this.aClass3_Sub23Array1 = null;
		this.aClass10_1.method262();
		this.aClass10_1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[I")
	public int[] method9(@OriginalArg(1) int arg0) {
		if (this.anInt10 == this.anInt11) {
			this.aBoolean2 = this.aClass3_Sub23Array1[arg0] == null;
			this.aClass3_Sub23Array1[arg0] = Static110.aClass3_Sub23_1;
			return this.anIntArrayArray1[arg0];
		} else if (this.anInt11 == 1) {
			this.aBoolean2 = this.anInt9 != arg0;
			this.anInt9 = arg0;
			return this.anIntArrayArray1[0];
		} else {
			@Pc(65) Class3_Sub23 local65 = this.aClass3_Sub23Array1[arg0];
			if (local65 == null) {
				this.aBoolean2 = true;
				if (this.anInt11 > this.anInt7) {
					local65 = new Class3_Sub23(arg0, this.anInt7);
					this.anInt7++;
				} else {
					@Pc(100) Class3_Sub23 local100 = (Class3_Sub23) this.aClass10_1.method257();
					local65 = new Class3_Sub23(arg0, local100.anInt3621);
					this.aClass3_Sub23Array1[local100.anInt3619] = null;
					local100.method3320();
				}
				this.aClass3_Sub23Array1[arg0] = local65;
			} else {
				this.aBoolean2 = false;
			}
			this.aClass10_1.method265(local65);
			return this.anIntArrayArray1[local65.anInt3621];
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)[[I")
	public int[][] method11() {
		if (this.anInt11 != this.anInt10) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt11; local28++) {
			this.aClass3_Sub23Array1[local28] = Static110.aClass3_Sub23_1;
		}
		return this.anIntArrayArray1;
	}
}
