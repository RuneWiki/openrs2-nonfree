import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static39 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ck;IB)V")
	public static void method643(@OriginalArg(0) Class3_Sub5_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static20.anInt242 = 0;
		Static55.aBoolean65 = false;
		Static165.method2522(arg0);
		Static171.method2655(arg0);
		if (Static55.aBoolean65) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt3121 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt3121 + " psize:" + arg1);
		}
	}
}
