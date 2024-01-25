import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "Lclient!wm;")
	public static Class390 aClass390_85;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "Lclient!k;")
	public static final Class187 aClass187_10 = new Class187("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "Lclient!gp;")
	public static final Class139 aClass139_6 = new Class139(8, 1);

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_66 = new Class305(10, 3);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!mc;)Lclient!iv;")
	public static Class10_Sub2 method6352(@OriginalArg(1) Class5_Sub41 arg0) {
		@Pc(7) Class10 local7 = Static223.method3495(arg0);
		@Pc(11) int local11 = arg0.method7860();
		@Pc(15) int local15 = arg0.method7860();
		@Pc(19) int local19 = arg0.method7860();
		@Pc(28) int local28 = arg0.method7860();
		@Pc(32) int local32 = arg0.method7860();
		@Pc(36) int local36 = arg0.method7860();
		return new Class10_Sub2(local7.aClass275_17, local7.aClass81_17, local7.anInt10597, local7.anInt10602, local7.anInt10594, local7.anInt10595, local7.anInt10598, local7.anInt10601, local7.anInt10596, local11, local15, local19, local28, local32, local36);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIBI)V")
	public static void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class5_Sub3_Sub17 local13 = Static358.method5408(8, (long) arg3);
		local13.method7286();
		local13.anInt8545 = arg2;
		local13.anInt8549 = arg1;
		local13.anInt8546 = arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method6355(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZI[B)I")
	public static int method6356(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static633.method8532(arg1, arg0, 0);
	}
}
