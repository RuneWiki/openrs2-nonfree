import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!tr", name = "Z", descriptor = "I")
	public static int anInt6288;

	@OriginalMember(owner = "client!tr", name = "db", descriptor = "[I")
	public static int[] anIntArray505;

	@OriginalMember(owner = "client!tr", name = "cb", descriptor = "J")
	public static long aLong232 = 0L;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)V")
	public static void method5252() {
		Static285.method4876();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static345.aClass174Array1[local13].method4654();
		}
		Static170.method3202();
		Static207.method3647();
		System.gc();
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V")
	public static void method5253() {
		Static147.aClass154_51.method4219();
		Static35.aClass154_7.method4219();
	}

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)V")
	public static void method5255() {
		Static101.aClass154_48.method4219();
	}

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "(I)Z")
	public static boolean method5257() {
		return Static6.anInt1971 == 0 ? Static6.aBoolean170 : true;
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(III)V")
	public static void method5259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static155.method2994(0, 15);
		local13.method2031();
		local13.anInt2405 = arg1;
		local13.anInt2410 = arg0;
	}
}
