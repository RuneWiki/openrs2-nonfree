import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	public static int anInt10290;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_146 = new Class71(73, -2);

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	public static int anInt10289 = 0;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ha;IZ)Lclient!da;")
	public static Class27 method8308(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(14) Class3 local14 = Static265.method4616(arg0, arg2, arg1);
		return local14 == null ? null : local14.aClass27_1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIILclient!nv;I)Lclient!tea;")
	public static Class20_Sub4_Sub1 method8310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class16_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean534 || Static439.method6796(arg1) && Static439.method6796(arg0)) {
			return new Class20_Sub4_Sub1(arg3, 3553, arg4, arg2, arg1, arg0, true);
		} else if (arg3.aBoolean521) {
			return new Class20_Sub4_Sub1(arg3, 34037, arg4, arg2, arg1, arg0, true);
		} else {
			return new Class20_Sub4_Sub1(arg3, arg4, arg2, arg1, arg0, Static629.method8469(arg1), Static629.method8469(arg0), true);
		}
	}
}
