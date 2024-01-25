import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
	public static int anInt6398;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "[B")
	public static byte[] aByteArray201;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
	public static int anInt6401;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
	public static int anInt6394 = -2;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "[I")
	public static final int[] anIntArray609 = new int[128];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIII)I")
	public static int method5693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static158.aClass114Array2 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(21) int local21 = arg4 >> 7;
			@Pc(25) int local25 = arg2 >> 7;
			if (arg1 < 0 || arg0 < 0 || arg1 > Static195.anInt3965 - 1 || arg0 > Static298.anInt5716 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && local21 <= Static195.anInt3965 - 1 && Static298.anInt5716 - 1 >= local25) {
				@Pc(87) boolean local87 = (Static108.aByteArrayArrayArray5[1][arg4 >> 7][arg2 >> 7] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(131) boolean local131;
				if ((arg4 & 0x7F) == 0) {
					local112 = (Static108.aByteArrayArrayArray5[1][local21 - 1][arg2 >> 7] & 0x2) != 0;
					local131 = (Static108.aByteArrayArrayArray5[1][local21][arg2 >> 7] & 0x2) != 0;
					if (local131 != local112) {
						local87 = (Static108.aByteArrayArrayArray5[1][arg1][arg0] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x7F) == 0) {
					local112 = (Static108.aByteArrayArrayArray5[1][arg4 >> 7][local25 - 1] & 0x2) != 0;
					local131 = (Static108.aByteArrayArrayArray5[1][arg4 >> 7][local25] & 0x2) != 0;
					if (local131 != local112) {
						local87 = (Static108.aByteArrayArrayArray5[1][arg1][arg0] & 0x2) != 0;
					}
				}
				if (local87) {
					arg3++;
				}
				return Static158.aClass114Array2[arg3].method3607(arg4, arg2);
			} else {
				return 0;
			}
		} else {
			return Static158.aClass114Array2[arg3].method3607(arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V")
	public static void method5694() {
		if (!Static183.method3533()) {
			return;
		}
		if (Static21.aStringArray23 == null) {
			Static252.method4375();
		}
		Static83.anIntArray618 = new int[100];
		Static220.anIntArray394 = new int[100];
		Static17.anInt345 = 0;
		Static174.aBoolean233 = true;
		Static174.aBooleanArray15 = new boolean[100];
		Static9.anIntArray11 = new int[100];
		for (@Pc(34) int local34 = 0; local34 < 100; local34++) {
			Static9.anIntArray11[local34] = (int) ((double) Static294.anInt5659 * Math.random());
			Static220.anIntArray394[local34] = (int) (Math.random() * 350.0D);
			Static83.anIntArray618[local34] = (int) (Math.random() * 102.0D);
			Static174.aBooleanArray15[local34] = Math.random() < 0.5D;
		}
		try {
			Static297.aClipboard1 = Static353.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIIII)V")
	public static void method5696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
		Static164.aClass14_Sub4_Sub2_3.method2538(20);
		Static164.aClass14_Sub4_Sub2_3.method2538(arg3);
		Static164.aClass14_Sub4_Sub2_3.method2538(arg1);
		Static164.aClass14_Sub4_Sub2_3.method2509(arg0);
		Static164.aClass14_Sub4_Sub2_3.method2509(arg2);
		Static309.anInt5892 = 0;
		Static57.anInt1379 = -3;
		Static108.anInt2423 = 1;
		Static68.anInt1635 = 0;
	}
}
