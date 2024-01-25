import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static647 {

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "Lclient!kh;")
	public static Class208 aClass208_13;

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
	public static int anInt9957;

	@OriginalMember(owner = "client!vq", name = "V", descriptor = "Lclient!gj;")
	public static Class143 aClass143_143;

	@OriginalMember(owner = "client!vq", name = "W", descriptor = "I")
	public static int anInt9959;

	@OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
	public static int anInt9954 = 1;

	@OriginalMember(owner = "client!vq", name = "S", descriptor = "Lclient!jia;")
	public static Class193 aClass193_70 = new Class193();

	@OriginalMember(owner = "client!vq", name = "U", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V")
	public static void method8475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static14.aClass181_5 == Static102.aClass181_38) {
			if (Static628.method8288(0, 1, false, arg1, 1, arg0, -2, 0)) {
				return;
			}
			Static628.method8288(0, 1, false, arg1, 1, arg0, -3, 0);
		} else if (Static628.method8288(0, 1, false, arg1, 1, arg0, -3, 0)) {
			return;
		} else {
			Static628.method8288(0, 1, false, arg1, 1, arg0, -2, 0);
		}
	}
}
