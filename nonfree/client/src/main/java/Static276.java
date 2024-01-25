import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jha", name = "z", descriptor = "I")
	public static int anInt4337 = 0;

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(BLclient!li;)V")
	public static void method3846(@OriginalArg(1) Class41_Sub1_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt9491 - Static421.anInt7434;
		@Pc(20) int local20 = arg0.anInt9468 * 512 + arg0.method7917() * 256;
		@Pc(31) int local31 = arg0.anInt9505 * 512 + arg0.method7917() * 256;
		arg0.anInt9523 = 0;
		arg0.anInt10367 += (local31 - arg0.anInt10367) / local9;
		arg0.anInt10366 += (local20 - arg0.anInt10366) / local9;
		if (arg0.anInt9515 == 0) {
			arg0.method7915(8192);
		}
		if (arg0.anInt9515 == 1) {
			arg0.method7915(12288);
		}
		if (arg0.anInt9515 == 2) {
			arg0.method7915(0);
		}
		if (arg0.anInt9515 == 3) {
			arg0.method7915(4096);
		}
	}
}
