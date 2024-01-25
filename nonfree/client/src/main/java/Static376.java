import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!bu;")
	public static final Class43 aClass43_1 = new Class43(1);

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "[I")
	public static final int[] anIntArray347 = new int[1];

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIBII)Lclient!vm;")
	public static Class130 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg3 * 67481L ^ (long) arg5 * 97549L ^ (long) arg1 * 475427L ^ (long) arg2 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg0 * 76724863L;
		@Pc(44) Class130 local44 = (Class130) Static156.aClass87_85.method1805(local38);
		if (local44 == null) {
			local44 = Static550.aClass133_14.method7318(arg3, arg5, arg1, arg2, arg4, arg0);
			Static156.aClass87_85.method1792(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!raa;ILclient!raa;)V")
	public static void method5536(@OriginalArg(0) Class295 arg0, @OriginalArg(2) Class295 arg1) {
		@Pc(17) Class5_Sub48 local17 = Static16.method232(Static141.aClass46_30, Static276.aClass251_2);
		local17.aClass5_Sub22_Sub1_2.method5949(arg1.anInt8022);
		local17.aClass5_Sub22_Sub1_2.method5961(arg1.anInt8010);
		local17.aClass5_Sub22_Sub1_2.method5959(arg0.anInt8022);
		local17.aClass5_Sub22_Sub1_2.method5904(arg0.anInt8010);
		local17.aClass5_Sub22_Sub1_2.method5927(arg1.anInt8025);
		local17.aClass5_Sub22_Sub1_2.method5961(arg0.anInt8025);
		Static277.method4436(local17);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIB)Z")
	public static boolean method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static227.method3519(arg0, arg1) || Static40.method5453(arg1, arg0);
	}
}
