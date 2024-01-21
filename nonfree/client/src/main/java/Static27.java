import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!pa;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_6 = null;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!od;")
	private static Class60 aClass60_293 = Static41.method597("No reply from loginserver)3");

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_291 = aClass60_293;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Lclient!od;")
	public static Class60 aClass60_292 = Static41.method597("gleiten:");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method459() {
		aClass60_292 = null;
		aClass62_1 = null;
		aClass4_Sub14_6 = null;
		aClass60_291 = null;
		aClass60_293 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!t;II)V")
	public static void method460(@OriginalArg(0) Class10_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static9.aClass4_Sub9_2 == null) {
			Static99.method340(255, 0, 255, (byte) 0, null, true);
			Static71.aClass10_Sub1Array1[arg1] = arg0;
		} else {
			Static9.aClass4_Sub9_2.anInt1312 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static9.aClass4_Sub9_2.method780();
			@Pc(20) int local20 = Static9.aClass4_Sub9_2.method780();
			arg0.method1797(local16, local20);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZ)I")
	public static int method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = 256 - arg2;
		return ((arg0 & 0xFF00) * local4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + (local4 * (arg0 & 0xFF00FF) + ((arg1 & 0xFF00FF) * arg2) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
	public static int method462(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(25) int local25 = local12 | local12 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return local37 + 1;
	}
}
