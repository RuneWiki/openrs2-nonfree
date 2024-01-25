import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!de;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public static int anInt3123;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_61 = new Class216(85, 7);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public static void method2895() {
		Static78.anInt1643 = -1;
		Static102.anInt10343 = 0;
		Static110.anInt2183 = -1;
		Static619.anInt9724 = -1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBILjava/lang/Object;)[B")
	public static byte[] method2896(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static548.method7291(arg0, local13);
		} else if (arg1 instanceof Class156) {
			@Pc(25) Class156 local25 = (Class156) arg1;
			return local25.method4852(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method2897() {
		Static330.aClass300_2.method6605();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!maa;)V")
	public static void method2898(@OriginalArg(0) Class223 arg0) {
		Static419.aClass223_4 = arg0;
	}
}
