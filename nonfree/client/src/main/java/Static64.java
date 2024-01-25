import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array7;

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "Lclient!aj;")
	public static Class15 aClass15_19;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
	public static int anInt1275;

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "[I")
	public static final int[] anIntArray114 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Z")
	public static boolean method1326() {
		if (Static663.aBoolean803) {
			try {
				if ((Boolean) Static686.method8109(Static124.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!jp;)Lclient!le;")
	public static Class3_Sub9 method1327(@OriginalArg(1) Class3_Sub25 arg0) {
		arg0.method8632();
		@Pc(15) int local15 = arg0.method8632();
		@Pc(21) Class3_Sub9 local21 = Static671.method9325(local15);
		local21.anInt10587 = arg0.method8632();
		@Pc(30) int local30 = arg0.method8632();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			@Pc(40) int local40 = arg0.method8632();
			local21.method9166(arg0, local40);
		}
		local21.method9163();
		return local21;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1328(@OriginalArg(1) Class13 arg0) {
		Static7.aClass368Array1 = new Class368[Static532.anIntArray747.length];
		for (@Pc(16) int local16 = 0; local16 < Static532.anIntArray747.length; local16++) {
			@Pc(22) int local22 = Static532.anIntArray747[local16];
			@Pc(27) Class88 local27 = Static629.method8788(Static330.aClass15_88, local22);
			@Pc(35) Class69 local35 = arg0.method8515(local27, Static682.method2747(Static81.aClass15_24, local22));
			Static7.aClass368Array1[local16] = new Class368(local35, local27);
		}
	}
}
