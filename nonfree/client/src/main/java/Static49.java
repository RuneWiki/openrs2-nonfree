import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	public static final int anInt1657 = 5063219;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_8 = new Class25(50);

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_526 = method1293("hitmarks");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_527 = method1293("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_528 = method1293("au");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)Lclient!rf;")
	public static Class70 method1293(@OriginalArg(1) String arg0) {
		@Pc(5) int local5 = 0;
		@Pc(8) byte[] local8 = arg0.getBytes();
		@Pc(11) int local11 = local8.length;
		@Pc(23) Class70 local23 = new Class70();
		local23.aByteArray46 = new byte[local11];
		while (local5 < local11) {
			@Pc(35) int local35 = local8[local5++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local11 <= local5) {
					break;
				}
				@Pc(74) int local74 = local8[local5++] & 0xFF;
				local23.aByteArray46[local23.anInt3915++] = (byte) (local35 * 43 + local74 - 1720 - 48);
			} else if (local35 != 0) {
				local23.aByteArray46[local23.anInt3915++] = (byte) local35;
			}
		}
		local23.method2893();
		return local23.method2918();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([IIIIIII)V")
	public static void method1294(@OriginalArg(0) int[] arg0) {
		Static34.anInt1115 = 25;
		Static143.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static34.anInt1115 + Static34.anInt1115 + 1][Static34.anInt1115 + Static34.anInt1115 + 1];
		Static112.anInt4361 = 0;
		Static6.anInt272 = 0;
		Static7.anInt283 = 512;
		Static89.anInt2607 = 334;
		Static16.anInt462 = 256;
		Static121.anInt3318 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static34.anInt1115 + Static34.anInt1115 + 3][Static34.anInt1115 + Static34.anInt1115 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static161.anInt4213 = Class1_Sub1_Sub1_Sub1.anIntArray11[local47];
				Static171.anInt4443 = Class1_Sub1_Sub1_Sub1.anIntArray8[local47];
				Static114.anInt3121 = Class1_Sub1_Sub1_Sub1.anIntArray11[local50];
				Static66.anInt2085 = Class1_Sub1_Sub1_Sub1.anIntArray8[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static34.anInt1115 + 1); local82 <= Static34.anInt1115 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static34.anInt1115 + 1); local88 <= Static34.anInt1115 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static136.method2661(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static34.anInt1115 + 1][local88 + Static34.anInt1115 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static34.anInt1115; local77 < Static34.anInt1115; local77++) {
					for (local82 = -Static34.anInt1115; local82 < Static34.anInt1115; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static34.anInt1115 + 1][local82 + local97 + Static34.anInt1115 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static34.anInt1115 + 1][local82 + local97 + Static34.anInt1115 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static34.anInt1115 + 1][local82 + local97 + Static34.anInt1115 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static34.anInt1115 + 1][local82 + local97 + Static34.anInt1115 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static143.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static34.anInt1115][local82 + Static34.anInt1115] = local174;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method1295() {
		aClass25_8 = null;
		aClass70_528 = null;
		aClass70_527 = null;
		anIntArray169 = null;
		aRandom1 = null;
		aClass70_526 = null;
	}
}
