import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Lclient!g;")
	public static Class83 aClass83_49;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_26 = new Class183(8, 7);

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z")
	public static boolean method1833(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 12 || arg0 == 20 || arg0 == 58 || arg0 == 17) {
			return true;
		} else {
			return arg0 == 3 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	public static void method1834() {
		Static92.aClass48_5.method2475(Static226.anInt4567, Static135.aBoolean204 ? Static100.anInt2240 + 256 : -1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIIIIII)V")
	public static void method1835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class3 local8 = Static134.method2355(arg3, arg4);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray9 != null) {
			@Pc(18) Class2_Sub5 local18 = new Class2_Sub5();
			local18.anObjectArray33 = local8.anObjectArray9;
			local18.aClass3_4 = local8;
			Static351.method5589(local18);
		}
		Static190.anInt3987 = arg0;
		Static5.anInt136 = arg1;
		Static67.anInt1508 = local8.anInt56;
		Static45.aBoolean446 = true;
		Static92.anInt1971 = arg3;
		Static272.anInt5116 = arg2;
		Static56.anInt5212 = arg5;
		Static306.anInt5658 = arg4;
		Static128.method2229(local8);
	}
}
