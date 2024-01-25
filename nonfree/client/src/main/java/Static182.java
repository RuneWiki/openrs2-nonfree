import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "Lclient!um;")
	public static Class11_Sub39 aClass11_Sub39_1;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "[[I")
	public static int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
	public static int anInt3662;

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "Lclient!nq;")
	public static Class144 aClass144_49;

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "Lclient!nq;")
	public static Class144 aClass144_50;

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_63 = new Class117("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "[I")
	public static final int[] anIntArray268 = new int[4096];

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_32 = new Class26(2);

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIB)B")
	public static byte method3089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!uo;IILclient!nj;BIII)Lclient!sg;")
	public static Class97 method3090(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class140 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static194.aClass165_3.anInt5181 = arg5;
		Static194.aClass165_3.anInt5176 = arg4;
		Static194.aClass165_3.anInt5175 = arg1;
		Static194.aClass165_3.anInt5178 = arg2;
		Static194.aClass165_3.aBoolean337 = arg3 != null;
		Static194.aClass165_3.anInt5174 = arg0.anInt5876;
		Static194.aClass165_3.anInt5179 = arg6;
		return (Class97) Static72.aClass54_1.method925(Static194.aClass165_3);
	}
}
