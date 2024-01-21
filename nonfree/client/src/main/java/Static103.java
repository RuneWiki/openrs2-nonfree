import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray26;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_996 = Static187.method3089("Okay");

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "[I")
	public static final int[] anIntArray167 = new int[32768];

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_997 = Static187.method3089("Please contact customer support)3");

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "Z")
	public static final boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "Lclient!vd;")
	public static Class92 aClass92_998 = aClass92_997;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
	public static int anInt2229 = 0;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
	public static int anInt2230 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static102.anInt2207 <= arg5 && Static116.anInt2488 >= arg0 && arg4 >= Static118.anInt2521 && Static204.anInt2389 >= arg2) {
			Static119.method1755(arg3, arg5, arg4, arg6, arg2, arg1, arg0);
		} else {
			Static123.method1827(arg2, arg5, arg3, arg1, arg6, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILclient!e;JLclient!e;Lclient!e;)V")
	public static void method1560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class8 arg6, @OriginalArg(7) Class8 arg7) {
		@Pc(3) Class87 local3 = new Class87();
		local3.aClass8_8 = arg4;
		local3.anInt3911 = arg1 * 128 + 64;
		local3.anInt3910 = arg2 * 128 + 64;
		local3.anInt3912 = arg3;
		local3.aLong213 = arg5;
		local3.aClass8_10 = arg6;
		local3.aClass8_9 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub17 local42 = Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2380; local46++) {
				@Pc(52) Class16 local52 = local42.aClass16Array3[local46];
				if ((local52.aLong30 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass8_2.method2668();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt3915 = -local34;
		if (Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub17(arg0, arg1, arg2);
		}
		Static179.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass87_1 = local3;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILclient!d;Ljava/awt/Component;)Lclient!bh;")
	public static Class15 method1561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Component arg3) {
		if (Static96.anInt2009 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class15 local30 = (Class15) Class.forName("Class15_Sub2").getDeclaredConstructor().newInstance();
			local30.anIntArray305 = new int[(Static151.aBoolean177 ? 2 : 1) * 256];
			local30.anInt3492 = arg1;
			local30.method2620(arg3);
			local30.anInt3490 = (arg1 & 0xFFFFFC00) + 1024;
			if (local30.anInt3490 > 16384) {
				local30.anInt3490 = 16384;
			}
			local30.method2621(local30.anInt3490);
			if (Static149.anInt3048 > 0 && Static21.aClass56_1 == null) {
				Static21.aClass56_1 = new Class56();
				Static21.aClass56_1.aClass24_2 = arg2;
				arg2.method560(Static21.aClass56_1, Static149.anInt3048);
			}
			if (Static21.aClass56_1 != null) {
				if (Static21.aClass56_1.aClass15Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static21.aClass56_1.aClass15Array1[arg0] = local30;
			}
			return local30;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class15_Sub1 local114 = new Class15_Sub1(arg2, arg0);
				local114.anInt3492 = arg1;
				local114.anIntArray305 = new int[(Static151.aBoolean177 ? 2 : 1) * 256];
				local114.method2620(arg3);
				local114.anInt3490 = 16384;
				local114.method2621(local114.anInt3490);
				if (Static149.anInt3048 > 0 && Static21.aClass56_1 == null) {
					Static21.aClass56_1 = new Class56();
					Static21.aClass56_1.aClass24_2 = arg2;
					arg2.method560(Static21.aClass56_1, Static149.anInt3048);
				}
				if (Static21.aClass56_1 != null) {
					if (Static21.aClass56_1.aClass15Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static21.aClass56_1.aClass15Array1[arg0] = local114;
				}
				return local114;
			} catch (@Pc(173) Throwable local173) {
				return new Class15();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!kf;III)V")
	public static void method1562(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static152.anInt3135 >= 400) {
			return;
		}
		if (arg1.anIntArray169 != null) {
			arg1 = arg1.method1581();
		}
		if (arg1 == null || !arg1.aBoolean131) {
			return;
		}
		@Pc(31) Class92 local31 = arg1.aClass92_1017;
		if (arg1.anInt2271 != 0) {
			local31 = Static208.method787(new Class92[] { local31, Static178.method2909(Static15.aClass8_Sub3_Sub1_1.anInt975, arg1.anInt2271), Static138.aClass92_1348, Static17.aClass92_1689, Static49.method872(arg1.anInt2271), Static167.aClass92_1685 });
		}
		if (Static189.anInt4128 == 1) {
			Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static186.aClass92_1900, Static93.aClass92_866, local31 }), arg0, arg2, (short) 48, Static140.aClass92_1352);
		} else if (!Static72.aBoolean100) {
			@Pc(85) Class92[] local85 = arg1.aClass92Array15;
			if (aBoolean129) {
				local85 = Static72.method1107(local85);
			}
			@Pc(95) int local95;
			if (local85 != null) {
				for (local95 = 4; local95 >= 0; local95--) {
					if (local85[local95] != null && (Static63.anInt3580 != 0 || !local85[local95].method3241(Static159.aClass92_1614))) {
						@Pc(119) byte local119 = 0;
						if (local95 == 0) {
							local119 = 21;
						}
						if (local95 == 1) {
							local119 = 50;
						}
						if (local95 == 2) {
							local119 = 47;
						}
						if (local95 == 3) {
							local119 = 25;
						}
						if (local95 == 4) {
							local119 = 7;
						}
						Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static98.aClass92_937, local31 }), arg0, arg2, local119, local85[local95]);
					}
				}
			}
			if (Static63.anInt3580 == 0 && local85 != null) {
				for (local95 = 4; local95 >= 0; local95--) {
					if (local85[local95] != null && local85[local95].method3241(Static159.aClass92_1614)) {
						@Pc(199) short local199 = 0;
						@Pc(201) short local201 = 0;
						if (arg1.anInt2271 > Static15.aClass8_Sub3_Sub1_1.anInt975) {
							local199 = 2000;
						}
						if (local95 == 0) {
							local201 = 21;
						}
						if (local95 == 1) {
							local201 = 50;
						}
						if (local95 == 2) {
							local201 = 47;
						}
						if (local95 == 3) {
							local201 = 25;
						}
						if (local95 == 4) {
							local201 = 7;
						}
						if (local201 != 0) {
							local201 += local199;
						}
						Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static98.aClass92_937, local31 }), arg0, arg2, local201, local85[local95]);
					}
				}
			}
			Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static98.aClass92_937, local31 }), arg0, arg2, (short) 1006, Static19.aClass92_212);
			return;
		} else if ((Static19.anInt529 & 0x2) == 2) {
			Static116.method1722((long) arg3, Static208.method787(new Class92[] { Static15.aClass92_135, Static93.aClass92_866, local31 }), arg0, arg2, (short) 43, Static48.aClass92_516);
			return;
		}
	}
}
