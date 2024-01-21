import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public static int anInt3118;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1151 = Static146.method2172("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1152 = Static146.method2172("wishes to trade with you)3");

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1153 = aClass77_1152;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method2200() {
		aClass77_1153 = null;
		aByteArrayArrayArray5 = null;
		aClass77_1152 = null;
		aClass77_1151 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
	public static int method2201(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lclient!sg;")
	public static Class77 method2202(@OriginalArg(1) int arg0) {
		return Static136.aClass77Array20[arg0].method2532() <= 0 ? Static56.aClass77Array10[arg0] : Static146.method2168(new Class77[] { Static56.aClass77Array10[arg0], Static112.aClass77_1057, Static136.aClass77Array20[arg0] });
	}
}
