import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
	public static int anInt4287;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "Lclient!ii;")
	public static Class69 aClass69_10 = new Class69(64);

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	public static int anInt4288 = 0;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	public static void method3443() {
		aClass69_10 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
	public static void method3444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		Static129.method2127(arg1 + arg2, arg1 + -arg2, arg0, Static234.anIntArrayArray40[arg3]);
		@Pc(25) int local25 = arg2;
		@Pc(28) int local28 = -arg2;
		@Pc(35) int local35 = -1;
		while (local7 < local25) {
			local7++;
			local35 += 2;
			local28 += local35;
			if (local28 >= 0) {
				local25--;
				@Pc(58) int[] local58 = Static234.anIntArrayArray40[arg3 - local25];
				local28 -= local25 << 1;
				@Pc(69) int local69 = arg1 - local7;
				@Pc(73) int local73 = local7 + arg1;
				@Pc(79) int[] local79 = Static234.anIntArrayArray40[local25 + arg3];
				Static129.method2127(local73, local69, arg0, local79);
				Static129.method2127(local73, local69, arg0, local58);
			}
			@Pc(96) int local96 = arg1 - local25;
			@Pc(100) int local100 = local25 + arg1;
			@Pc(106) int[] local106 = Static234.anIntArrayArray40[local7 + arg3];
			@Pc(112) int[] local112 = Static234.anIntArrayArray40[arg3 - local7];
			Static129.method2127(local100, local96, arg0, local106);
			Static129.method2127(local100, local96, arg0, local112);
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	public static void method3445() {
		@Pc(2) Class151 local2 = Static96.aClass151_1;
		synchronized (Static96.aClass151_1) {
			Static82.anInt1579++;
			Static71.anInt1316 = Static110.anInt2432;
			Static72.anInt1326 = Static243.anInt4643;
			Static117.anInt2589 = Static87.anInt1798;
			Static44.anInt885 = Static44.anInt883;
			Static35.anInt708 = Static10.anInt201;
			Static147.anInt2993 = Static214.anInt4261;
			Static175.aLong125 = Static51.aLong37;
			Static44.anInt883 = 0;
		}
	}
}
