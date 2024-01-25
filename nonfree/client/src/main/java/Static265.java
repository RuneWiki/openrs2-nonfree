import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "Lclient!pj;")
	public static Class248 aClass248_37;

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public static int anInt4731 = -50;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IILclient!ql;)V")
	public static void method4011(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub12_Sub2 arg1) {
		Static534.anInt8867 = 0;
		Static274.aBoolean358 = false;
		Static436.method6185(arg1);
		Static270.method4035(arg1);
		if (Static274.aBoolean358) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt7556) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7556 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4012(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static9.method126(-1, -1, arg1, arg0);
	}
}
