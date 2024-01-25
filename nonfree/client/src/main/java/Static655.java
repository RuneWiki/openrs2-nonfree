import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public static int anInt10510;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public static int anInt10505 = 0;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!v;")
	public static final Class362 aClass362_63 = new Class362();

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt10514 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ[BLclient!pq;II)Lclient!iq;")
	public static Class53_Sub2_Sub1 method8906(@OriginalArg(2) int arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) Class132_Sub3 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean538 || Static177.method2498(arg0) && Static177.method2498(arg3)) {
			return new Class53_Sub2_Sub1(arg2, 3553, 6406, arg0, arg3, false, arg1, 6406);
		} else if (arg2.aBoolean539) {
			return new Class53_Sub2_Sub1(arg2, 34037, 6406, arg0, arg3, false, arg1, 6406);
		} else {
			return new Class53_Sub2_Sub1(arg2, 6406, arg0, arg3, method8912(arg0), method8912(arg3), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	public static int method8912(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 - 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}
}
