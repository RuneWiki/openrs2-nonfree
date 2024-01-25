import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public static int anInt4684;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_132 = new Class208(20, -2);

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "[I")
	public static final int[] anIntArray390 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method4218(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!kd;)V")
	public static void method4219(@OriginalArg(1) Class123 arg0) {
		@Pc(7) Class248 local7 = null;
		try {
			@Pc(11) Class86 local11 = arg0.method3248();
			while (local11.anInt2590 == 0) {
				Static215.method3855(1L);
			}
			if (local11.anInt2590 == 1) {
				local7 = (Class248) local11.anObject2;
				@Pc(32) Class2_Sub24 local32 = Static310.method5030();
				local7.method6005(local32.aByteArray100, local32.anInt6669, 0);
			}
		} catch (@Pc(42) Exception local42) {
		}
		try {
			if (local7 != null) {
				local7.method6004();
			}
		} catch (@Pc(49) Exception local49) {
		}
	}
}
