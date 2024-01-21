import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
	public static long aLong99;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public static int anInt2210;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!df;")
	public static Class5_Sub2_Sub6_Sub1 aClass5_Sub2_Sub6_Sub1_5;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!mb;")
	public static Class45 aClass45_929 = Static63.method1251("");

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_921 = aClass45_929;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_922 = aClass45_929;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_923 = aClass45_929;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public static int anInt2204 = 0;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_924 = Static63.method1251("(U3");

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_925 = aClass45_929;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_926 = aClass45_929;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_927 = Static63.method1251("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "[B")
	public static byte[] aByteArray30 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_928 = aClass45_929;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	public static int anInt2212 = 0;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!mb;")
	public static Class45 aClass45_930 = aClass45_929;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	public static int anInt2215 = 0;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	public static int anInt2217 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public static void method1483() {
		aClass45_930 = null;
		aClass45_926 = null;
		aClass45_923 = null;
		aClass45_928 = null;
		aClass45_921 = null;
		aClass45_924 = null;
		aByteArray30 = null;
		aClass45_925 = null;
		aClass5_Sub2_Sub6_Sub1_5 = null;
		aClass45_922 = null;
		aClass45_927 = null;
		aClass45_929 = null;
		aByteArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)Z")
	public static boolean method1484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && arg0 == Static27.anInt858) {
			return true;
		} else if (arg1 == 1 && arg0 == Static32.anInt943) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static111.anInt2905;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public static void method1485(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static36.method768(arg0)) {
			return;
		}
		@Pc(19) Class5_Sub2_Sub8[] local19 = Static19.aClass5_Sub2_Sub8ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class5_Sub2_Sub8 local27 = local19[local21];
			if (local27.anObjectArray10 != null) {
				Static33.method687(0, null, 0, local27.anObjectArray10, 0, local27);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1486() {
		for (@Pc(10) Class5_Sub19 local10 = (Class5_Sub19) Static74.aClass10_10.method230(); local10 != null; local10 = (Class5_Sub19) Static74.aClass10_10.method233()) {
			if (local10.anInt3116 == -1) {
				local10.anInt3120 = 0;
				Static62.method1234(local10);
			} else {
				local10.method2144();
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!jc;IIIIILclient!i;I)V")
	public static void method1487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class34 arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = Static40.anIntArrayArrayArray2[arg1][arg5][arg8];
		@Pc(25) int local25 = Static40.anIntArrayArrayArray2[arg1][arg5 + 1][arg8 + 1];
		@Pc(35) int local35 = Static40.anIntArrayArrayArray2[arg1][arg5 + 1][arg8];
		@Pc(45) int local45 = Static40.anIntArrayArrayArray2[arg1][arg5][arg8 + 1];
		@Pc(55) int local55 = local25 + local9 + local35 + local45 >> 2;
		@Pc(59) Class5_Sub2_Sub7 local59 = Static62.method1232(arg0);
		@Pc(65) int local65 = (arg6 << 6) + arg4;
		@Pc(78) int local78 = (arg0 << 14) + arg5 + (arg8 << 7) + 1073741824;
		if (local59.anInt828 == 0) {
			local78 += Integer.MIN_VALUE;
		}
		if (local59.anInt832 == 1) {
			local65 += 256;
		}
		@Pc(117) Class5_Sub2_Sub4 local117;
		if (arg4 == 22) {
			if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
				local117 = local59.method603(22, local9, local35, local25, local45, arg6);
			} else {
				local117 = new Class5_Sub2_Sub4_Sub5(arg0, 22, arg6, local9, local35, local25, local45, local59.anInt831, true, null);
			}
			arg7.method898(arg3, arg5, arg8, local55, local117, local78, local65);
			if (local59.aBoolean43 && local59.anInt828 == 1) {
				arg2.method1122(arg8, arg5);
			}
			return;
		}
		@Pc(205) int local205;
		@Pc(208) int local208;
		if (arg4 == 10 || arg4 == 11) {
			if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
				local117 = local59.method603(10, local9, local35, local25, local45, arg6);
			} else {
				local117 = new Class5_Sub2_Sub4_Sub5(arg0, 10, arg6, local9, local35, local25, local45, local59.anInt831, true, null);
			}
			if (local117 != null) {
				if (arg6 == 1 || arg6 == 3) {
					local208 = local59.anInt839;
					local205 = local59.anInt829;
				} else {
					local205 = local59.anInt839;
					local208 = local59.anInt829;
				}
				@Pc(218) int local218 = 0;
				if (arg4 == 11) {
					local218 += 256;
				}
				arg7.method912(arg3, arg5, arg8, local55, local205, local208, local117, local218, local78, local65);
			}
			if (local59.aBoolean43) {
				arg2.method1117(local59.anInt829, local59.aBoolean35, arg6, arg8, local59.anInt839, arg5);
			}
		} else if (arg4 >= 12) {
			if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
				local117 = local59.method603(arg4, local9, local35, local25, local45, arg6);
			} else {
				local117 = new Class5_Sub2_Sub4_Sub5(arg0, arg4, arg6, local9, local35, local25, local45, local59.anInt831, true, null);
			}
			arg7.method912(arg3, arg5, arg8, local55, 1, 1, local117, 0, local78, local65);
			if (local59.aBoolean43) {
				arg2.method1117(local59.anInt829, local59.aBoolean35, arg6, arg8, local59.anInt839, arg5);
			}
		} else if (arg4 == 0) {
			if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
				local117 = local59.method603(0, local9, local35, local25, local45, arg6);
			} else {
				local117 = new Class5_Sub2_Sub4_Sub5(arg0, 0, arg6, local9, local35, local25, local45, local59.anInt831, true, null);
			}
			arg7.method919(arg3, arg5, arg8, local55, local117, null, Static53.anIntArray348[arg6], 0, local78, local65);
			if (local59.aBoolean43) {
				arg2.method1119(arg6, local59.aBoolean35, arg4, arg8, arg5);
			}
		} else if (arg4 == 1) {
			if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
				local117 = local59.method603(1, local9, local35, local25, local45, arg6);
			} else {
				local117 = new Class5_Sub2_Sub4_Sub5(arg0, 1, arg6, local9, local35, local25, local45, local59.anInt831, true, null);
			}
			arg7.method919(arg3, arg5, arg8, local55, local117, null, Static29.anIntArray151[arg6], 0, local78, local65);
			if (local59.aBoolean43) {
				arg2.method1119(arg6, local59.aBoolean35, arg4, arg8, arg5);
			}
		} else {
			@Pc(476) Class5_Sub2_Sub4 local476;
			if (arg4 == 2) {
				@Pc(457) int local457 = arg6 + 1 & 0x3;
				@Pc(486) Class5_Sub2_Sub4 local486;
				if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
					local476 = local59.method603(2, local9, local35, local25, local45, arg6 + 4);
					local486 = local59.method603(2, local9, local35, local25, local45, local457);
				} else {
					local476 = new Class5_Sub2_Sub4_Sub5(arg0, 2, arg6 + 4, local9, local35, local25, local45, local59.anInt831, true, null);
					local486 = new Class5_Sub2_Sub4_Sub5(arg0, 2, local457, local9, local35, local25, local45, local59.anInt831, true, null);
				}
				arg7.method919(arg3, arg5, arg8, local55, local476, local486, Static53.anIntArray348[arg6], Static53.anIntArray348[local457], local78, local65);
				if (local59.aBoolean43) {
					arg2.method1119(arg6, local59.aBoolean35, arg4, arg8, arg5);
				}
			} else if (arg4 == 3) {
				if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
					local476 = local59.method603(3, local9, local35, local25, local45, arg6);
				} else {
					local476 = new Class5_Sub2_Sub4_Sub5(arg0, 3, arg6, local9, local35, local25, local45, local59.anInt831, true, null);
				}
				arg7.method919(arg3, arg5, arg8, local55, local476, null, Static29.anIntArray151[arg6], 0, local78, local65);
				if (local59.aBoolean43) {
					arg2.method1119(arg6, local59.aBoolean35, arg4, arg8, arg5);
				}
			} else if (arg4 == 9) {
				if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
					local476 = local59.method603(arg4, local9, local35, local25, local45, arg6);
				} else {
					local476 = new Class5_Sub2_Sub4_Sub5(arg0, arg4, arg6, local9, local35, local25, local45, local59.anInt831, true, null);
				}
				arg7.method912(arg3, arg5, arg8, local55, 1, 1, local476, 0, local78, local65);
				if (local59.aBoolean43) {
					arg2.method1117(local59.anInt829, local59.aBoolean35, arg6, arg8, local59.anInt839, arg5);
				}
			} else {
				if (local59.aBoolean40) {
					if (arg6 == 1) {
						local205 = local45;
						local45 = local25;
						local25 = local35;
						local35 = local9;
						local9 = local205;
					} else if (arg6 == 2) {
						local205 = local45;
						local45 = local35;
						local35 = local205;
						local205 = local25;
						local25 = local9;
						local9 = local205;
					} else if (arg6 == 3) {
						local205 = local45;
						local45 = local9;
						local9 = local35;
						local35 = local25;
						local25 = local205;
					}
				}
				if (arg4 == 4) {
					if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
						local476 = local59.method603(4, local9, local35, local25, local45, 0);
					} else {
						local476 = new Class5_Sub2_Sub4_Sub5(arg0, 4, 0, local9, local35, local25, local45, local59.anInt831, true, null);
					}
					arg7.method884(arg3, arg5, arg8, local55, local476, Static53.anIntArray348[arg6], arg6 * 512, 0, 0, local78, local65);
				} else if (arg4 == 5) {
					local208 = arg7.method916(arg3, arg5, arg8);
					local205 = 16;
					if (local208 != 0) {
						local205 = Static62.method1232(local208 >> 14 & 0x7FFF).anInt837;
					}
					@Pc(837) Class5_Sub2_Sub4 local837;
					if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
						local837 = local59.method603(4, local9, local35, local25, local45, 0);
					} else {
						local837 = new Class5_Sub2_Sub4_Sub5(arg0, 4, 0, local9, local35, local25, local45, local59.anInt831, true, null);
					}
					arg7.method884(arg3, arg5, arg8, local55, local837, Static53.anIntArray348[arg6], arg6 * 512, Static12.anIntArray485[arg6] * local205, local205 * Static76.anIntArray308[arg6], local78, local65);
				} else if (arg4 == 6) {
					if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
						local476 = local59.method603(4, local9, local35, local25, local45, 0);
					} else {
						local476 = new Class5_Sub2_Sub4_Sub5(arg0, 4, 0, local9, local35, local25, local45, local59.anInt831, true, null);
					}
					arg7.method884(arg3, arg5, arg8, local55, local476, 256, arg6, 0, 0, local78, local65);
				} else if (arg4 == 7) {
					if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
						local476 = local59.method603(4, local9, local35, local25, local45, 0);
					} else {
						local476 = new Class5_Sub2_Sub4_Sub5(arg0, 4, 0, local9, local35, local25, local45, local59.anInt831, true, null);
					}
					arg7.method884(arg3, arg5, arg8, local55, local476, 512, arg6, 0, 0, local78, local65);
				} else if (arg4 == 8) {
					if (local59.anInt831 == -1 && local59.anIntArray143 == null) {
						local476 = local59.method603(4, local9, local35, local25, local45, 0);
					} else {
						local476 = new Class5_Sub2_Sub4_Sub5(arg0, 4, 0, local9, local35, local25, local45, local59.anInt831, true, null);
					}
					arg7.method884(arg3, arg5, arg8, local55, local476, 768, arg6, 0, 0, local78, local65);
				}
			}
		}
	}
}
