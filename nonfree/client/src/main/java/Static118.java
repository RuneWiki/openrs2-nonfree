import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_3;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!tg;")
	private static Class81 aClass81_957 = Static120.method2057("Connection timed out)3");

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "[I")
	public static int[] anIntArray279 = new int[32];

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public static int anInt2618 = 0;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
	public static int[] anIntArray280 = new int[100];

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_958 = aClass81_957;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[I")
	public static int[] anIntArray281 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ub;ZIIZI)V")
	public static void method2029(@OriginalArg(0) Class1_Sub2_Sub18 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static81.anInt1859 >= 50 || (arg0.anIntArray393 == null || arg0.anIntArray393.length <= arg4)) {
			return;
		}
		@Pc(21) int local21 = arg0.anIntArray393[arg4];
		if (local21 == 0) {
			return;
		}
		@Pc(32) int local32 = local21 >> 8;
		@Pc(38) int local38 = local21 >> 4 & 0x7;
		@Pc(42) int local42 = local21 & 0xF;
		if (local42 == 0) {
			if (arg1) {
				Static141.method603(local38, local32, 0);
			}
		} else if (Static149.anInt3335 != 0) {
			@Pc(64) int local64 = (arg3 - 64) / 128;
			Static166.anIntArray399[Static81.anInt1859] = local32;
			Static116.anIntArray276[Static81.anInt1859] = local38;
			@Pc(78) int local78 = (arg2 - 64) / 128;
			Static175.anIntArray308[Static81.anInt1859] = 0;
			Static157.aClass21Array1[Static81.anInt1859] = null;
			Static51.anIntArray103[Static81.anInt1859] = local42 + (local64 << 16) + (local78 << 8);
			Static81.anInt1859++;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method2030() {
		anIntArray281 = null;
		anIntArray278 = null;
		aShortArrayArray5 = null;
		anIntArray280 = null;
		aClass1_Sub2_Sub2_Sub4_3 = null;
		aClass81_958 = null;
		anIntArray279 = null;
		aClass81_957 = null;
	}
}
