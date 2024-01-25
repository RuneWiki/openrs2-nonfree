import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "[I")
	public static int[] anIntArray648;

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "J")
	public static long aLong248 = -1L;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;BZI)Lclient!da;")
	public static Class68 method8292(@OriginalArg(0) Class20 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class95 local14 = Static252.method4683(arg2, arg0, arg1);
		return local14 == null ? null : local14.aClass68_5;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)V")
	public static void method8295(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static421.aBooleanArray19[arg0]) {
			Static517.aClass157_255.method4565(arg0);
			Static631.aClass24ArrayArray2[arg0] = null;
			Static410.aClass24ArrayArray1[arg0] = null;
			Static421.aBooleanArray19[arg0] = false;
		}
	}
}
