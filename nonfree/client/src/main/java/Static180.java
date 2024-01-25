import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "J")
	public static long aLong125 = -1L;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
	public static int anInt3888 = -2;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)V")
	public static void method3548() {
		@Pc(1) Class87 local1 = Static190.aClass87_35;
		synchronized (Static190.aClass87_35) {
			Static190.aClass87_35.method2473(5);
		}
		local1 = Static5.aClass87_1;
		synchronized (Static5.aClass87_1) {
			Static5.aClass87_1.method2473(5);
		}
		local1 = Static56.aClass87_14;
		synchronized (Static56.aClass87_14) {
			Static56.aClass87_14.method2473(5);
		}
		local1 = Static101.aClass87_19;
		synchronized (Static101.aClass87_19) {
			Static101.aClass87_19.method2473(5);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
	public static void method3550() {
		Static103.anInt2461 = -1;
		Static70.aClass216_23 = null;
		Static28.anInt1014 = -1;
		Static188.anInt4068 = 0;
		Static33.anInt1108 = 1;
		Static175.anInt3790 = 2;
		Static285.aBoolean421 = false;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIBI)I")
	public static int method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg2 : arg3;
		@Pc(40) int local40 = local12 < 4 ? arg2 : local12 == 12 || local12 == 14 ? arg3 : arg1;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local40 : -local40);
	}
}
