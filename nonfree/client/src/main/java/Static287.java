import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
	public static int anInt5262;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "Lclient!fu;")
	public static Class106 aClass106_4;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "Lclient!om;")
	public static Class246 aClass246_135;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	public static int anInt5264 = 0;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIB)I")
	public static int method4540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!gfa;)V")
	public static void method4544(@OriginalArg(0) Class9_Sub1 arg0) {
		Static482.aClass43_12.MA(arg0.anInt8975, arg0.anInt8977 + (arg0.method7478() >> 1), arg0.anInt8980, Static193.anIntArray314);
		arg0.anInt8978 = Static193.anIntArray314[0];
		arg0.anInt8974 = Static193.anIntArray314[1];
		arg0.anInt8976 = Static193.anIntArray314[2];
	}
}
