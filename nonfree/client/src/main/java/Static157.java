import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public static int anInt3480 = 0;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "[Lclient!tq;")
	public static final Class279[] aClass279Array1 = new Class279[32];

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "[I")
	public static final int[] anIntArray272 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method3127() {
		Static195.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!kp;Lclient!kp;I)V")
	public static void method3128(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_284 != null) {
			arg1.method7983();
		}
		arg1.aClass1_284 = arg0.aClass1_284;
		arg1.aClass1_283 = arg0;
		arg1.aClass1_284.aClass1_283 = arg1;
		arg1.aClass1_283.aClass1_284 = arg1;
	}
}
