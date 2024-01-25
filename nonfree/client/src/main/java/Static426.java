import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public static int anInt6744;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!si;")
	public static final Class331 aClass331_4 = new Class331();

	@OriginalMember(owner = "client!od", name = "h", descriptor = "J")
	public static long aLong194 = 0L;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	public static void method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class3_Sub1_Sub3 local13 = local7.aClass3_Sub1_Sub3_1;
		@Pc(16) Class3_Sub1_Sub3 local16 = local7.aClass3_Sub1_Sub3_2;
		if (local13 != null) {
			local13.aShort87 = (short) (local13.aShort87 * arg3 / (0x10 << Static273.anInt4424 - 7));
			local13.aShort88 = (short) (local13.aShort88 * arg3 / (0x10 << Static273.anInt4424 - 7));
		}
		if (local16 != null) {
			local16.aShort87 = (short) (local16.aShort87 * arg3 / (0x10 << Static273.anInt4424 - 7));
			local16.aShort88 = (short) (local16.aShort88 * arg3 / (0x10 << Static273.anInt4424 - 7));
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public static void method5914(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub34 local14 = (Class4_Sub34) Static255.aClass66_18.method1994((long) arg0);
		if (local14 != null) {
			local14.aBoolean430 = !local14.aBoolean430;
			local14.aClass105_Sub1_1.method2527(local14.aBoolean430);
		}
	}
}
