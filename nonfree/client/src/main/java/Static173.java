import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray104;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt3848 = 0;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2280 = Static118.method2249(":clan:");

	@OriginalMember(owner = "client!si", name = "m", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2283 = Static118.method2249("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2281 = aClass65_2283;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2282 = Static118.method2249("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!si", name = "s", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2284 = Static118.method2249("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!si", name = "u", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2285 = Static118.method2249("mapflag");

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lclient!kg;")
	public static Class1_Sub2_Sub14 method2924(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2_Sub14 local18 = (Class1_Sub2_Sub14) Static25.aClass87_14.method3062((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static190.aClass60_38.method2340(Static210.method3317(arg0), Static49.method850(arg0));
		local18 = new Class1_Sub2_Sub14();
		if (local32 != null) {
			local18.method1892(new Class1_Sub14(local32));
		}
		local18.method1879();
		Static25.aClass87_14.method3068(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Z")
	public static boolean method2925(@OriginalArg(0) int arg0) {
		if (Static100.aBooleanArray13[arg0]) {
			return true;
		} else if (Static61.aClass60_13.method2316(arg0)) {
			@Pc(28) int local28 = Static61.aClass60_13.method2342(arg0);
			if (local28 == 0) {
				Static100.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static99.aClass97ArrayArray1[arg0] == null) {
				Static99.aClass97ArrayArray1[arg0] = new Class97[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static99.aClass97ArrayArray1[arg0][local47] == null) {
					@Pc(60) byte[] local60 = Static61.aClass60_13.method2340(local47, arg0);
					if (local60 != null) {
						Static99.aClass97ArrayArray1[arg0][local47] = new Class97();
						Static99.aClass97ArrayArray1[arg0][local47].anInt4376 = local47 + (arg0 << 16);
						if (local60[0] == -1) {
							Static99.aClass97ArrayArray1[arg0][local47].method3271(new Class1_Sub14(local60));
						} else {
							Static99.aClass97ArrayArray1[arg0][local47].method3266(new Class1_Sub14(local60));
						}
					}
				}
			}
			Static100.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Lclient!wd;")
	public static Class97 method2926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class97 local3 = Static154.method2691(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass97Array2 == null || arg1 >= local3.aClass97Array2.length) {
			return null;
		} else {
			return local3.aClass97Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	public static int method2929() {
		return Static91.anInt2182;
	}
}
