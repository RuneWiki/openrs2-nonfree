import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!nba", name = "g", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_111 = new Class145(22, 8);

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "Lclient!ria;")
	public static Class303 aClass303_14 = null;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[4];

	@OriginalMember(owner = "client!nba", name = "r", descriptor = "[I")
	public static final int[] anIntArray418 = new int[3];

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([BI)[B")
	public static byte[] method5548(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local13];
		Static650.method2274(arg0, 0, local16, 0, local13);
		return local16;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BIIII)V")
	public static void method5550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static566.anInt9279 <= arg3 && Static392.anInt6753 >= arg3) {
			@Pc(20) int local20 = Static117.method5173(Static346.anInt5494, arg1, Static640.anInt10333);
			@Pc(26) int local26 = Static117.method5173(Static346.anInt5494, arg2, Static640.anInt10333);
			Static285.method4534(arg3, arg0, local26, local20);
		}
	}
}
