import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Lclient!l;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_18 = new Class2(74, 3);

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	public static int anInt935 = -1;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "Lclient!em;")
	public static final Class7_Sub15 aClass7_Sub15_1 = new Class7_Sub15(0, 0);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lclient!sj;")
	public static Class7_Sub4_Sub14 method750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class7_Sub4_Sub14 local20 = (Class7_Sub4_Sub14) Static333.aClass164_22.method3512((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class7_Sub4_Sub14(arg1, arg0);
			Static333.aClass164_22.method3508(local20.aLong230, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)V")
	public static void method754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static93.aFloat125 > Static93.aFloat126) {
			Static93.aFloat126 = (float) ((double) Static93.aFloat126 + (double) Static93.aFloat126 / 30.0D);
			if (Static93.aFloat126 > Static93.aFloat125) {
				Static93.aFloat126 = Static93.aFloat125;
			}
			Static430.method5562();
			Static93.anInt4318 = (int) Static93.aFloat126 >> 1;
			Static93.aByteArrayArrayArray15 = Static205.method2956(Static93.anInt4318);
		} else if (Static93.aFloat125 < Static93.aFloat126) {
			Static93.aFloat126 = (float) ((double) Static93.aFloat126 - (double) Static93.aFloat126 / 30.0D);
			if (Static93.aFloat125 > Static93.aFloat126) {
				Static93.aFloat126 = Static93.aFloat125;
			}
			Static430.method5562();
			Static93.anInt4318 = (int) Static93.aFloat126 >> 1;
			Static93.aByteArrayArrayArray15 = Static205.method2956(Static93.anInt4318);
		}
		if (Static168.anInt3036 != -1 && Static5.anInt16 != -1) {
			@Pc(86) int local86 = Static168.anInt3036 - Static203.anInt3590;
			if (local86 < 2 || local86 > 2) {
				local86 /= 8;
			}
			@Pc(104) int local104 = Static5.anInt16 - Static21.anInt321;
			if (local104 < 2 || local104 > 2) {
				local104 /= 8;
			}
			Static203.anInt3590 += local86;
			if (local86 == 0 && local104 == 0) {
				Static168.anInt3036 = -1;
				Static5.anInt16 = -1;
			}
			Static21.anInt321 += local104;
			Static430.method5562();
		}
		if (Static339.anInt5508 > 0) {
			Static129.anInt2479--;
			if (Static129.anInt2479 == 0) {
				Static129.anInt2479 = 100;
				Static339.anInt5508--;
			}
		} else {
			anInt935 = -1;
			Static237.anInt4069 = -1;
		}
		if (!Static259.aBoolean279 || Static238.aClass85_27 == null) {
			return;
		}
		for (@Pc(171) Class7_Sub33 local171 = (Class7_Sub33) Static238.aClass85_27.method2010(); local171 != null; local171 = (Class7_Sub33) Static238.aClass85_27.method2000()) {
			@Pc(180) Class20 local180 = Static93.aClass62_4.method1481(local171.aClass7_Sub11_1.anInt1062);
			if (local171.method3884(arg1, arg0)) {
				if (local180.aStringArray1 != null) {
					if (local180.aStringArray1[4] != null) {
						Static181.method2635(local180.anInt314, local180.aStringArray1[4], -1, false, -1, local180.aString1, 0, (long) local171.aClass7_Sub11_1.anInt1062, true, 1003);
					}
					if (local180.aStringArray1[3] != null) {
						Static181.method2635(local180.anInt314, local180.aStringArray1[3], -1, false, -1, local180.aString1, 0, (long) local171.aClass7_Sub11_1.anInt1062, true, 1004);
					}
					if (local180.aStringArray1[2] != null) {
						Static181.method2635(local180.anInt314, local180.aStringArray1[2], -1, false, -1, local180.aString1, 0, (long) local171.aClass7_Sub11_1.anInt1062, true, 1001);
					}
					if (local180.aStringArray1[1] != null) {
						Static181.method2635(local180.anInt314, local180.aStringArray1[1], -1, false, -1, local180.aString1, 0, (long) local171.aClass7_Sub11_1.anInt1062, true, 1007);
					}
					if (local180.aStringArray1[0] != null) {
						Static181.method2635(local180.anInt314, local180.aStringArray1[0], -1, false, -1, local180.aString1, 0, (long) local171.aClass7_Sub11_1.anInt1062, true, 1002);
					}
				}
				if (!local171.aClass7_Sub11_1.aBoolean65) {
					local171.aClass7_Sub11_1.aBoolean65 = true;
					Static159.method2356(Static41.aClass229_1, local171.aClass7_Sub11_1.anInt1062, local180.anInt314);
				}
				if (local171.aClass7_Sub11_1.aBoolean65) {
					Static159.method2356(Static116.aClass229_9, local171.aClass7_Sub11_1.anInt1062, local180.anInt314);
				}
			} else if (local171.aClass7_Sub11_1.aBoolean65) {
				local171.aClass7_Sub11_1.aBoolean65 = false;
				Static159.method2356(Static45.aClass229_2, local171.aClass7_Sub11_1.anInt1062, local180.anInt314);
			}
		}
	}
}
