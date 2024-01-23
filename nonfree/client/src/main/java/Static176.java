import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public static int anInt777;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "Lclient!mg;")
	public static Class1_Sub1_Sub14 aClass1_Sub1_Sub14_2;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
	private static int anInt796;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_258 = Static200.method3116("::fps ");

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public static int anInt768 = 0;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!kh;")
	private static Class60 aClass60_259 = Static200.method3116("Choose Option");

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!je;")
	public static Class51 aClass51_2 = new Class51();

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_260 = Static200.method3116("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "Lclient!kh;")
	public static Class60 aClass60_261 = aClass60_259;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Lclient!kh;")
	private static Class60 aClass60_263 = Static200.method3116("No response from server)3");

	@OriginalMember(owner = "client!sb", name = "P", descriptor = "Lclient!kh;")
	public static Class60 aClass60_262 = aClass60_263;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "S")
	public static short aShort10 = 1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
	public static int method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = 256 - arg0;
		return (arg0 * (arg2 & 0xFF00FF) + local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (arg0 * (arg2 & 0xFF00) + local7 * (arg1 & 0xFF00) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method578() {
		Static168.aClass39_21.method1158();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!ai;I)[Lclient!o;")
	public static Class73_Sub1[] method581(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		return Static64.method1157(arg0, arg1) ? Static105.method1784() : null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass47_1 != null && local7.aClass47_1.aLong58 == arg3) {
			return true;
		} else if (local7.aClass106_1 != null && local7.aClass106_1.aLong141 == arg3) {
			return true;
		} else if (local7.aClass16_1 != null && local7.aClass16_1.aLong22 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt3358; local46++) {
				if (local7.aClass29Array3[local46].aLong43 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
