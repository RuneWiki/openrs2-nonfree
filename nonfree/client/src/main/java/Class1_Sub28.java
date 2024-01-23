import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!od;")
	public Class11_Sub4_Sub2 aClass11_Sub4_Sub2_1;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public int anInt4418;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public int anInt4419;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public int anInt4420;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int anInt4421;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "[I")
	public int[] anIntArray495;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public int anInt4424;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	public int anInt4425;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	public int anInt4427;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	public int anInt4428;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Lclient!cn;")
	public Class1_Sub7_Sub1 aClass1_Sub7_Sub1_2;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Lclient!kl;")
	public Class11_Sub4_Sub1 aClass11_Sub4_Sub1_2;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "Lclient!cn;")
	public Class1_Sub7_Sub1 aClass1_Sub7_Sub1_3;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!s;")
	public Class150 aClass150_1;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	public int anInt4430;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	public int anInt4431;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Z")
	public boolean aBoolean401;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	public int anInt4436;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	public int anInt4429 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public void method3798() {
		@Pc(8) int local8 = this.anInt4420;
		if (this.aClass150_1 != null) {
			@Pc(91) Class150 local91 = this.aClass150_1.method3884();
			if (local91 == null) {
				this.anIntArray495 = null;
				this.anInt4420 = -1;
				this.anInt4436 = 0;
				this.anInt4421 = 0;
				this.anInt4428 = 0;
				this.anInt4427 = 0;
			} else {
				this.anInt4428 = local91.anInt4555;
				this.anInt4421 = local91.anInt4572;
				this.anInt4427 = local91.anInt4547 * 128;
				this.anInt4436 = local91.anInt4545;
				this.anIntArray495 = local91.anIntArray506;
				this.anInt4420 = local91.anInt4561;
			}
		} else if (this.aClass11_Sub4_Sub2_1 != null) {
			@Pc(23) int local23 = Static294.method945(this.aClass11_Sub4_Sub2_1);
			if (local8 != local23) {
				this.anInt4420 = local23;
				@Pc(33) Class183 local33 = this.aClass11_Sub4_Sub2_1.aClass183_1;
				if (local33.anIntArray596 != null) {
					local33 = local33.method4526();
				}
				if (local33 == null) {
					this.anInt4421 = this.anInt4427 = 0;
				} else {
					this.anInt4427 = local33.anInt5418 * 128;
					this.anInt4421 = local33.anInt5420;
				}
			}
		} else if (this.aClass11_Sub4_Sub1_2 != null) {
			this.anInt4420 = Static107.method2017(this.aClass11_Sub4_Sub1_2);
			this.anInt4421 = this.aClass11_Sub4_Sub1_2.anInt3011;
			this.anInt4427 = this.aClass11_Sub4_Sub1_2.anInt3005 * 128;
		}
		if (this.anInt4420 != local8 && this.aClass1_Sub7_Sub1_2 != null) {
			Static173.aClass1_Sub7_Sub3_1.method3613(this.aClass1_Sub7_Sub1_2);
			this.aClass1_Sub7_Sub1_2 = null;
		}
	}
}
