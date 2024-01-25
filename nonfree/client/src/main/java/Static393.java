import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "[Lclient!pd;")
	public static Class139_Sub1[] aClass139_Sub1Array1;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!kh;")
	public static final Class172 aClass172_6 = new Class172();

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!iv;")
	public static final Class150 aClass150_6 = new Class150();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5717(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static244.anInt4491 >= 100) {
			Static141.method2337(Static146.aClass103_86.method2355(Static188.anInt28));
			return;
		}
		@Pc(25) String local25 = Static83.method1161(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(37) int local37 = 0; local37 < Static244.anInt4491; local37++) {
			@Pc(45) String local45 = Static83.method1161(Static74.aStringArray5[local37]);
			if (local45 != null && local45.equals(local25)) {
				Static141.method2337(arg0 + Static146.aClass103_87.method2355(Static188.anInt28));
				return;
			}
			if (Static41.aStringArray4[local37] != null) {
				local76 = Static83.method1161(Static41.aStringArray4[local37]);
				if (local76 != null && local76.equals(local25)) {
					Static141.method2337(arg0 + Static146.aClass103_87.method2355(Static188.anInt28));
					return;
				}
			}
		}
		for (@Pc(105) int local105 = 0; local105 < Static569.anInt9840; local105++) {
			local76 = Static83.method1161(Static326.aStringArray26[local105]);
			if (local76 != null && local76.equals(local25)) {
				Static141.method2337(Static146.aClass103_92.method2355(Static188.anInt28) + arg0 + Static146.aClass103_93.method2355(Static188.anInt28));
				return;
			}
			if (Static114.aStringArray8[local105] != null) {
				@Pc(149) String local149 = Static83.method1161(Static114.aStringArray8[local105]);
				if (local149 != null && local149.equals(local25)) {
					Static141.method2337(Static146.aClass103_92.method2355(Static188.anInt28) + arg0 + Static146.aClass103_93.method2355(Static188.anInt28));
					return;
				}
			}
		}
		if (Static83.method1161(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82).equals(local25)) {
			Static141.method2337(Static146.aClass103_89.method2355(Static188.anInt28));
		} else {
			Static534.method7063(Static343.aClass316_78);
			Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(arg0) + 1);
			Static340.aClass6_Sub12_Sub2_1.method6009(arg0);
			Static340.aClass6_Sub12_Sub2_1.method6047(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
	public static int method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static582.anIntArrayArray69 == null ? 0 : Static582.anIntArrayArray69[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
	public static void method5724(@OriginalArg(1) boolean arg0) {
		Static262.method3999();
		if (!Static151.method2389(Static375.anInt9162)) {
			return;
		}
		Static75.anInt1265++;
		if (Static75.anInt1265 < 50 && !arg0) {
			return;
		}
		Static75.anInt1265 = 0;
		if (!Static476.aBoolean540 && Static354.aClass1_1 != null) {
			Static534.method7063(Static83.aClass316_19);
			try {
				Static354.aClass1_1.method53(Static340.aClass6_Sub12_Sub2_1.aByteArray97, Static340.aClass6_Sub12_Sub2_1.anInt7556);
				Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
			} catch (@Pc(48) IOException local48) {
				Static476.aBoolean540 = true;
			}
		}
		Static262.method3999();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)Z")
	public static boolean method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static245.method3831(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static23.anInt420;
		@Pc(14) int local14 = arg2 << Static23.anInt420;
		@Pc(23) int local23 = Static205.aClass46Array1[arg0].JA(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static23.anInt420 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static23.anInt420 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static23.anInt420 - 7);
		if (arg3 == 1) {
			if (local10 > Static226.anInt4160) {
				if (!Static416.method5920(local10, local23, local14)) {
					return false;
				}
				if (!Static416.method5920(local10, local23, local14 + Static259.anInt4703)) {
					return false;
				}
				if (!Static416.method5920(local10, local23, local14 + Static113.anInt1928)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static416.method5920(local10, local31, local14)) {
					return false;
				}
				if (!Static416.method5920(local10, local31, local14 + Static259.anInt4703)) {
					return false;
				}
				if (!Static416.method5920(local10, local31, local14 + Static113.anInt1928)) {
					return false;
				}
			}
			if (!Static416.method5920(local10, local39, local14)) {
				return false;
			} else if (Static416.method5920(local10, local39, local14 + Static259.anInt4703)) {
				return Static416.method5920(local10, local39, local14 + Static113.anInt1928);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static567.anInt9819) {
				if (!Static416.method5920(local10, local23, local14 + Static113.anInt1928)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static259.anInt4703, local23, local14 + Static113.anInt1928)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local23, local14 + Static113.anInt1928)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static416.method5920(local10, local31, local14 + Static113.anInt1928)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static259.anInt4703, local31, local14 + Static113.anInt1928)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local31, local14 + Static113.anInt1928)) {
					return false;
				}
			}
			if (!Static416.method5920(local10, local39, local14 + Static113.anInt1928)) {
				return false;
			} else if (Static416.method5920(local10 + Static259.anInt4703, local39, local14 + Static113.anInt1928)) {
				return Static416.method5920(local10 + Static113.anInt1928, local39, local14 + Static113.anInt1928);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static226.anInt4160) {
				if (!Static416.method5920(local10 + Static113.anInt1928, local23, local14)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local23, local14 + Static259.anInt4703)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local23, local14 + Static113.anInt1928)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static416.method5920(local10 + Static113.anInt1928, local31, local14)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local31, local14 + Static259.anInt4703)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local31, local14 + Static113.anInt1928)) {
					return false;
				}
			}
			if (!Static416.method5920(local10 + Static113.anInt1928, local39, local14)) {
				return false;
			} else if (Static416.method5920(local10 + Static113.anInt1928, local39, local14 + Static259.anInt4703)) {
				return Static416.method5920(local10 + Static113.anInt1928, local39, local14 + Static113.anInt1928);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static567.anInt9819) {
				if (!Static416.method5920(local10, local23, local14)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static259.anInt4703, local23, local14)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static416.method5920(local10, local31, local14)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static259.anInt4703, local31, local14)) {
					return false;
				}
				if (!Static416.method5920(local10 + Static113.anInt1928, local31, local14)) {
					return false;
				}
			}
			if (!Static416.method5920(local10, local39, local14)) {
				return false;
			} else if (Static416.method5920(local10 + Static259.anInt4703, local39, local14)) {
				return Static416.method5920(local10 + Static113.anInt1928, local39, local14);
			} else {
				return false;
			}
		} else if (!Static416.method5920(local10 + Static259.anInt4703, local47, local14 + Static259.anInt4703)) {
			return false;
		} else if (arg3 == 16) {
			return Static416.method5920(local10, local39, local14 + Static113.anInt1928);
		} else if (arg3 == 32) {
			return Static416.method5920(local10 + Static113.anInt1928, local39, local14 + Static113.anInt1928);
		} else if (arg3 == 64) {
			return Static416.method5920(local10 + Static113.anInt1928, local39, local14);
		} else if (arg3 == 128) {
			return Static416.method5920(local10, local39, local14);
		} else {
			return true;
		}
	}
}
