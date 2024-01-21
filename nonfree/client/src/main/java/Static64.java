import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Lclient!dd;")
	public static Class15 aClass15_4;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!sa;")
	public static Class72 aClass72_14 = new Class72(30);

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public static int anInt1575 = 0;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!cd;")
	private static Class10 aClass10_689 = Static51.method932("This world is full)3");

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!sa;")
	public static Class72 aClass72_15 = new Class72(260);

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_690 = aClass10_689;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
	public static int anInt1576 = 0;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_691 = Static51.method932("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt1578 = 0;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	public static int anInt1579 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method1126() {
		aClass10_689 = null;
		anIntArrayArray22 = null;
		aClass10_690 = null;
		aClass72_14 = null;
		aClass72_15 = null;
		aClass15_4 = null;
		aClass10_691 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
	public static int method1127(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method1128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static5.anInt119; local3++) {
			if (Static101.anIntArray244[local3] + Static72.anIntArray187[local3] > arg3 && Static72.anIntArray187[local3] < arg3 + arg0 && arg1 < Static159.anIntArray360[local3] + Static109.anIntArray255[local3] && arg2 + arg1 > Static109.anIntArray255[local3]) {
				Static170.aBooleanArray18[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1129(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static142.aClass86_1);
		arg0.removeMouseMotionListener(Static142.aClass86_1);
		arg0.removeFocusListener(Static142.aClass86_1);
		Static130.anInt2897 = 0;
	}
}
