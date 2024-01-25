import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dr", name = "N", descriptor = "I")
	public static int anInt1449;

	@OriginalMember(owner = "client!dr", name = "Q", descriptor = "Lclient!ge;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!dr", name = "I", descriptor = "J")
	public static long aLong60 = 0L;

	@OriginalMember(owner = "client!dr", name = "L", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!dr", name = "R", descriptor = "Lclient!br;")
	public static final Class26 aClass26_7 = new Class26(16);

	@OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
	public static volatile int anInt1452 = 0;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)V")
	public static void method1416() {
		Static309.aFont1 = null;
		Static314.anImage3 = null;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(II)Lclient!gn;")
	public static Class73 method1417(@OriginalArg(1) int arg0) {
		@Pc(10) Class73 local10 = (Class73) Static207.aClass140_104.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static189.aClass165_58.method4508(arg0, 35);
		local10 = new Class73();
		if (local25 != null) {
			local10.method2032(new Class1_Sub7(local25));
		}
		local10.method2031();
		Static207.aClass140_104.method3817((long) arg0, local10);
		return local10;
	}
}
