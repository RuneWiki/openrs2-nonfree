import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!og;")
	public static Class127 aClass127_2;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString33 = "shake:";

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt1279 = 0;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[Lclient!m;")
	public static Class109[] aClass109Array1 = new Class109[6];

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method1041() {
		if (Static152.aFloat81 < 128.0F) {
			Static152.aFloat81 = 128.0F;
		}
		while (Static177.aFloat97 >= 2048.0F) {
			Static177.aFloat97 -= 2048.0F;
		}
		@Pc(21) int local21 = Static242.anInt4995 >> 7;
		if (Static152.aFloat81 > 383.0F) {
			Static152.aFloat81 = 383.0F;
		}
		@Pc(36) int local36 = Static139.anInt2614 >> 7;
		while (Static177.aFloat97 < 0.0F) {
			Static177.aFloat97 += 2048.0F;
		}
		@Pc(52) int local52 = Static124.method1919(Static159.anInt2978, Static139.anInt2614, Static242.anInt4995);
		@Pc(60) int local60 = 0;
		@Pc(81) int local81;
		if (local36 > 3 && local21 > 3 && local36 < 100 && local21 < 100) {
			for (local81 = local36 - 4; local81 <= local36 + 4; local81++) {
				for (@Pc(90) int local90 = local21 - 4; local90 <= local21 + 4; local90++) {
					@Pc(101) int local101 = Static159.anInt2978;
					if (local101 < 3 && (Static242.aByteArrayArrayArray23[1][local81][local90] & 0x2) == 2) {
						local101++;
					}
					@Pc(141) int local141 = local52 + (Static70.aByteArrayArrayArray8[local101][local81][local90] & 0xFF) * 8 - Static163.anIntArrayArrayArray16[local101][local81][local90];
					if (local60 < local141) {
						local60 = local141;
					}
				}
			}
		}
		local81 = local60 * 192;
		if (local81 > 98048) {
			local81 = 98048;
		}
		if (local81 < 32768) {
			local81 = 32768;
		}
		if (Static121.anInt2349 < local81) {
			Static121.anInt2349 += (local81 - Static121.anInt2349) / 24;
		} else if (Static121.anInt2349 > local81) {
			Static121.anInt2349 += (local81 - Static121.anInt2349) / 80;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ak;IZ)Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 method1042(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2) {
		return Static139.method2193(arg1, arg0, arg2) ? Static299.method4557() : null;
	}
}
