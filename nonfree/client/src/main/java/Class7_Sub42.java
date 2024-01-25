import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class7_Sub42 extends Class7 {

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	public int anInt6161;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	public int anInt6162;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	public int anInt6163;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	public int anInt6164;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	public int anInt6165;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	public int anInt6166;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	public int anInt6167;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "I")
	public int anInt6168;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "I")
	public int anInt6169;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "I")
	public int anInt6170;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	public int anInt6171;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	public int anInt6172;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	public int anInt6176;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ya;IB)Lclient!t;")
	public Class163 method4917(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = Static150.anIntArray251[this.anInt6168];
		if (local16 == 0) {
			@Pc(125) Class26_Sub3 local125 = Static184.method2673(this.anInt6161, this.anInt6163, this.anInt6167);
			if (local125 instanceof Class26_Sub3_Sub3) {
				@Pc(131) Class26_Sub3_Sub3 local131 = (Class26_Sub3_Sub3) local125;
				if (local131.aClass26_Sub3_3 != null) {
					return ((Interface5) local131.aClass26_Sub3_3).method5727(arg1, arg0);
				}
			}
		} else if (local16 == 1) {
			@Pc(100) Class26_Sub1 local100 = Static178.method2592(this.anInt6161, this.anInt6163, this.anInt6167);
			if (local100 instanceof Class26_Sub1_Sub3) {
				@Pc(106) Class26_Sub1_Sub3 local106 = (Class26_Sub1_Sub3) local100;
				if (local106.aClass26_Sub1_3 != null) {
					return ((Interface5) local106.aClass26_Sub1_3).method5727(arg1, arg0);
				}
			}
		} else if (local16 == 2) {
			@Pc(47) Class26_Sub2 local47 = Static14.method152(this.anInt6161, this.anInt6163, this.anInt6167, gf.class);
			if (local47 instanceof Class26_Sub2_Sub5) {
				@Pc(53) Class26_Sub2_Sub5 local53 = (Class26_Sub2_Sub5) local47;
				if (local53.aClass26_Sub2_1 != null) {
					return ((Interface5) local53.aClass26_Sub2_1).method5727(arg1, arg0);
				}
			}
		} else if (local16 == 3) {
			@Pc(75) Class26_Sub4 local75 = Static339.method4422(this.anInt6161, this.anInt6163, this.anInt6167);
			if (local75 instanceof Class26_Sub4_Sub2) {
				@Pc(81) Class26_Sub4_Sub2 local81 = (Class26_Sub4_Sub2) local75;
				if (local81.aClass26_Sub4_1 != null) {
					return ((Interface5) local81.aClass26_Sub4_1).method5727(arg1, arg0);
				}
			}
		}
		return null;
	}
}
