import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame62;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array85 = new Class65[1000];

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1278 = Static119.method1462("Malformed login packet)3");

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1277 = aClass65_1278;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject65 = new Object();

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1279 = Static119.method1462("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1280 = Static119.method1462("_");

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public static volatile int anInt2956 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!na;IZI)Z")
	public static boolean method2052(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1666(arg2, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static38.method668(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public static void method2054() {
		aClass65_1278 = null;
		aClass65Array85 = null;
		aClass65_1280 = null;
		anObject65 = null;
		aFrame62 = null;
		anIntArray418 = null;
		aClass65_1279 = null;
		aClass65_1277 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method2056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub20 local10 = (Class2_Sub20) Static22.aClass40_6.method851((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray345.length > arg0) {
			return local10.anIntArray345[arg0];
		} else {
			return -1;
		}
	}
}
