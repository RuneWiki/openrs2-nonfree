import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "Lclient!vq;")
	public static Class47 aClass47_9;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "[I")
	public static int[] anIntArray443 = new int[2];

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "[I")
	public static final int[] anIntArray444 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "J")
	public static long aLong175 = 0L;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BII)B")
	public static byte method4687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!br;)Lclient!br;")
	public static Class21 method4696(@OriginalArg(1) Class21 arg0) {
		@Pc(6) Class21 local6 = Static44.method883(arg0);
		if (local6 == null) {
			local6 = arg0.aClass21_2;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!bk;Lclient!ml;Ljava/awt/Canvas;I)Lclient!vq;")
	public static Class47 method4697(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) Class134 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class47_Sub2");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, bk.class, Integer.TYPE, Integer.TYPE, ml.class);
			return (Class47) local57.newInstance(arg3, arg1, Integer.valueOf(arg0), new Integer(arg4), arg2);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}
}
