import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
	public static int anInt4221;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "Lclient!rb;")
	public static Class87 aClass87_37;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "[I")
	public static final int[] anIntArray431 = new int[25];

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "[Lclient!cb;")
	public static final Class14[] aClass14Array1 = new Class14[4];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[BI)I")
	public static int method3210(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static75.method1221(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	public static void method3212() {
		for (@Pc(6) Class5_Sub9 local6 = (Class5_Sub9) Static210.aClass91_7.method2684(); local6 != null; local6 = (Class5_Sub9) Static210.aClass91_7.method2678()) {
			if (local6.aClass5_Sub2_Sub7_1 != null) {
				local6.method836();
			}
		}
	}
}
