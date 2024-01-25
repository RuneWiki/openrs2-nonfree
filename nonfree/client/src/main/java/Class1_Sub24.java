import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	public int anInt3664;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	public int anInt3665;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
	public int anInt3666;

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
	public int anInt3667;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	public int anInt3668;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
	public int anInt3669;

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
	public int anInt3670;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
	public int anInt3672;

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
	public int anInt3673;

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
	public int anInt3674;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
	public int anInt3675;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
	public int anInt3677;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
	public int anInt3678;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
	public int anInt3679;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	public Class8 method2870(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(8) int local8 = Static17.anIntArray311[this.anInt3676];
		if (local8 == 0) {
			@Pc(125) Class11_Sub3 local125 = Static464.method5366(this.anInt3669, this.anInt3666, this.anInt3677);
			if (local125 instanceof Class11_Sub3_Sub1) {
				@Pc(131) Class11_Sub3_Sub1 local131 = (Class11_Sub3_Sub1) local125;
				if (local131.aClass11_Sub3_1 != null) {
					return ((Interface7) local131.aClass11_Sub3_1).method4901(arg1, arg0);
				}
			}
		} else if (local8 == 1) {
			@Pc(30) Class11_Sub4 local30 = Static282.method3773(this.anInt3669, this.anInt3666, this.anInt3677);
			if (local30 instanceof Class11_Sub4_Sub3) {
				@Pc(36) Class11_Sub4_Sub3 local36 = (Class11_Sub4_Sub3) local30;
				if (local36.aClass11_Sub4_3 != null) {
					return ((Interface7) local36.aClass11_Sub4_3).method4901(arg1, arg0);
				}
			}
		} else if (local8 == 2) {
			@Pc(100) Class11_Sub1 local100 = Static423.method5398(this.anInt3669, this.anInt3666, this.anInt3677, nc.class);
			if (local100 instanceof Class11_Sub1_Sub1) {
				@Pc(106) Class11_Sub1_Sub1 local106 = (Class11_Sub1_Sub1) local100;
				if (local106.aClass11_Sub1_1 != null) {
					return ((Interface7) local106.aClass11_Sub1_1).method4901(arg1, arg0);
				}
			}
		} else if (local8 == 3) {
			@Pc(67) Class11_Sub2 local67 = Static168.method2856(this.anInt3669, this.anInt3666, this.anInt3677);
			if (local67 instanceof Class11_Sub2_Sub1) {
				@Pc(73) Class11_Sub2_Sub1 local73 = (Class11_Sub2_Sub1) local67;
				if (local73.aClass11_Sub2_1 != null) {
					return ((Interface7) local73.aClass11_Sub2_1).method4901(arg1, arg0);
				}
			}
		}
		return null;
	}
}
