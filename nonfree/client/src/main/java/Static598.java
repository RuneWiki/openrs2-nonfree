import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_62 = new Class276();

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "Lclient!us;")
	public static final Class344 aClass344_119 = new Class344(79, 4);

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_52 = new Class307(16);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
	public static void method8177() {
		@Pc(9) int local9 = Static493.anInt8769 * 512 + 256;
		@Pc(15) int local15 = Static66.anInt1410 * 512 + 256;
		@Pc(24) int local24 = Static202.method3958(local15, Static552.anInt9440, local9) - Static174.anInt4141;
		if (Static206.anInt6647 >= 100) {
			Static289.anInt5908 = Static66.anInt1410 * 512 + 256;
			Static465.anInt8425 = Static493.anInt8769 * 512 + 256;
			Static641.anInt10516 = Static202.method3958(Static289.anInt5908, Static552.anInt9440, Static465.anInt8425) - Static174.anInt4141;
		} else {
			if (Static465.anInt8425 < local9) {
				Static465.anInt8425 += (local9 - Static465.anInt8425) * Static206.anInt6647 / 1000 + Class2_Sub3_Sub5_Sub1.lb;
				if (Static465.anInt8425 > local9) {
					Static465.anInt8425 = local9;
				}
			}
			if (Static641.anInt10516 < local24) {
				Static641.anInt10516 += (local24 - Static641.anInt10516) * Static206.anInt6647 / 1000 + Class2_Sub3_Sub5_Sub1.lb;
				if (local24 < Static641.anInt10516) {
					Static641.anInt10516 = local24;
				}
			}
			if (Static465.anInt8425 > local9) {
				Static465.anInt8425 -= Class2_Sub3_Sub5_Sub1.lb + (Static465.anInt8425 - local9) * Static206.anInt6647 / 1000;
				if (Static465.anInt8425 < local9) {
					Static465.anInt8425 = local9;
				}
			}
			if (local15 > Static289.anInt5908) {
				Static289.anInt5908 += Class2_Sub3_Sub5_Sub1.lb + (local15 - Static289.anInt5908) * Static206.anInt6647 / 1000;
				if (local15 < Static289.anInt5908) {
					Static289.anInt5908 = local15;
				}
			}
			if (local24 < Static641.anInt10516) {
				Static641.anInt10516 -= Class2_Sub3_Sub5_Sub1.lb + (Static641.anInt10516 - local24) * Static206.anInt6647 / 1000;
				if (local24 > Static641.anInt10516) {
					Static641.anInt10516 = local24;
				}
			}
			if (local15 < Static289.anInt5908) {
				Static289.anInt5908 -= Class2_Sub3_Sub5_Sub1.lb + Static206.anInt6647 * (Static289.anInt5908 - local15) / 1000;
				if (local15 > Static289.anInt5908) {
					Static289.anInt5908 = local15;
				}
			}
		}
		local9 = Static227.anInt5145 * 512 + 256;
		local15 = Static184.anInt4365 * 512 + 256;
		local24 = Static202.method3958(local15, Static552.anInt9440, local9) - Static552.anInt9439;
		@Pc(234) int local234 = local9 - Static465.anInt8425;
		@Pc(239) int local239 = local24 - Static641.anInt10516;
		@Pc(244) int local244 = local15 - Static289.anInt5908;
		@Pc(255) int local255 = (int) Math.sqrt((double) (local234 * local234 + local244 * local244));
		@Pc(266) int local266 = (int) (Math.atan2((double) local239, (double) local255) * 2607.5945876176133D) & 0x3FFF;
		@Pc(277) int local277 = (int) (Math.atan2((double) local234, (double) local244) * -2607.5945876176133D) & 0x3FFF;
		if (local266 < 1024) {
			local266 = 1024;
		}
		if (local266 > 3072) {
			local266 = 3072;
		}
		if (local266 > Static299.anInt8877) {
			Static299.anInt8877 += Static190.anInt4448 + (local266 - Static299.anInt8877 >> 3) * Static513.anInt9000 / 1000 << 3;
			if (Static299.anInt8877 > local266) {
				Static299.anInt8877 = local266;
			}
		}
		if (local266 < Static299.anInt8877) {
			Static299.anInt8877 -= Static513.anInt9000 * (Static299.anInt8877 - local266 >> 3) / 1000 + Static190.anInt4448 << 3;
			if (local266 > Static299.anInt8877) {
				Static299.anInt8877 = local266;
			}
		}
		@Pc(351) int local351 = local277 - Static166.anInt3989;
		if (local351 > 8192) {
			local351 -= 16384;
		}
		if (local351 < -8192) {
			local351 += 16384;
		}
		local351 >>= 0x3;
		if (local351 > 0) {
			Static166.anInt3989 += Static513.anInt9000 * local351 / 1000 + Static190.anInt4448 << 3;
			Static166.anInt3989 &= 0x3FFF;
		}
		if (local351 < 0) {
			Static166.anInt3989 -= Static190.anInt4448 + -local351 * Static513.anInt9000 / 1000 << 3;
			Static166.anInt3989 &= 0x3FFF;
		}
		@Pc(410) int local410 = local277 - Static166.anInt3989;
		if (local410 > 8192) {
			local410 -= 16384;
		}
		if (local410 < -8192) {
			local410 += 16384;
		}
		if (local410 < 0 && local351 > 0 || local410 > 0 && local351 < 0) {
			Static166.anInt3989 = local277;
		}
		Static136.anInt3505 = 0;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method8181(@OriginalArg(0) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static62.aStringArray7.length; local15++) {
			if (Static62.aStringArray7[local15].equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
	public static void method8184() {
		Static392.aClass258_4.method6559();
		Static265.aClass310_4.method7463();
		Static510.aClass97_2.method3257();
		Static541.aClass349_4.method8120();
		Static604.aClass139_2.method4346();
		Static367.aClass281_1.method6981();
		Static618.aClass222_2.method5864();
		Static35.aClass343_1.method8032();
		Static390.aClass359_1.method8267();
		Static90.aClass335_1.method7999();
		Static367.aClass285_1.method7019();
		Static168.aClass204_3.method5449();
		Static34.aClass115_1.method3757();
		Static552.aClass360_1.method8273();
		Static513.aClass49_2.method1854();
		Static20.aClass202_1.method5432();
		Static57.aClass265_33.method6690();
		Static461.aClass220_1.method5819();
		Static535.aClass110_3.method3577();
		Static5.aClass236_1.method6055();
		Static203.aClass306_1.method7415();
		Static608.method6807();
		Static583.method8050();
		Static258.method4832();
		Static639.method8629();
		if (Static85.aClass107_2 != Static624.aClass107_7) {
			for (@Pc(85) int local85 = 0; local85 < Static28.aByteArrayArray1.length; local85++) {
				Static28.aByteArrayArray1[local85] = null;
			}
			Static416.anInt7793 = 0;
		}
		Static377.method5989();
		Static102.method8166();
		Static288.method4993();
		Static500.method7311();
		Static383.method6077();
		Static84.aClass112_10.method3638();
		Static47.aClass33_3.method6199();
		Static333.method4606();
		Static577.method6364();
		Static108.aClass181_21.method5048();
		Static378.aClass181_69.method5048();
		Static187.aClass181_36.method5048();
		Static243.aClass181_54.method5048();
		Static462.aClass181_92.method5048();
		Static123.aClass181_28.method5048();
		Static399.aClass181_75.method5048();
		Static412.aClass181_78.method5048();
		Static150.aClass181_34.method5048();
		Static511.aClass181_104.method5048();
		Static639.aClass181_133.method5048();
		Static474.aClass181_98.method5048();
		Static347.aClass181_63.method5048();
		Static340.aClass181_62.method5048();
		Static349.aClass181_64.method5048();
		Static35.aClass181_3.method5048();
		Static493.aClass181_100.method5048();
		Static34.aClass181_2.method5048();
		Static293.aClass181_57.method5048();
		Static387.aClass181_73.method5048();
		Static574.aClass181_117.method5048();
		Static37.aClass181_5.method5048();
		Static113.aClass181_128.method5048();
		Static35.aClass181_4.method5048();
		Static568.aClass181_115.method5048();
		Static465.aClass181_93.method5048();
		Static226.aClass181_47.method5048();
		Static433.aClass181_81.method5048();
		Static496.aClass181_101.method5048();
		Static58.aClass181_9.method5048();
		Static139.aClass181_31.method5048();
		Static393.aClass181_30.method5048();
		Static515.aClass181_107.method5048();
		Static557.aClass112_60.method3638();
		Static150.aClass112_16.method3638();
		Static214.aClass112_41.method3638();
		Static122.aClass112_14.method3638();
	}
}
