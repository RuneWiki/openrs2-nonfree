import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cia", name = "p", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_25 = new Class337(119, 0);

	@OriginalMember(owner = "client!cia", name = "r", descriptor = "I")
	public static int anInt1484 = 0;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(III)Lclient!uw;")
	public static Class4_Sub2_Sub4 method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_Sub4_1;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!la;IIZIII)V")
	public static void method1203(@OriginalArg(0) Class207 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static591.aClass5_Sub1_Sub5_4 = null;
		Static72.anInt1497 = 1;
		Static212.anInt4042 = 0;
		Static217.aClass207_53 = arg0;
		Static134.aBoolean181 = false;
		Static172.anInt3051 = 2;
		Static207.anInt3986 = arg1;
		Static522.anInt8987 = arg2;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(CI)Z")
	public static boolean method1204(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(38) char[] local38 = Static555.aCharArray6;
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				@Pc(46) char local46 = local38[local40];
				if (local46 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Z)V")
	public static void method1206() {
		Static19.aClass289_1.method6824();
		Static533.aClass23_5.method316();
		Static387.aClass252_2.method5618();
		Static61.aClass246_7.method5494();
		Static439.aClass92_2.method1917();
		Static643.aClass275_2.method6647();
		Static435.aClass298_1.method7035();
		Static52.aClass10_1.method213();
		Static475.aClass370_1.method8786();
		Static299.aClass110_1.method2247();
		Static147.aClass238_1.method5283();
		Static325.aClass42_1.method939();
		Static586.aClass333_4.method7935();
		Static302.aClass291_1.method6829();
		Static508.aClass139_1.method3549();
		Static513.aClass260_2.method6302();
		Static55.aClass191_1.method4432();
		Static124.aClass84_1.method1743();
		Static232.aClass189_2.method4425();
		Static275.aClass2_1.method28();
		Static634.aClass372_2.method8810();
		Static156.method2257();
		Static242.method4013();
		Static415.method6354();
		Static82.method1379();
		Static128.method60();
		Static579.aClass87_234.method1793(5);
		Static167.aClass87_91.method1793(5);
		Static107.aClass87_254.method1793(5);
		Static122.aClass87_69.method1793(5);
		Static370.aClass87_149.method1793(5);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(III[B)I")
	public static int method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg1; local7++) {
			local5 = local5 >>> 8 ^ Class303.anIntArray475[(arg2[local7] ^ local5) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qv;")
	public static RuntimeException_Sub1 method1208(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString87 = local12.aString87 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
