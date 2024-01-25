import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Lclient!rk;")
	public static Class180 aClass180_50;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public static int anInt3822 = 0;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
	public static final int[] anIntArray521 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!pe;IZI)V")
	public static void method3450(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static321.aClass14ArrayArray1 = new Class14[arg2][arg1];
		Static34.aClass89_1 = arg0;
		if (Static243.anIntArray642 != null) {
			Static178.aClass17_4 = Static300.method4858(Static243.anIntArray642[4], Static243.anIntArray642[1], Static243.anIntArray642[2], Static243.anIntArray642[0], Static243.anIntArray642[3], Static243.anIntArray642[5]);
		}
		Static339.aClass14_2 = new Class14();
		Static29.method512();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I")
	public static int method3452() {
		try {
			if (Static120.anInt2721 == 0) {
				if (Static28.aLong28 > Static335.method5308() - 5000L) {
					return 0;
				}
				Static233.aClass99_8 = Static116.aClass21_4.method380(Static221.anInt4410, Static56.aString109);
				Static205.aLong139 = Static335.method5308();
				Static120.anInt2721 = 1;
			}
			if (Static205.aLong139 + 30000L < Static335.method5308()) {
				return Static262.method4385(1000);
			}
			@Pc(76) int local76;
			@Pc(113) int local113;
			if (Static120.anInt2721 == 1) {
				if (Static233.aClass99_8.anInt2836 == 2) {
					return Static262.method4385(1001);
				}
				if (Static233.aClass99_8.anInt2836 != 1) {
					return -1;
				}
				Static193.aClass61_1 = new Class61((Socket) Static233.aClass99_8.anObject2, Static116.aClass21_4);
				Static233.aClass99_8 = null;
				local76 = 0;
				if (Static316.aBoolean441) {
					local76 = Static69.anInt1711;
				}
				Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
				Static29.aClass7_Sub3_Sub2_1.method2735(23);
				Static29.aClass7_Sub3_Sub2_1.method2765(local76);
				Static193.aClass61_1.method1377(Static29.aClass7_Sub3_Sub2_1.aByteArray33, Static29.aClass7_Sub3_Sub2_1.anInt3005);
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				local113 = Static193.aClass61_1.method1382();
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				if (local113 != 0) {
					return Static262.method4385(local113);
				}
				Static120.anInt2721 = 2;
			}
			if (Static120.anInt2721 == 2) {
				if (Static193.aClass61_1.method1372() < 2) {
					return -1;
				}
				Static239.anInt4730 = Static193.aClass61_1.method1382();
				Static239.anInt4730 <<= 0x8;
				Static239.anInt4730 += Static193.aClass61_1.method1382();
				Static149.anInt3232 = 0;
				Static134.aByteArray32 = new byte[Static239.anInt4730];
				Static120.anInt2721 = 3;
			}
			if (Static120.anInt2721 != 3) {
				return -1;
			}
			local76 = Static193.aClass61_1.method1372();
			if (local76 < 1) {
				return -1;
			}
			if (Static239.anInt4730 - Static149.anInt3232 < local76) {
				local76 = Static239.anInt4730 - Static149.anInt3232;
			}
			Static193.aClass61_1.method1373(Static149.anInt3232, Static134.aByteArray32, local76);
			Static149.anInt3232 += local76;
			if (Static239.anInt4730 > Static149.anInt3232) {
				return -1;
			} else if (Static234.method4077(Static134.aByteArray32)) {
				Static272.aClass187_Sub1Array2 = new Class187_Sub1[Static101.anInt2448];
				local113 = 0;
				for (@Pc(227) int local227 = Static58.anInt1482; local227 <= Static65.anInt1637; local227++) {
					@Pc(232) Class187_Sub1 local232 = Static27.method479(local227);
					if (local232 != null) {
						Static272.aClass187_Sub1Array2[local113++] = local232;
					}
				}
				Static179.anInt3651 = 0;
				Static62.aClass7_Sub39_1 = null;
				Static193.aClass61_1.method1376();
				Static35.anInt1015 = 0;
				Static193.aClass61_1 = null;
				Static134.aByteArray32 = null;
				Static120.anInt2721 = 0;
				Static28.aLong28 = Static335.method5308();
				return 0;
			} else {
				return Static262.method4385(1002);
			}
		} catch (@Pc(273) IOException local273) {
			return Static262.method4385(1003);
		}
	}
}
