import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	public static int anInt650;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "[Lclient!ui;")
	public static Class1_Sub2_Sub22[] aClass1_Sub2_Sub22Array2 = new Class1_Sub2_Sub22[14];

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method607() {
		Static174.aByteArrayArrayArray11 = null;
		Static24.anIntArray24 = null;
		Static129.anIntArray223 = null;
		Static132.aByteArrayArrayArray12 = null;
		Static180.anIntArray293 = null;
		Static250.aByteArrayArrayArray19 = null;
		Static190.anIntArrayArrayArray10 = null;
		Static174.anIntArray284 = null;
		Static244.aByteArrayArrayArray18 = null;
		Static100.anIntArray175 = null;
		Static91.anIntArray164 = null;
		Static91.aByteArrayArrayArray2 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BC)Z")
	public static boolean method608(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static285.aCharArray4;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(49) char local49 = local35[local37];
				if (arg0 == local49) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method610() {
		@Pc(6) int local6 = (Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7) + Static199.anInt3817;
		@Pc(14) int local14 = (Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7) + Static192.anInt3637;
		Static255.anInt4630 = 0;
		if (local6 >= 3053 && local6 <= 3156 && local14 >= 3056 && local14 <= 3136) {
			Static255.anInt4630 = 1;
		}
		if (local6 >= 3072 && local6 <= 3118 && local14 >= 9492 && local14 <= 9535) {
			Static255.anInt4630 = 1;
		}
		if (Static255.anInt4630 == 1 && local6 >= 3139 && local6 <= 3199 && local14 >= 3008 && local14 <= 3062) {
			Static255.anInt4630 = 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V")
	public static void method612() {
		Static37.aClass187_23.method4534(5);
		Static227.aClass187_116.method4534(5);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLclient!hi;I)Ljava/lang/String;")
	public static String method613(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1) {
		if (!Static37.method679(arg0).method3057(arg1) && arg0.anObjectArray25 == null) {
			return null;
		} else if (arg0.aStringArray17 == null || arg1 >= arg0.aStringArray17.length || arg0.aStringArray17[arg1] == null || arg0.aStringArray17[arg1].trim().length() == 0) {
			return Static95.aBoolean103 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray17[arg1];
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public static void method614() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static197.aBooleanArray15[local7] = false;
		}
		Static71.anInt1521 = 0;
		Static143.anInt2865 = -1;
		Static201.anInt3866 = -1;
		Static155.anInt3076 = 0;
		Static167.anInt3292 = 5;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;Lclient!lf;I)I")
	public static int method615(@OriginalArg(0) String arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(6) int local6 = arg1.anInt1480;
		@Pc(10) byte[] local10 = Static238.method3678(arg0);
		arg1.method1359(local10.length);
		arg1.anInt1480 += Static117.aClass192_1.method4612(arg1.aByteArray17, local10, local10.length, arg1.anInt1480, 0);
		return arg1.anInt1480 - local6;
	}
}
