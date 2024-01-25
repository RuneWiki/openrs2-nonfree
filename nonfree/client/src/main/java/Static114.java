import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
	public static int anInt2087;

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
	public static int anInt2095;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "[S")
	public static final short[] aShortArray31 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "[S")
	private static final short[] aShortArray33 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "[S")
	private static final short[] aShortArray32 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "[[S")
	public static final short[][] aShortArrayArray17 = new short[][] { aShortArray33, aShortArray32, aShortArray31 };

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "[I")
	public static final int[] anIntArray144 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!vj;I)Lclient!vc;")
	public static Class69_Sub3 method1710(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(7) Class69 local7 = Static24.method447(arg0);
		@Pc(11) int local11 = arg0.method8542();
		@Pc(22) int local22 = arg0.method8542();
		return new Class69_Sub3(local7.aClass361_10, local7.aClass306_13, local7.anInt9605, local7.anInt9611, local7.anInt9616, local7.anInt9604, local7.anInt9610, local7.anInt9613, local7.anInt9612, local11, local22);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)J")
	public static long method1711() {
		return Static374.aClass99_1.method6869();
	}
}
