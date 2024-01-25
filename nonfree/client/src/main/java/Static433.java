import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static433 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
	public static final int[] anIntArray501 = new int[14];

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!kp;")
	public static Class196 aClass196_7 = null;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public static int anInt7318 = 0;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_214 = new Class363(27, -1);

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "[I")
	public static final int[] anIntArray502 = new int[2];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z")
	public static boolean method6129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static222.method3495(arg1, arg0) & Static419.method5470(arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!lo;)V")
	public static void method6131(@OriginalArg(0) Class6_Sub1 arg0) {
		Static356.aClass100_8.MA(arg0.anInt8761, arg0.anInt8759 + (arg0.method7328() >> 1), arg0.anInt8764, Static450.anIntArray519);
		arg0.anInt8762 = Static450.anIntArray519[0];
		arg0.anInt8763 = Static450.anIntArray519[1];
		arg0.anInt8758 = Static450.anIntArray519[2];
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	public static int method6132(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
