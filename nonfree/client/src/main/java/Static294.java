import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!sm;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray17 = new byte[1000][];

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
	public static int anInt5732 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!la;Ljava/awt/Component;III)Lclient!em;")
	public static Class43 method4509(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static107.anInt2456 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(46) Class43 local46 = (Class43) Class.forName("Class43_Sub1").getDeclaredConstructor().newInstance();
			local46.anInt3050 = arg2;
			local46.anIntArray304 = new int[(Static49.aBoolean84 ? 2 : 1) * 256];
			local46.method2447(arg1);
			local46.anInt3055 = (arg2 & 0xFFFFFC00) + 1024;
			if (local46.anInt3055 > 16384) {
				local46.anInt3055 = 16384;
			}
			local46.method2441(local46.anInt3055);
			if (Static161.anInt3593 > 0 && aClass163_1 == null) {
				aClass163_1 = new Class163();
				aClass163_1.aClass102_4 = arg0;
				arg0.method2893(Static161.anInt3593, aClass163_1);
			}
			if (aClass163_1 != null) {
				if (aClass163_1.aClass43Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				aClass163_1.aClass43Array1[arg3] = local46;
			}
			return local46;
		} catch (@Pc(127) Throwable local127) {
			try {
				@Pc(133) Class43_Sub2 local133 = new Class43_Sub2(arg0, arg3);
				local133.anIntArray304 = new int[(Static49.aBoolean84 ? 2 : 1) * 256];
				local133.anInt3050 = arg2;
				local133.method2447(arg1);
				local133.anInt3055 = 16384;
				local133.method2441(local133.anInt3055);
				if (Static161.anInt3593 > 0 && aClass163_1 == null) {
					aClass163_1 = new Class163();
					aClass163_1.aClass102_4 = arg0;
					arg0.method2893(Static161.anInt3593, aClass163_1);
				}
				if (aClass163_1 != null) {
					if (aClass163_1.aClass43Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					aClass163_1.aClass43Array1[arg3] = local133;
				}
				return local133;
			} catch (@Pc(200) Throwable local200) {
				return new Class43();
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)Z")
	public static boolean method4510() {
		if (Static219.aBoolean300) {
			try {
				Static322.method2907(Static164.aClass102_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIIILclient!rm;I)V")
	public static void method4513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class154 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg1 == 0) {
			local7 = Static160.method4114(arg0, arg2, arg5);
		} else if (arg1 == 1) {
			local7 = Static89.method1579(arg0, arg2, arg5);
		} else if (arg1 == 2) {
			local7 = Static166.method3026(arg0, arg2, arg5);
		} else if (arg1 == 3) {
			local7 = Static202.method2141(arg0, arg2, arg5);
		}
		@Pc(60) int local60 = Integer.MAX_VALUE & (int) (local7 >>> 32);
		@Pc(69) int local69 = (int) local7 >> 20 & 0x3;
		@Pc(78) int local78 = (int) local7 >> 14 & 0x1F;
		@Pc(85) Class146 local85 = Static10.method158(local60);
		if (local85.method3827()) {
			Static141.method2501(arg2, arg5, arg0, local85);
		}
		if (local7 == 0L) {
			return;
		}
		@Pc(103) Class15 local103 = null;
		@Pc(105) Class15 local105 = null;
		if (arg1 == 0) {
			@Pc(112) Class122 local112 = Static137.method2469(arg0, arg2, arg5);
			if (local112 != null) {
				local103 = local112.aClass15_3;
				local105 = local112.aClass15_2;
			}
			if (local85.anInt4746 != 0) {
				arg4.method3908(arg5, local78, local85.aBoolean317, local69, !local85.aBoolean320, arg2);
			}
		} else if (arg1 == 1) {
			@Pc(151) Class147 local151 = Static287.method4463(arg0, arg2, arg5);
			if (local151 != null) {
				local105 = local151.aClass15_4;
				local103 = local151.aClass15_5;
			}
		} else if (arg1 == 2) {
			@Pc(198) Class170 local198 = Static161.method2974(arg0, arg2, arg5);
			if (local198 != null) {
				local103 = local198.aClass15_9;
			}
			if (local85.anInt4746 != 0 && arg2 + local85.anInt4749 < 104 && arg5 + local85.anInt4749 < 104 && local85.anInt4721 + arg2 < 104 && local85.anInt4721 + arg5 < 104) {
				arg4.method3912(local85.anInt4721, arg5, arg2, local85.aBoolean317, !local85.aBoolean320, local85.anInt4749, local69);
			}
		} else if (arg1 == 3) {
			@Pc(175) Class191 local175 = Static318.method1663(arg0, arg2, arg5);
			if (local175 != null) {
				local103 = local175.aClass15_10;
			}
			if (local85.anInt4746 == 1) {
				arg4.method3926(arg5, arg2);
			}
		}
		if (local85.anIntArray467 != null) {
			local85 = local85.method3815();
		}
		if (!Static116.aBoolean184 || local85 == null || !local85.aBoolean322) {
			return;
		}
		if (local78 == 2) {
			if (local103 instanceof Class15_Sub4) {
				((Class15_Sub4) local103).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, 0, arg2, 0, local69 + 4, local78);
			}
			if (local105 instanceof Class15_Sub4) {
				((Class15_Sub4) local105).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, 0, arg2, 0, local69 + 1 & 0x3, local78);
			}
		} else if (local78 == 5) {
			if (local103 instanceof Class15_Sub4) {
				((Class15_Sub4) local103).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, Static118.anIntArray233[local69] * 8, arg2, Static17.anIntArray50[local69] * 8, local69, 4);
			}
		} else if (local78 == 6) {
			if (local103 instanceof Class15_Sub4) {
				((Class15_Sub4) local103).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, Static52.anIntArray103[local69] * 8, arg2, Static271.anIntArray520[local69] * 8, local69 + 4, 4);
			}
		} else if (local78 == 7) {
			if (local103 instanceof Class15_Sub4) {
				((Class15_Sub4) local103).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, 0, arg2, 0, (local69 + 2 & 0x3) + 4, 4);
			}
		} else if (local78 == 8) {
			if (local103 instanceof Class15_Sub4) {
				((Class15_Sub4) local103).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, Static52.anIntArray103[local69] * 8, arg2, Static271.anIntArray520[local69] * 8, local69 + 4, 4);
			}
			if (local105 instanceof Class15_Sub4) {
				((Class15_Sub4) local105).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, Static52.anIntArray103[local69] * 8, arg2, Static271.anIntArray520[local69] * 8, (local69 + 2 & 0x3) + 4, 4);
			}
		} else if (local78 == 11) {
			if (local103 instanceof Class15_Sub4) {
				((Class15_Sub4) local103).method1734();
			} else {
				Static100.method1733(local85, arg3, arg5, 0, arg2, 0, local69 + 4, 10);
			}
		} else if (local103 instanceof Class15_Sub4) {
			((Class15_Sub4) local103).method1734();
		} else {
			Static100.method1733(local85, arg3, arg5, 0, arg2, 0, local69, local78);
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)Z")
	public static boolean method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static236.anInt4758; local1++) {
			@Pc(8) Class150 local8 = Static71.aClass150Array1[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt4812 == 1) {
				local17 = local8.anInt4814 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt4810 + (local8.anInt4820 * local17 >> 8);
					local39 = local8.anInt4817 + (local8.anInt4816 * local17 >> 8);
					local49 = local8.anInt4811 + (local8.anInt4803 * local17 >> 8);
					local59 = local8.anInt4819 + (local8.anInt4818 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4812 == 2) {
				local17 = arg0 - local8.anInt4814;
				if (local17 > 0) {
					local29 = local8.anInt4810 + (local8.anInt4820 * local17 >> 8);
					local39 = local8.anInt4817 + (local8.anInt4816 * local17 >> 8);
					local49 = local8.anInt4811 + (local8.anInt4803 * local17 >> 8);
					local59 = local8.anInt4819 + (local8.anInt4818 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4812 == 3) {
				local17 = local8.anInt4810 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt4814 + (local8.anInt4809 * local17 >> 8);
					local39 = local8.anInt4806 + (local8.anInt4800 * local17 >> 8);
					local49 = local8.anInt4811 + (local8.anInt4803 * local17 >> 8);
					local59 = local8.anInt4819 + (local8.anInt4818 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4812 == 4) {
				local17 = arg2 - local8.anInt4810;
				if (local17 > 0) {
					local29 = local8.anInt4814 + (local8.anInt4809 * local17 >> 8);
					local39 = local8.anInt4806 + (local8.anInt4800 * local17 >> 8);
					local49 = local8.anInt4811 + (local8.anInt4803 * local17 >> 8);
					local59 = local8.anInt4819 + (local8.anInt4818 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt4812 == 5) {
				local17 = arg1 - local8.anInt4811;
				if (local17 > 0) {
					local29 = local8.anInt4814 + (local8.anInt4809 * local17 >> 8);
					local39 = local8.anInt4806 + (local8.anInt4800 * local17 >> 8);
					local49 = local8.anInt4810 + (local8.anInt4820 * local17 >> 8);
					local59 = local8.anInt4817 + (local8.anInt4816 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
	public static void method4516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(11, arg2);
		local8.method2052();
		local8.anInt2702 = arg0;
		local8.anInt2698 = arg1;
	}
}
