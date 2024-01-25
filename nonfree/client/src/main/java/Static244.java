import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!pt;")
	public static Class3_Sub35 aClass3_Sub35_2;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[200];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)V")
	public static void method3984(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static212.method3305(arg0)) {
			Static48.method922(Static375.aClass62ArrayArray2[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIBI)Lclient!ja;")
	public static Class8 method3985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg4 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(39) Class8 local39 = (Class8) Static155.aClass139_33.method3076(local33);
		if (local39 == null) {
			local39 = Static278.aClass155_6.method4860(arg3, arg1, arg2, arg4, arg0, arg5);
			Static155.aClass139_33.method3070(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
	public static String method3986(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static349.method5263(arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method3987() {
		if (Static29.anInt4374 > 0) {
			Static53.method988();
		} else {
			Static268.aClass145_4 = Static12.aClass145_2;
			Static12.aClass145_2 = null;
			Static310.method4763(40);
		}
	}
}
