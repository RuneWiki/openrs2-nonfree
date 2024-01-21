import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!ea;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!ja;")
	public static Class33 aClass33_2 = new Class33(64);

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_8 = Static60.method1113("me");

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	public static int anInt27 = 0;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1 = new byte[4][104][104];

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!ec;")
	public static Class22 aClass22_9 = Static60.method1113("mapedge");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
	public static int method9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 / arg1;
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(23) int local23 = arg1 - 1 & arg0;
		@Pc(28) int local28 = Static9.method154(local7, local3);
		@Pc(35) int local35 = Static9.method154(local7, local3 + 1);
		@Pc(42) int local42 = Static9.method154(local7 + 1, local3);
		@Pc(51) int local51 = Static9.method154(local7 + 1, local3 - -1);
		@Pc(63) int local63 = Static109.method151(arg1, local13, local35, local28);
		@Pc(70) int local70 = Static109.method151(arg1, local13, local51, local42);
		return Static109.method151(arg1, local23, local70, local63);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method10() {
		aClass20_1 = null;
		anIntArray3 = null;
		anIntArray2 = null;
		aByteArrayArrayArray1 = null;
		aClass22_8 = null;
		aClass22_9 = null;
		aClass33_2 = null;
		aClass4_Sub1_Sub2_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!ea;Lclient!ea;)V")
	public static void method11(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		Static35.aClass20_19 = arg1;
		Static133.aClass20_62 = arg0;
	}
}
