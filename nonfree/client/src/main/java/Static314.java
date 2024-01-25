import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!gda;")
	public static Class114 aClass114_11;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_134 = new Class362(19, 0);

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt6224 = 0;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "[I")
	public static final int[] anIntArray302 = new int[1000];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!jn;)V")
	public static void method5292(@OriginalArg(1) Class176 arg0) {
		Static421.aClass176_105 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Z")
	public static boolean method5296(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
