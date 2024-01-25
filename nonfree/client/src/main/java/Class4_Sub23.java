import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
	public int anInt3188;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public int anInt3189;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public int anInt3190;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public int anInt3191;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	public int anInt3192;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
	public int anInt3193;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
	public int anInt3194;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
	public int anInt3195;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
	public int anInt3196;

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
	public int anInt3198;

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
	public int anInt3199;

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
	public int anInt3200;

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
	public int anInt3202;

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
	public int anInt3203;

	@OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
	public int anInt3204;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	public Class110 method2719(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static201.anIntArray410[this.anInt3195];
		if (local8 == 0) {
			@Pc(112) Class16_Sub5 local112 = Static227.method3449(this.anInt3196, this.anInt3189, this.anInt3193);
			if (local112 instanceof Class16_Sub5_Sub1) {
				@Pc(118) Class16_Sub5_Sub1 local118 = (Class16_Sub5_Sub1) local112;
				if (local118.aClass16_Sub5_1 != null) {
					return ((Interface6) local118.aClass16_Sub5_1).method5352(arg0, arg1);
				}
			}
		} else if (local8 == 1) {
			@Pc(87) Class16_Sub2 local87 = Static54.method918(this.anInt3196, this.anInt3189, this.anInt3193);
			if (local87 instanceof Class16_Sub2_Sub2) {
				@Pc(93) Class16_Sub2_Sub2 local93 = (Class16_Sub2_Sub2) local87;
				if (local93.aClass16_Sub2_1 != null) {
					return ((Interface6) local93.aClass16_Sub2_1).method5352(arg0, arg1);
				}
			}
		} else if (local8 == 2) {
			@Pc(32) Class16_Sub1 local32 = Static36.method648(this.anInt3196, this.anInt3189, this.anInt3193, f.class);
			if (local32 instanceof Class16_Sub1_Sub1) {
				@Pc(38) Class16_Sub1_Sub1 local38 = (Class16_Sub1_Sub1) local32;
				if (local38.aClass16_Sub1_2 != null) {
					return ((Interface6) local38.aClass16_Sub1_2).method5352(arg0, arg1);
				}
			}
		} else if (local8 == 3) {
			@Pc(62) Class16_Sub4 local62 = Static117.method2096(this.anInt3196, this.anInt3189, this.anInt3193);
			if (local62 instanceof Class16_Sub4_Sub1) {
				@Pc(68) Class16_Sub4_Sub1 local68 = (Class16_Sub4_Sub1) local62;
				if (local68.aClass16_Sub4_1 != null) {
					return ((Interface6) local68.aClass16_Sub4_1).method5352(arg0, arg1);
				}
			}
		}
		return null;
	}
}
