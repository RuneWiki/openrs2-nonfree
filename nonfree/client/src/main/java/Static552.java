import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static552 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	public static int anInt8530;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!mo;Z)Z")
	public static boolean method7058(@OriginalArg(0) Class218 arg0) {
		return Static243.aClass218_5 == arg0 || Static428.aClass218_7 == arg0 || Static363.aClass218_9 == arg0 || arg0 == Static584.aClass218_11;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!jd;BI)V")
	public static void method7061(@OriginalArg(0) Class1_Sub20_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static371.aBoolean465 = false;
		Static121.anInt2449 = 0;
		Static291.method4576(arg0);
		Static435.method6300(arg0);
		if (Static371.aBoolean465) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt5238) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt5238 + " psize:" + arg1);
		}
	}
}
