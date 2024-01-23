import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public static int anInt1525;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
	public static int anInt1531;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Lclient!pe;")
	public static Class1_Sub2_Sub15 aClass1_Sub2_Sub15_2;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Lclient!hd;")
	public static Class50 aClass50_11 = new Class50(4096);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public static void method1205() {
		Static36.aClass61_15.method1695(5);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
	public static void method1206() {
		for (@Pc(1) int local1 = 0; local1 < Static176.anInt3801; local1++) {
			@Pc(6) Class99 local6 = Static30.aClass99Array1[local1];
			Static57.method3715(local6);
			Static30.aClass99Array1[local1] = null;
		}
		Static176.anInt3801 = 0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!qd;)V")
	public static void method1207(@OriginalArg(1) Class1_Sub24 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) long local7 = 0L;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg0.anInt3730 == 0) {
			local7 = Static222.method2957(arg0.anInt3737, arg0.anInt3735, arg0.anInt3739);
		}
		if (arg0.anInt3730 == 1) {
			local7 = Static43.method856(arg0.anInt3737, arg0.anInt3735, arg0.anInt3739);
		}
		if (arg0.anInt3730 == 2) {
			local7 = Static111.method1949(arg0.anInt3737, arg0.anInt3735, arg0.anInt3739);
		}
		if (arg0.anInt3730 == 3) {
			local7 = Static59.method1131(arg0.anInt3737, arg0.anInt3735, arg0.anInt3739);
		}
		if (local7 != 0L) {
			local5 = Integer.MAX_VALUE & (int) (local7 >>> 32);
			local9 = (int) local7 >> 20 & 0x3;
			local11 = (int) local7 >> 14 & 0x1F;
		}
		arg0.anInt3731 = local11;
		arg0.anInt3743 = local5;
		arg0.anInt3741 = local9;
	}
}
