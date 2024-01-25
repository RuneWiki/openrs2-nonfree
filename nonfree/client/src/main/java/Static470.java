import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	public static int anInt8041;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public static int anInt8040 = 2;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "[I")
	public static final int[] anIntArray504 = new int[3];

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Z")
	public static final boolean aBoolean605 = false;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLclient!jc;)Lclient!as;")
	public static Class25 method7086(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(16) int local16 = arg0.method3030();
		@Pc(23) Class318 local23 = Static70.method932()[arg0.method3030()];
		@Pc(30) Class238 local30 = Static632.method8588()[arg0.method3030()];
		@Pc(34) int local34 = arg0.method2989();
		@Pc(38) int local38 = arg0.method2989();
		@Pc(42) int local42 = arg0.method3018();
		@Pc(46) int local46 = arg0.method3018();
		@Pc(50) int local50 = arg0.method3015();
		@Pc(54) int local54 = arg0.method3015();
		@Pc(58) int local58 = arg0.method3015();
		@Pc(70) boolean local70 = arg0.method3030() == 1;
		return new Class25(local16, local23, local30, local34, local38, local42, local46, local50, local54, local58, local70);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	public static void method7087() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static153.aBooleanArray9[local7] = false;
		}
		Static421.anInt7233 = Static141.anInt8737;
		Static309.anInt5362 = 0;
		Static566.anInt8430 = 0;
		Static16.anInt232 = -1;
		Static126.anInt2529 = -1;
		Static105.anInt2088 = Static475.anInt8090;
		Static526.anInt8626 = 5;
		Static547.anInt8870 = Static406.anInt7076;
		Static507.anInt10524 = Static337.anInt5759;
		Static560.anInt9040 = -1;
		Static619.anInt9777 = -1;
		Static429.anInt7378 = Static365.anInt6155;
		Static30.anInt391 = Static21.anInt279;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lclient!kka;")
	public static Class210 method7088() {
		return Static689.method9046();
	}
}
