import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "Lclient!ee;")
	public static final Class74 aClass74_4 = new Class74();

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "[S")
	public static short[] aShortArray82 = new short[256];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(JJ)J")
	public static long method4397(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
