import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Lclient!ai;")
	public static Class9 aClass9_4;

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
	public static void method4915(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static192.aBooleanArray20[arg0]) {
			return;
		}
		Static46.aClass144_19.method3912(arg0);
		if (Static188.aClass137ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(31) int local31 = 0; local31 < Static188.aClass137ArrayArray1[arg0].length; local31++) {
			if (Static188.aClass137ArrayArray1[arg0][local31] != null) {
				if (Static188.aClass137ArrayArray1[arg0][local31].anInt4067 == 2) {
					local25 = false;
				} else {
					Static188.aClass137ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local25) {
			Static188.aClass137ArrayArray1[arg0] = null;
		}
		Static192.aBooleanArray20[arg0] = false;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)Lclient!kb;")
	public static Class11_Sub4_Sub8 method4916(@OriginalArg(1) int arg0) {
		@Pc(10) Class11_Sub4_Sub8 local10 = (Class11_Sub4_Sub8) Static215.aClass142_10.method3874((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static328.aClass144_105.method3896(arg0, 19);
		local10 = new Class11_Sub4_Sub8();
		if (local20 != null) {
			local10.method2515(new Class11_Sub25(local20));
		}
		Static215.aClass142_10.method3870(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)V")
	public static void method4917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static198.anIntArray311[arg1] = arg0;
		@Pc(23) Class11_Sub16 local23 = (Class11_Sub16) Static37.aClass58_7.method1009((long) arg1);
		if (local23 == null) {
			local23 = new Class11_Sub16(Static268.method4627() + 500L);
			Static37.aClass58_7.method1006((long) arg1, local23);
		} else {
			local23.aLong74 = Static268.method4627() + 500L;
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
	public static void method4918() {
		if (Static283.method4712() || Static141.anInt2602 == Static322.anInt6250) {
			Static170.method2770(Static107.aClass129_4);
			if (Static257.anInt5200 != Static322.anInt6250) {
				Static76.method4698();
			}
		} else {
			Static19.method1626(false, Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], Static16.anInt277, false, Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static19.anInt1986, Static322.anInt6250);
		}
	}
}
