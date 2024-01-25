import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public static int anInt7790;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!hv;")
	public static Class12_Sub20 aClass12_Sub20_3;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!ha;")
	public static Class84 aClass84_21;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "[B")
	public static final byte[] aByteArray97 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
	public static int anInt7798 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZII)I")
	public static int method6483(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class12_Sub23 local10 = Static292.method4742(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray334.length; local23++) {
				if (local10.anIntArray333[local23] == arg2) {
					local21 += local10.anIntArray334[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIILclient!mc;)V")
	public static void method6485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class198 arg2) {
		Static157.anInt3414 = arg1;
		Static82.anInt1961 = arg0;
		Static488.aClass198_15 = arg2;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)V")
	public static void method6486(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static126.aBooleanArray46[arg0]) {
			Static314.aClass16_78.method383(arg0);
			Static71.aClass198ArrayArray1[arg0] = null;
			Static473.aClass198ArrayArray2[arg0] = null;
			Static126.aBooleanArray46[arg0] = false;
		}
	}
}
