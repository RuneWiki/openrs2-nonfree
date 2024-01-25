import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	public static int anInt3975;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
	public static int anInt3976;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_67 = new Class198("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	public static int anInt3974 = 0;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "[I")
	public static final int[] anIntArray254 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	public static int method3170() {
		if ((double) Static98.aFloat83 == 3.0D) {
			return 37;
		} else if ((double) Static98.aFloat83 == 4.0D) {
			return 50;
		} else if ((double) Static98.aFloat83 == 6.0D) {
			return 75;
		} else if ((double) Static98.aFloat83 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)Z")
	public static boolean method3172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static210.method2798(arg1, arg0) | (arg0 & 0x70000) != 0 || Static16.method268(arg0, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBIIIIIII)Z")
	public static boolean method3174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg2 + arg6 && arg7 + arg0 > arg2) {
			return arg4 < arg5 + arg3 && arg3 < arg4 + arg1;
		} else {
			return false;
		}
	}
}
