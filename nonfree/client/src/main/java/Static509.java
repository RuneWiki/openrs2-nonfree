import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "Lclient!oga;")
	public static Class236 aClass236_6;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!ml;")
	public static Class208 aClass208_6;

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_169 = new Class73(18, 11);

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
	public static int anInt9475 = 0;

	@OriginalMember(owner = "client!tj", name = "w", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_106 = new Class136(50);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V")
	public static void method7731(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		Static399.aHashtable4.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Z")
	public static boolean method7735(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class6_Sub45 local8 = (Class6_Sub45) Static182.aClass361_23.method7838(); local8 != null; local8 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
			if (Static280.method4614(local8.anInt8730) && (long) arg0 == local8.aLong235) {
				return true;
			}
		}
		return false;
	}
}
