import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fga", name = "F", descriptor = "I")
	public static int anInt3211;

	@OriginalMember(owner = "client!fga", name = "L", descriptor = "Lclient!w;")
	public static Class375 aClass375_1;

	@OriginalMember(owner = "client!fga", name = "M", descriptor = "Z")
	public static boolean aBoolean249;

	@OriginalMember(owner = "client!fga", name = "N", descriptor = "Lclient!vv;")
	public static Interface26 anInterface26_1;

	@OriginalMember(owner = "client!fga", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!fga", name = "O", descriptor = "Z")
	public static volatile boolean aBoolean250 = true;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIILclient!cl;Lclient!cl;)V")
	public static void method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub1_Sub2 arg3, @OriginalArg(4) Class28_Sub1_Sub2 arg4) {
		@Pc(4) Class164 local4 = Static408.method5789(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass28_Sub1_Sub2_2 = arg3;
		local4.aClass28_Sub1_Sub2_1 = arg4;
		@Pc(19) int local19 = Static121.aClass21Array2 == Static108.aClass21Array1 ? 1 : 0;
		if (!arg3.method9281()) {
			arg3.aClass28_Sub1_23 = Static198.aClass28_Sub1Array37[local19];
			Static198.aClass28_Sub1Array37[local19] = arg3;
		} else if (arg3.method9287()) {
			arg3.aClass28_Sub1_23 = Static38.aClass28_Sub1Array5[local19];
			Static38.aClass28_Sub1Array5[local19] = arg3;
		} else {
			arg3.aClass28_Sub1_23 = Static539.aClass28_Sub1Array26[local19];
			Static539.aClass28_Sub1Array26[local19] = arg3;
			Static27.aBoolean42 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9281()) {
			if (arg4.method9287()) {
				arg4.aClass28_Sub1_23 = Static38.aClass28_Sub1Array5[local19];
				Static38.aClass28_Sub1Array5[local19] = arg4;
				return;
			}
			arg4.aClass28_Sub1_23 = Static539.aClass28_Sub1Array26[local19];
			Static539.aClass28_Sub1Array26[local19] = arg4;
			Static27.aBoolean42 = true;
			return;
		}
		arg4.aClass28_Sub1_23 = Static198.aClass28_Sub1Array37[local19];
		Static198.aClass28_Sub1Array37[local19] = arg4;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)V")
	public static void method2960(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(14, (long) arg0);
		local9.method2194();
	}
}
