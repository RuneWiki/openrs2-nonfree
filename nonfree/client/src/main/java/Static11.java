import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	public static int anInt335;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
	public static int anInt344;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
	public static int anInt347;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array1;

	@OriginalMember(owner = "client!ca", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public static int anInt333 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_139 = Static59.method1195("The server is being updated)3");

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_140 = aClass60_139;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_141 = Static59.method1195("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "Lclient!qf;")
	private static Class60 aClass60_149 = Static59.method1195("Players");

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_142 = aClass60_149;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!qf;")
	private static Class60 aClass60_143 = Static59.method1195("Invalid username or password)3");

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_144 = Static59.method1195("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!qf;")
	private static Class60 aClass60_145 = Static59.method1195("Take");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public static int anInt340 = 0;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_146 = Static59.method1195("invback");

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	public static final int anInt342 = 0;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!qf;")
	public static Class60 aClass60_147 = aClass60_143;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
	public static int anInt345 = 0;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	public static int anInt346 = -1;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
	public static int anInt350 = 0;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!qf;")
	public static Class60 aClass60_148 = aClass60_145;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!qf;")
	public static Class60 aClass60_150 = Static59.method1195("sideicons");

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "[I")
	public static int[] anIntArray50 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
	public static int anInt351 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
	public static int anInt354 = 0;

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "Lclient!qf;")
	public static Class60 aClass60_151 = Static59.method1195("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "Lclient!qf;")
	public static Class60 aClass60_152 = Static59.method1195("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method316() {
		aClass60_141 = null;
		aClass60_139 = null;
		anIntArray50 = null;
		aClass60_143 = null;
		aClass60_150 = null;
		aClass3_Sub1_Sub2_Sub4Array1 = null;
		aClass60_146 = null;
		aClass60_145 = null;
		aClass60_152 = null;
		aClass60_149 = null;
		aClass60_147 = null;
		aByteArrayArrayArray1 = null;
		aClass60_144 = null;
		aClass60_142 = null;
		aClass60_151 = null;
		aClass60_148 = null;
		aClass60_140 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method317(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static116.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static97.aClass81_1);
		arg0.addFocusListener(Static97.aClass81_1);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIIIIIII)V")
	public static void method318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg6 < 1 || arg0 > 102 || arg6 > 102) {
			return;
		}
		if (Static14.aBoolean15 && Static119.anInt3243 != arg2) {
			return;
		}
		@Pc(39) int local39 = 0;
		if (arg1 == 0) {
			local39 = Static13.aClass58_1.method1745(arg2, arg0, arg6);
		}
		if (arg1 == 1) {
			local39 = Static13.aClass58_1.method1755(arg2, arg0, arg6);
		}
		if (arg1 == 2) {
			local39 = Static13.aClass58_1.method1774(arg2, arg0, arg6);
		}
		if (arg1 == 3) {
			local39 = Static13.aClass58_1.method1738(arg2, arg0, arg6);
		}
		@Pc(99) int local99;
		if (local39 != 0) {
			@Pc(92) int local92 = local39 >> 14 & 0x7FFF;
			local99 = Static13.aClass58_1.method1747(arg2, arg0, arg6, local39);
			@Pc(103) int local103 = local99 & 0x1F;
			@Pc(109) int local109 = local99 >> 6 & 0x3;
			@Pc(120) Class3_Sub1_Sub17 local120;
			if (arg1 == 0) {
				Static13.aClass58_1.method1732(arg2, arg0, arg6);
				local120 = Static18.method517(local92);
				if (local120.anInt3436 != 0) {
					Static89.aClass72Array1[arg2].method2102(local120.aBoolean130, arg6, arg0, local103, local109);
				}
			}
			if (arg1 == 1) {
				Static13.aClass58_1.method1751(arg2, arg0, arg6);
			}
			if (arg1 == 2) {
				Static13.aClass58_1.method1775(arg2, arg0, arg6);
				local120 = Static18.method517(local92);
				if (local120.anInt3449 + arg0 > 103 || local120.anInt3449 + arg6 > 103 || arg0 + local120.anInt3441 > 103 || arg6 + local120.anInt3441 > 103) {
					return;
				}
				if (local120.anInt3436 != 0) {
					Static89.aClass72Array1[arg2].method2113(local120.aBoolean130, local120.anInt3441, local120.anInt3449, local109, arg6, arg0);
				}
			}
			if (arg1 == 3) {
				Static13.aClass58_1.method1750(arg2, arg0, arg6);
				local120 = Static18.method517(local92);
				if (local120.anInt3436 == 1) {
					Static89.aClass72Array1[arg2].method2104(arg6, arg0);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local99 = arg2;
		if (arg2 < 3 && (Static60.aByteArrayArrayArray4[1][arg0][arg6] & 0x2) == 2) {
			local99 = arg2 + 1;
		}
		Static72.method1494(Static89.aClass72Array1[arg2], arg2, arg0, arg4, Static13.aClass58_1, local99, arg6, arg3, arg5);
		return;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method320() {
		Static79.aClass3_Sub12_Sub1_1.method1979();
		@Pc(13) int local13 = Static79.aClass3_Sub12_Sub1_1.method1982(8);
		@Pc(22) int local22;
		if (Static20.anInt829 > local13) {
			for (local22 = local13; local22 < Static20.anInt829; local22++) {
				Static74.anIntArray239[Static118.anInt3220++] = Static128.anIntArray390[local22];
			}
		}
		if (local13 > Static20.anInt829) {
			throw new RuntimeException("gnpov1");
		}
		Static20.anInt829 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static128.anIntArray390[local22];
			@Pc(68) Class3_Sub1_Sub1_Sub3_Sub2 local68 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local64];
			@Pc(73) int local73 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
			if (local73 == 0) {
				Static128.anIntArray390[Static20.anInt829++] = local64;
				local68.anInt1531 = Static34.anInt1183;
			} else {
				@Pc(93) int local93 = Static79.aClass3_Sub12_Sub1_1.method1982(2);
				if (local93 == 0) {
					Static128.anIntArray390[Static20.anInt829++] = local64;
					local68.anInt1531 = Static34.anInt1183;
					Static46.anIntArray170[Static74.anInt2399++] = local64;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local93 == 1) {
						Static128.anIntArray390[Static20.anInt829++] = local64;
						local68.anInt1531 = Static34.anInt1183;
						local138 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
						local68.method1016(false, local138);
						local148 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
						if (local148 == 1) {
							Static46.anIntArray170[Static74.anInt2399++] = local64;
						}
					} else if (local93 == 2) {
						Static128.anIntArray390[Static20.anInt829++] = local64;
						local68.anInt1531 = Static34.anInt1183;
						local138 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
						local68.method1016(true, local138);
						local148 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
						local68.method1016(true, local148);
						@Pc(202) int local202 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
						if (local202 == 1) {
							Static46.anIntArray170[Static74.anInt2399++] = local64;
						}
					} else if (local93 == 3) {
						Static74.anIntArray239[Static118.anInt3220++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!qf;Lclient!qf;ZILclient!jb;I)V")
	public static void method321(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(4) Class25 arg2) {
		@Pc(4) int local4 = arg2.method920(arg0);
		@Pc(19) int local19 = arg2.method922(local4, arg1);
		Static120.method2180(arg2, local19, 255, local4);
	}
}
