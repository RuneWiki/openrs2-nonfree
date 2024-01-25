import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
	public static int anInt6176 = 104;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "[I")
	public static final int[] anIntArray289 = new int[1];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!oi;)V")
	public static void method5161(@OriginalArg(1) Class9_Sub4_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt4316 - Static384.anInt7234;
		@Pc(22) int local22 = arg0.anInt4303 * 512 + arg0.method3620() * 256;
		@Pc(33) int local33 = arg0.anInt4273 * 512 + arg0.method3620() * 256;
		arg0.anInt10357 += (local33 - arg0.anInt10357) / local9;
		arg0.anInt10360 += (local22 - arg0.anInt10360) / local9;
		arg0.anInt4358 = 0;
		if (arg0.anInt4334 == 0) {
			arg0.method3628(8192);
		}
		if (arg0.anInt4334 == 1) {
			arg0.method3628(12288);
		}
		if (arg0.anInt4334 == 2) {
			arg0.method3628(0);
		}
		if (arg0.anInt4334 == 3) {
			arg0.method3628(4096);
		}
	}
}
