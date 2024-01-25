import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	public static int anInt8260;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_19 = new Class244(12, 8);

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_151 = new Class268(13, 1);

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "[Lclient!uba;")
	public static final Class6_Sub46[] aClass6_Sub46Array5 = new Class6_Sub46[1024];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ[F)[F")
	public static float[] method7118(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static655.method5832(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
