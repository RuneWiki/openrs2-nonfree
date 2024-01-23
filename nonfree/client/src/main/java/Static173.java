import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "[Lclient!ga;")
	public static Class59[] aClass59Array1;

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "Lclient!qd;")
	public static Class1_Sub7_Sub3 aClass1_Sub7_Sub3_1;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public static int anInt3382 = 0;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJ)V")
	public static void method2972(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static144.anInt2798 >= 100 && !Static309.aBoolean525 || Static144.anInt2798 >= 200) {
			Static305.method4555(Static246.aString162, "", 0);
			return;
		}
		@Pc(33) String local33 = Static69.method1333(arg0);
		@Pc(35) int local35;
		for (local35 = 0; local35 < Static144.anInt2798; local35++) {
			if (arg0 == Static133.aLongArray7[local35]) {
				Static305.method4555(local33 + Static258.aString178, "", 0);
				return;
			}
		}
		for (local35 = 0; local35 < Static282.anInt5138; local35++) {
			if (arg0 == Static86.aLongArray6[local35]) {
				Static305.method4555(Static174.aString219 + local33 + Static125.aString86, "", 0);
				return;
			}
		}
		if (local33.equals(Static138.aClass11_Sub4_Sub1_3.aString99)) {
			Static305.method4555(Static39.aString33, "", 0);
			return;
		}
		Static19.aStringArray4[Static144.anInt2798] = local33;
		Static133.aLongArray7[Static144.anInt2798] = arg0;
		Static58.anIntArray96[Static144.anInt2798] = 0;
		Static54.aStringArray5[Static144.anInt2798] = "";
		Static23.anIntArray53[Static144.anInt2798] = 0;
		Static196.aBooleanArray15[Static144.anInt2798] = false;
		Static144.anInt2798++;
		Static105.anInt2227 = Static149.anInt950;
		Static116.aClass1_Sub13_Sub1_48.method1887(37);
		Static116.aClass1_Sub13_Sub1_48.method1857(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
	public static void method2973(@OriginalArg(1) boolean arg0) {
		Static246.method3875();
		if (Static97.anInt2087 != 30 && Static97.anInt2087 != 25) {
			return;
		}
		Static122.anInt2478++;
		if (Static122.anInt2478 < 50 && !arg0) {
			return;
		}
		Static122.anInt2478 = 0;
		if (!Static55.aBoolean119 && Static97.aClass49_2 != null) {
			Static116.aClass1_Sub13_Sub1_48.method1887(71);
			try {
				Static97.aClass49_2.method1302(Static116.aClass1_Sub13_Sub1_48.aByteArray63, Static116.aClass1_Sub13_Sub1_48.anInt2018);
				Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
			} catch (@Pc(55) IOException local55) {
				Static55.aBoolean119 = true;
			}
		}
		Static246.method3875();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!nm;Lclient!nm;I)I")
	public static int method2974(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method3250(Static219.anInt4103)) {
			local5++;
		}
		if (arg0.method3250(Static100.anInt5569)) {
			local5++;
		}
		if (arg0.method3250(Static305.anInt5487)) {
			local5++;
		}
		if (arg1.method3250(Static219.anInt4103)) {
			local5++;
		}
		if (arg1.method3250(Static100.anInt5569)) {
			local5++;
		}
		if (arg1.method3250(Static305.anInt5487)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)Z")
	public static boolean method2975() {
		if (Static274.aBoolean479) {
			try {
				return !((Boolean) Static320.method2266("showingVideoAd", Static222.aClass176_3.anApplet1));
			} catch (@Pc(29) Throwable local29) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 < 0 || arg4 < 0 || arg1 >= 103 || arg4 >= 103) {
			return;
		}
		@Pc(45) int local45;
		if (arg5 == 0) {
			@Pc(35) Class39 local35 = Static22.method447(arg2, arg1, arg4);
			if (local35 != null) {
				local45 = Integer.MAX_VALUE & (int) (local35.aLong48 >>> 32);
				if (arg3 == 2) {
					local35.aClass11_4 = new Class11_Sub6(local45, 2, arg0 + 4, arg2, arg1, arg4, arg6, false, local35.aClass11_4);
					local35.aClass11_3 = new Class11_Sub6(local45, 2, arg0 + 1 & 0x3, arg2, arg1, arg4, arg6, false, local35.aClass11_3);
				} else {
					local35.aClass11_4 = new Class11_Sub6(local45, arg3, arg0, arg2, arg1, arg4, arg6, false, local35.aClass11_4);
				}
			}
		}
		if (arg5 == 1) {
			@Pc(112) Class18 local112 = Static269.method4148(arg2, arg1, arg4);
			if (local112 != null) {
				local45 = Integer.MAX_VALUE & (int) (local112.aLong21 >>> 32);
				if (arg3 == 4 || arg3 == 5) {
					local112.aClass11_1 = new Class11_Sub6(local45, 4, arg0, arg2, arg1, arg4, arg6, false, local112.aClass11_1);
				} else if (arg3 == 6) {
					local112.aClass11_1 = new Class11_Sub6(local45, 4, arg0 + 4, arg2, arg1, arg4, arg6, false, local112.aClass11_1);
				} else if (arg3 == 7) {
					local112.aClass11_1 = new Class11_Sub6(local45, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg4, arg6, false, local112.aClass11_1);
				} else if (arg3 == 8) {
					local112.aClass11_1 = new Class11_Sub6(local45, 4, arg0 + 4, arg2, arg1, arg4, arg6, false, local112.aClass11_1);
					local112.aClass11_2 = new Class11_Sub6(local45, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg4, arg6, false, local112.aClass11_2);
				}
			}
		}
		if (arg5 == 2) {
			if (arg3 == 11) {
				arg3 = 10;
			}
			@Pc(258) Class45 local258 = Static235.method3788(arg2, arg1, arg4);
			if (local258 != null) {
				local258.aClass11_5 = new Class11_Sub6((int) (local258.aLong56 >>> 32) & Integer.MAX_VALUE, arg3, arg0, arg2, arg1, arg4, arg6, false, local258.aClass11_5);
			}
		}
		if (arg5 == 3) {
			@Pc(293) Class124 local293 = Static38.method659(arg2, arg1, arg4);
			if (local293 != null) {
				local293.aClass11_10 = new Class11_Sub6((int) (local293.aLong143 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg2, arg1, arg4, arg6, false, local293.aClass11_10);
			}
		}
	}
}
