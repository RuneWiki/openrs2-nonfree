import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!et", name = "l", descriptor = "I")
	public int anInt2342;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "I")
	public int anInt2344;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "I")
	public int anInt2345;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "I")
	public int anInt2346;

	@OriginalMember(owner = "client!et", name = "s", descriptor = "I")
	public int anInt2347;

	@OriginalMember(owner = "client!et", name = "t", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "I")
	public int anInt2349;

	@OriginalMember(owner = "client!et", name = "v", descriptor = "I")
	public int anInt2350;

	@OriginalMember(owner = "client!et", name = "w", descriptor = "I")
	public int anInt2351;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "I")
	public int anInt2355;

	@OriginalMember(owner = "client!et", name = "C", descriptor = "I")
	public int anInt2356;

	@OriginalMember(owner = "client!et", name = "D", descriptor = "I")
	public int anInt2357;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "I")
	public int anInt2358;

	@OriginalMember(owner = "client!et", name = "F", descriptor = "I")
	public int anInt2359;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ya;IB)Lclient!t;")
	public Class91 method1840(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static284.anIntArray418[this.anInt2356];
		if (local14 == 0) {
			@Pc(24) Class3_Sub5 local24 = Static215.method3376(this.anInt2358, this.anInt2349, this.anInt2352);
			if (local24 instanceof Class3_Sub5_Sub3) {
				@Pc(30) Class3_Sub5_Sub3 local30 = (Class3_Sub5_Sub3) local24;
				if (local30.aClass3_Sub5_3 != null) {
					return ((Interface6) local30.aClass3_Sub5_3).method5154(arg0, arg1);
				}
			}
		} else if (local14 == 1) {
			@Pc(116) Class3_Sub3 local116 = Static414.method5443(this.anInt2358, this.anInt2349, this.anInt2352);
			if (local116 instanceof Class3_Sub3_Sub3) {
				@Pc(122) Class3_Sub3_Sub3 local122 = (Class3_Sub3_Sub3) local116;
				if (local122.aClass3_Sub3_3 != null) {
					return ((Interface6) local122.aClass3_Sub3_3).method5154(arg0, arg1);
				}
			}
		} else if (local14 == 2) {
			@Pc(91) Class3_Sub2 local91 = Static455.method4456(this.anInt2358, this.anInt2349, this.anInt2352, jn.class);
			if (local91 instanceof Class3_Sub2_Sub5) {
				@Pc(97) Class3_Sub2_Sub5 local97 = (Class3_Sub2_Sub5) local91;
				if (local97.aClass3_Sub2_2 != null) {
					return ((Interface6) local97.aClass3_Sub2_2).method5154(arg0, arg1);
				}
			}
		} else if (local14 == 3) {
			@Pc(58) Class3_Sub1 local58 = Static139.method2376(this.anInt2358, this.anInt2349, this.anInt2352);
			if (local58 instanceof Class3_Sub1_Sub1) {
				@Pc(64) Class3_Sub1_Sub1 local64 = (Class3_Sub1_Sub1) local58;
				if (local64.aClass3_Sub1_1 != null) {
					return ((Interface6) local64.aClass3_Sub1_1).method5154(arg0, arg1);
				}
			}
		}
		return null;
	}
}
