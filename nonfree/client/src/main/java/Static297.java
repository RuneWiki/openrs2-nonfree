import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "I")
	public static int anInt5356 = -1;

	@OriginalMember(owner = "client!kia", name = "h", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray9 = new int[2][][];

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ID)V")
	public static void method4694(@OriginalArg(1) double arg0) {
		Static432.aClass51_9.method6704(Static605.aClass51_10);
		Static432.aClass51_9.method6711(0, 0, (int) arg0);
		Static613.aClass13_82.method8138(Static432.aClass51_9);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIZZIII)V")
	public static void method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 ? Static305.aClass2_Sub49_15.aClass33_Sub9_4.method3103() : Static305.aClass2_Sub49_15.aClass33_Sub9_5.method3103()) != 0 && arg3 != 0 && Static110.anInt2383 < 50 && arg0 != -1) {
			Static301.aClass301Array1[Static110.anInt2383++] = new Class301((byte) (arg2 ? 3 : 2), arg0, arg3, arg4, arg5, 0, arg1, (Class16_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z)V")
	public static void method4696() {
		Static340.anInt5976++;
		Static229.anInt4227 = 0;
		Static570.anInt9337 = 0;
		Static192.method3289();
		Static358.method5348();
		Static239.method3869();
		@Pc(21) boolean local21 = false;
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static229.anInt4227; local28++) {
			local34 = Static104.anIntArray173[local28];
			@Pc(41) Class2_Sub32 local41 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local34);
			@Pc(44) Class16_Sub1_Sub1_Sub3_Sub1 local44 = local41.aClass16_Sub1_Sub1_Sub3_Sub1_2;
			if (Static113.aBoolean192 && Static590.method8337(local34)) {
				Static395.method5851();
			}
			if (Static340.anInt5976 != local44.anInt8110) {
				if (local44.aClass113_1.method2743()) {
					Static409.method6031(local44);
				}
				local44.method1409((Class113) null);
				local21 = true;
				local41.method8920();
			}
		}
		if (local21) {
			Static608.anInt10053 = Static514.aClass323_32.method7483();
			Static514.aClass323_32.method7476(Static480.aClass2_Sub32Array1);
		}
		if (Static327.aClass2_Sub17_Sub1_1.anInt3378 != Static245.anInt4755) {
			throw new RuntimeException("gnp1 pos:" + Static327.aClass2_Sub17_Sub1_1.anInt3378 + " psize:" + Static245.anInt4755);
		}
		for (local34 = 0; local34 < Static317.anInt5602; local34++) {
			if (Static514.aClass323_32.method7484((long) Static363.anIntArray409[local34]) == null) {
				throw new RuntimeException("gnp2 pos:" + local34 + " size:" + Static317.anInt5602);
			}
		}
		if (Static608.anInt10053 - Static317.anInt5602 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static608.anInt10053 - Static317.anInt5602));
		}
		for (@Pc(170) int local170 = 0; local170 < Static608.anInt10053; local170++) {
			if (Static480.aClass2_Sub32Array1[local170].aClass16_Sub1_Sub1_Sub3_Sub1_2.anInt8110 != Static340.anInt5976) {
				throw new RuntimeException("gnp4 uk:" + Static480.aClass2_Sub32Array1[local170].aClass16_Sub1_Sub1_Sub3_Sub1_2.anInt8075);
			}
		}
	}
}
