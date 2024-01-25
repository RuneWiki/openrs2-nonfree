import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public static int anInt2974;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!dw;")
	public static final Class78 aClass78_1 = Static99.method4654();

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_13 = new Class353();

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "F")
	public static float aFloat59 = 0.0F;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!gaa;")
	public static final Class115 aClass115_6 = new Class115();

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)I")
	public static int method2395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method2396(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static598.method1173(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
	public static void method2398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static270.anInt4759 <= arg0 && Static162.anInt2935 >= arg3 && arg4 >= Static514.anInt8722 && arg1 <= Static451.anInt7775) {
			Static61.method1094(arg1, arg0, arg2, arg3, arg4);
		} else {
			Static581.method4964(arg3, arg4, arg0, arg1, arg2);
		}
	}
}
