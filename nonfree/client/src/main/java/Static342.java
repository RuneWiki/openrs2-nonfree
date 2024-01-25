import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!mn;")
	public static Class171 aClass171_74;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!nw;")
	public static Class186 aClass186_1;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	public static final int anInt6096 = -1;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	public static int anInt6098 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLclient!na;II[BIIB)Lclient!me;")
	public static Class64_Sub4_Sub1 method4851(@OriginalArg(1) Class75_Sub2 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg0.aBoolean360 || Static409.method687(arg2) && Static409.method687(arg3)) {
			return new Class64_Sub4_Sub1(arg0, 3553, 6406, arg2, arg3, false, arg1, 6406);
		} else if (arg0.aBoolean345) {
			return new Class64_Sub4_Sub1(arg0, 34037, 6406, arg2, arg3, false, arg1, 6406);
		} else {
			return new Class64_Sub4_Sub1(arg0, 6406, arg2, arg3, Static43.method654(arg2), Static43.method654(arg3), arg1, 6406);
		}
	}
}
