import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!hca", name = "z", descriptor = "[Lclient!s;")
	public static Class96[] aClass96Array1;

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_63 = new Class322(110, 0);

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "[Lclient!cj;")
	public static final Class6_Sub11[] aClass6_Sub11Array1 = new Class6_Sub11[1024];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method3955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(23) Class125 local23 = Static290.aClass163_5.method4124(122, arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local23.method3388(arg1);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!qo;I)V")
	public static void method3957(@OriginalArg(1) Class60_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = -1;
		@Pc(16) int local16 = 0;
		if (arg0.anInt4869 > Static141.anInt8737) {
			Static27.method334(arg0);
		} else if (arg0.anInt4875 >= Static141.anInt8737) {
			Static516.method7470(arg0);
		} else {
			Static78.method1058(false, arg0);
			local16 = Static245.anInt4707;
			local14 = Static380.anInt6621;
		}
		@Pc(95) int local95;
		if (arg0.anInt9048 < 512 || arg0.anInt9057 < 512 || arg0.anInt9048 >= Static29.anInt380 * 512 - 512 || (Static327.anInt5650 - 1) * 512 <= arg0.anInt9057) {
			arg0.aClass104_8.method9035(-1);
			for (local95 = 0; local95 < arg0.aClass40Array3.length; local95++) {
				arg0.aClass40Array3[local95].anInt571 = -1;
				arg0.aClass40Array3[local95].aClass104_1.method9035(-1);
			}
			local14 = -1;
			arg0.anIntArray256 = null;
			local16 = 0;
			arg0.anInt4875 = 0;
			arg0.anInt4869 = 0;
			arg0.anInt9048 = arg0.anIntArray263[0] * 512 + arg0.method4424((byte) -28) * 256;
			arg0.anInt9057 = arg0.anIntArray264[0] * 512 + arg0.method4424((byte) -28) * 256;
			arg0.method4425();
		}
		if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == arg0 && (arg0.anInt9048 < 6144 || arg0.anInt9057 < 6144 || Static29.anInt380 * 512 - 6144 <= arg0.anInt9048 || Static327.anInt5650 * 512 - 6144 <= arg0.anInt9057)) {
			arg0.aClass104_8.method9035(-1);
			for (local95 = 0; local95 < arg0.aClass40Array3.length; local95++) {
				arg0.aClass40Array3[local95].anInt571 = -1;
				arg0.aClass40Array3[local95].aClass104_1.method9035(-1);
			}
			local16 = 0;
			arg0.anInt4869 = 0;
			arg0.anIntArray256 = null;
			local14 = -1;
			arg0.anInt4875 = 0;
			arg0.anInt9048 = arg0.anIntArray263[0] * 512 + arg0.method4424((byte) -28) * 256;
			arg0.anInt9057 = arg0.anIntArray264[0] * 512 + arg0.method4424((byte) -28) * 256;
			arg0.method4425();
		}
		local95 = Static11.method171(arg0);
		Static172.method3339(arg0);
		Static319.method5024(arg0, local95, local14, local16);
		Static182.method3446(arg0, local14);
		Static514.method7394(arg0);
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(III)Z")
	public static boolean method3959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V")
	public static void method3962() {
		Static541.anInt9249 = 0;
		@Pc(10) Class6_Sub15_Sub1 local10 = Static525.aClass260_4.aClass6_Sub15_Sub1_2;
		@Pc(14) int local14 = local10.method3005();
		@Pc(18) int local18 = local10.method3005();
		@Pc(22) int local22 = local10.method3021();
		@Pc(36) boolean local36 = local10.method3036() == 1;
		Static272.method975();
		Static593.method8224(local22);
		@Pc(49) int local49 = (Static525.aClass260_4.anInt7198 - local10.anInt3174) / 16;
		Static222.anIntArrayArray21 = new int[local49][4];
		@Pc(59) int local59;
		for (@Pc(55) int local55 = 0; local55 < local49; local55++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static222.anIntArrayArray21[local55][local59] = local10.method3015();
			}
		}
		Static173.aByteArrayArray61 = new byte[local49][];
		Static617.anIntArray642 = new int[local49];
		Static432.aByteArrayArray134 = new byte[local49][];
		Static224.anIntArray221 = new int[local49];
		Static384.aByteArrayArray119 = new byte[local49][];
		Static293.anIntArray289 = null;
		Static364.anIntArray363 = new int[local49];
		Static504.anIntArray530 = new int[local49];
		Static89.aByteArrayArray29 = new byte[local49][];
		Static346.anIntArray343 = new int[local49];
		Static76.aByteArrayArray27 = null;
		local49 = 0;
		for (local59 = (local18 - (Static29.anInt380 >> 4)) / 8; local59 <= (local18 + (Static29.anInt380 >> 4)) / 8; local59++) {
			for (@Pc(146) int local146 = (local14 - (Static327.anInt5650 >> 4)) / 8; local146 <= ((Static327.anInt5650 >> 4) + local14) / 8; local146++) {
				Static617.anIntArray642[local49] = (local59 << 8) + local146;
				Static224.anIntArray221[local49] = Static194.aClass223_39.method5257("m" + local59 + "_" + local146);
				Static346.anIntArray343[local49] = Static194.aClass223_39.method5257("l" + local59 + "_" + local146);
				Static504.anIntArray530[local49] = Static194.aClass223_39.method5257("um" + local59 + "_" + local146);
				Static364.anIntArray363[local49] = Static194.aClass223_39.method5257("ul" + local59 + "_" + local146);
				local49++;
			}
		}
		if (1236953956 != 1236953956) {
			aClass96Array1 = null;
		}
		Static472.method7116(12, local36, local14, local18);
	}
}
