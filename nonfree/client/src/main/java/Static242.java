import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!in", name = "D", descriptor = "I")
	public static int anInt4063;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "Lclient!du;")
	public static final Class81 aClass81_37 = new Class81(16);

	@OriginalMember(owner = "client!in", name = "K", descriptor = "[I")
	public static final int[] anIntArray346 = new int[25];

	@OriginalMember(owner = "client!in", name = "L", descriptor = "Lclient!cga;")
	public static final Class52 aClass52_2 = new Class52();

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I[BB)[B")
	public static byte[] method3685(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static655.method4109(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
