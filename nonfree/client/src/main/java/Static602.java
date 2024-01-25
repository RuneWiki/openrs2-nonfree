import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static602 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Lclient!wu;")
	public static Class384 aClass384_131;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public static int anInt9884;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)Z")
	public static boolean method8405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!ns;)I")
	public static int method8407(@OriginalArg(1) Class247 arg0) {
		if (Static385.aClass247_11 == arg0) {
			return 5120;
		} else if (arg0 == Static385.aClass247_12) {
			return 5122;
		} else if (arg0 == Static385.aClass247_13) {
			return 5124;
		} else if (arg0 == Static385.aClass247_14) {
			return 5121;
		} else if (Static385.aClass247_15 == arg0) {
			return 5123;
		} else if (Static385.aClass247_16 == arg0) {
			return 5125;
		} else if (arg0 == Static385.aClass247_17) {
			return 5131;
		} else if (arg0 == Static385.aClass247_18) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([Ljava/awt/Rectangle;IB)V")
	public static void method8408(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (Static453.anInt7627 == 1) {
			Static512.aClass126_22.method7014(arg0, arg1, Static463.anInt7854, Static355.anInt6322);
		} else {
			Static512.aClass126_22.method7014(arg0, arg1, 0, 0);
		}
	}
}
