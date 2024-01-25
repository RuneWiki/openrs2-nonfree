import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!vd;")
	public static Class353 aClass353_4;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "J")
	public static long aLong22;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!op;")
	public static Class245 aClass245_1;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_17 = new Class268(79, 2);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method758(@OriginalArg(1) Class100 arg0) {
		if (Static270.aBoolean364) {
			Static307.method5202(arg0);
		} else {
			Static330.method5441(arg0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method760(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
}
