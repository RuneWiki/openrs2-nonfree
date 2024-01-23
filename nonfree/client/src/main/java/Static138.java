import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "Lclient!fh;")
	public static Class58 aClass58_64;

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "Z")
	public static boolean aBoolean183;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "[I")
	public static int[] anIntArray231;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "Lclient!im;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!cc;")
	public static Class26 aClass26_27 = new Class26(5);

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
	public static int anInt2643 = -1;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)Lclient!cj;")
	public static Class4_Sub3_Sub3 method2057(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub3_Sub3 local6 = (Class4_Sub3_Sub3) Static89.aClass40_9.method889((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(33) byte[] local33 = Static36.aClass58_20.method1372(Static102.method1678(arg0), Static66.method1056(arg0));
		local6 = new Class4_Sub3_Sub3();
		if (local33 != null) {
			local6.method609(new Class4_Sub10(local33));
		}
		Static89.aClass40_9.method888((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2061(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static110.aClass4_Sub10_Sub1_1.method4687(215);
		Static110.aClass4_Sub10_Sub1_1.method4619(Static108.method1747(arg1));
		Static110.aClass4_Sub10_Sub1_1.method4615(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
	public static void method2063() {
		for (@Pc(6) Class4_Sub27 local6 = (Class4_Sub27) Static148.aClass85_13.method1843(); local6 != null; local6 = (Class4_Sub27) Static148.aClass85_13.method1844()) {
			@Pc(11) int local11 = local6.anInt4621;
			if (Static79.method1364(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Class189[] local21 = Static188.aClass189ArrayArray115[local11];
				@Pc(23) int local23;
				for (local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].aBoolean417;
						break;
					}
				}
				if (!local17) {
					local23 = (int) local6.aLong217;
					@Pc(54) Class189 local54 = Static114.method1814(local23);
					if (local54 != null) {
						Static205.method3283(local54);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void method2064() {
		Static110.aClass4_Sub10_Sub1_1.method4687(189);
		for (@Pc(14) Class4_Sub27 local14 = (Class4_Sub27) Static148.aClass85_13.method1843(); local14 != null; local14 = (Class4_Sub27) Static148.aClass85_13.method1844()) {
			if (local14.anInt4620 == 0) {
				Static203.method3259(true, local14);
			}
		}
		if (Static252.aClass189_14 != null) {
			Static205.method3283(Static252.aClass189_14);
			Static252.aClass189_14 = null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)[Lclient!uj;")
	public static Class4_Sub3_Sub14[] method2065() {
		@Pc(4) Class4_Sub3_Sub14[] local4 = new Class4_Sub3_Sub14[Static143.anInt2748];
		for (@Pc(16) int local16 = 0; local16 < Static143.anInt2748; local16++) {
			@Pc(27) int local27 = Static110.anIntArray185[local16] * Static301.anIntArray643[local16];
			@Pc(31) byte[] local31 = Static230.aByteArrayArray36[local16];
			if (Static223.aBooleanArray22[local16]) {
				@Pc(112) byte[] local112 = Static141.aByteArrayArray54[local16];
				@Pc(115) int[] local115 = new int[local27];
				for (@Pc(117) int local117 = 0; local117 < local27; local117++) {
					local115[local117] = Static58.anIntArray85[local31[local117] & 0xFF] | (local112[local117] & 0xFF) << 24;
				}
				if (Static94.aBoolean138) {
					local4[local16] = new Class4_Sub3_Sub14_Sub2_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local16], Static187.anIntArray391[local16], Static110.anIntArray185[local16], Static301.anIntArray643[local16], local115);
				} else {
					local4[local16] = new Class4_Sub3_Sub14_Sub1_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local16], Static187.anIntArray391[local16], Static110.anIntArray185[local16], Static301.anIntArray643[local16], local115);
				}
			} else {
				@Pc(38) int[] local38 = new int[local27];
				for (@Pc(40) int local40 = 0; local40 < local27; local40++) {
					local38[local40] = Static58.anIntArray85[local31[local40] & 0xFF];
				}
				if (Static94.aBoolean138) {
					local4[local16] = new Class4_Sub3_Sub14_Sub2(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local16], Static187.anIntArray391[local16], Static110.anIntArray185[local16], Static301.anIntArray643[local16], local38);
				} else {
					local4[local16] = new Class4_Sub3_Sub14_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local16], Static187.anIntArray391[local16], Static110.anIntArray185[local16], Static301.anIntArray643[local16], local38);
				}
			}
		}
		Static304.method4707();
		return local4;
	}
}
