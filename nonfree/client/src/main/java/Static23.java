import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "[[Lclient!kd;")
	public static Class1_Sub20[][] aClass1_Sub20ArrayArray2;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public static int anInt486;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString14 = "Loaded title screen";

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public static int anInt483 = 0;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "[I")
	public static int[] anIntArray49 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILclient!ok;IIII)V")
	public static void method395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class116 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg0 * arg0 + arg4 * arg4;
		if (arg1 < local17) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg2.anInt4299 / 2, arg2.anInt4363 / 2);
		if (local32 * local32 >= local17) {
			Static167.method3092(arg4, arg5, arg3, arg0, arg2, Static33.aClass1_Sub2_Sub14Array5[arg6]);
			return;
		}
		local32 -= 10;
		@Pc(45) int local45 = Static59.anInt1529 + (int) Static125.aFloat97 & 0x7FF;
		@Pc(49) int local49 = Class91.anIntArray320[local45];
		@Pc(57) int local57 = local49 * 256 / (Static16.anInt453 + 256);
		@Pc(61) int local61 = Class91.anIntArray319[local45];
		@Pc(69) int local69 = local61 * 256 / (Static16.anInt453 + 256);
		@Pc(80) int local80 = arg0 * local57 - arg4 * local69 >> 16;
		@Pc(90) int local90 = local57 * arg4 + local69 * arg0 >> 16;
		@Pc(96) double local96 = Math.atan2((double) local90, (double) local80);
		@Pc(103) int local103 = (int) (Math.sin(local96) * (double) local32);
		@Pc(110) int local110 = (int) (Math.cos(local96) * (double) local32);
		if (Static296.aBoolean335) {
			((Class1_Sub2_Sub14_Sub2) Static40.aClass1_Sub2_Sub14Array10[arg6]).method2736((local103 + arg3 + arg2.anInt4299 / 2) * 16, (arg2.anInt4363 / 2 + arg5 - local110) * 16, (int) (local96 * 10430.378D));
		} else {
			((Class1_Sub2_Sub14_Sub1) Static40.aClass1_Sub2_Sub14Array10[arg6]).method2475(arg2.anInt4299 / 2 + arg3 + local103 - 10, -local110 + -10 + arg2.anInt4363 / 2 + arg5, local96);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method396(@OriginalArg(0) Class83 arg0) {
		if (Static270.aBoolean308) {
			return;
		}
		if (Static296.aBoolean335) {
			Static288.method4715();
		} else {
			Static203.method3602();
		}
		Static229.aClass1_Sub2_Sub14_7 = Static239.method4128(Static46.anInt6184, arg0);
		@Pc(20) int local20 = Static144.anInt3368;
		@Pc(26) int local26 = local20 * 956 / 503;
		Static229.aClass1_Sub2_Sub14_7.method2726((Static193.anInt4370 - local26) / 2, 0, local26, local20);
		Static90.aClass7_1 = Static139.method4753(Static270.anInt5838, arg0);
		Static90.aClass7_1.method4259(Static193.anInt4370 / 2 - Static90.aClass7_1.anInt5432 / 2, 18);
		Static270.aBoolean308 = true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!kb;II)Lclient!jc;")
	public static Class1_Sub17 method398(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method2330(arg1);
		return local16 == null ? null : new Class1_Sub17(local16);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public static void method399() {
		Static125.aClass155_22.method4362();
		Static183.aClass155_35.method4362();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLclient!ok;I)V")
	public static void method400(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class116 arg1) {
		@Pc(9) int local9 = arg1.anInt4321 == 0 ? arg1.anInt4299 : arg1.anInt4321;
		@Pc(21) int local21 = arg1.anInt4320 == 0 ? arg1.anInt4363 : arg1.anInt4320;
		Static230.method4024(arg1.anInt4290, local9, Static81.aClass116ArrayArray1[arg1.anInt4290 >> 16], arg0, local21);
		if (arg1.aClass116Array1 != null) {
			Static230.method4024(arg1.anInt4290, local9, arg1.aClass116Array1, arg0, local21);
		}
		@Pc(59) Class1_Sub12 local59 = (Class1_Sub12) Static147.aClass117_12.method3438((long) arg1.anInt4290);
		if (local59 != null) {
			Static240.method4145(arg0, local21, local9, local59.anInt2230);
		}
	}
}
