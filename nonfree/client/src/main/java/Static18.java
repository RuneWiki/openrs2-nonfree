import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bh", name = "fb", descriptor = "Lclient!ad;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
	public static volatile int anInt371 = 0;

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_239 = Static32.method683("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!bh", name = "ib", descriptor = "Lclient!lf;")
	public static Class49 aClass49_240 = null;

	@OriginalMember(owner = "client!bh", name = "ob", descriptor = "I")
	public static int anInt381 = 0;

	@OriginalMember(owner = "client!bh", name = "rb", descriptor = "I")
	public static int anInt384 = 500;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLclient!bg;Lclient!bg;I)V")
	public static void method344(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2) {
		Static6.aBoolean8 = arg0;
		Static62.aClass11_55 = arg2;
		Static155.aClass11_123 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
	public static void method345() {
		aClass49_239 = null;
		aClass3_1 = null;
		aClass49_240 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZII)I")
	public static int method346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local7 < 0 || local16 < 0 || local7 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg1;
		if (arg1 < 3 && (Static81.aByteArrayArrayArray2[1][local7][local16] & 0x2) == 2) {
			local35 = arg1 + 1;
		}
		@Pc(54) int local54 = arg2 & 0x7F;
		@Pc(58) int local58 = arg0 & 0x7F;
		@Pc(90) int local90 = Static162.anIntArrayArrayArray7[local35][local7][local16 + 1] * (128 - local54) + local54 * Static162.anIntArrayArrayArray7[local35][local7 + 1][local16 + 1] >> 7;
		@Pc(117) int local117 = Static162.anIntArrayArrayArray7[local35][local7 + 1][local16] * local54 + Static162.anIntArrayArrayArray7[local35][local7][local16] * (128 - local54) >> 7;
		return (128 - local58) * local117 + local90 * local58 >> 7;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Lclient!lf;")
	public static Class49 method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static98.aClass49_994;
		} else if (local8 < -6) {
			return Static25.aClass49_313;
		} else if (local8 < -3) {
			return Static34.aClass49_464;
		} else if (local8 < 0) {
			return Static134.aClass49_1314;
		} else if (local8 > 9) {
			return Static36.aClass49_479;
		} else if (local8 > 6) {
			return Static11.aClass49_103;
		} else if (local8 > 3) {
			return Static136.aClass49_1319;
		} else if (local8 > 0) {
			return Static17.aClass49_1176;
		} else {
			return Static98.aClass49_995;
		}
	}
}
