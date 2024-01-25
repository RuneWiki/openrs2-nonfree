import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "J")
	public static long aLong308 = 0L;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_142 = new Class25(33, -1);

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_103 = new Class231("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!za;ILclient!nj;I)V")
	public static void method4758(@OriginalArg(1) Class75 arg0, @OriginalArg(3) Class181 arg1) {
		Static463.aClass181_53.method3969();
		if (Static414.aBoolean470) {
			return;
		}
		for (@Pc(20) Class2_Sub16 local20 = (Class2_Sub16) arg1.method3972(); local20 != null; local20 = (Class2_Sub16) arg1.method3975()) {
			@Pc(28) Class203 local28 = Static5.aClass84_4.method1953(local20.anInt2880);
			if (Static228.method4879(local28)) {
				@Pc(40) boolean local40 = Static283.method4016(arg0, local28, local20);
				if (local40) {
					Static361.method5083(local28, arg0, local20);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)B")
	public static byte method4759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
