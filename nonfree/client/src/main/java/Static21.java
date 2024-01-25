import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!db;")
	public static final Class64 aClass64_28 = new Class64(13, -1);

	@OriginalMember(owner = "client!as", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[5];

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	public static int anInt415 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BIIFFIFLclient!fq;FFI)[B")
	public static byte[] method415(@OriginalArg(3) float arg0, @OriginalArg(4) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) Class109 arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static423.method6067(0, arg2, arg4, arg0, local15, arg1, arg3, arg5);
		return local15;
	}
}
