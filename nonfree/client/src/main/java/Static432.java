import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "[Lclient!nc;")
	public static Class246[] aClass246Array1;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!fo;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
	public static final int[] anIntArray469 = new int[1];

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_110 = new Class216(2, -1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public static void method5963() {
		if (Static162.method2597(Static656.anInt10356) || Static477.method6557(Static656.anInt10356)) {
			Static531.method7142(Static611.anInt9382 >> 12, Static652.anInt10283 >> 12, 5000);
		} else {
			@Pc(31) int local31 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0] >> 3;
			@Pc(38) int local38 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0] >> 3;
			if (local31 >= 0 && Static224.anInt3557 >> 3 > local31 && local38 >= 0 && Static267.anInt4309 >> 3 > local38) {
				Static531.method7142(local31, local38, 5000);
			} else {
				Static531.method7142(Static224.anInt3557 >> 4, Static267.anInt4309 >> 4, 0);
			}
		}
		Static197.method4784();
		Static349.method4691();
		Static230.method3346();
		Static210.method3126();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Lclient!hba;")
	public static Class144 method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass144_1;
	}
}
