import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt8;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public static int anInt16;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!p;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lclient!o;", line = 16)
	public static Class40 method1(@OriginalArg(1) int arg0) {
		if (arg0 > Static78.anInt2035 + 10) {
			return Class14.aClass40_115;
		}
		@Pc(17) long local17 = ((long) arg0 + 11745L) * 86400000L;
		@Pc(19) Calendar local19 = Calendar.getInstance();
		local19.setTime(new Date(local17));
		@Pc(29) int local29 = local19.get(5);
		@Pc(38) int local38 = local19.get(2);
		@Pc(42) int local42 = local19.get(1);
		@Pc(93) Class40[] local93 = new Class40[] { Class60.aClass40_679, Class2_Sub12.aClass40_670, Class2_Sub2_Sub12_Sub1_Sub1.aClass40_396, Class59.aClass40_633, Class25.aClass40_291, Class2_Sub3.aClass40_738, Class10.aClass40_70, Class5.aClass40_24, Class2_Sub2_Sub16.aClass40_712, Class59.aClass40_630, Class2_Sub2_Sub10.aClass40_320, Class2_Sub7.aClass40_255 };
		return Static72.method1334(new Class40[] { Static48.method859(local29), Class2_Sub2_Sub12_Sub2.aClass40_409, local93[local38], Class2_Sub2_Sub12_Sub2.aClass40_409, Static48.method859(local42) });
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z", line = 43)
	public static boolean method2(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 99)
	public static void method3() {
		for (@Pc(10) Class2_Sub2_Sub12_Sub6 local10 = (Class2_Sub2_Sub12_Sub6) Class2_Sub2_Sub12_Sub1_Sub2.aClass44_8.method1224(); local10 != null; local10 = (Class2_Sub2_Sub12_Sub6) Class2_Sub2_Sub12_Sub1_Sub2.aClass44_8.method1231()) {
			if (local10.anInt2235 != anInt8 || local10.aBoolean169) {
				local10.method1677();
			} else if (Class24.anInt2511 >= local10.anInt2231) {
				local10.method1519(Class27.anInt1095);
				if (local10.aBoolean169) {
					local10.method1677();
				} else {
					Static85.aClass55_1.method1425(local10.anInt2235, local10.anInt2232, local10.anInt2230, local10.anInt2223, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ke;Z)V", line = 140)
	public static void method4(@OriginalArg(0) Class2_Sub2_Sub12_Sub1 arg0) {
		if (arg0.anInt2297 == Class24.anInt2511 || arg0.anInt2307 == -1 || arg0.anInt2313 != 0 || arg0.anInt2267 + 1 > Static57.method1042(arg0.anInt2307).anIntArray128[arg0.anInt2316]) {
			@Pc(38) int local38 = arg0.anInt2297 - arg0.anInt2277;
			@Pc(44) int local44 = Class24.anInt2511 - arg0.anInt2277;
			@Pc(54) int local54 = arg0.anInt2278 * 64 + arg0.anInt2321 * 128;
			@Pc(64) int local64 = arg0.anInt2278 * 64 + arg0.anInt2311 * 128;
			@Pc(74) int local74 = arg0.anInt2286 * 128 + arg0.anInt2278 * 64;
			@Pc(84) int local84 = arg0.anInt2278 * 64 + arg0.anInt2317 * 128;
			arg0.anInt2275 = ((local38 - local44) * local84 + local64 * local44) / local38;
			arg0.anInt2284 = ((local38 - local44) * local54 + local74 * local44) / local38;
		}
		arg0.anInt2282 = 0;
		if (arg0.anInt2314 == 0) {
			arg0.anInt2283 = 1024;
		}
		if (arg0.anInt2314 == 1) {
			arg0.anInt2283 = 1536;
		}
		if (arg0.anInt2314 == 2) {
			arg0.anInt2283 = 0;
		}
		if (arg0.anInt2314 == 3) {
			arg0.anInt2283 = 512;
		}
		arg0.anInt2305 = arg0.anInt2283;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 192)
	public static void method5() {
		Class1.aClass40_3 = null;
		Class1.aClass40_2 = null;
		aClass45_1 = null;
		anIntArray1 = null;
		Class1.aClass40_4 = null;
		Class1.aClass40_1 = null;
	}
}
