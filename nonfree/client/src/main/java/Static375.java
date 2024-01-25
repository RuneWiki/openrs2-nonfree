import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!ns;")
	public static Class166 aClass166_207;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!ns;")
	public static Class166 aClass166_208;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	public static int anInt5261;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	public static int anInt5262;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!bp;")
	public static Class6_Sub2_Sub1_Sub1 aClass6_Sub2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!er;")
	public static final Class69 aClass69_49 = new Class69(10);

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!pg;")
	public static Class186 aClass186_176 = null;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ns;BI)Lclient!jt;")
	public static Class4_Sub24 method4048(@OriginalArg(0) Class166 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method3684(arg1);
		return local13 == null ? null : new Class4_Sub24(local13);
	}
}
