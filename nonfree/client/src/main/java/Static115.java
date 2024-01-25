import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_50 = new Class119(14, -2);

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "[S")
	public static final short[] aShortArray32 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
	public static boolean aBoolean223 = false;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
	public static int anInt2498 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Lclient!vm;")
	public static Class7_Sub5 method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class7_Sub5 local14 = local7.aClass7_Sub5_1;
			local7.aClass7_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "()V")
	public static void method1912() {
		for (@Pc(1) int local1 = 0; local1 < Static232.anInt4417; local1++) {
			@Pc(6) Class7_Sub2 local6 = Static434.aClass7_Sub2Array3[local1];
			Static156.method2537(local6);
			Static434.aClass7_Sub2Array3[local1] = null;
		}
		Static232.anInt4417 = 0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIIIII)V")
	public static void method1913(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(44) int local44 = Static366.aShort89 + (Static387.aShort90 - Static366.aShort89) * local21 / 100;
		if (local44 < Static224.aShort69) {
			local44 = Static224.aShort69;
		} else if (Static421.aShort92 < local44) {
			local44 = Static421.aShort92;
		}
		@Pc(65) int local65 = arg1 * 512 * local44 / (arg2 * 334);
		@Pc(99) int local99;
		@Pc(106) int local106;
		@Pc(74) short local74;
		if (local65 < Static32.aShort30) {
			local74 = Static32.aShort30;
			local44 = local74 * 334 * arg2 / (arg1 * 512);
			if (Static421.aShort92 < local44) {
				local44 = Static421.aShort92;
				local99 = local44 * arg1 * 512 / (local74 * 334);
				local106 = (arg2 - local99) / 2;
				if (arg0) {
					Static121.aClass172_3.va();
					Static121.aClass172_3.method5507(-16777216, arg1, arg4, arg3, local106);
					Static121.aClass172_3.method5507(-16777216, arg1, arg2 + arg4 - local106, arg3, local106);
				}
				arg2 -= local106 * 2;
				arg4 += local106;
			}
		} else if (Static16.aShort21 < local65) {
			local74 = Static16.aShort21;
			local44 = local74 * 334 * arg2 / (arg1 * 512);
			if (local44 < Static224.aShort69) {
				local44 = Static224.aShort69;
				local99 = arg2 * local74 * 334 / (local44 * 512);
				local106 = (arg1 - local99) / 2;
				if (arg0) {
					Static121.aClass172_3.va();
					Static121.aClass172_3.method5507(-16777216, local106, arg4, arg3, arg2);
					Static121.aClass172_3.method5507(-16777216, local106, arg4, arg1 + arg3 - local106, arg2);
				}
				arg3 += local106;
				arg1 -= local106 * 2;
			}
		}
		Static75.anInt1920 = arg4;
		Static284.anInt5188 = arg3;
		Static410.anInt6752 = (short) arg2;
		Static361.anInt6104 = (short) arg1;
		Static316.anInt5558 = local44 * arg1 / 334;
	}
}
