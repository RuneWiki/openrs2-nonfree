import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lclient!oc;")
	public static Class61 aClass61_4;

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3 aClass3_Sub2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
	public static int anInt3081;

	@OriginalMember(owner = "client!pc", name = "ob", descriptor = "Lclient!wf;")
	public static Class87 aClass87_11 = new Class87(8);

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1001 = Static170.method3101("purple:");

	@OriginalMember(owner = "client!pc", name = "ub", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1002 = aClass28_1001;

	@OriginalMember(owner = "client!pc", name = "vb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1003 = aClass28_1001;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public static void method2398() {
		aClass28_1002 = null;
		aClass28_1001 = null;
		aClass3_Sub2_Sub2_Sub3_2 = null;
		aClass61_4 = null;
		aClass87_11 = null;
		aClass28_1003 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZZ)V")
	public static void method2400(@OriginalArg(2) boolean arg0) {
		Static41.anInt1147 = 2;
		Static31.aBoolean51 = arg0;
		Static96.anInt4194 = 22050;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)I")
	public static int method2401() {
		return Static134.anInt3415++;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!fh;II)V")
	public static void method2403(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static82.anInt2400 >= 400) {
			return;
		}
		if (arg1.anIntArray242 != null) {
			arg1 = arg1.method1118();
		}
		if (arg1 == null || !arg1.aBoolean69) {
			return;
		}
		@Pc(34) Class28 local34 = arg1.aClass28_414;
		if (arg1.anInt1318 != 0) {
			local34 = Static4.method96(new Class28[] { local34, Static101.method2115(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt877, arg1.anInt1318), Static113.aClass28_938, Static132.aClass28_1098, Static146.method2793(arg1.anInt1318), Static163.aClass28_1379 });
		}
		if (Static95.anInt2636 == 1) {
			Static70.method1646(Static85.aClass28_786, arg3, arg2, Static4.method96(new Class28[] { Static154.aClass28_1288, Static74.aClass28_665, local34 }), (short) 17, (long) arg0);
		} else if (!Static67.aBoolean109) {
			@Pc(86) Class28[] local86 = arg1.aClass28Array5;
			if (Static52.aBoolean79) {
				local86 = Static168.method3099(local86);
			}
			@Pc(96) int local96;
			if (local86 != null) {
				for (local96 = 4; local96 >= 0; local96--) {
					if (local86[local96] != null && !local86[local96].method936(Static19.aClass28_212)) {
						@Pc(114) byte local114 = 0;
						if (local96 == 0) {
							local114 = 9;
						}
						if (local96 == 1) {
							local114 = 4;
						}
						if (local96 == 2) {
							local114 = 11;
						}
						if (local96 == 3) {
							local114 = 15;
						}
						if (local96 == 4) {
							local114 = 38;
						}
						Static70.method1646(local86[local96], arg3, arg2, Static4.method96(new Class28[] { Static21.aClass28_233, local34 }), local114, (long) arg0);
					}
				}
			}
			if (local86 != null) {
				for (local96 = 4; local96 >= 0; local96--) {
					if (local86[local96] != null && local86[local96].method936(Static19.aClass28_212)) {
						@Pc(197) short local197 = 0;
						if (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt877 < arg1.anInt1318) {
							local197 = 2000;
						}
						@Pc(206) short local206 = 0;
						if (local96 == 0) {
							local206 = 9;
						}
						if (local96 == 1) {
							local206 = 4;
						}
						if (local96 == 2) {
							local206 = 11;
						}
						if (local96 == 3) {
							local206 = 15;
						}
						if (local96 == 4) {
							local206 = 38;
						}
						if (local206 != 0) {
							local206 += local197;
						}
						Static70.method1646(local86[local96], arg3, arg2, Static4.method96(new Class28[] { Static21.aClass28_233, local34 }), local206, (long) arg0);
					}
				}
			}
			Static70.method1646(Static110.aClass28_916, arg3, arg2, Static4.method96(new Class28[] { Static21.aClass28_233, local34 }), (short) 1005, (long) arg0);
			return;
		} else if ((Static171.anInt4101 & 0x2) == 2) {
			Static70.method1646(Static30.aClass28_313, arg3, arg2, Static4.method96(new Class28[] { Static101.aClass28_843, Static74.aClass28_665, local34 }), (short) 41, (long) arg0);
			return;
		}
	}
}
