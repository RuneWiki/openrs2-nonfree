import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public static int anInt3887;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt3891 = 0;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2315 = Static107.method1838(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method2730() {
		@Pc(4) int[] local4 = new int[Static145.anInt3284];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static145.anInt3284; local12++) {
			@Pc(23) Class2_Sub4_Sub12 local23 = Static58.method1034(local12);
			if (local23.anInt2220 >= 0 || local23.anInt2202 >= 0) {
				local4[local10++] = local12;
			}
		}
		Static168.anIntArray354 = new int[local10];
		for (@Pc(43) int local43 = 0; local43 < local10; local43++) {
			Static168.anIntArray354[local43] = local4[local43];
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BILclient!gf;II)V")
	public static void method2731(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2 || Static150.anInt3365 >= 400) {
			return;
		}
		@Pc(61) Class28 local61;
		if (arg1.anInt1663 == 0) {
			local61 = Static83.method1481(new Class28[] { arg1.aClass28_953, Static126.method2042(arg1.anInt1669, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1669), Static135.aClass28_1824, Static118.aClass28_2378, Static158.method2411(arg1.anInt1669), Static125.aClass28_1735 });
		} else {
			local61 = Static83.method1481(new Class28[] { arg1.aClass28_953, Static135.aClass28_1824, Static81.aClass28_1465, Static158.method2411(arg1.anInt1663), Static125.aClass28_1735 });
		}
		@Pc(131) int local131;
		if (Static166.anInt3704 == 1) {
			Static75.method1358((short) 17, arg3, Static28.aClass28_538, arg0, (long) arg2, Static83.method1481(new Class28[] { Static61.aClass28_954, Static78.aClass28_1187, local61 }));
		} else if (!Static163.aBoolean157) {
			for (local131 = 7; local131 >= 0; local131--) {
				if (Static151.aClass28Array50[local131] != null) {
					@Pc(145) short local145 = 0;
					if (Static151.aClass28Array50[local131].method1140(Static22.aClass28_488)) {
						if (arg1.anInt1669 > Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1669) {
							local145 = 2000;
						}
						if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1660 != 0 && arg1.anInt1660 != 0) {
							if (arg1.anInt1660 == Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1660) {
								local145 = 2000;
							} else {
								local145 = 0;
							}
						}
					} else if (Static23.aBooleanArray9[local131]) {
						local145 = 2000;
					}
					@Pc(191) short local191 = Static15.aShortArray2[local131];
					@Pc(196) short local196 = (short) (local191 + local145);
					Static75.method1358(local196, arg3, Static151.aClass28Array50[local131], arg0, (long) arg2, Static83.method1481(new Class28[] { Static79.aClass28_1209, local61 }));
				}
			}
		} else if ((Static151.anInt3386 & 0x8) == 8) {
			Static75.method1358((short) 22, arg3, Static98.aClass28_1425, arg0, (long) arg2, Static83.method1481(new Class28[] { Static24.aClass28_499, Static78.aClass28_1187, local61 }));
		}
		for (local131 = 0; local131 < Static150.anInt3365; local131++) {
			if (Static176.aShortArray41[local131] == 19) {
				Static80.aClass28Array29[local131] = Static83.method1481(new Class28[] { Static79.aClass28_1209, local61 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method2732(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static48.anInt1248 > 0) {
			local16 = Static171.aByteArrayArray11[--Static48.anInt1248];
			Static171.aByteArrayArray11[Static48.anInt1248] = null;
			return local16;
		} else if (arg0 == 5000 && Static34.anInt963 > 0) {
			local16 = Static160.aByteArrayArray8[--Static34.anInt963];
			Static160.aByteArrayArray8[Static34.anInt963] = null;
			return local16;
		} else if (arg0 == 30000 && Static61.anInt1667 > 0) {
			local16 = Static168.aByteArrayArray10[--Static61.anInt1667];
			Static168.aByteArrayArray10[Static61.anInt1667] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public static void method2733() {
		aClass28_2315 = null;
	}
}
