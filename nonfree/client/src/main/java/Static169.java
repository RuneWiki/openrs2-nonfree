import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
	public static int anInt3012;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array5;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
	public static int anInt3015;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_7 = new Class210(8, 1);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!kq;I)Ljava/lang/String;")
	public static String method2825(@OriginalArg(0) Class199 arg0) {
		if (Static75.method1604(arg0).method815() == 0) {
			return null;
		} else if (arg0.aString51 == null || arg0.aString51.trim().length() == 0) {
			return Static110.aBoolean147 ? "Hidden-use" : null;
		} else {
			return arg0.aString51;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;II)V")
	public static void method2827(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class97 local9 = Static146.aClass97Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static146.aClass97Array1[local11] = Static146.aClass97Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class97(arg1, arg7, arg0, arg2, arg4, arg3, arg6, arg5);
		} else {
			local9.method2409(arg6, arg2, arg3, arg5, arg1, arg0, arg4, arg7);
		}
		Static146.aClass97Array1[0] = local9;
		Static178.anInt3101 = Static317.anInt4914;
		Static208.anInt3378++;
	}
}
