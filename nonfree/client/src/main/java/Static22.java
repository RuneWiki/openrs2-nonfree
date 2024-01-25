import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_15 = new Class254(100, -2);

	@OriginalMember(owner = "client!av", name = "m", descriptor = "[I")
	public static final int[] anIntArray58 = new int[6];

	@OriginalMember(owner = "client!av", name = "r", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_6 = new Class181(44, -1);

	@OriginalMember(owner = "client!av", name = "s", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_16 = new Class254(43, 3);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
	public static void method867(@OriginalArg(0) boolean arg0) {
		Static421.anInt7828 = 0;
		Static561.anInt2408 = 0;
		Static339.method5355();
		Static270.method4561(arg0);
		Static47.method1151();
		@Pc(18) boolean local18 = false;
		@Pc(31) int local31;
		for (@Pc(20) int local20 = 0; local20 < Static421.anInt7828; local20++) {
			local31 = Static426.anIntArray565[local20];
			@Pc(38) Class6_Sub33 local38 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local31);
			@Pc(41) Class11_Sub1_Sub1_Sub1 local41 = local38.aClass11_Sub1_Sub1_Sub1_2;
			if (Static218.aBoolean366 && Static187.method3612(local31)) {
				Static581.method8173();
			}
			if (local41.anInt7354 != Static508.anInt8998) {
				if (local41.aClass222_1.method5321()) {
					Static548.method7833(local41);
				}
				local41.method611(null);
				local38.method8151();
				local18 = true;
			}
		}
		if (local18) {
			Static452.anInt8286 = Static506.aClass305_36.method7443();
			Static506.aClass305_36.method7442(Static9.aClass6_Sub33Array1);
		}
		if (Static345.aClass6_Sub26_Sub2_1.anInt5769 != Static462.anInt8534) {
			throw new RuntimeException("gnp1 pos:" + Static345.aClass6_Sub26_Sub2_1.anInt5769 + " psize:" + Static462.anInt8534);
		}
		for (local31 = 0; local31 < Static208.anInt4409; local31++) {
			if (Static506.aClass305_36.method7447((long) Static70.anIntArray111[local31]) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static208.anInt4409);
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(JI)V")
	public static void method868(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIILclient!aj;II)V")
	public static void method871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt568 == -1 && arg2.anIntArray45 == null) {
			return;
		}
		@Pc(22) int local22 = 0;
		if (arg2.anInt565 < arg3) {
			local22 = arg3 - arg2.anInt565;
		} else if (arg2.anInt566 > arg3) {
			local22 = arg2.anInt566 - arg3;
		}
		@Pc(64) int local64 = Static104.aClass6_Sub6_Sub1_4.anInt1178 * arg2.anInt556 >> 8;
		if (arg2.anInt562 < arg1) {
			local22 += arg1 - arg2.anInt562;
		} else if (arg2.anInt561 > arg1) {
			local22 += arg2.anInt561 - arg1;
		}
		if (arg2.anInt557 == 0 || arg2.anInt557 < local22 - 256 || Static104.aClass6_Sub6_Sub1_4.anInt1178 == 0 || arg4 != arg2.anInt564) {
			if (arg2.aClass6_Sub10_Sub2_1 != null) {
				Static35.aClass6_Sub10_Sub3_1.method4742(arg2.aClass6_Sub10_Sub2_1);
				arg2.aClass6_Sub37_1 = null;
				arg2.aClass6_Sub12_Sub1_2 = null;
				arg2.aClass6_Sub10_Sub2_1 = null;
			}
			if (arg2.aClass6_Sub10_Sub2_2 != null) {
				Static35.aClass6_Sub10_Sub3_1.method4742(arg2.aClass6_Sub10_Sub2_2);
				arg2.aClass6_Sub10_Sub2_2 = null;
				arg2.aClass6_Sub37_2 = null;
				arg2.aClass6_Sub12_Sub1_1 = null;
			}
			return;
		}
		local22 -= 256;
		if (local22 < 0) {
			local22 = 0;
		}
		@Pc(161) int local161 = local64 * (arg2.anInt557 - local22) / arg2.anInt557;
		@Pc(211) Class6_Sub10_Sub2 local211;
		if (arg2.aClass6_Sub10_Sub2_1 != null) {
			arg2.aClass6_Sub10_Sub2_1.method3435(local161);
		} else if (arg2.anInt568 >= 0) {
			if (arg2.aBoolean33) {
				if (arg2.aClass6_Sub37_1 == null) {
					arg2.aClass6_Sub37_1 = Static368.method5869(Static128.aClass168_35, arg2.anInt568);
				}
				if (arg2.aClass6_Sub37_1 != null) {
					if (arg2.aClass6_Sub12_Sub1_2 == null) {
						arg2.aClass6_Sub12_Sub1_2 = arg2.aClass6_Sub37_1.method5870(new int[] { 22050 });
					}
					if (arg2.aClass6_Sub12_Sub1_2 != null) {
						local211 = Static587.method3422(arg2.aClass6_Sub12_Sub1_2, local161);
						local211.method3434(-1);
						Static35.aClass6_Sub10_Sub3_1.method4737(local211);
						arg2.aClass6_Sub10_Sub2_1 = local211;
					}
				}
			} else {
				@Pc(228) Class33 local228 = Static585.method1086(Static487.aClass168_112, arg2.anInt568, 0);
				if (local228 != null) {
					@Pc(235) Class6_Sub12_Sub1 local235 = local228.method1085().method7958(Static184.aClass151_1);
					@Pc(240) Class6_Sub10_Sub2 local240 = Static587.method3422(local235, local161);
					local240.method3434(-1);
					Static35.aClass6_Sub10_Sub3_1.method4737(local240);
					arg2.aClass6_Sub10_Sub2_1 = local240;
				}
			}
		}
		if (arg2.aClass6_Sub10_Sub2_2 != null) {
			arg2.aClass6_Sub10_Sub2_2.method3435(local161);
			if (arg2.aClass6_Sub10_Sub2_2.method8152()) {
				return;
			}
			arg2.aClass6_Sub12_Sub1_1 = null;
			arg2.aClass6_Sub37_2 = null;
			arg2.aClass6_Sub10_Sub2_2 = null;
		} else if (arg2.anIntArray45 != null && (arg2.anInt554 -= arg0) <= 0) {
			@Pc(280) int local280;
			if (arg2.aBoolean34) {
				if (arg2.aClass6_Sub37_2 == null) {
					local280 = (int) (Math.random() * (double) arg2.anIntArray45.length);
					arg2.aClass6_Sub37_2 = Static368.method5869(Static128.aClass168_35, arg2.anIntArray45[local280]);
				}
				if (arg2.aClass6_Sub37_2 != null) {
					if (arg2.aClass6_Sub12_Sub1_1 == null) {
						arg2.aClass6_Sub12_Sub1_1 = arg2.aClass6_Sub37_2.method5870(new int[] { 22050 });
					}
					if (arg2.aClass6_Sub12_Sub1_1 != null) {
						local211 = Static587.method3422(arg2.aClass6_Sub12_Sub1_1, local161);
						local211.method3434(0);
						Static35.aClass6_Sub10_Sub3_1.method4737(local211);
						arg2.aClass6_Sub10_Sub2_2 = local211;
						arg2.anInt554 = (int) (Math.random() * (double) (arg2.anInt560 - arg2.anInt555)) + arg2.anInt555;
						return;
					}
				}
				return;
			}
			local280 = (int) ((double) arg2.anIntArray45.length * Math.random());
			@Pc(355) Class33 local355 = Static585.method1086(Static487.aClass168_112, arg2.anIntArray45[local280], 0);
			if (local355 != null) {
				@Pc(362) Class6_Sub12_Sub1 local362 = local355.method1085().method7958(Static184.aClass151_1);
				@Pc(367) Class6_Sub10_Sub2 local367 = Static587.method3422(local362, local161);
				local367.method3434(0);
				Static35.aClass6_Sub10_Sub3_1.method4737(local367);
				arg2.anInt554 = (int) (Math.random() * (double) (arg2.anInt560 - arg2.anInt555)) + arg2.anInt555;
				arg2.aClass6_Sub10_Sub2_2 = local367;
				return;
			}
		}
	}
}
