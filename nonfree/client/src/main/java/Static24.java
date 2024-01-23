import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
	public static int anInt639;

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "Lclient!pk;")
	public static Class132 aClass132_8;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "Lclient!am;")
	public static Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString21 = "Checking for updates - ";

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)J")
	public static long method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass141_1 == null ? 0L : local7.aClass141_1.aLong166;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)[Lclient!wd;")
	public static Class8_Sub1_Sub7[] method426() {
		@Pc(16) Class8_Sub1_Sub7[] local16 = new Class8_Sub1_Sub7[Static288.anInt1353];
		for (@Pc(18) int local18 = 0; local18 < Static288.anInt1353; local18++) {
			@Pc(29) int local29 = Static92.anIntArray130[local18] * Static135.anIntArray225[local18];
			@Pc(33) byte[] local33 = Static232.aByteArrayArray15[local18];
			@Pc(36) int[] local36 = new int[local29];
			for (@Pc(38) int local38 = 0; local38 < local29; local38++) {
				local36[local38] = Static147.anIntArray236[local33[local38] & 0xFF];
			}
			if (Static116.aBoolean188) {
				local16[local18] = new Class8_Sub1_Sub7_Sub2(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local18], Static225.anIntArray345[local18], Static92.anIntArray130[local18], Static135.anIntArray225[local18], local36);
			} else {
				local16[local18] = new Class8_Sub1_Sub7_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local18], Static225.anIntArray345[local18], Static92.anIntArray130[local18], Static135.anIntArray225[local18], local36);
			}
		}
		Static147.method2386();
		return local16;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public static void method427() {
		Static160.aClass61_27.method1381(5);
		Static222.aClass61_41.method1381(5);
		Static203.aClass61_37.method1381(5);
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
	public static void method428() {
		Static11.aClass61_23.method1378();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
	public static void method430(@OriginalArg(1) int arg0) {
		@Pc(14) Class8_Sub1_Sub6 local14 = Static181.method2779(5, arg0);
		local14.method929();
	}
}
