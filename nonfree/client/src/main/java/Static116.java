import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!ab;")
	public static Class3 aClass3_22;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public static int anInt2488 = 100;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1154 = Static187.method3089(": ");

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1155 = Static187.method3089("Welt");

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1157 = Static187.method3089(" is already on your ignore list)3");

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1156 = aClass92_1157;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Lclient!rf;")
	public static Class35 method1720() {
		try {
			return (Class35) Class.forName("Class35_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class35_Sub1();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(JLclient!vd;BIISLclient!vd;)V")
	public static void method1722(@OriginalArg(0) long arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) Class92 arg5) {
		if (Static35.aBoolean61 || Static152.anInt3135 >= 500) {
			return;
		}
		Static158.aClass92Array23[Static152.anInt3135] = arg5;
		Static65.aClass92Array9[Static152.anInt3135] = arg1;
		Static120.aShortArray21[Static152.anInt3135] = arg4;
		Static142.aLongArray8[Static152.anInt3135] = arg0;
		Static119.anIntArray192[Static152.anInt3135] = arg2;
		Static184.anIntArray327[Static152.anInt3135] = arg3;
		Static152.anInt3135++;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BIIII)V")
	public static void method1723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg3 <= arg0) {
			for (local10 = arg3; local10 < arg0; local10++) {
				Static142.anIntArrayArray25[local10][arg2] = arg1;
			}
		} else {
			for (local10 = arg0; local10 < arg3; local10++) {
				Static142.anIntArrayArray25[local10][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lclient!ja;")
	public static Class1_Sub3_Sub11 method1724(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub3_Sub11 local19 = (Class1_Sub3_Sub11) Static133.aClass47_20.method1281((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33 = Static63.aClass3_34.method3265(Static24.method462(arg0), Static168.method2630(arg0));
		local19 = new Class1_Sub3_Sub11();
		local19.anInt1919 = arg0;
		if (local33 != null) {
			local19.method1321(new Class1_Sub14(local33));
		}
		Static133.aClass47_20.method1273((long) arg0, local19);
		return local19;
	}
}
