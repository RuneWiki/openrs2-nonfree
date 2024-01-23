import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!sc;")
	public static Class2_Sub8_Sub1_Sub1 aClass2_Sub8_Sub1_Sub1_4;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
	public static int anInt5436;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
	public static int anInt5440;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "Lclient!ek;")
	public static Class42 aClass42_93;

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	public static int anInt5434 = 0;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString187 = "level: ";

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
	public static int anInt5447 = 1;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method4318() {
		Static11.aClass157_5.method4027();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4320(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(16) String local16 = Static5.method3854(arg0);
		if (local16 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static56.anInt1437; local23++) {
			@Pc(32) String local32 = Static5.method3854(Static242.aStringArray38[local23]);
			if (local32 != null && local32.equals(local16)) {
				Static56.anInt1437--;
				for (@Pc(50) int local50 = local23; local50 < Static56.anInt1437; local50++) {
					Static242.aStringArray38[local50] = Static242.aStringArray38[local50 + 1];
					Static262.aStringArray43[local50] = Static262.aStringArray43[local50 + 1];
					Static187.aBooleanArray16[local50] = Static187.aBooleanArray16[local50 + 1];
				}
				Static233.anInt6039 = Static291.anInt5632;
				Static211.aClass2_Sub16_Sub1_2.method2198(126);
				Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(arg0));
				Static211.aClass2_Sub16_Sub1_2.method2153(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4321(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local4; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
