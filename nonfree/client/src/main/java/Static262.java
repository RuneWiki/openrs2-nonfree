import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "Lclient!pl;")
	public static Class259 aClass259_82;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_27 = new Class8();

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "Lclient!il;")
	public static final Class162 aClass162_22 = new Class162(8);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	public static void method4041() {
		@Pc(14) int local14 = (int) ((double) Static188.anInt3850 * 34.46D);
		local14 <<= 0x2;
		if (Static307.aClass100_6.method6219()) {
			local14 += 512;
		}
		Static307.aClass100_6.GA(200, local14);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!da;ILclient!sd;III)V")
	public static void method4042(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class297 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			arg2.method6781(arg1, arg0.J(), arg0.K(), arg0.OA(), arg4, arg0.l(), arg0.KA(), arg0.H(), arg3, arg0.za());
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
	public static void method4043() {
		@Pc(9) int[] local9 = new int[Static296.aClass218_1.anInt6086];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static296.aClass218_1.anInt6086; local13++) {
			@Pc(20) Class339 local20 = Static296.aClass218_1.method5067(local13);
			if (local20.anInt8959 >= 0 || local20.anInt8966 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static287.anIntArray363 = new int[local11];
		for (@Pc(45) int local45 = 0; local45 < local11; local45++) {
			Static287.anIntArray363[local45] = local9[local45];
		}
	}
}
