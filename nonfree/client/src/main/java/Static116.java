import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
	public static int anInt2993;

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_29 = new Class185(36, -1);

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_40 = new Class73(113, -2);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z")
	public static boolean method2525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static613.method8396(arg0, arg1) || Static405.method6339(arg0, arg1);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI[F)[F")
	public static float[] method2527(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static653.method6540(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
