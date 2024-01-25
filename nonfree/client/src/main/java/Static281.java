import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static281 {

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
	public static int anInt5391;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public static int anInt5392;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "Lclient!fn;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
	public static int anInt5394 = 1;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)Z")
	public static boolean method4576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BLclient!mfa;I)V")
	public static void method4577(@OriginalArg(1) Class3_Sub9_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static458.anInt7786 = 0;
		Static214.aBoolean328 = false;
		Static12.method218(arg0);
		Static224.method3861(arg0);
		if (Static214.aBoolean328) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt6453 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt6453 + " psize:" + arg1);
		}
	}
}
