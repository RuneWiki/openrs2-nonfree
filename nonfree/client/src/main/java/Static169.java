import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public static int anInt3576 = 0;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString178 = "Choose Option";

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!ec;")
	public static Class46 aClass46_29 = new Class46(64);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
	public static void method2900(@OriginalArg(1) int arg0) {
		@Pc(10) Class162 local10 = Static19.aClass162_1;
		synchronized (Static19.aClass162_1) {
			Static185.anInt3926 = arg0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!jd;I)V")
	public static void method2901(@OriginalArg(0) Class84 arg0) {
		Static190.aClass84_90 = arg0;
	}
}
