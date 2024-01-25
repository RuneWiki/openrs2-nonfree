import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
	public static int anInt1451;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "[Lclient!wc;")
	public static final Class8_Sub5_Sub21[] aClass8_Sub5_Sub21Array4 = new Class8_Sub5_Sub21[14];

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	public static void method1260() {
		Static383.anInt7454 = 0;
		Static636.anInt10642 = 0;
		Static514.anInt9009 = 0;
		Static583.anInt10010 = 0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B[SI)[S")
	public static short[] method1261(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static649.method5533(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
	public static void method1262() {
		if (Static229.anInterface18Array1 == null) {
			return;
		}
		@Pc(14) Interface18[] local14 = Static229.anInterface18Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface18 local22 = local14[local16];
			local22.method8412();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([IIIII)V")
	public static void method1264(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(8) int local8 = arg3 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg1 < local11) {
			@Pc(15) int local15 = arg1 + 1;
			arg0[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			arg1 = local45 + 1;
			arg0[arg1] = arg2;
		}
		while (local8 > arg1) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BZIII)Lclient!wg;")
	public static Class8_Sub51 method1265(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class8_Sub51 local7 = new Class8_Sub51();
		local7.anInt10453 = arg2;
		local7.anInt10454 = arg3;
		Static218.aClass253_14.method6591(local7, (long) arg1);
		Static260.method4575(arg3);
		@Pc(26) Class331 local26 = Static178.method3435(arg1);
		if (local26 != null) {
			Static86.method2113(local26);
		}
		if (Static523.aClass331_16 != null) {
			Static86.method2113(Static523.aClass331_16);
			Static523.aClass331_16 = null;
		}
		Static271.method4666();
		if (local26 != null) {
			Static279.method4732(!arg0, local26);
		}
		if (!arg0) {
			Static273.method4691(arg3);
		}
		if (!arg0 && Static212.anInt4965 != -1) {
			Static279.method4733(Static212.anInt4965, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IBI)I")
	public static int method1266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static59.method1642(arg0 - 1, arg1 + -1) + Static59.method1642(arg0 + 1, arg1 + -1) + Static59.method1642(arg0 + -1, arg1 + 1) + Static59.method1642(arg0 - -1, arg1 + 1);
		@Pc(76) int local76 = Static59.method1642(arg0 - 1, arg1) + Static59.method1642(arg0 + 1, arg1) + Static59.method1642(arg0, arg1 - 1) + Static59.method1642(arg0, arg1 + 1);
		@Pc(81) int local81 = Static59.method1642(arg0, arg1);
		return local76 / 8 + local40 / 16 + local81 / 4;
	}
}
