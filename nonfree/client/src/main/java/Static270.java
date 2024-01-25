import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_71 = new Class205(44, 8);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!vh;II)V")
	public static void method2993(@OriginalArg(0) Class2_Sub16_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static266.aBoolean346 = false;
		Static299.anInt5124 = 0;
		Static308.method4503(arg0);
		Static262.method4051(arg0);
		if (Static266.aBoolean346) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt6145 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt6145 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BILclient!ae;I)V")
	public static void method2995(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2) {
		Static31.anInt666 = arg0;
		Static380.anInt6480 = arg2;
		Static40.aClass4_7 = arg1;
	}
}
