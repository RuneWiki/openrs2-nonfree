import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!naa", name = "C", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!naa", name = "I", descriptor = "[Lclient!mca;")
	public static Class8_Sub7[] aClass8_Sub7Array2;

	@OriginalMember(owner = "client!naa", name = "t", descriptor = "I")
	public static int anInt3224 = 0;

	@OriginalMember(owner = "client!naa", name = "u", descriptor = "[I")
	public static final int[] anIntArray298 = new int[14];

	@OriginalMember(owner = "client!naa", name = "D", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!naa", name = "E", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[50][];

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V")
	public static void method2571() {
		if (Static169.aBoolean229) {
			return;
		}
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean383) {
			Static287.aFloat117 = (int) Static287.aFloat117 + 47 & 0xFFFFFFF0;
		} else {
			Static85.aFloat17 += (12.0F - Static85.aFloat17) / 2.0F;
		}
		Static305.aBoolean423 = true;
		Static169.aBoolean229 = true;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZILclient!ok;II[I)Lclient!ot;")
	public static Class40_Sub3_Sub1 method2572(@OriginalArg(1) int arg0, @OriginalArg(2) Class134_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3) {
		if (arg1.aBoolean519 || Static230.method3483(arg2) && Static230.method3483(arg0)) {
			return new Class40_Sub3_Sub1(arg1, 3553, arg2, arg0, false, arg3);
		} else if (arg1.aBoolean505) {
			return new Class40_Sub3_Sub1(arg1, 34037, arg2, arg0, false, arg3);
		} else {
			return new Class40_Sub3_Sub1(arg1, arg2, arg0, Static457.method6299(arg2), Static457.method6299(arg0), arg3);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZI)I")
	public static int method2573(@OriginalArg(0) boolean arg0) {
		if (Static480.anIntArray622 == null) {
			return 0;
		} else if (arg0 || Static515.aClass110Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static480.anIntArray622.length; local22++) {
				@Pc(28) int local28 = Static480.anIntArray622[local22];
				if (Static576.aClass270_119.method5694(local28)) {
					local20++;
				}
				if (Static267.aClass270_53.method5694(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static480.anIntArray622.length * 2;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BZII)Ljava/lang/String;")
	public static String method2574(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		@Pc(43) int local43 = arg0 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local39++;
		}
		@Pc(55) char[] local55 = new char[local39];
		local55[0] = '+';
		for (@Pc(63) int local63 = local39 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 < 10) {
				local55[local63] = (char) (local78 + 48);
			} else {
				local55[local63] = (char) (local78 + 87);
			}
		}
		return new String(local55);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)I")
	public static int method2575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}
}
