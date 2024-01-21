import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!m", name = "Eb", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_21;

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "[I")
	public static int[] anIntArray219 = new int[] { 0, 0, 0, 0, -1, 2, 8, 2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 0, 1, 0, 0, 0, 0, 2, 3, 0, 5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 3, 3, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, 0, 0, 8, 0, 0, 0, 0, -2, 4, 0, 0, 2, 0, 0, 0, -2, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 0, 8, 4, 0, 0, 2, 0, 0, 0, 0, 0, 2, 5, 0, 0, 4, 0, -2, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 4, 0, 0, 0, -2, 0, 1, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 2, 0, -2, 15, 2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 2, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -1, 3, 0, 0, 10, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 1, 0, 0, 0, 5, 0, 6, 0, 0, 0, 5, 0, 0, -2, -2, 6, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, 6, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, 2 };

	@OriginalMember(owner = "client!m", name = "pb", descriptor = "[I")
	public static int[] anIntArray221 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!m", name = "qb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_815 = Static75.method1216("::fpson");

	@OriginalMember(owner = "client!m", name = "Ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_816 = Static75.method1216("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
	public static void method1071() {
		aClass3_Sub1_Sub4_Sub3_21 = null;
		anIntArray219 = null;
		aClass4_815 = null;
		aClass4_816 = null;
		anIntArray221 = null;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)I")
	public static int method1073() {
		return 5;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I[BII)I")
	public static int method1079(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(10) int local10 = arg0; local10 < arg2; local10++) {
			local3 = local3 >>> 8 ^ Canvas_Sub1.anIntArray171[(local3 ^ arg1[local10]) & 0xFF];
		}
		return ~local3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ad;ILclient!ad;IIII)V")
	public static void method1082(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static4.anInt204 >= 500) {
			return;
		}
		if (arg0.method118() > 0) {
			Static104.aClass4Array20[Static4.anInt204] = Static60.method1012(new Class4[] { arg2, Static4.aClass4_109, arg0 });
		} else {
			Static104.aClass4Array20[Static4.anInt204] = arg2;
		}
		Static22.anIntArray38[Static4.anInt204] = arg1;
		Static52.anIntArray176[Static4.anInt204] = arg3;
		Static63.anIntArray225[Static4.anInt204] = arg4;
		Static107.anIntArray331[Static4.anInt204] = arg5;
		Static4.anInt204++;
	}
}
