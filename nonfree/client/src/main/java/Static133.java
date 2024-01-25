import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!ne;")
	public static final Class240 aClass240_2 = new Class240("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "J")
	public static long aLong67 = 0L;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_37 = new Class100(66, -1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V")
	public static void method2137() {
		Static629.aClass264_62.method6366(5);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
	public static void method2138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class304 local9 = Static610.aClass304ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static551.anInt7256 = local9.anInt9029;
			Static218.anInt4114 = local9.anInt9031;
			Static24.anInt443 = local9.anInt9035;
		}
		Static405.method6011();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method2139() {
		Static238.method3566();
		Static147.aClass144_1 = null;
		Static626.aClass144_4 = null;
		Static439.aClass144_2 = null;
		Static354.aClass137_31 = null;
		Static610.aClass304ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)I")
	public static int method2141(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(45) int local45 = local31 | local31 >>> 16;
		return ~local45 & arg0;
	}
}
