import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_90 = new Class36(80, 4);

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
	public static int anInt4959 = -1;

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "Lclient!ob;")
	public static final Class170 aClass170_3 = new Class170("RC", 1);

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "Lclient!ik;")
	public static final Class119 aClass119_1 = Static73.method1340();

	@OriginalMember(owner = "client!oe", name = "eb", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_91 = new Class36(63, -1);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
	public static void method3775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class4_Sub1_Sub8 local13 = Static416.method5456(arg3, 10);
		local13.method2762();
		local13.anInt3611 = arg2;
		local13.anInt3610 = arg0;
		local13.anInt3607 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
	public static void method3777() {
		if (Static285.aBoolean355) {
			Static285.aBoolean355 = false;
			Static328.aClass3_16 = null;
			Static235.aClass3_12 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
	public static void method3778(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static137.aFloat154 = 3.0F;
		} else if (arg0 == 50) {
			Static137.aFloat154 = 4.0F;
		} else if (arg0 == 75) {
			Static137.aFloat154 = 6.0F;
		} else if (arg0 == 100) {
			Static137.aFloat154 = 8.0F;
		} else if (arg0 == 200) {
			Static137.aFloat154 = 16.0F;
		}
		Static97.anInt2094 = -1;
		Static97.anInt2094 = -1;
	}
}
