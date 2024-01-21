import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "J")
	public static long aLong43;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "[I")
	public static int[] anIntArray103 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Lclient!md;")
	public static Class54 aClass54_4 = new Class54(4096);

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Lclient!kb;")
	public static Class46 aClass46_371 = Static65.method1172("null");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!kb;BLclient!kb;ILclient!jg;Z)V")
	public static void method840(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class46 arg1, @OriginalArg(4) Class44 arg2) {
		@Pc(12) int local12 = arg2.method1617(arg1);
		@Pc(22) int local22 = arg2.method1631(arg0, local12);
		method845(255, local22, local12, arg2);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([Lclient!kb;I)[Lclient!kb;")
	public static Class46[] method841(@OriginalArg(0) Class46[] arg0) {
		@Pc(4) Class46[] local4 = new Class46[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local4[local10] = Static178.method2860(new Class46[] { Static57.method1068(local10), Static37.aClass46_290 });
			if (arg0 != null && arg0[local10] != null) {
				local4[local10] = Static178.method2860(new Class46[] { local4[local10], arg0[local10] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V")
	public static void method843() {
		aClass54_4 = null;
		aClass46_371 = null;
		anIntArray103 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZIIZ)Lclient!me;")
	public static Class44_Sub1 method844(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) Class30 local15 = null;
		if (Static53.aClass6_3 != null) {
			local15 = new Class30(arg2, Static53.aClass6_3, Static110.aClass6Array1[arg2], 1000000);
		}
		return new Class44_Sub1(local15, Static152.aClass30_4, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!jg;BZ)V")
	public static void method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44 arg3) {
		Static88.aClass44_15 = arg3;
		Static130.anInt3073 = 10000;
		Static54.anInt1417 = arg1;
		Static167.anInt739 = arg2;
		Static146.aBoolean140 = false;
		Static22.anInt527 = 1;
		Static77.anInt1924 = arg0;
	}
}
