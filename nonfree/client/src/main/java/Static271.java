import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!no", name = "c", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!no", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BJ)V")
	public static void method3945(@OriginalArg(1) long arg0) {
		if (Static268.aClass211ArrayArrayArray4 != null) {
			if (Static310.anInt5540 == 1 || Static310.anInt5540 == 5) {
				Static35.method1642(arg0);
			} else if (Static310.anInt5540 == 4) {
				Static131.method5614(arg0);
			}
		}
		Static447.method5990((long) Static403.anInt6978, Static276.aClass109_10);
		if (Static273.anInt4878 != -1) {
			Static192.method2935(Static273.anInt4878);
		}
		for (@Pc(42) int local42 = 0; local42 < Static262.anInt4661; local42++) {
			if (Static22.aBooleanArray12[local42]) {
				Static108.aBooleanArray7[local42] = true;
			}
			Static240.aBooleanArray15[local42] = Static22.aBooleanArray12[local42];
			Static22.aBooleanArray12[local42] = false;
		}
		Static212.anInt453 = Static403.anInt6978;
		if (Static276.aClass109_10.method4703()) {
			Static203.aBoolean253 = true;
		}
		if (Static273.anInt4878 != -1) {
			Static262.anInt4661 = 0;
			Static382.method5216();
		}
		Static276.aClass109_10.va();
		Static339.method4797(Static276.aClass109_10);
		@Pc(89) int local89 = Static114.method1703();
		if (local89 == -1) {
			local89 = Static246.anInt4394;
		}
		if (local89 == -1) {
			local89 = Static154.anInt2645;
		}
		Static234.method3458(local89);
		Static60.method1071(Static9.anInt248, Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95, Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068, Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065);
		Static9.anInt248 = 0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V")
	public static void method3946(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static164.aBooleanArray22[arg0]) {
			Static136.aClass250_26.method5646(arg0);
			Static448.aClass219ArrayArray2[arg0] = null;
			Static346.aClass219ArrayArray1[arg0] = null;
			Static164.aBooleanArray22[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBII)I")
	public static int method3947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
