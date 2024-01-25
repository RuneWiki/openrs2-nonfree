import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Z")
	public static boolean aBoolean717 = false;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLjava/lang/String;)Lclient!pu;")
	public static Class128 method8550(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class128 local8;
		try {
			local8 = (Class128) Class.forName("Class128_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class128_Sub2();
		}
		local8.anInt5388 = arg0;
		local8.aString66 = arg1;
		return local8;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(BI)V")
	public static void method8553(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub18 local15 = (Class2_Sub18) Static284.aClass335_14.method8357((long) arg0);
		if (local15 != null) {
			local15.aBoolean110 = !local15.aBoolean110;
			local15.aClass78_Sub1_1.method1995(local15.aBoolean110);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JIBI)V")
	public static void method8556(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static76.method1368(local10, local17, 0, arg1, 0, 0, true, arg2);
			return;
		}
		@Pc(60) Class331 local60 = Static251.aClass328_1.method8261(local24);
		@Pc(74) int local74;
		@Pc(71) int local71;
		if (local17 == 0 || local17 == 2) {
			local74 = local60.anInt9454;
			local71 = local60.anInt9425;
		} else {
			local71 = local60.anInt9454;
			local74 = local60.anInt9425;
		}
		@Pc(85) int local85 = local60.anInt9444;
		if (local17 != 0) {
			local85 = (local85 << local17 & 0xF) + (local85 >> 4 - local17);
		}
		Static76.method1368(0, 0, local71, arg1, local74, local85, true, arg2);
	}
}
