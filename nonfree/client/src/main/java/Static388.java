import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nda", name = "J", descriptor = "Lclient!ji;")
	public static Class179 aClass179_2;

	@OriginalMember(owner = "client!nda", name = "M", descriptor = "D")
	public static double aDouble18;

	@OriginalMember(owner = "client!nda", name = "F", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_130 = new Class44(2, 10);

	@OriginalMember(owner = "client!nda", name = "G", descriptor = "[I")
	public static final int[] anIntArray523 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!nda", name = "H", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_44 = new Class264(128, 4);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILclient!so;)V")
	public static void method5808(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (Static426.aClass179_3 == null) {
			return;
		}
		try {
			Static426.aClass179_3.method4026(0L);
			Static426.aClass179_3.method4029(24, arg1.aByteArray84, arg0);
		} catch (@Pc(18) Exception local18) {
		}
	}
}
