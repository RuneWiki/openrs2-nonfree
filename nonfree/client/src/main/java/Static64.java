import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public static int anInt1337;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!bb;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_448 = Static151.method2243(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[Lclient!ha;")
	public static final Class39[] aClass39Array1 = new Class39[100];

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public static int anInt1343 = 0;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "[I")
	public static final int[] anIntArray105 = new int[1000];

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	public static int anInt1346 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!pb;BLclient!pb;Lclient!ca;Lclient!pb;)Z")
	public static boolean method887(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class2_Sub2_Sub1 arg2, @OriginalArg(4) Class71 arg3) {
		Static30.aClass2_Sub2_Sub1_1 = arg2;
		Static80.aClass71_16 = arg3;
		Static127.aClass71_25 = arg0;
		Static54.aClass71_11 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBI[Lclient!mb;)Lclient!mb;")
	public static Class62 method888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg2[local9 + arg1] == null) {
				arg2[arg1 + local9] = Static56.aClass62_391;
			}
			local7 += arg2[arg1 + local9].anInt2653;
		}
		@Pc(43) int local43 = 0;
		@Pc(46) byte[] local46 = new byte[local7];
		@Pc(61) Class62 local61;
		for (@Pc(53) int local53 = 0; local53 < arg0; local53++) {
			local61 = arg2[arg1 + local53];
			Static220.method1006(local61.aByteArray28, 0, local46, local43, local61.anInt2653);
			local43 += local61.anInt2653;
		}
		local61 = new Class62();
		local61.anInt2653 = local7;
		local61.aByteArray28 = local46;
		return local61;
	}
}
