import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "[I")
	public static final int[] anIntArray660 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!uja", name = "r", descriptor = "Z")
	public static boolean aBoolean728 = false;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(III)Lclient!et;")
	public static Class3_Sub1_Sub4 method7996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_Sub4_2;
	}
}
