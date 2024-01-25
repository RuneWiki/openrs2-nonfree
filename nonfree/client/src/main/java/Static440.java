import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "Lclient!db;")
	public static final Class64 aClass64_366 = new Class64(42, 3);

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "Lclient!nea;")
	public static final Class240 aClass240_3 = new Class240();

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "[I")
	public static final int[] anIntArray616 = new int[4096];

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "Lclient!tga;")
	public static final Class315 aClass315_6 = new Class315("WTI", 5);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Z")
	public static boolean method6234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)I")
	public static int method6235(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Z")
	public static boolean method6236(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)Z")
	public static boolean method6237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
