import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!df;")
	public static Class33 aClass33_3;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
	public static final int[] anIntArray488 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!fc;IZI)V")
	public static void method5698(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static247.aClass54ArrayArray1[arg2][arg1] = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)V")
	public static void method5699(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class1_Sub26 local10 = Static65.method5281(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray255.length; local15++) {
				local10.anIntArray255[local15] = -1;
				local10.anIntArray256[local15] = 0;
			}
		}
	}
}
