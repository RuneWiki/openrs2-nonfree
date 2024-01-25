import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "[I")
	public static int[] anIntArray279;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!ra;")
	public static Class170 aClass170_73;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!bm;Lclient!am;ILjava/awt/Canvas;)Lclient!en;")
	public static Class59 method3511(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Canvas arg4) {
		try {
			@Pc(6) Class local6 = Class.forName("Class59_Sub1");
			@Pc(52) Constructor local52 = local6.getConstructor(Canvas.class, bm.class, Integer.TYPE, Integer.TYPE, am.class);
			return (Class59) local52.newInstance(arg4, arg1, Integer.valueOf(arg3), new Integer(arg0), arg2);
		} catch (@Pc(89) Exception local89) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3515(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static290.aString323 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static353.aString381 + "</col>";
		}
	}
}
