import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
	public static int anInt2946;

	@OriginalMember(owner = "client!oi", name = "Y", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_20;

	@OriginalMember(owner = "client!oi", name = "Z", descriptor = "Lclient!wa;")
	public static Class23 aClass23_53;

	@OriginalMember(owner = "client!oi", name = "ab", descriptor = "Z")
	public static boolean aBoolean126;

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
	public static int anInt2945 = 0;

	@OriginalMember(owner = "client!oi", name = "V", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1109 = Static161.method2452("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!oi", name = "W", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!oi", name = "db", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1111 = Static161.method2452("Cancel");

	@OriginalMember(owner = "client!oi", name = "X", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1110 = aClass20_1111;

	@OriginalMember(owner = "client!oi", name = "bb", descriptor = "J")
	public static long aLong173 = 0L;

	@OriginalMember(owner = "client!oi", name = "cb", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!oi", name = "eb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1112 = Static161.method2452(" ");

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!dc;BIII)V")
	public static void method2197(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class69 local4 = Static201.method1363(arg2, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray27 != null) {
			@Pc(26) Class5_Sub10 local26 = new Class5_Sub10();
			local26.aClass20_346 = arg0;
			local26.anObjectArray3 = local4.anObjectArray27;
			local26.anInt1031 = arg3;
			local26.aClass69_3 = local4;
			Static184.method2781(local26);
		}
		@Pc(44) boolean local44 = true;
		if (local4.anInt2550 > 0) {
			local44 = Static57.method993(local4);
		}
		if (!local44 || !Static118.method2465(Static94.method1538(local4), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static43.aClass5_Sub6_Sub1_2.method3087(230);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 2) {
			Static43.aClass5_Sub6_Sub1_2.method3087(205);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 3) {
			Static43.aClass5_Sub6_Sub1_2.method3087(127);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 4) {
			Static43.aClass5_Sub6_Sub1_2.method3087(211);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 5) {
			Static43.aClass5_Sub6_Sub1_2.method3087(203);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 6) {
			Static43.aClass5_Sub6_Sub1_2.method3087(39);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 7) {
			Static43.aClass5_Sub6_Sub1_2.method3087(187);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 8) {
			Static43.aClass5_Sub6_Sub1_2.method3087(156);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 9) {
			Static43.aClass5_Sub6_Sub1_2.method3087(128);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
		if (arg3 == 10) {
			Static43.aClass5_Sub6_Sub1_2.method3087(235);
			Static43.aClass5_Sub6_Sub1_2.method3030(arg2);
			Static43.aClass5_Sub6_Sub1_2.method3044(arg1);
		}
	}
}
