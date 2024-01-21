import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lclient!ie;")
	public static Class35 aClass35_11;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "Lclient!id;")
	public static Class34 aClass34_672 = Static9.method266("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_673 = Static9.method266("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lclient!id;")
	private static Class34 aClass34_678 = Static9.method266("Please enter your username)3");

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!id;")
	public static Class34 aClass34_674 = aClass34_678;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Lclient!id;")
	public static Class34 aClass34_675 = Static9.method266(")4l");

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
	public static int anInt1347 = 0;

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
	public static int anInt1348 = 0;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "Lclient!id;")
	private static Class34 aClass34_676 = Static9.method266("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!id;")
	public static Class34 aClass34_677 = aClass34_676;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ie;)V")
	public static void method874(@OriginalArg(1) Class35 arg0) {
		Static12.aClass35_1 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
	public static void method875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 0;
		@Pc(11) int local11 = 2048 - arg0 & 0x7FF;
		@Pc(18) int local18 = 2048 - arg2 & 0x7FF;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg1;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (local18 != 0) {
			local31 = Class1_Sub1_Sub2_Sub4.anIntArray335[local18];
			local35 = Class1_Sub1_Sub2_Sub4.anIntArray334[local18];
			local46 = local35 * 0 - arg1 * local31 >> 16;
			local22 = local35 * arg1 + local31 * 0 >> 16;
			local20 = local46;
		}
		if (local11 != 0) {
			local31 = Class1_Sub1_Sub2_Sub4.anIntArray335[local11];
			local35 = Class1_Sub1_Sub2_Sub4.anIntArray334[local11];
			local46 = local35 * 0 + local31 * local22 >> 16;
			local22 = local22 * local35 - local31 * 0 >> 16;
			local5 = local46;
		}
		Static58.anInt1617 = arg2;
		Static66.anInt1754 = arg0;
		Static88.anInt2285 = arg4 - local20;
		Static119.anInt2839 = arg3 - local5;
		Static109.anInt3091 = arg5 - local22;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method876() {
		aClass34_674 = null;
		aClass34_677 = null;
		anImage3 = null;
		aClass34_676 = null;
		aClass34_673 = null;
		anIntArray143 = null;
		aClass34_672 = null;
		aClass34_678 = null;
		aClass35_11 = null;
		aClass34_675 = null;
	}
}
