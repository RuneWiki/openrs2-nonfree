import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!d", name = "Pc", descriptor = "[Lclient!c;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!d", name = "Rc", descriptor = "I")
	public static int anInt820 = 0;

	@OriginalMember(owner = "client!d", name = "Xc", descriptor = "I")
	public static int anInt826 = 0;

	@OriginalMember(owner = "client!d", name = "qd", descriptor = "Lclient!he;")
	private static Class26 aClass26_397 = Static6.method100("wave:");

	@OriginalMember(owner = "client!d", name = "Zc", descriptor = "Lclient!he;")
	public static Class26 aClass26_391 = aClass26_397;

	@OriginalMember(owner = "client!d", name = "fd", descriptor = "Lclient!he;")
	private static Class26 aClass26_394 = Static6.method100("Close");

	@OriginalMember(owner = "client!d", name = "cd", descriptor = "Lclient!he;")
	public static Class26 aClass26_392 = aClass26_394;

	@OriginalMember(owner = "client!d", name = "kd", descriptor = "Lclient!he;")
	public static Class26 aClass26_395 = aClass26_397;

	@OriginalMember(owner = "client!d", name = "nd", descriptor = "Lclient!he;")
	private static Class26 aClass26_396 = Static6.method100("Loading interfaces )2 ");

	@OriginalMember(owner = "client!d", name = "ud", descriptor = "Lclient!he;")
	public static Class26 aClass26_398 = aClass26_396;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	public static void method476(@OriginalArg(0) int arg0) {
		if (Static73.method1341(arg0)) {
			Static22.method487(-1, Static49.aClass3_Sub14ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
	public static int method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
	public static void method479() {
		aClass10Array1 = null;
		aClass26_392 = null;
		aClass26_394 = null;
		aClass26_396 = null;
		aClass26_395 = null;
		aClass26_391 = null;
		aClass26_397 = null;
		aClass26_398 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!m;Z)Lclient!he;")
	public static Class26 method480(@OriginalArg(1) Class3_Sub11 arg0) {
		try {
			@Pc(12) Class26 local12 = new Class26();
			local12.anInt1345 = arg0.method979();
			if (local12.anInt1345 > 32767) {
				local12.anInt1345 = 32767;
			}
			local12.aByteArray7 = new byte[local12.anInt1345];
			arg0.anInt1562 += Static16.aClass47_1.method1352(arg0.aByteArray13, local12.anInt1345, arg0.anInt1562, local12.aByteArray7, 0);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static43.aClass26_1474;
		}
	}
}
