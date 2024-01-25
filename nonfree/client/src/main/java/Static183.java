import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "[S")
	public static short[] aShortArray54;

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!gga", name = "t", descriptor = "[I")
	public static final int[] anIntArray236 = new int[3];

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method3126(@OriginalArg(0) Class13 arg0) {
		if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 != Static248.anInt4780 && (Static348.aClass84ArrayArrayArray5 != null && Static532.method7369(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, arg0))) {
			Static248.anInt4780 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BB)Lclient!iea;")
	public static Class31 method3128(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static509.aClient1);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static509.aClient1);
				@Pc(40) int local40 = local21.getHeight(Static509.aClient1);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(57) int[] local57 = new int[local36 * local40];
					@Pc(69) PixelGrabber local69 = new PixelGrabber(local21, 0, 0, local36, local40, local57, 0, local36);
					local69.grabPixels();
					return Static141.aClass13_27.method8088(local36, local40, local57, local36);
				}
				throw new RuntimeException("");
			} catch (@Pc(82) InterruptedException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BZIII)V")
	public static void method3129(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && Static470.anInt7589 == arg1 && Static456.anInt7439 == arg3 && (Static245.anInt4753 == Static531.anInt8550 || Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 1)) {
			return;
		}
		Static245.anInt4753 = Static531.anInt8550;
		Static470.anInt7589 = arg1;
		Static456.anInt7439 = arg3;
		if (Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 1) {
			Static245.anInt4753 = 0;
		}
		Static213.method3541(arg2);
		Static24.method603(Static39.aClass37_1, Static141.aClass13_27, true, Static266.aClass183_7, Static573.aClass345_14.method7951(Static496.anInt7407));
		@Pc(70) int local70 = Static406.anInt6899;
		@Pc(72) int local72 = Static338.anInt5885;
		Static406.anInt6899 = (Static470.anInt7589 - (Static456.anInt7428 >> 4)) * 8;
		Static338.anInt5885 = (Static456.anInt7439 - (Static5.anInt112 >> 4)) * 8;
		Static126.aClass2_Sub7_Sub3_1 = Static371.method7978(Static470.anInt7589 * 8, Static456.anInt7439 * 8);
		Static223.aClass129_3 = null;
		@Pc(104) int local104 = Static406.anInt6899 - local70;
		@Pc(109) int local109 = Static338.anInt5885 - local72;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(245) int local245;
		@Pc(191) int local191;
		if (arg2 == 11) {
			for (local116 = 0; local116 < Static608.anInt10053; local116++) {
				@Pc(122) Class2_Sub32 local122 = Static480.aClass2_Sub32Array1[local116];
				if (local122 != null) {
					@Pc(127) Class16_Sub1_Sub1_Sub3_Sub1 local127 = local122.aClass16_Sub1_Sub1_Sub3_Sub1_2;
					for (local129 = 0; local129 < 10; local129++) {
						local127.anIntArray595[local129] -= local104;
						local127.anIntArray594[local129] -= local109;
					}
					local127.anInt8037 -= local104 * 512;
					local127.anInt8034 -= local109 * 512;
				}
			}
		} else {
			@Pc(177) boolean local177 = false;
			Static317.anInt5602 = 0;
			@Pc(185) int local185 = (Static456.anInt7428 - 1) * 512;
			local191 = Static5.anInt112 * 512 - 512;
			for (local129 = 0; local129 < Static608.anInt10053; local129++) {
				@Pc(199) Class2_Sub32 local199 = Static480.aClass2_Sub32Array1[local129];
				if (local199 != null) {
					@Pc(204) Class16_Sub1_Sub1_Sub3_Sub1 local204 = local199.aClass16_Sub1_Sub1_Sub3_Sub1_2;
					local204.anInt8037 -= local104 * 512;
					local204.anInt8034 -= local109 * 512;
					if (local204.anInt8037 >= 0 && local204.anInt8037 <= local185 && local204.anInt8034 >= 0 && local204.anInt8034 <= local191) {
						@Pc(243) boolean local243 = true;
						for (local245 = 0; local245 < 10; local245++) {
							local204.anIntArray595[local245] -= local104;
							local204.anIntArray594[local245] -= local109;
							if (local204.anIntArray595[local245] < 0 || Static456.anInt7428 <= local204.anIntArray595[local245] || local204.anIntArray594[local245] < 0 || local204.anIntArray594[local245] >= Static5.anInt112) {
								local243 = false;
							}
						}
						if (local243) {
							Static363.anIntArray409[Static317.anInt5602++] = local204.anInt8075;
						} else {
							local204.method1409((Class113) null);
							local177 = true;
							local199.method8920();
						}
					} else {
						local204.method1409((Class113) null);
						local199.method8920();
						local177 = true;
					}
				}
			}
			if (local177) {
				Static608.anInt10053 = Static514.aClass323_32.method7483();
				Static514.aClass323_32.method7476(Static480.aClass2_Sub32Array1);
			}
		}
		for (local116 = 0; local116 < 2048; local116++) {
			@Pc(353) Class16_Sub1_Sub1_Sub3_Sub2 local353 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local116];
			if (local353 != null) {
				for (local191 = 0; local191 < 10; local191++) {
					local353.anIntArray595[local191] -= local104;
					local353.anIntArray594[local191] -= local109;
				}
				local353.anInt8034 -= local109 * 512;
				local353.anInt8037 -= local104 * 512;
			}
		}
		@Pc(403) Class110[] local403 = Static448.aClass110Array1;
		for (local191 = 0; local191 < local403.length; local191++) {
			@Pc(411) Class110 local411 = local403[local191];
			if (local411 != null) {
				local411.anInt3139 -= local104 * 512;
				local411.anInt3143 -= local109 * 512;
			}
		}
		@Pc(439) Class2_Sub2 local439;
		for (local439 = (Class2_Sub2) Static536.aClass114_42.method2772(); local439 != null; local439 = (Class2_Sub2) Static536.aClass114_42.method2762()) {
			local439.anInt119 -= local109;
			local439.anInt129 -= local104;
			if (Static376.anInt6481 != 4 && (local439.anInt129 < 0 || local439.anInt119 < 0 || Static456.anInt7428 <= local439.anInt129 || local439.anInt119 >= Static5.anInt112)) {
				local439.method8920();
			}
		}
		for (local439 = (Class2_Sub2) Static387.aClass114_33.method2772(); local439 != null; local439 = (Class2_Sub2) Static387.aClass114_33.method2762()) {
			local439.anInt119 -= local109;
			local439.anInt129 -= local104;
			if (Static376.anInt6481 != 4 && (local439.anInt129 < 0 || local439.anInt119 < 0 || Static456.anInt7428 <= local439.anInt129 || Static5.anInt112 <= local439.anInt119)) {
				local439.method8920();
			}
		}
		if (Static376.anInt6481 != 4) {
			for (@Pc(558) Class2_Sub23 local558 = (Class2_Sub23) Static263.aClass323_18.method7480(); local558 != null; local558 = (Class2_Sub23) Static263.aClass323_18.method7482()) {
				@Pc(566) int local566 = (int) (local558.aLong278 & 0x3FFFL);
				@Pc(571) int local571 = local566 - Static406.anInt6899;
				local245 = (int) (local558.aLong278 >> 14 & 0x3FFFL);
				@Pc(583) int local583 = local245 - Static338.anInt5885;
				if (local571 < 0 || local583 < 0 || Static456.anInt7428 <= local571 || local583 >= Static5.anInt112) {
					local558.method8920();
				}
			}
		}
		if (Static375.anInt6459 != 0) {
			Static583.anInt9512 -= local109;
			Static375.anInt6459 -= local104;
		}
		Static592.method8362();
		if (arg2 != 11) {
			Static379.anInt6616 -= local109;
			Static63.anInt1715 -= local109 * 512;
			Static195.anInt3891 -= local109;
			Static576.anInt9403 -= local104 * 512;
			Static12.anInt193 -= local104;
			Static510.anInt8225 -= local104;
			if (Math.abs(local104) > Static456.anInt7428 || Math.abs(local109) > Static5.anInt112) {
				Static350.method5258();
			}
		} else if (Static407.anInt6909 == 4) {
			Static553.anInt9177 -= local109 * 512;
			Static595.anInt9886 -= local104 * 512;
			Static33.anInt661 -= local109 * 512;
			Static145.anInt3035 -= local104 * 512;
		} else {
			Static407.anInt6909 = 1;
			Static648.anInt10476 = -1;
			Static644.anInt10415 = -1;
		}
		Static524.method7272();
		Static191.method3265();
		Static329.aClass114_28.method2768();
		Static514.aClass114_40.method2768();
		Static187.aClass19_5.method565();
		Static349.method5250();
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V")
	public static void method3130(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static601.anInt9959 == 2) {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[0]);
				Static569.aClass380Array1[1].method8752(Static307.aClass182Array1[1]);
			} else if (Static601.anInt9959 == 3) {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[0]);
				Static569.aClass380Array1[1].method8752(Static307.aClass182Array1[1]);
				Static569.aClass380Array1[2].method8752(Static307.aClass182Array1[2]);
			} else {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[0]);
				Static569.aClass380Array1[1].method8752(Static307.aClass182Array1[1]);
				Static569.aClass380Array1[2].method8752(Static307.aClass182Array1[2]);
				Static569.aClass380Array1[3].method8752(Static307.aClass182Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static601.anInt9959 == 2) {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[2]);
			} else if (Static601.anInt9959 == 3) {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[3]);
				Static569.aClass380Array1[1].method8752(Static307.aClass182Array1[4]);
			} else {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[4]);
				Static569.aClass380Array1[1].method8752(Static307.aClass182Array1[5]);
				Static569.aClass380Array1[2].method8752(Static307.aClass182Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static601.anInt9959 == 2) {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[3]);
				return;
			}
			if (Static601.anInt9959 == 3) {
				Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[5]);
				return;
			}
			Static569.aClass380Array1[0].method8752(Static307.aClass182Array1[7]);
		}
	}
}
