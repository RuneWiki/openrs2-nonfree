import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "[I")
	public static final int[] anIntArray229 = new int[25];

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	public static int anInt4497 = 500;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	public static void method4112() {
		@Pc(13) Class6_Sub13 local13 = Static30.method353(Static441.aClass241_70, Static525.aClass260_4.aClass270_2);
		local13.aClass6_Sub15_Sub1_1.method3016(Static368.method5566());
		local13.aClass6_Sub15_Sub1_1.method3040(Static535.anInt4128);
		local13.aClass6_Sub15_Sub1_1.method3040(Static274.anInt3226);
		local13.aClass6_Sub15_Sub1_1.method3016(Static687.aClass6_Sub44_33.aClass7_Sub25_2.method7631());
		Static525.aClass260_4.method6404(local13);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)Z")
	public static boolean method4114(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Lclient!dka;")
	public static Class6_Sub2_Sub4 method4115() {
		@Pc(17) Class6_Sub2_Sub4 local17 = (Class6_Sub2_Sub4) Static99.aClass82_2.method2071();
		if (local17 != null) {
			local17.method9051();
			local17.method8464();
			return local17;
		}
		do {
			local17 = (Class6_Sub2_Sub4) Static371.aClass82_11.method2071();
			if (local17 == null) {
				return null;
			}
			if (local17.method2037() > Static549.method7758()) {
				return null;
			}
			local17.method9051();
			local17.method8464();
		} while ((Long.MIN_VALUE & local17.aLong317) == 0L);
		return local17;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public static void method4116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class6_Sub2_Sub4 local18 = Static602.method8315((long) arg1, 1);
		local18.method2040();
		local18.anInt2111 = arg0;
	}
}
