import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_122 = new Class221(97, -2);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	public static int anInt3758 = 0;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_87 = new Class140("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	public static void method3267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static202.aFloat49 > Static202.aFloat50) {
			Static202.aFloat50 = (float) ((double) Static202.aFloat50 + (double) Static202.aFloat50 / 30.0D);
			if (Static202.aFloat49 < Static202.aFloat50) {
				Static202.aFloat50 = Static202.aFloat49;
			}
			Static220.method4160();
			Static202.anInt4948 = (int) Static202.aFloat50 >> 1;
			Static202.aByteArrayArrayArray9 = Static212.method3985(Static202.anInt4948);
		} else if (Static202.aFloat49 < Static202.aFloat50) {
			Static202.aFloat50 = (float) ((double) Static202.aFloat50 - (double) Static202.aFloat50 / 30.0D);
			if (Static202.aFloat50 < Static202.aFloat49) {
				Static202.aFloat50 = Static202.aFloat49;
			}
			Static220.method4160();
			Static202.anInt4948 = (int) Static202.aFloat50 >> 1;
			Static202.aByteArrayArrayArray9 = Static212.method3985(Static202.anInt4948);
		}
		if (Static49.anInt819 != -1 && Static160.anInt3750 != -1) {
			@Pc(78) int local78 = Static49.anInt819 - Static298.anInt5924;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(95) int local95 = Static160.anInt3750 - Static105.anInt2196;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			Static298.anInt5924 += local78;
			Static105.anInt2196 -= -local95;
			if (local78 == 0 && local95 == 0) {
				Static160.anInt3750 = -1;
				Static49.anInt819 = -1;
			}
			Static220.method4160();
		}
		if (Static314.anInt6200 <= 0) {
			Static308.anInt6109 = -1;
			Static286.anInt5744 = -1;
		} else {
			Static328.anInt6685--;
			if (Static328.anInt6685 == 0) {
				Static328.anInt6685 = 100;
				Static314.anInt6200--;
			}
		}
		if (!Static261.aBoolean457 || Static284.aClass180_39 == null) {
			return;
		}
		for (@Pc(161) Class2_Sub38 local161 = (Class2_Sub38) Static284.aClass180_39.method4919(); local161 != null; local161 = (Class2_Sub38) Static284.aClass180_39.method4916()) {
			@Pc(169) Class66 local169 = Static312.method5209(local161.aClass2_Sub8_1.anInt1039);
			if (Static366.anInt4511 == 0 && local161.method4852(arg1, arg0)) {
				if (local169.aStringArray9 != null) {
					if (local169.aStringArray9[4] != null) {
						Static104.method2071(0, 1001, local169.anInt1764, false, local169.aStringArray9[4], local169.aString17, -1, (long) local161.aClass2_Sub8_1.anInt1039, true);
					}
					if (local169.aStringArray9[3] != null) {
						Static104.method2071(0, 1008, local169.anInt1764, false, local169.aStringArray9[3], local169.aString17, -1, (long) local161.aClass2_Sub8_1.anInt1039, true);
					}
					if (local169.aStringArray9[2] != null) {
						Static104.method2071(0, 1012, local169.anInt1764, false, local169.aStringArray9[2], local169.aString17, -1, (long) local161.aClass2_Sub8_1.anInt1039, true);
					}
					if (local169.aStringArray9[1] != null) {
						Static104.method2071(0, 1011, local169.anInt1764, false, local169.aStringArray9[1], local169.aString17, -1, (long) local161.aClass2_Sub8_1.anInt1039, true);
					}
					if (local169.aStringArray9[0] != null) {
						Static104.method2071(0, 1007, local169.anInt1764, false, local169.aStringArray9[0], local169.aString17, -1, (long) local161.aClass2_Sub8_1.anInt1039, true);
					}
				}
				if (!local161.aClass2_Sub8_1.aBoolean104) {
					local161.aClass2_Sub8_1.aBoolean104 = true;
					Static367.method5886(Static145.aClass102_61, local161.aClass2_Sub8_1.anInt1039, local169.anInt1764);
				}
				if (local161.aClass2_Sub8_1.aBoolean104) {
					Static367.method5886(Static159.aClass102_54, local161.aClass2_Sub8_1.anInt1039, local169.anInt1764);
				}
			} else if (local161.aClass2_Sub8_1.aBoolean104) {
				local161.aClass2_Sub8_1.aBoolean104 = false;
				Static367.method5886(Static288.aClass102_111, local161.aClass2_Sub8_1.anInt1039, local169.anInt1764);
			}
		}
	}
}
