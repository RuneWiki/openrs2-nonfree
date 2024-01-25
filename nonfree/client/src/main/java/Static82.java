import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!fd;")
	public static Class72 aClass72_7 = null;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public static int anInt1737 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1449(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local13 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local13 == 2 || Character.isUpperCase(local26)) {
				local26 = Static127.method2529(local26);
			}
			if (Character.isLetter(local26)) {
				local13 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local20] = local26;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)V")
	public static void method1450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub1_Sub8 local15 = Static155.method2994(arg0, 5);
		local15.method2031();
		local15.anInt2410 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method1451() {
		if (Static320.aClass39_2 != null) {
			Static320.aClass39_2.method4798();
		}
		if (Static36.aClass39_1 != null) {
			Static36.aClass39_1.method4798();
		}
		Static195.method3537(Static240.aBoolean423);
		Static320.aClass39_2 = Static126.method2523(Static212.aClass120_3, 0, Static101.aCanvas8, 22050);
		Static320.aClass39_2.method4793(Static206.aClass4_Sub13_Sub3_2);
		Static36.aClass39_1 = Static126.method2523(Static212.aClass120_3, 1, Static101.aCanvas8, 2048);
		Static36.aClass39_1.method4793(Static337.aClass4_Sub13_Sub2_2);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public static void method1453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class198 local10 = new Class198(16);
		for (@Pc(15) Class4_Sub21 local15 = (Class4_Sub21) Static178.aClass198_35.method5268(); local15 != null; local15 = (Class4_Sub21) Static178.aClass198_35.method5263()) {
			local15.method5667();
			@Pc(26) int local26 = (int) (local15.aLong259 >> 28);
			@Pc(37) int local37 = (int) (local15.aLong259 >> 14 & 0x3FFFL) - arg0;
			@Pc(46) int local46 = (int) (local15.aLong259 & 0x3FFFL) - arg1;
			if (local46 >= 0 && local37 >= 0 && local46 < Static92.anInt2048 && local37 < Static290.anInt5893) {
				local10.method5267((long) (local26 << 28 | local37 << 14 | local46), local15);
			}
		}
		Static178.aClass198_35 = local10;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(III)I")
	public static int method1454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return local11 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
