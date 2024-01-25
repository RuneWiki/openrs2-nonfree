import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
	public static int anInt7456;

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_14 = new Class208(2, 4, 4, 0);

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	public static int anInt7455 = 0;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_192 = new Class81(50, 7);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZILclient!cr;IB)V")
	public static void method5775(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg2.anInt1622;
		if (arg2.aByte9 == 0) {
			arg2.anInt1622 = arg2.anInt1674;
		} else if (arg2.aByte9 == 1) {
			arg2.anInt1622 = arg3 - arg2.anInt1674;
		} else if (arg2.aByte9 == 2) {
			arg2.anInt1622 = arg3 * arg2.anInt1674 >> 14;
		}
		@Pc(52) int local52 = arg2.anInt1599;
		if (arg2.aByte12 == 0) {
			arg2.anInt1599 = arg2.anInt1614;
		} else if (arg2.aByte12 == 1) {
			arg2.anInt1599 = arg1 - arg2.anInt1614;
		} else if (arg2.aByte12 == 2) {
			arg2.anInt1599 = arg1 * arg2.anInt1614 >> 14;
		}
		if (arg2.aByte9 == 4) {
			arg2.anInt1622 = arg2.anInt1599 * arg2.anInt1623 / arg2.anInt1637;
		}
		if (arg2.aByte12 == 4) {
			arg2.anInt1599 = arg2.anInt1622 * arg2.anInt1637 / arg2.anInt1623;
		}
		if (Static345.aBoolean339 && (Static56.method1112(arg2).anInt2146 != 0 || arg2.anInt1642 == 0)) {
			if (arg2.anInt1599 < 5 && arg2.anInt1622 < 5) {
				arg2.anInt1599 = 5;
				arg2.anInt1622 = 5;
			} else {
				if (arg2.anInt1599 <= 0) {
					arg2.anInt1599 = 5;
				}
				if (arg2.anInt1622 <= 0) {
					arg2.anInt1622 = 5;
				}
			}
		}
		if (arg2.anInt1632 == Static225.anInt4312) {
			Static402.aClass41_14 = arg2;
		}
		if (arg0 && arg2.anObjectArray17 != null && (local8 != arg2.anInt1622 || arg2.anInt1599 != local52)) {
			@Pc(199) Class2_Sub14 local199 = new Class2_Sub14();
			local199.anObjectArray32 = arg2.anObjectArray17;
			local199.aClass41_5 = arg2;
			Static200.aClass265_55.method5999(local199);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILclient!hq;)Z")
	public static boolean method5777(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20_Sub1 arg1) {
		@Pc(15) int local15 = arg1.method2505(2);
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(113) int local113;
		@Pc(117) int local117;
		@Pc(123) int local123;
		if (local15 == 0) {
			if (arg1.method2505(1) != 0) {
				method5777(arg0, arg1);
			}
			local38 = arg1.method2505(6);
			local45 = arg1.method2505(6);
			@Pc(57) boolean local57 = arg1.method2505(1) == 1;
			if (local57) {
				Static389.anIntArray456[Static390.anInt6850++] = arg0;
			}
			if (Static129.aClass4_Sub2_Sub2_Sub1Array27[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(80) Class260 local80 = Static329.aClass260Array1[arg0];
			@Pc(88) Class4_Sub2_Sub2_Sub1 local88 = Static129.aClass4_Sub2_Sub2_Sub1Array27[arg0] = new Class4_Sub2_Sub2_Sub1();
			local88.anInt6456 = arg0;
			if (Static180.aClass2_Sub20Array1[arg0] != null) {
				local88.method4596(Static180.aClass2_Sub20Array1[arg0]);
			}
			local88.method5122(local80.anInt7526);
			local88.anInt6481 = local80.anInt7527;
			local113 = local80.anInt7531;
			local117 = local113 >> 28;
			local123 = local113 >> 14 & 0xFF;
			@Pc(127) int local127 = local113 & 0xFF;
			local88.aBoolean510 = local80.aBoolean643;
			local88.aByteArray181[0] = Static349.aByteArray171[arg0];
			local88.aByte92 = (byte) local117;
			local88.method4603(local45 + (local127 << 6) - Static379.anInt6721, (local123 << 6) - -local38 - Static173.anInt3340);
			local88.aBoolean508 = false;
			Static329.aClass260Array1[arg0] = null;
			return true;
		} else if (local15 == 1) {
			local38 = arg1.method2505(2);
			local45 = Static329.aClass260Array1[arg0].anInt7531;
			Static329.aClass260Array1[arg0].anInt7531 = ((local38 + (local45 >> 28) & 0x3) << 28) + (local45 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(222) int local222;
			@Pc(227) int local227;
			@Pc(236) int local236;
			if (local15 != 2) {
				local38 = arg1.method2505(18);
				local45 = local38 >> 16;
				local222 = local38 >> 8 & 0xFF;
				local227 = local38 & 0xFF;
				local236 = Static329.aClass260Array1[arg0].anInt7531;
				local113 = local45 + (local236 >> 28) & 0x3;
				local117 = local222 + (local236 >> 14) & 0xFF;
				local123 = local227 + local236 & 0xFF;
				Static329.aClass260Array1[arg0].anInt7531 = (local117 << 14) + (local113 << 28) + local123;
				return false;
			}
			local38 = arg1.method2505(5);
			local45 = local38 >> 3;
			local222 = local38 & 0x7;
			local227 = Static329.aClass260Array1[arg0].anInt7531;
			local236 = (local227 >> 28) + local45 & 0x3;
			local113 = local227 >> 14 & 0xFF;
			local117 = local227 & 0xFF;
			if (local222 == 0) {
				local113--;
				local117--;
			}
			if (local222 == 1) {
				local117--;
			}
			if (local222 == 2) {
				local117--;
				local113++;
			}
			if (local222 == 3) {
				local113--;
			}
			if (local222 == 4) {
				local113++;
			}
			if (local222 == 5) {
				local113--;
				local117++;
			}
			if (local222 == 6) {
				local117++;
			}
			if (local222 == 7) {
				local113++;
				local117++;
			}
			Static329.aClass260Array1[arg0].anInt7531 = (local236 << 28) + (local113 << 14) + local117;
			return false;
		}
	}
}
