import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "Lclient!oh;")
	public static final Class238 aClass238_1 = new Class238();

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_35 = new Class254(13, -2);

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	public static int anInt1726 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIILclient!as;)V")
	public static void method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub2 arg4) {
		@Pc(4) Class224 local4 = Static178.method3530(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1043 = (arg1 << Static494.anInt8859) + Static406.anInt9843;
		arg4.anInt1044 = arg3;
		arg4.anInt1039 = (arg2 << Static494.anInt8859) + Static406.anInt9843;
		for (@Pc(28) Class270 local28 = local4.aClass270_1; local28 != null; local28 = local28.aClass270_2) {
			if (local28.aClass11_Sub1_2.aBoolean542) {
				@Pc(38) int local38 = local28.aClass11_Sub1_2.method6199();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1044 += local8;
			arg4.aBoolean85 = true;
		} else if (local4.aClass11_Sub5_2 != null) {
			arg4.anInt1044 -= local4.aClass11_Sub5_2.aShort126;
		}
		local4.aClass11_Sub2_1 = arg4;
	}
}
