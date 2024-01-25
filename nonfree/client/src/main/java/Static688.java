import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_6 = new Class286(56, 6);

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_9 = new Class186(21, -1);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_7 = new Class286(63, 8);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIZII)V")
	public static void method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg5 - arg0;
		@Pc(19) int local19 = arg0 + arg3;
		for (@Pc(21) int local21 = arg3; local21 < local19; local21++) {
			Static482.method7040(arg4, arg1, Static384.anIntArrayArray38[local21], arg2);
		}
		@Pc(45) int local45 = arg1 + arg0;
		for (@Pc(47) int local47 = arg5; local47 > local15; local47--) {
			Static482.method7040(arg4, arg1, Static384.anIntArrayArray38[local47], arg2);
		}
		@Pc(70) int local70 = arg2 - arg0;
		for (@Pc(72) int local72 = local19; local72 <= local15; local72++) {
			@Pc(80) int[] local80 = Static384.anIntArrayArray38[local72];
			Static482.method7040(arg4, arg1, local80, local45);
			Static482.method7040(arg4, local70, local80, arg2);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method332(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class400 local10 = Static81.method1057();
		@Pc(16) Class3_Sub48 local16 = Static89.method1200(Static345.aClass286_58, local10.aClass399_2);
		local16.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(arg1) + 1);
		local16.aClass3_Sub28_Sub2_1.method5315(arg0);
		local16.aClass3_Sub28_Sub2_1.method5283(arg1);
		local10.method9223(local16);
	}
}
