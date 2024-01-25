import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Lclient!nl;")
	public static Class171 aClass171_51;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "[I")
	public static int[] anIntArray733;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public static int anInt3685 = 0;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_59 = new Class11(69, 4);

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!mb;")
	public static final Class154 aClass154_6 = new Class154();

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_60 = new Class11(21, 7);

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
	public static int anInt3687 = 0;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_61 = new Class11(25, 7);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method3360(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	public static void method3361() {
		if (Static141.aClass117_7 != Static350.aClass117_9) {
			try {
				Static403.method4138("tbrefresh", Static387.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
