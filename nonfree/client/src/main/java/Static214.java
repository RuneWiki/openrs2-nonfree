import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
	public static final int[] anIntArray331 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray5 = new Rectangle[100];

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
	public static int anInt4012 = -1;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
	public static int anInt4016 = -1;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_32 = new Class258();

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
	public static int anInt4022 = -1;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)V")
	public static void method3054() {
		for (@Pc(15) Class4_Sub36 local15 = (Class4_Sub36) Static193.aClass258_48.method5538(); local15 != null; local15 = (Class4_Sub36) Static193.aClass258_48.method5528()) {
			if (local15.anInt6029 > 0) {
				local15.anInt6029--;
			}
			if (local15.anInt6029 != 0) {
				if (local15.anInt6034 > 0) {
					local15.anInt6034--;
				}
				if (local15.anInt6034 == 0 && local15.anInt6026 >= 1 && local15.anInt6039 >= 1 && Static126.anInt2569 - 2 >= local15.anInt6026 && Static190.anInt3697 - 2 >= local15.anInt6039 && (local15.anInt6040 < 0 || Static385.method4426(local15.anInt6036, local15.anInt6040))) {
					Static340.method4725(-1, local15.anInt6039, local15.anInt6035, local15.anInt6027, local15.anInt6040, local15.anInt6036, local15.anInt6038, local15.anInt6026);
					local15.anInt6034 = -1;
					if (local15.anInt6037 == local15.anInt6040 && local15.anInt6037 == -1) {
						local15.method5854();
					} else if (local15.anInt6040 == local15.anInt6037 && local15.anInt6032 == local15.anInt6035 && local15.anInt6036 == local15.anInt6031) {
						local15.method5854();
					}
				}
			} else if (local15.anInt6037 < 0 || Static385.method4426(local15.anInt6031, local15.anInt6037)) {
				Static340.method4725(-1, local15.anInt6039, local15.anInt6032, local15.anInt6027, local15.anInt6037, local15.anInt6031, local15.anInt6038, local15.anInt6026);
				local15.method5854();
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(B)J")
	public static long method3057() {
		return Static53.aClass173_1.method5211();
	}
}
