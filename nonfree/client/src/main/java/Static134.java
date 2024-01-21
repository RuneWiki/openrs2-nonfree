import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!fc;")
	public static Class24 aClass24_8;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "[Lclient!kf;")
	public static Class41[] aClass41Array1 = new Class41[50];

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!v;")
	private static Class76 aClass76_1327 = method2017("Loaded update list");

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
	public static int[] anIntArray409 = new int[100];

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_1328 = method2017("(U3");

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	public static int anInt2840 = 0;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_1329 = method2017("blinken3:");

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	public static int anInt2842 = 0;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_1330 = aClass76_1327;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_1331 = method2017("rect_debug=");

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILclient!je;B)V")
	public static void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub4_Sub3_Sub1_Sub2 arg3) {
		if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1 == arg3 || Static10.anInt206 >= 400) {
			return;
		}
		@Pc(50) Class76 local50;
		if (arg3.anInt1441 == 0) {
			local50 = Static59.method1017(new Class76[] { arg3.aClass76_612, Static117.method1785(arg3.anInt1461, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1461), Static25.aClass76_222, Static14.aClass76_121, Static63.method1092(arg3.anInt1461), Static96.aClass76_1015 });
		} else {
			local50 = Static59.method1017(new Class76[] { arg3.aClass76_612, Static25.aClass76_222, Static78.aClass76_863, Static63.method1092(arg3.anInt1441), Static96.aClass76_1015 });
		}
		@Pc(99) int local99;
		if (Static39.anInt1125 == 1) {
			Static79.method551(34, arg2, arg1, arg0, Static73.aClass76_814, Static59.method1017(new Class76[] { Static49.aClass76_557, Static43.aClass76_144, local50 }));
		} else if (!Static18.aBoolean21) {
			for (local99 = 7; local99 >= 0; local99--) {
				if (Static79.aClass76Array6[local99] != null) {
					@Pc(113) short local113 = 0;
					if (Static79.aClass76Array6[local99].method1882(Static104.aClass76_1092)) {
						if (arg3.anInt1461 > Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1461) {
							local113 = 2000;
						}
						if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1452 != 0 && arg3.anInt1452 != 0) {
							if (arg3.anInt1452 == Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1452) {
								local113 = 2000;
							} else {
								local113 = 0;
							}
						}
					} else if (Static113.aBooleanArray15[local99]) {
						local113 = 2000;
					}
					@Pc(161) int local161 = local113 + Static120.anIntArray385[local99];
					Static79.method551(local161, arg2, arg1, arg0, Static79.aClass76Array6[local99], Static59.method1017(new Class76[] { Static81.aClass76_880, local50 }));
				}
			}
		} else if ((Static119.anInt2563 & 0x8) == 8) {
			Static79.method551(23, arg2, arg1, arg0, Static102.aClass76_1086, Static59.method1017(new Class76[] { Static117.aClass76_1203, Static43.aClass76_144, local50 }));
		}
		for (local99 = 0; local99 < Static10.anInt206; local99++) {
			if (Static95.anIntArray311[local99] == 9) {
				Static62.aClass76Array14[local99] = Static59.method1017(new Class76[] { Static81.aClass76_880, local50 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLjava/lang/String;)Lclient!v;")
	public static Class76 method2017(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(20) Class76 local20 = new Class76();
		local20.aByteArray71 = new byte[local9];
		@Pc(26) int local26 = 0;
		while (local9 > local26) {
			@Pc(34) int local34 = local6[local26++] & 0xFF;
			if (local34 <= 45 && local34 >= 40) {
				if (local26 >= local9) {
					break;
				}
				@Pc(52) int local52 = local6[local26++] & 0xFF;
				local20.aByteArray71[local20.anInt2668++] = (byte) (local52 + local34 * 43 - 48 - 1720);
			} else if (local34 != 0) {
				local20.aByteArray71[local20.anInt2668++] = (byte) local34;
			}
		}
		local20.method1855();
		return local20.method1880();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public static void method2018() {
		anIntArray409 = null;
		aClass41Array1 = null;
		aClass76_1327 = null;
		aClass76_1328 = null;
		aClass24_8 = null;
		aClass76_1331 = null;
		aClass76_1330 = null;
		aClass76_1329 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
	public static int method2019(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + (local13 >>> 2 & 0x73333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}
}
