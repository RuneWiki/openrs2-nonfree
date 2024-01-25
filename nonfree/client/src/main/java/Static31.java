import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Lclient!qm;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "Lclient!ui;")
	public static Class230 aClass230_9;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_13 = new Class211(13, -2);

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!tq;IIIIIII)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) Interface6 local11 = (Interface6) Static186.method2676(arg6, arg5, arg0);
		@Pc(33) Class236 local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(49) int local49;
		if (local11 != null) {
			local33 = Static54.aClass153_1.method3081(local11.method5250());
			local39 = local11.method5251() & 0x3;
			local43 = local11.method5246();
			if (local33.anInt5922 == -1) {
				local49 = arg7;
				if (local33.anInt5915 > 0) {
					local49 = arg4;
				}
				if (local43 == 0 || local43 == 2) {
					if (local39 == 0) {
						arg1.method5362(local49, 4, arg2, arg3);
					} else if (local39 == 1) {
						arg1.method5395(arg2, 4, local49, arg3);
					} else if (local39 == 2) {
						arg1.method5362(local49, 4, arg2, arg3 + 3);
					} else if (local39 == 3) {
						arg1.method5395(arg2 + 3, 4, local49, arg3);
					}
				}
				if (local43 == 3) {
					if (local39 == 0) {
						arg1.method5343(1, local49, arg2, arg3, 1);
					} else if (local39 == 1) {
						arg1.method5343(1, local49, arg2, arg3 + 3, 1);
					} else if (local39 == 2) {
						arg1.method5343(1, local49, arg2 + 3, arg3 + 3, 1);
					} else if (local39 == 3) {
						arg1.method5343(1, local49, arg2 + 3, arg3, 1);
					}
				}
				if (local43 == 2) {
					if (local39 == 0) {
						arg1.method5395(arg2, 4, local49, arg3);
					} else if (local39 == 1) {
						arg1.method5362(local49, 4, arg2, arg3 + 3);
					} else if (local39 == 2) {
						arg1.method5395(arg2 + 3, 4, local49, arg3);
					} else if (local39 == 3) {
						arg1.method5362(local49, 4, arg2, arg3);
					}
				}
			} else {
				Static109.method1540(arg2, local33, local39, arg3, arg1);
			}
		}
		local11 = (Interface6) Static67.method1123(arg6, arg5, arg0, ki.class);
		if (local11 != null) {
			local33 = Static54.aClass153_1.method3081(local11.method5250());
			local39 = local11.method5251() & 0x3;
			local43 = local11.method5246();
			if (local33.anInt5922 != -1) {
				Static109.method1540(arg2, local33, local39, arg3, arg1);
			} else if (local43 == 9) {
				local49 = -1118482;
				if (local33.anInt5915 > 0) {
					local49 = -1179648;
				}
				if (local39 == 0 || local39 == 2) {
					arg1.method5358(arg2, local49, arg3, arg2 + 3, arg3 - -3);
				} else {
					arg1.method5358(arg2 + 3, local49, arg3, arg2, arg3 + 3);
				}
			}
		}
		local11 = (Interface6) Static91.method1355(arg6, arg5, arg0);
		if (local11 == null) {
			return;
		}
		local33 = Static54.aClass153_1.method3081(local11.method5250());
		local39 = local11.method5251() & 0x3;
		if (local33.anInt5922 != -1) {
			Static109.method1540(arg2, local33, local39, arg3, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!bg;B)V")
	public static void method494(@OriginalArg(0) Class25_Sub1_Sub1_Sub1 arg0) {
		@Pc(15) Class1_Sub18 local15 = (Class1_Sub18) Static48.aClass77_4.method1368((long) arg0.anInt2331);
		if (local15 == null) {
			return;
		}
		if (local15.aClass1_Sub7_Sub2_2 != null) {
			Static366.aClass1_Sub7_Sub4_2.method4410(local15.aClass1_Sub7_Sub2_2);
			local15.aClass1_Sub7_Sub2_2 = null;
		}
		local15.method5577();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)Z")
	public static boolean method495() {
		try {
			return Static113.method1650();
		} catch (@Pc(22) IOException local22) {
			Static48.method744();
			return true;
		} catch (@Pc(27) Exception local27) {
			@Pc(87) String local87 = "T2 - " + (Static186.aClass211_85 == null ? -1 : Static186.aClass211_85.method4707()) + "," + (Static71.aClass211_28 == null ? -1 : Static71.aClass211_28.method4707()) + "," + (Static144.aClass211_67 == null ? -1 : Static144.aClass211_67.method4707()) + " - " + Static121.anInt2167 + "," + (Static256.anInt4410 + Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0]) + "," + (Static293.anInt5053 + Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0]) + " - ";
			for (@Pc(89) int local89 = 0; local89 < Static121.anInt2167 && local89 < 50; local89++) {
				local87 = local87 + Static139.aClass1_Sub33_Sub2_1.aByteArray86[local89] + ",";
			}
			Static62.method1006(local27, local87);
			Static384.method5442();
			return true;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ug;Z)Z")
	public static boolean method498(@OriginalArg(0) Class25_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static229.aClass42Array3 == Static77.aClass42Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) byte local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5241();
		if (arg0.aShort88 < 0 || arg0.aShort89 < 0 || arg0.aShort87 >= Static19.anInt329 || arg0.aShort90 >= Static230.anInt6113) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort88; local34 <= arg0.aShort87; local34++) {
			for (local38 = arg0.aShort89; local38 <= arg0.aShort90; local38++) {
				@Pc(45) Class132 local45 = Static18.method2854(arg0.aByte70, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort88) {
						local49++;
					}
					if (local34 < arg0.aShort87) {
						local49 += 4;
					}
					if (local38 > arg0.aShort89) {
						local49 += 8;
					}
					if (local38 < arg0.aShort90) {
						local49 += 2;
					}
					@Pc(74) Class116 local74 = Static131.method1913(local49, arg0);
					@Pc(77) Class116 local77 = local45.aClass116_3;
					if (local77 == null) {
						local45.aClass116_3 = local74;
					} else {
						while (local77.aClass116_2 != null) {
							local77 = local77.aClass116_2;
						}
						local77.aClass116_2 = local74;
					}
					local45.aByte51 = (byte) (local45.aByte51 | local49);
					if (local6 && (Static113.anIntArrayArray30[local34][local38] & 0xFF000000) != 0) {
						local8 = Static113.anIntArrayArray30[local34][local38];
						local10 = Static351.aByteArrayArray20[local34][local38];
						local12 = Static35.aByteArrayArray1[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort88; local38 <= arg0.aShort87; local38++) {
				for (@Pc(150) int local150 = arg0.aShort89; local150 <= arg0.aShort90; local150++) {
					if ((Static113.anIntArrayArray30[local38][local150] & 0xFF000000) == 0) {
						Static113.anIntArrayArray30[local38][local150] = local8;
						Static351.aByteArrayArray20[local38][local150] = local10;
						Static35.aByteArrayArray1[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static65.aClass25_Sub1Array2[Static143.anInt2670++] = arg0;
		}
		return true;
	}
}
