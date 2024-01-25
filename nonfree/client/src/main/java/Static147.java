import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public static int anInt2682;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array11;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "Lclient!nq;")
	public static Class144 aClass144_42;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Z")
	public static boolean aBoolean182 = true;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B[[[Lclient!jd;)V")
	public static void method2248(@OriginalArg(1) Class106[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class106[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class106 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass67_Sub4_1 instanceof Interface7) {
							((Interface7) local27.aClass67_Sub4_1).method5416();
						}
						if (local27.aClass67_Sub1_1 instanceof Interface7) {
							((Interface7) local27.aClass67_Sub1_1).method5416();
						}
						if (local27.aClass67_Sub1_2 instanceof Interface7) {
							((Interface7) local27.aClass67_Sub1_2).method5416();
						}
						if (local27.aClass67_Sub2_1 instanceof Interface7) {
							((Interface7) local27.aClass67_Sub2_1).method5416();
						}
						if (local27.aClass67_Sub2_2 instanceof Interface7) {
							((Interface7) local27.aClass67_Sub2_2).method5416();
						}
						for (@Pc(77) Class64 local77 = local27.aClass64_4; local77 != null; local77 = local77.aClass64_2) {
							@Pc(82) Class67_Sub3 local82 = local77.aClass67_Sub3_1;
							if (local82 instanceof Interface7) {
								((Interface7) local82).method5416();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!uo;Lclient!cf;)I")
	public static int method2250(@OriginalArg(1) Class129 arg0, @OriginalArg(2) Class34 arg1) {
		if (arg1.anInt689 != -1) {
			return arg1.anInt689;
		}
		if (arg1.anInt686 != -1) {
			@Pc(35) Class134 local35 = Static76.anInterface2_6.method2244(arg0.method4927() ? arg1.anInt686 : arg1.anInt690);
			if (!local35.aBoolean256) {
				return local35.aShort63;
			}
		}
		return arg1.anInt684;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Lclient!pg;")
	public static Class157_Sub1 method2251() {
		return Static22.anInt414 < Static165.aClass157_Sub1Array5.length ? Static165.aClass157_Sub1Array5[Static22.anInt414++] : null;
	}
}
