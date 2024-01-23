import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!co", name = "H", descriptor = "Lclient!si;")
	public static Class157 aClass157_4;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "I")
	public static int anInt1026;

	@OriginalMember(owner = "client!co", name = "K", descriptor = "I")
	public static int anInt1028;

	@OriginalMember(owner = "client!co", name = "M", descriptor = "I")
	public static int anInt1030;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "[I")
	public static int[] anIntArray78;

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "Lclient!sc;")
	public static Class153 aClass153_3;

	@OriginalMember(owner = "client!co", name = "R", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!co", name = "T", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!co", name = "X", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V")
	public static void method871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(36) String local36 = "::tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local36);
		Static274.method4203(local36);
	}
}
