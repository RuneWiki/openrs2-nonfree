import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!wd;")
	public static Class8_Sub1_Sub7 aClass8_Sub1_Sub7_5;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
	public static int anInt2236;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public static int anInt2231 = -1;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[Lclient!lm;")
	public static Class107[] aClass107Array2 = new Class107[50];

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString83 = "Loading - please wait.";

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	public static void method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (Static239.anInt4789 != arg1) {
			Static171.anIntArray258 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static171.anIntArray258[local9] = (local9 << 12) / arg1;
			}
			Static214.anInt4402 = arg1 - 1;
			Static37.anInt3862 = arg1 * 32;
			Static239.anInt4789 = arg1;
		}
		if (Static86.anInt1852 == arg0) {
			return;
		}
		if (Static239.anInt4789 == arg0) {
			Static33.anIntArray50 = Static171.anIntArray258;
		} else {
			Static33.anIntArray50 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static33.anIntArray50[local9] = (local9 << 12) / arg0;
			}
		}
		Static51.anInt1120 = arg0 - 1;
		Static86.anInt1852 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!aj;)Lclient!jl;")
	public static Class3_Sub3 method1724(@OriginalArg(1) Class8_Sub2 arg0) {
		return new Class3_Sub3(arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2323(), arg0.method2334());
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!pk;I)V")
	public static void method1725(@OriginalArg(0) Class132 arg0) {
		Static224.aClass132_77 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1726(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static77.method1226("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method1727(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			if (arg1 == arg0.charAt(local18)) {
				local16++;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)V")
	public static void method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class50 local3 = new Class50();
		local3.anInt1545 = arg1 / 128;
		local3.anInt1547 = arg2 / 128;
		local3.anInt1557 = arg3 / 128;
		local3.anInt1542 = arg4 / 128;
		local3.anInt1555 = arg0;
		local3.anInt1540 = arg1;
		local3.anInt1544 = arg2;
		local3.anInt1549 = arg3;
		local3.anInt1560 = arg4;
		local3.anInt1550 = arg5;
		local3.anInt1553 = arg6;
		Static236.aClass50Array2[Static153.anInt3126++] = local3;
	}
}
