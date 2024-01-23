import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!fh;")
	public static Class58 aClass58_102;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public static int anInt5807 = 0;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[Lclient!jd;")
	public static Class95[] aClass95Array1 = new Class95[8];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!fd;Z)Lclient!am;")
	public static Class11_Sub1 method4711(@OriginalArg(0) Class4_Sub10 arg0) {
		return new Class11_Sub1(arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4613(), arg0.method4655(), arg0.method4655(), arg0.method4666());
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZBLclient!qk;II)Lclient!uj;")
	public static Class4_Sub3_Sub14 method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class147 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23 = (arg2 ? 65536 : 0) + (arg4 + (arg1 << 17) + (arg5 << 19));
		@Pc(34) long local34 = (long) arg0 * 3147483667L + (long) local23 * 3849834839L;
		@Pc(40) Class4_Sub3_Sub14 local40 = (Class4_Sub3_Sub14) Static193.aClass26_37.method518(local34);
		if (local40 != null) {
			return local40;
		}
		Static158.aBoolean218 = false;
		local40 = Static56.method965(arg1, arg2, arg0, false, arg3, arg5, arg4, false);
		if (local40 != null && !Static158.aBoolean218) {
			Static193.aClass26_37.method510(local40, local34);
		}
		return local40;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method4714() {
		if (Static218.aClass191ArrayArray1 == null) {
			return;
		}
		@Pc(8) Class191 local8 = new Class191();
		for (@Pc(10) int local10 = 0; local10 < 13; local10++) {
			for (@Pc(15) int local15 = 0; local15 < 13; local15++) {
				Static218.aClass191ArrayArray1[local10][local15] = local8;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method4715(@OriginalArg(0) int arg0) {
		@Pc(6) Class4_Sub3_Sub9 local6 = Static43.method2329(3, arg0);
		local6.method1519();
	}
}
