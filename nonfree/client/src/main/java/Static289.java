import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "Lclient!ps;")
	public static Class275 aClass275_1;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "[Lclient!s;")
	public static Class12[] aClass12Array3;

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
	public static int anInt4893;

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_189 = new Class179(26, 6);

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "Lclient!pb;")
	public static final Class265 aClass265_13 = new Class265(3);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	public static void method4158() {
		for (@Pc(6) Class6_Sub34 local6 = (Class6_Sub34) Static60.aClass209_5.method5037(); local6 != null; local6 = (Class6_Sub34) Static60.aClass209_5.method5036()) {
			if (local6.aBoolean342) {
				local6.aBoolean342 = false;
			} else {
				Static270.method3993(local6.anInt5400);
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)Z")
	public static boolean method4159(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
