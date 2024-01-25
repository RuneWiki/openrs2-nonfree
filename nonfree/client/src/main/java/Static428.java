import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!qfa;")
	public static Class272 aClass272_46;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Z")
	private static boolean aBoolean156;

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
	private static int anInt1904;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
	private static int anInt1905;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "Z")
	private static boolean aBoolean157;

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	private static int anInt1906;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "Z")
	private static boolean aBoolean158;

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "Z")
	private static boolean aBoolean159;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "Z")
	private static boolean aBoolean160;

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
	private static int anInt1907;

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	private static int anInt1908;

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
	private static int anInt1909;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
	private static int anInt1910;

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
	private static int anInt1911;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "Z")
	private static boolean aBoolean161;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "[I")
	public static int[] anIntArray119 = new int[1];

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString28 = null;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!fda;I)I")
	public static int method1615(@OriginalArg(0) Class93 arg0) {
		if (arg0 == Static146.aClass93_6) {
			return 6407;
		} else if (arg0 == Static581.aClass93_14) {
			return 6408;
		} else if (Static563.aClass93_13 == arg0) {
			return 6406;
		} else if (Static423.aClass93_9 == arg0) {
			return 6409;
		} else if (Static58.aClass93_4 == arg0) {
			return 6410;
		} else if (arg0 == Static586.aClass93_15) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1617(@OriginalArg(0) String arg0) {
		if (Static419.aClass325Array5 != null) {
			@Pc(15) Class3_Sub34 local15 = Static374.method5522(Static594.aClass298_180, Static220.aClass287_2);
			local15.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(arg0));
			local15.aClass3_Sub11_Sub1_2.method3136(arg0);
			Static131.method2572(local15);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIIIIIILclient!r;)V")
	public static void method1621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class43 arg7) {
		@Pc(15) Interface22 local15 = (Interface22) Static247.method4031(arg3, arg5, arg4);
		@Pc(24) Class23 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (local15 != null) {
			local24 = Static476.aClass69_5.method2181(local15.method7088());
			local30 = local15.method7093() & 0x3;
			local34 = local15.method7091();
			if (local24.anInt735 == -1) {
				local40 = arg2;
				if (local24.anInt772 > 0) {
					local40 = arg6;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg7.method7213(arg1, 4, local40, arg0);
					} else if (local30 == 1) {
						arg7.method7200(arg1, local40, 4, arg0);
					} else if (local30 == 2) {
						arg7.method7213(arg1 + 3, 4, local40, arg0);
					} else if (local30 == 3) {
						arg7.method7200(arg1, local40, 4, arg0 + 3);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg7.method7185(arg0, 1, 1, arg1, local40);
					} else if (local30 == 1) {
						arg7.method7185(arg0, 1, 1, arg1 + 3, local40);
					} else if (local30 == 2) {
						arg7.method7185(arg0 + 3, 1, 1, arg1 + 3, local40);
					} else if (local30 == 3) {
						arg7.method7185(arg0 + 3, 1, 1, arg1, local40);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg7.method7200(arg1, local40, 4, arg0);
					} else if (local30 == 1) {
						arg7.method7213(arg1 + 3, 4, local40, arg0);
					} else if (local30 == 2) {
						arg7.method7200(arg1, local40, 4, arg0 + 3);
					} else if (local30 == 3) {
						arg7.method7213(arg1, 4, local40, arg0);
					}
				}
			} else {
				Static310.method4850(arg0, local30, local24, arg1, arg7);
			}
		}
		local15 = (Interface22) Static417.method5998(arg3, arg5, arg4, qu.class);
		if (local15 != null) {
			local24 = Static476.aClass69_5.method2181(local15.method7088());
			local30 = local15.method7093() & 0x3;
			local34 = local15.method7091();
			if (local24.anInt735 != -1) {
				Static310.method4850(arg0, local30, local24, arg1, arg7);
			} else if (local34 == 9) {
				local40 = -1118482;
				if (local24.anInt772 > 0) {
					local40 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg7.method7174(arg1 + 3, arg0, arg0 + 3, arg1, local40);
				} else {
					arg7.method7174(arg1 + 3, arg0 - -3, arg0, arg1, local40);
				}
			}
		}
		local15 = (Interface22) Static168.method7472(arg3, arg5, arg4);
		if (local15 == null) {
			return;
		}
		local24 = Static476.aClass69_5.method2181(local15.method7088());
		local30 = local15.method7093() & 0x3;
		if (local24.anInt735 != -1) {
			Static310.method4850(arg0, local30, local24, arg1, arg7);
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	public static void method1624() {
		for (@Pc(7) int local7 = 0; local7 < Static154.aByteArrayArrayArray15.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static154.aByteArrayArrayArray15[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static154.aByteArrayArrayArray15[0][0].length; local15++) {
					Static154.aByteArrayArrayArray15[local7][local11][local15] = 0;
				}
			}
		}
	}
}
