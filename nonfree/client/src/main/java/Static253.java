import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Lclient!eo;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!co;")
	public static final Class41 aClass41_58 = new Class41(8);

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public static int anInt4866 = 0;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "[I")
	public static final int[] anIntArray399 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
	public static void method4380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(5, arg1);
		local8.method1198();
		local8.anInt1465 = arg0;
	}
}
