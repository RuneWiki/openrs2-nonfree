import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "[Lclient!or;")
	public static final Class152[] aClass152Array1 = new Class152[50];

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
	public static int anInt5064 = 0;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!fn;")
	public static final Class69 aClass69_1 = new Class69();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BJ)V")
	public static void method4396(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static42.method836(arg0 - 1L);
			Static42.method836(1L);
		} else {
			Static42.method836(arg0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)V")
	public static void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null && local7.aClass8_Sub5_1 != null) {
			local7.aClass8_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method4399(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBIII)V")
	public static void method4400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg3, 10);
		local8.method4908();
		local8.anInt5705 = arg1;
		local8.anInt5703 = arg2;
		local8.anInt5704 = arg0;
	}
}
