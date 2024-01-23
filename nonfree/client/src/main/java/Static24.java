import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!bo", name = "cb", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_18;

	@OriginalMember(owner = "client!bo", name = "fb", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!bo", name = "gb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray22;

	@OriginalMember(owner = "client!bo", name = "lb", descriptor = "Lclient!km;")
	public static Class91 aClass91_169;

	@OriginalMember(owner = "client!bo", name = "Sb", descriptor = "I")
	public static int anInt4676 = 0;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)V")
	public static void method3640() {
		Static200.anInt4074 = 2;
		Static244.anInt4854 = 0;
		Static59.anInt3983 = -1;
		Static299.anInt5641 = 1;
		Static139.aBoolean224 = false;
		Static237.anInt4708 = -1;
		Static14.aClass91_14 = null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3641(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) long local28 = arg0; local28 != 0L; local28 /= 37L) {
				local26++;
			}
			@Pc(46) StringBuffer local46 = new StringBuffer(local26);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				@Pc(66) char local66 = Static23.aCharArray1[(int) (local52 - arg0 * 37L)];
				if (local66 == '_') {
					@Pc(77) int local77 = local46.length() - 1;
					local46.setCharAt(local77, Character.toUpperCase(local46.charAt(local77)));
					local66 = ' ';
				}
				local46.append(local66);
			}
			local46.reverse();
			local46.setCharAt(0, Character.toUpperCase(local46.charAt(0)));
			return local46.toString();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static23.method431(arg3, Static49.anInt1129, Static297.anInt5619);
		@Pc(17) int local17 = Static23.method431(arg2, Static49.anInt1129, Static297.anInt5619);
		@Pc(23) int local23 = Static23.method431(arg5, Static68.anInt1451, Static224.anInt4436);
		@Pc(41) int local41 = Static23.method431(arg0, Static68.anInt1451, Static224.anInt4436);
		@Pc(49) int local49 = Static23.method431(arg3 + arg4, Static49.anInt1129, Static297.anInt5619);
		@Pc(58) int local58 = Static23.method431(arg2 - arg4, Static49.anInt1129, Static297.anInt5619);
		@Pc(60) int local60;
		for (local60 = local11; local60 < local49; local60++) {
			Static126.method1523(Static22.anIntArrayArray3[local60], local41, arg6, local23);
		}
		for (local60 = local17; local60 > local58; local60--) {
			Static126.method1523(Static22.anIntArrayArray3[local60], local41, arg6, local23);
		}
		@Pc(102) int local102 = Static23.method431(arg4 + arg5, Static68.anInt1451, Static224.anInt4436);
		@Pc(111) int local111 = Static23.method431(arg0 - arg4, Static68.anInt1451, Static224.anInt4436);
		for (local60 = local49; local60 <= local58; local60++) {
			@Pc(120) int[] local120 = Static22.anIntArrayArray3[local60];
			Static126.method1523(local120, local102, arg6, local23);
			Static126.method1523(local120, local111, arg1, local102);
			Static126.method1523(local120, local41, arg6, local111);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLclient!km;)V")
	public static void method3649(@OriginalArg(1) Class91 arg0) {
		Static272.aClass12_Sub2Array1 = Static296.method4437(arg0, Static84.anInt1889);
		Static14.anIntArray32 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(29) float local29 = (float) (Static62.anIntArray137[local15] >> 16 & 0xFF);
			@Pc(39) int local39 = Static62.anIntArray137[local15 + 1] >> 16 & 0xFF;
			@Pc(46) float local46 = ((float) local39 - local29) / 64.0F;
			@Pc(56) int local56 = Static62.anIntArray137[local15 + 1] >> 8 & 0xFF;
			@Pc(65) float local65 = (float) (Static62.anIntArray137[local15] >> 8 & 0xFF);
			@Pc(73) float local73 = ((float) local56 - local65) / 64.0F;
			@Pc(81) int local81 = Static62.anIntArray137[local15 + 1] & 0xFF;
			@Pc(88) float local88 = (float) (Static62.anIntArray137[local15] & 0xFF);
			@Pc(95) float local95 = ((float) local81 - local88) / 64.0F;
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				Static14.anIntArray32[local97 + local15 * 64] = (int) local88 | (int) local29 << 16 | (int) local65 << 8;
				local88 += local95;
				local65 += local73;
				local29 += local46;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static14.anIntArray32[local15] = Static62.anIntArray137[3];
		}
		Static151.anIntArray555 = new int[32768];
		Static124.anIntArray257 = new int[32768];
		Static31.method646(null);
		Static123.anIntArray256 = new int[32768];
		Static233.anIntArray408 = new int[32768];
		Static278.aClass1_Sub2_Sub11_Sub2_5 = new Class1_Sub2_Sub11_Sub2(128, 254);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!km;ILclient!km;)V")
	public static void method3651(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		Static45.aClass91_43 = arg0;
		Static85.aClass91_66 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(III)V")
	public static void method3657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static108.anInt2516 = Static73.aClass62ArrayArray1[arg0][arg1].anInt2404;
		Static217.anInt4294 = Static73.aClass62ArrayArray1[arg0][arg1].anInt2412;
		Static236.anInt4597 = Static73.aClass62ArrayArray1[arg0][arg1].anInt2418;
		Static28.method554((float) Static108.anInt2516, (float) Static217.anInt4294, (float) Static236.anInt4597);
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)V")
	public static void method3659() {
		if (Static194.anInt4017 == 10 && Static277.aBoolean412) {
			Static163.method2823(28);
		}
		if (Static194.anInt4017 == 30) {
			Static163.method2823(25);
		}
	}
}
