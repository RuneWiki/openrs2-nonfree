import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public static int anInt4343;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "[I")
	public static final int[] anIntArray357 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method3988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!fha;)V")
	public static void method3993(@OriginalArg(1) Class14_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(16) Class5_Sub52 local16 = (Class5_Sub52) Static616.aClass81_73.method1599((long) arg0.anInt2960);
		if (local16 == null) {
			return;
		}
		if (local16.aClass5_Sub16_Sub2_4 != null) {
			Static287.aClass5_Sub16_Sub3_1.method6144(local16.aClass5_Sub16_Sub2_4);
			local16.aClass5_Sub16_Sub2_4 = null;
		}
		local16.method8911();
	}
}
