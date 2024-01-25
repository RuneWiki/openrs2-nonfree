import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[5];

	@OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
	public static final int anInt703 = 12;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V")
	public static void method607() {
		Static19.anInt396 = 0;
		Static50.aClass254_8.method5438();
		Static50.aClass254_8.method5430(Static126.aClass1_Sub45_1);
		Static19.anInt396++;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/awt/Canvas;BIILclient!ji;Lclient!m;)Lclient!qa;")
	public static Class128 method609(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class124 arg3, @OriginalArg(5) Interface8 arg4) {
		return new Class128_Sub2(arg1, arg0, arg4, arg2, arg3);
	}
}
