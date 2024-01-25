import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
	public static int anInt3508;

	@OriginalMember(owner = "client!kh", name = "db", descriptor = "Lclient!kb;")
	public static Class52 aClass52_18;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "[I")
	public static int[] anIntArray473 = new int[2];

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
	public static int anInt3502 = 0;

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
	public static int anInt3509 = 100;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
	public static int anInt3512 = 0;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
	public static void method3213() {
		Static27.aClass52_1 = null;
		Static225.anInt4490 = -1;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)V")
	public static void method3214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7;
		if (arg1 != Static201.anInt4174) {
			Static129.anIntArray375 = new int[arg1];
			for (local7 = 0; local7 < arg1; local7++) {
				Static129.anIntArray375[local7] = (local7 << 12) / arg1;
			}
			Static310.anInt5906 = arg1 * 32;
			Static110.anInt2508 = arg1 - 1;
			Static201.anInt4174 = arg1;
		}
		if (Static216.anInt4322 == arg0) {
			return;
		}
		if (arg0 == Static201.anInt4174) {
			Static314.anIntArray756 = Static129.anIntArray375;
		} else {
			Static314.anIntArray756 = new int[arg0];
			for (local7 = 0; local7 < arg0; local7++) {
				Static314.anIntArray756[local7] = (local7 << 12) / arg0;
			}
		}
		Static153.anInt3263 = arg0 - 1;
		Static216.anInt4322 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!ap;I)Lclient!sd;")
	public static Class43_Sub4 method3216(@OriginalArg(0) Class7_Sub3 arg0) {
		return new Class43_Sub4(arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2791(), arg0.method2791(), arg0.method2772());
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIB)V")
	public static void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15 = arg2 - arg1;
		@Pc(20) int local20 = arg3 - arg4;
		if (local15 == 0) {
			if (local20 != 0) {
				Static186.method3410(arg0, arg4, arg3, arg1);
			}
		} else if (local20 == 0) {
			Static257.method4320(arg0, arg1, arg2, arg4);
		} else {
			@Pc(49) int local49 = (local20 << 12) / local15;
			@Pc(58) int local58 = arg4 - (local49 * arg1 >> 12);
			@Pc(76) int local76;
			@Pc(74) int local74;
			if (arg1 < Static61.anInt1534) {
				local76 = Static61.anInt1534;
				local74 = local58 + (Static61.anInt1534 * local49 >> 12);
			} else if (anInt3509 >= arg1) {
				local74 = arg4;
				local76 = arg1;
			} else {
				local76 = anInt3509;
				local74 = local58 + (anInt3509 * local49 >> 12);
			}
			@Pc(117) int local117;
			@Pc(115) int local115;
			if (arg2 < Static61.anInt1534) {
				local115 = local58 + (Static61.anInt1534 * local49 >> 12);
				local117 = Static61.anInt1534;
			} else if (anInt3509 < arg2) {
				local115 = (anInt3509 * local49 >> 12) + local58;
				local117 = anInt3509;
			} else {
				local115 = arg3;
				local117 = arg2;
			}
			if (Static142.anInt3103 > local74) {
				local74 = Static142.anInt3103;
				local76 = (Static142.anInt3103 - local58 << 12) / local49;
			} else if (local74 > Static314.anInt6030) {
				local76 = (Static314.anInt6030 - local58 << 12) / local49;
				local74 = Static314.anInt6030;
			}
			if (local115 < Static142.anInt3103) {
				local115 = Static142.anInt3103;
				local117 = (Static142.anInt3103 - local58 << 12) / local49;
			} else if (Static314.anInt6030 < local115) {
				local115 = Static314.anInt6030;
				local117 = (Static314.anInt6030 - local58 << 12) / local49;
			}
			Static13.method198(local117, local115, arg0, local74, local76);
		}
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
	public static void method3218() {
		Static69.aClass103_17.method2678();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V")
	public static void method3219(@OriginalArg(0) int arg0) {
		Static268.anInt5281 = arg0;
		Static320.anInt6132 = 100;
		Static100.anInt2435 = -1;
		Static242.anInt3402 = 3;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
	public static void method3221() {
		@Pc(1) Class103 local1 = Static200.aClass103_37;
		synchronized (Static200.aClass103_37) {
			Static200.aClass103_37.method2684();
		}
	}
}
