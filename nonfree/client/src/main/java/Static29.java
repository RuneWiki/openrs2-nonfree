import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt620 = 0;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public static int anInt630 = 0;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString25 = "Cancel";

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method608(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static291.aClass48_1);
		arg0.addMouseMotionListener(Static291.aClass48_1);
		arg0.addFocusListener(Static291.aClass48_1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)Z")
	public static boolean method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static309.method1137(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static190.method3149(local10 + 1, Static154.anIntArrayArrayArray5[arg0][arg1][arg2] + arg3, local14 + 1) && Static190.method3149(local10 + 128 - 1, Static154.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static190.method3149(local10 + 128 - 1, Static154.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static190.method3149(local10 + 1, Static154.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!pi;B)Lclient!kk;")
	public static Class5_Sub4 method615(@OriginalArg(0) Class4_Sub24 arg0) {
		return new Class5_Sub4(arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3063(), arg0.method3110());
	}
}
