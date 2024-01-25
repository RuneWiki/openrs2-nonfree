import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
	public static int anInt4045;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	public static int anInt4043 = 0;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
	public static final int[] anIntArray323 = new int[13];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(CI)C")
	public static char method3728(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[B")
	public static byte[] method3729(@OriginalArg(0) int arg0) {
		@Pc(20) Class2_Sub11_Sub9 local20 = (Class2_Sub11_Sub9) Static259.aClass179_8.method5092((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(55) int local55 = 255 - local48;
				@Pc(60) int local60 = Static188.method3700(local31, local55);
				@Pc(64) byte local64 = local25[local60];
				local25[local60] = local25[local55];
				local25[local55] = local25[511 - local48] = local64;
			}
			local20 = new Class2_Sub11_Sub9(local25);
			Static259.aClass179_8.method5085(local20, (long) arg0);
		}
		return local20.aByteArray43;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method3730() {
		if (Static274.anInt5612 < 0) {
			return;
		}
		@Pc(16) long local16 = Static51.method1197();
		Static274.anInt5612 = (int) ((long) Static274.anInt5612 + Static254.aLong152 - local16);
		if (Static274.anInt5612 > 0) {
			@Pc(33) int local33 = (Static274.anInt5612 << 8) / anInt4043;
			@Pc(38) int local38 = 255 - local33;
			@Pc(43) float local43 = (float) local33 / 255.0F;
			Static19.anInt432 = ((Static152.anInt3102 & 0xFF00) * local33 + (Static39.aClass105_1.anInt3263 & 0xFF00) * local38 & 0xFF0000) + (local38 * (Static39.aClass105_1.anInt3263 & 0xFF00FF) + (Static152.anInt3102 & 0xFF00FF) * local33 & 0xFF00FF00) >>> 8;
			@Pc(80) float local80 = 1.0F - local43;
			Static254.aFloat69 = (Static39.aClass105_1.aFloat46 - Static153.aFloat42) * local80 + Static153.aFloat42;
			Static284.anInt5760 = (local33 * (Static185.anInt3644 & 0xFF00FF) + (Static39.aClass105_1.anInt3257 & 0xFF00FF) * local38 & 0xFF00FF00) + (local38 * (Static39.aClass105_1.anInt3257 & 0xFF00) + local33 * (Static185.anInt3644 & 0xFF00) & 0xFF0000) >>> 8;
			Static109.aFloat38 = (Static39.aClass105_1.aFloat49 - Static38.aFloat30) * local80 + Static38.aFloat30;
			Static146.aFloat40 = local80 * (Static39.aClass105_1.aFloat48 - Static183.aFloat50) + Static183.aFloat50;
			Static311.aFloat76 = local80 * (Static39.aClass105_1.aFloat44 - Static327.aFloat77) + Static327.aFloat77;
			Static32.aFloat29 = Static278.aFloat74 + local80 * (Static39.aClass105_1.aFloat47 - Static278.aFloat74);
			Static346.aFloat78 = local80 * (Static39.aClass105_1.aFloat45 - Static285.aFloat75) + Static285.aFloat75;
			Static261.anInt5107 = local33 * Static119.anInt2592 + Static39.aClass105_1.anInt3254 * local38 >> 8;
			if (Static39.aClass105_1.aClass22_1 != Static205.aClass22_2) {
				Static293.aClass22_3 = Static214.aClass4_9.method4295(Static205.aClass22_2, Static39.aClass105_1.aClass22_1, local80, Static293.aClass22_3);
			}
		} else {
			Static311.aFloat76 = Static39.aClass105_1.aFloat44;
			Static284.anInt5760 = Static39.aClass105_1.anInt3257;
			Static274.anInt5612 = -1;
			Static254.aFloat69 = Static39.aClass105_1.aFloat46;
			Static261.anInt5107 = Static39.aClass105_1.anInt3254;
			Static146.aFloat40 = Static39.aClass105_1.aFloat48;
			Static109.aFloat38 = Static39.aClass105_1.aFloat49;
			Static293.aClass22_3 = Static39.aClass105_1.aClass22_1;
			Static19.anInt432 = Static39.aClass105_1.anInt3263;
			Static32.aFloat29 = Static39.aClass105_1.aFloat47;
			Static346.aFloat78 = Static39.aClass105_1.aFloat45;
		}
		Static254.aLong152 = local16;
	}
}
