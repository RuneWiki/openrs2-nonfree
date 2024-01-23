import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_27;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public static int anInt3290;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_616 = Static199.method3560("Hidden)2use");

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
	public static int[] anIntArray542 = new int[2];

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt3288 = 0;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	public static int anInt3289 = 99;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V")
	public static void method2571() {
		Static142.aBoolean143 = false;
		Static129.anInt2911 = -1;
		Static81.anInt1743 = 0;
		Static41.aClass72_52 = null;
		Static9.anInt274 = 1;
		Static170.anInt3939 = 2;
		Static126.anInt2869 = -1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method2572() {
		@Pc(1) Class76 local1 = Static11.aClass76_1;
		synchronized (Static11.aClass76_1) {
			Static78.anInt1709 = Static184.anInt4293;
			Static44.anInt806 = Static155.anInt3590;
			Static75.anInt1617++;
			Static81.anInt1744 = Static101.anInt2208;
			Static122.anInt1735 = Static199.anInt4491;
			Static205.anInt740 = Static226.anInt4899;
			Static55.anInt981 = Static71.anInt1402;
			Static58.aLong41 = Static199.aLong162;
			Static199.anInt4491 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
	public static int method2574(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local18 * local32 >> 12;
	}
}
