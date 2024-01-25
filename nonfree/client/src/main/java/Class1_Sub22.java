import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public int anInt3791;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!p;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
	public int anInt3792;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	public int anInt3793;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "Lclient!vq;")
	public Class1_Sub19_Sub4 aClass1_Sub19_Sub4_3;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Lclient!ch;")
	public Class30_Sub1_Sub1_Sub2 aClass30_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
	public int anInt3794;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
	public int anInt3795;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public int anInt3796;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Lclient!bl;")
	public Class30_Sub1_Sub1_Sub1 aClass30_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
	public int anInt3797;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "Lclient!vq;")
	public Class1_Sub19_Sub4 aClass1_Sub19_Sub4_4;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	public int anInt3800;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
	public int anInt3803;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
	public int anInt3801 = 0;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method2938() {
		@Pc(9) int local9 = this.anInt3798;
		if (this.aClass192_1 != null) {
			@Pc(18) Class192 local18 = this.aClass192_1.method4369(Static366.aClass190_1);
			if (local18 == null) {
				this.anIntArray367 = null;
				this.anInt3791 = 0;
				this.anInt3795 = 0;
				this.anInt3798 = -1;
				this.anInt3792 = 0;
				this.anInt3797 = 0;
			} else {
				this.anIntArray367 = local18.anIntArray536;
				this.anInt3791 = local18.anInt5669;
				this.anInt3795 = local18.anInt5670 << 7;
				this.anInt3798 = local18.anInt5685;
				this.anInt3792 = local18.anInt5682;
				this.anInt3797 = local18.anInt5674;
			}
		} else if (this.aClass30_Sub1_Sub1_Sub1_1 != null) {
			@Pc(74) int local74 = Static145.method2320(this.aClass30_Sub1_Sub1_Sub1_1);
			if (local9 != local74) {
				this.anInt3798 = local74;
				@Pc(84) Class11 local84 = this.aClass30_Sub1_Sub1_Sub1_1.aClass11_1;
				if (local84.anIntArray12 != null) {
					local84 = local84.method136(Static366.aClass190_1);
				}
				if (local84 == null) {
					this.anInt3797 = this.anInt3795 = 0;
				} else {
					this.anInt3797 = local84.anInt161;
					this.anInt3795 = local84.anInt179 << 7;
				}
			}
		} else if (this.aClass30_Sub1_Sub1_Sub2_1 != null) {
			this.anInt3798 = Static458.method6182(this.aClass30_Sub1_Sub1_Sub2_1);
			this.anInt3795 = this.aClass30_Sub1_Sub1_Sub2_1.anInt1329 << 7;
			this.anInt3797 = this.aClass30_Sub1_Sub1_Sub2_1.anInt1324;
		}
		if (this.anInt3798 != local9 && this.aClass1_Sub19_Sub4_3 != null) {
			Static12.aClass1_Sub19_Sub2_1.method3181(this.aClass1_Sub19_Sub4_3);
			this.aClass1_Sub19_Sub4_3 = null;
		}
	}
}
