import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!el;")
	public static final Class109 aClass109_169 = new Class109(37, 28);

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "[Lclient!ks;")
	public static final Interface12[] anInterface12Array1 = new Interface12[75];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
	public static final int[] anIntArray476 = new int[3];

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
	public static boolean aBoolean605 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZJ)V")
	public static void method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2) {
		@Pc(17) int local17 = (int) arg2 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg2 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local17 != 10 && local17 != 11 && local17 != 22) {
			Static597.method8258(true, local24, arg0, local17, arg1, 0, 0, 0);
			return;
		}
		@Pc(64) Class55 local64 = Static536.aClass392_2.method9293(0, local31);
		@Pc(74) int local74;
		@Pc(77) int local77;
		if (local24 == 0 || local24 == 2) {
			local74 = local64.anInt958;
			local77 = local64.anInt954;
		} else {
			local74 = local64.anInt954;
			local77 = local64.anInt958;
		}
		@Pc(88) int local88 = local64.anInt939;
		if (local24 != 0) {
			local88 = (local88 << local24 & 0xF) + (local88 >> 4 - local24);
		}
		Static597.method8258(true, 0, arg0, 0, arg1, local88, local74, local77);
	}
}
