import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	public static int anInt314;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
	public static int anInt331;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public static int anInt315 = 0;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
	public static int anInt322 = -1;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)Z")
	public static boolean method300(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static53.method881();
		if (arg0 == local13) {
			return true;
		}
		if (!arg0) {
			Static53.method873();
		} else if (!Static53.method879() || !Static53.method877() || !Static53.method871()) {
			arg0 = false;
		}
		Static300.aBoolean391 = arg0;
		Static66.method1055(Static276.aClass139_4);
		if (local13 == arg0) {
			return false;
		} else {
			((Class24_Sub1) Static158.anInterface5_1).method460();
			return true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method301() {
		Static164.aClass26_30.method511();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
	public static int method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
	public static int method303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local9 << 13 ^ local9;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)Lclient!gl;")
	public static Class4_Sub3_Sub5 method304(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(27) Class4_Sub3_Sub5 local27;
		if (Static94.aBoolean138) {
			local27 = new Class4_Sub3_Sub5_Sub1(arg0, Static195.anIntArray402, Static187.anIntArray391, Static110.anIntArray185, Static301.anIntArray643, Static230.aByteArrayArray36);
		} else {
			local27 = new Class4_Sub3_Sub5_Sub2(arg0, Static195.anIntArray402, Static187.anIntArray391, Static110.anIntArray185, Static301.anIntArray643, Static230.aByteArrayArray36);
		}
		Static304.method4707();
		return local27;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lclient!wg;")
	public static Class4_Sub3_Sub22 method305() {
		return Static121.aClass4_Sub3_Sub22_3;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIBI)V")
	public static void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg2 >= arg3) {
			for (local10 = arg3; local10 < arg2; local10++) {
				Static220.anIntArrayArray36[local10][arg0] = arg1;
			}
		} else {
			for (local10 = arg2; local10 < arg3; local10++) {
				Static220.anIntArrayArray36[local10][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(JI)V")
	public static void method308(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < Static272.anInt5215; local13++) {
			if (Static285.aLongArray54[local13] == arg0) {
				Static272.anInt5215--;
				for (@Pc(36) int local36 = local13; local36 < Static272.anInt5215; local36++) {
					Static181.aStringArray23[local36] = Static181.aStringArray23[local36 + 1];
					Static157.anIntArray293[local36] = Static157.anIntArray293[local36 + 1];
					Static150.aStringArray22[local36] = Static150.aStringArray22[local36 + 1];
					Static285.aLongArray54[local36] = Static285.aLongArray54[local36 + 1];
					Static251.anIntArray517[local36] = Static251.anIntArray517[local36 + 1];
					Static81.aBooleanArray7[local36] = Static81.aBooleanArray7[local36 + 1];
				}
				Static98.anInt2102 = Static261.anInt4980;
				Static110.aClass4_Sub10_Sub1_1.method4687(172);
				Static110.aClass4_Sub10_Sub1_1.method4619(arg0);
				break;
			}
		}
	}
}
