import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public static int anInt1543;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ug;B)Lclient!aa;")
	public static Class2_Sub1 method1263(@OriginalArg(0) Class3_Sub26 arg0) {
		return new Class2_Sub1(arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3899(), arg0.method3899(), arg0.method3915());
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 - arg1;
		if (local3 < -9) {
			return "<col=ff0000>";
		} else if (local3 < -6) {
			return "<col=ff3000>";
		} else if (local3 < -3) {
			return "<col=ff7000>";
		} else if (local3 < 0) {
			return "<col=ffb000>";
		} else if (local3 > 9) {
			return "<col=00ff00>";
		} else if (local3 > 6) {
			return "<col=40ff00>";
		} else if (local3 > 3) {
			return "<col=80ff00>";
		} else if (local3 <= 0) {
			return "<col=ffff00>";
		} else {
			return "<col=c0ff00>";
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIII)V")
	public static void method1266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static136.anInt2621 = arg2;
		Static246.anInt4983 = arg1;
		Static241.anInt4892 = arg0;
		Static184.anInt3648 = arg3;
		Static313.anInt6125 = arg4;
	}
}
