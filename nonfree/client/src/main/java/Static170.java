import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
	public static int anInt3706;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	public static int anInt3689 = 1;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
	public static int anInt3695 = 0;

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!qb", name = "db", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1007 = Static231.method3737("AUS");

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "[I")
	public static int[] anIntArray328 = new int[100];

	@OriginalMember(owner = "client!qb", name = "lb", descriptor = "I")
	public static volatile int anInt3702 = 0;

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1008 = Static231.method3737(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Lclient!ra;")
	public static Class101 method2725(@OriginalArg(1) int arg0) {
		@Pc(17) Class101 local17 = (Class101) Static61.aClass61_22.method1693((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(35) byte[] local35 = Static122.aClass28_49.method819(Static48.method938(arg0), Static130.method2172(arg0));
		local17 = new Class101();
		local17.anInt3903 = arg0;
		if (local35 != null) {
			local17.method2838(new Class1_Sub26(local35));
		}
		local17.method2843();
		if (local17.aBoolean343) {
			local17.aBoolean346 = false;
			local17.anInt3921 = 0;
		}
		if (!Static39.aBoolean77 && local17.aBoolean345) {
			local17.aClass107Array24 = null;
		}
		Static61.aClass61_22.method1694((long) arg0, local17);
		return local17;
	}
}
