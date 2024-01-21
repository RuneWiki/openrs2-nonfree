import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt2158;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static int anInt2159 = 0;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
	public static int anInt2166 = 0;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1024 = Static32.method683(" )2> ");

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array15 = new Class49[500];

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
	public static int anInt2167 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)I")
	public static int method1750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 & arg0 - 1;
		@Pc(22) int local22 = arg1 & arg0 - 1;
		@Pc(26) int local26 = arg1 / arg0;
		@Pc(30) int local30 = arg2 / arg0;
		@Pc(35) int local35 = Static63.method1097(local26, local30);
		@Pc(42) int local42 = Static63.method1097(local26, local30 + 1);
		@Pc(49) int local49 = Static63.method1097(local26 + 1, local30);
		@Pc(58) int local58 = Static63.method1097(local26 + 1, local30 - -1);
		@Pc(67) int local67 = Static35.method732(arg0, local42, local35, local16);
		@Pc(76) int local76 = Static35.method732(arg0, local58, local49, local16);
		return Static35.method732(arg0, local76, local67, local22);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!lf;Lclient!lf;ILclient!lf;I)V")
	public static void method1753(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49 arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static94.anIntArray201[local7] = Static94.anIntArray201[local7 - 1];
			Static103.aClass49Array17[local7] = Static103.aClass49Array17[local7 - 1];
			Static81.aClass49Array13[local7] = Static81.aClass49Array13[local7 - 1];
			Static69.aClass49Array9[local7] = Static69.aClass49Array9[local7 - 1];
		}
		Static103.aClass49Array17[0] = arg0;
		Static81.aClass49Array13[0] = arg3;
		Static94.anIntArray201[0] = arg2;
		Static160.anInt3496 = Static69.anInt1431;
		Static69.aClass49Array9[0] = arg1;
		Static4.anInt68++;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)I")
	public static int method1754(@OriginalArg(1) int arg0) {
		@Pc(3) Class2_Sub2_Sub13 local3 = Static108.method1831(arg0);
		@Pc(6) int local6 = local3.anInt3038;
		@Pc(13) int local13 = local3.anInt3044;
		@Pc(16) int local16 = local3.anInt3043;
		@Pc(23) int local23 = client.anIntArray60[local13 - local16];
		return Static165.anIntArray317[local6] >> local16 & local23;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method1755() {
		aClass49Array15 = null;
		anIntArray208 = null;
		aClass49_1024 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!vg;I)V")
	public static void method1756(@OriginalArg(0) Class85 arg0) {
		if (Static93.anInt1951 == arg0.anInt3879) {
			Static171.aBooleanArray18[arg0.anInt3842] = true;
		}
	}
}
