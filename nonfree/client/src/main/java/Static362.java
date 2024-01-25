import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
	public static int anInt6989 = -1;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method5869(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static185.aClass33_8 = arg0;
		Static199.anInt4633 = arg1;
		Static441.aBoolean681 = Static199.anInt4633 > 1 && Static185.aClass33_8.method6155();
		Static276.anInt5846 = 9;
		Static325.anInt6512 = 0x1 << Static276.anInt5846;
		Static510.anInt8986 = Static325.anInt6512 >> 1;
		Math.sqrt((double) (Static510.anInt8986 * Static510.anInt8986 + Static510.anInt8986 * Static510.anInt8986));
		Static626.anInt10336 = 4;
		Static642.anInt10523 = arg2;
		Static158.anInt3845 = arg3;
		Static157.anInt3831 = arg4;
		Static638.aClass206_1 = Static235.method4529();
		Static92.method2446();
		Static360.aClass106ArrayArrayArray3 = new Class106[4][Static642.anInt10523][Static158.anInt3845];
		Static445.aClass274Array1 = new Class274[4];
		if (arg5) {
			Static226.anIntArrayArray49 = new int[Static642.anInt10523][Static158.anInt3845];
			Static256.aByteArrayArray10 = new byte[Static642.anInt10523][Static158.anInt3845];
			Static453.aShortArrayArray18 = new short[Static642.anInt10523][Static158.anInt3845];
			Static185.aClass106ArrayArrayArray2 = new Class106[1][Static642.anInt10523][Static158.anInt3845];
			Static524.aClass274Array3 = new Class274[1];
		} else {
			Static226.anIntArrayArray49 = null;
			Static256.aByteArrayArray10 = null;
			Static453.aShortArrayArray18 = null;
			Static185.aClass106ArrayArrayArray2 = null;
			Static524.aClass274Array3 = null;
		}
		if (arg6) {
			Static408.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static523.aClass93Array1 = new Class93[65535];
			Static511.aBooleanArray23 = new boolean[65535];
			Static252.anInt5591 = 0;
		} else {
			Static408.aLongArrayArrayArray1 = null;
			Static523.aClass93Array1 = null;
			Static511.aBooleanArray23 = null;
			Static252.anInt5591 = 0;
		}
		Static526.method6820(false);
		Static44.aClass2_Sub3Array3 = new Class2_Sub3[2];
		Static464.aClass2_Sub3Array6 = new Class2_Sub3[2];
		Static634.aClass2_Sub3Array7 = new Class2_Sub3[2];
		Static132.aClass2_Sub3Array4 = new Class2_Sub3[10000];
		Static161.anInt3884 = 0;
		Static199.aClass2_Sub3Array5 = new Class2_Sub3[5000];
		Static592.anInt9872 = 0;
		Static113.aClass2_Sub3_Sub1Array3 = new Class2_Sub3_Sub1[5000];
		Static185.anInt4396 = 0;
		Static622.aBooleanArrayArray11 = new boolean[Static157.anInt3831 + Static157.anInt3831 + 1][Static157.anInt3831 + Static157.anInt3831 + 1];
		Static49.aBooleanArrayArray1 = new boolean[Static157.anInt3831 + Static157.anInt3831 + 2][Static157.anInt3831 + Static157.anInt3831 + 2];
		Static163.anIntArray210 = new int[Static157.anInt3831 + Static157.anInt3831 + 2];
		Static625.aClass70_2 = Static625.aClass70_3;
		if (Static441.aBoolean681) {
			Static437.aBooleanArrayArrayArray2 = new boolean[4][Static157.anInt3831 + Static157.anInt3831 + 1][Static157.anInt3831 + Static157.anInt3831 + 1];
			Static227.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static443.aClass249Array1 != null) {
				Static496.method7256();
			}
			Static443.aClass249Array1 = new Class249[Static199.anInt4633];
			Static185.aClass33_8.method6195(Static443.aClass249Array1.length + 1);
			Static185.aClass33_8.method6154(0);
			for (@Pc(205) int local205 = 0; local205 < Static443.aClass249Array1.length; local205++) {
				Static443.aClass249Array1[local205] = new Class249(local205 + 1, Static185.aClass33_8);
				(new Thread(Static443.aClass249Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static199.anInt4633 == 2) {
				local240 = 4;
				Static303.anInt6083 = 2;
			} else if (Static199.anInt4633 == 3) {
				local240 = 6;
				Static303.anInt6083 = 3;
			} else {
				local240 = 8;
				Static303.anInt6083 = 4;
			}
			Static162.aClass56Array1 = new Class56[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static162.aClass56Array1[local260] = new Class56(Static214.aStringArrayArray2[Static199.anInt4633 - 2][local260]);
			}
		} else {
			Static303.anInt6083 = 1;
		}
		Static585.anIntArray616 = new int[Static303.anInt6083 - 1];
		Static324.anIntArray381 = new int[Static303.anInt6083 - 1];
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIII)V")
	public static void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) Class3_Sub1_Sub21 local21 = Static57.method8561(arg1, 4);
		local21.method8631();
		local21.anInt10490 = arg2;
		local21.anInt10489 = arg3;
		local21.anInt10491 = arg0;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IC)Z")
	public static boolean method5871(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	public static void method5872() {
		if (Static109.aClass107_3 != Static85.aClass107_2) {
			try {
				Static653.method5390("tbrefresh", Static321.aClient2);
			} catch (@Pc(23) Throwable local23) {
			}
		}
	}
}
