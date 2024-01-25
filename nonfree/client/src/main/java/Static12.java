import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "[Lclient!eo;")
	public static Class68[] aClass68Array1;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "Lclient!vg;")
	public static final Class247 aClass247_1 = new Class247("LIVE", 0);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Z")
	public static boolean method401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIFFIIFIFLclient!qi;F)[B")
	public static byte[] method403(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(6) float arg2, @OriginalArg(8) float arg3, @OriginalArg(9) Class10 arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static317.method4624(arg3, arg2, arg5, arg1, local10, 0, arg4, arg0);
		return local10;
	}
}
