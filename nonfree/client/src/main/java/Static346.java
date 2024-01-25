import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
	public static final int[] anIntArray713 = new int[32];

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Z")
	public static boolean aBoolean418 = true;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public static int anInt6269 = 0;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method5702(@OriginalArg(1) int arg0) {
		Static277.anInt5295 = arg0;
		Static174.aClass70_58.method1399();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method5704() {
		if (!Static79.aBoolean97) {
			return;
		}
		@Pc(11) Class132 local11 = Static6.method131(Static30.anInt572, Static252.anInt4705);
		if (local11 != null && local11.anObjectArray9 != null) {
			@Pc(20) Class6_Sub15 local20 = new Class6_Sub15();
			local20.aClass132_5 = local11;
			local20.anObjectArray2 = local11.anObjectArray9;
			Static140.method2654(local20);
		}
		Static79.aBoolean97 = false;
		Static163.anInt3085 = -1;
		Static298.method5108(local11);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ICI)I")
	public static int method5705(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	public static void method5706(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(5, arg0);
		local8.method2645();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method5707(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static210.method3751(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static87.method1484(local7);
			local7 = Static159.method3147("%3a", ":", local7);
			local7 = Static159.method3147("%40", "@", local7);
			local7 = Static159.method3147("%26", "&", local7);
			local7 = Static159.method3147("%23", "#", local7);
			if (Static292.aClass206_4.anApplet1 != null) {
				@Pc(101) Class196 local101 = Static292.aClass206_4.method5518(new URL(Static292.aClass206_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static29.anInt565 + "&u=" + Static121.aLong190 + "&v1=" + Static332.aString292 + "&v2=" + Static332.aString293 + "&e=" + local7));
				while (local101.anInt5851 == 0) {
					Static278.method5283(1L);
				}
				if (local101.anInt5851 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local101.anObject8;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!qo;[IB[I[I)V")
	public static void method5708(@OriginalArg(0) Class44_Sub4_Sub4_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) int local18 = arg1[local12];
			@Pc(22) int local22 = arg3[local12];
			@Pc(26) int local26 = arg2[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && arg0.aClass192Array3.length > local28) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg0.aClass192Array3[local28] = null;
					} else {
						@Pc(51) Class24 local51 = Static209.method3737(local18);
						@Pc(54) int local54 = local51.anInt574;
						@Pc(59) Class192 local59 = arg0.aClass192Array3[local28];
						if (local59 != null) {
							if (local18 == local59.anInt5797) {
								if (local54 == 0) {
									local59 = arg0.aClass192Array3[local28] = null;
								} else if (local54 == 1) {
									local59.anInt5792 = 0;
									local59.anInt5789 = 0;
									local59.anInt5791 = local26;
									local59.anInt5786 = 1;
									local59.anInt5796 = 0;
									Static203.method3667(0, arg0.anInt6339, local51, arg0.anInt6340, Static253.aClass44_Sub4_Sub4_Sub1_1 == arg0);
								} else if (local54 == 2) {
									local59.anInt5789 = 0;
								}
							} else if (local51.anInt588 >= Static209.method3737(local59.anInt5797).anInt588) {
								local59 = arg0.aClass192Array3[local28] = null;
							}
						}
						if (local59 == null) {
							local59 = arg0.aClass192Array3[local28] = new Class192();
							local59.anInt5791 = local26;
							local59.anInt5786 = 1;
							local59.anInt5796 = 0;
							local59.anInt5792 = 0;
							local59.anInt5789 = 0;
							local59.anInt5797 = local18;
							Static203.method3667(0, arg0.anInt6339, local51, arg0.anInt6340, arg0 == Static253.aClass44_Sub4_Sub4_Sub1_1);
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}
}
