import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!dp;")
	public static Class53 aClass53_36;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!of;")
	public static Class40 aClass40_3;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public static int anInt1342 = 0;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
	public static int anInt1344 = 0;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	public static int anInt1345 = -1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!vj;)V")
	public static void method1264(@OriginalArg(1) Class206 arg0) {
		@Pc(10) Class201 local10 = null;
		try {
			@Pc(14) Class196 local14 = arg0.method5517();
			while (local14.anInt5851 == 0) {
				Static278.method5283(1L);
			}
			if (local14.anInt5851 == 1) {
				local10 = (Class201) local14.anObject8;
				@Pc(33) Class6_Sub10 local33 = Static238.method4720();
				local10.method5364(local33.anInt4188, 0, local33.aByteArray67);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local10 != null) {
				local10.method5359();
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!qo;)V")
	public static void method1265(@OriginalArg(1) Class44_Sub4_Sub4_Sub1 arg0) {
		if (Static256.anInt4749 >= 400 || Static253.aClass44_Sub4_Sub4_Sub1_1 == arg0) {
			return;
		}
		@Pc(134) String local134;
		@Pc(63) int local63;
		if (arg0.anInt4920 == 0) {
			@Pc(18) boolean local18 = true;
			if (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4898 != -1 && arg0.anInt4898 != -1) {
				@Pc(38) int local38 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907 <= arg0.anInt4907 ? arg0.anInt4907 : Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907;
				@Pc(53) int local53 = arg0.anInt4898 > Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4898 ? Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4898 : arg0.anInt4898;
				local63 = local53 + local38 * 10 / 100 + 5;
				@Pc(70) int local70 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907 - arg0.anInt4907;
				if (local70 < 0) {
					local70 = -local70;
				}
				if (local63 < local70) {
					local18 = false;
				}
			}
			@Pc(93) String local93 = Static105.anInt1941 == 1 ? Static84.aString55 : Static299.aString255;
			if (arg0.anInt4915 <= arg0.anInt4907) {
				local134 = arg0.method4480() + (local18 ? Static304.method5214(arg0.anInt4907, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907) : "<col=ffffff>") + " (" + local93 + arg0.anInt4907 + ")";
			} else {
				local134 = arg0.method4480() + (local18 ? Static304.method5214(arg0.anInt4907, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907) : "<col=ffffff>") + " (" + local93 + arg0.anInt4907 + "+" + (arg0.anInt4915 - arg0.anInt4907) + ")";
			}
		} else {
			local134 = arg0.method4480() + " (" + Static239.aString306 + arg0.anInt4920 + ")";
		}
		if (Static14.anInt257 == 1) {
			Static52.method870(0, Static165.aString287, 19, 0, anInt1345, Static237.aString188 + " -> <col=ffffff>" + local134, (long) arg0.anInt5127);
		} else if (!Static79.aBoolean97) {
			for (@Pc(231) int local231 = 7; local231 >= 0; local231--) {
				if (Static325.aStringArray41[local231] != null) {
					@Pc(239) short local239 = 0;
					if (Static105.anInt1941 == 0 && Static325.aStringArray41[local231].equalsIgnoreCase(Static108.aString77)) {
						if (arg0.anInt4907 > Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907) {
							local239 = 2000;
						}
						if (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4918 != 0 && arg0.anInt4918 != 0) {
							if (arg0.anInt4918 == Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4918) {
								local239 = 2000;
							} else {
								local239 = 0;
							}
						}
					} else if (Static230.aBooleanArray25[local231]) {
						local239 = 2000;
					}
					@Pc(293) short local293 = (short) (local239 + Static16.aShortArray1[local231]);
					local63 = Static278.anIntArray661[local231] == -1 ? Static284.anInt5376 : Static278.anIntArray661[local231];
					Static52.method870(0, Static325.aStringArray41[local231], local293, 0, local63, "<col=ffffff>" + local134, (long) arg0.anInt5127);
				}
			}
		} else if ((Static288.anInt5432 & 0x8) != 0) {
			Static52.method870(0, Static312.aString270, 51, 0, Static1.anInt38, Static303.aString264 + " -> <col=ffffff>" + local134, (long) arg0.anInt5127);
		}
		for (@Pc(368) Class6_Sub32 local368 = (Class6_Sub32) Static214.aClass211_24.method5594(); local368 != null; local368 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
			if (local368.anInt4932 == 15) {
				local368.aString209 = "<col=ffffff>" + local134;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILclient!ja;IZLclient!bn;I)Lclient!of;")
	public static Class40 method1267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class81 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class21 arg5, @OriginalArg(7) int arg6) {
		Static30.aClass202_1.anInt5937 = arg2;
		Static30.aClass202_1.anInt5943 = arg0;
		Static30.aClass202_1.anInt5936 = arg1;
		Static30.aClass202_1.anInt5941 = arg4;
		Static30.aClass202_1.anInt5940 = arg6;
		Static30.aClass202_1.aBoolean398 = arg5 != null;
		Static30.aClass202_1.anInt5942 = arg3.anInt2815;
		return (Class40) Static270.aClass137_1.method3637(Static30.aClass202_1);
	}
}
