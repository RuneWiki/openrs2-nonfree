import java.awt.Dimension;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "[I")
	public static int[] anIntArray661;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BII)I")
	public static int method8255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static195.anInt3801 == -1) {
			return 1;
		}
		if (arg1 != Static275.anInt5823) {
			Static121.method3342(arg1, Static139.aClass101_12.method2841(Static126.anInt2904));
			if (Static275.anInt5823 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(34) Dimension local34 = Static545.aCanvas14.getSize();
			Static569.method8164(true, Static139.aClass101_12.method2841(Static126.anInt2904), Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
			@Pc(50) Class96 local50 = Static374.method6085(Static195.anInt3801, Static159.aClass254_51);
			@Pc(55) long local55 = Static376.method6088();
			Static546.aClass15_16.F();
			Static574.aClass255_9.GA(0, Static377.anInt7321, 0);
			Static546.aClass15_16.method5291(Static574.aClass255_9);
			Static546.aClass15_16.m(local34.width / 2, local34.height / 2, 512, 512);
			Static546.aClass15_16.ha(1.0F);
			Static546.aClass15_16.YA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(96) Class21 local96 = Static546.aClass15_16.method5352(local50, 2048, 64, 64, 768);
			@Pc(98) int local98 = 0;
			label41: for (@Pc(100) int local100 = 0; local100 < 500; local100++) {
				Static546.aClass15_16.D(0);
				Static546.aClass15_16.method5342();
				for (@Pc(108) int local108 = 15; local108 >= 0; local108--) {
					for (@Pc(111) int local111 = 0; local111 <= local108; local111++) {
						Static202.aClass255_6.GA((int) (((float) local111 - (float) local108 / 2.0F) * (float) Static480.anInt8971), 0, (local108 + 1) * Static480.anInt8971);
						local96.method7145(Static202.aClass255_6, null, 0);
						local98++;
						if (Static376.method6088() - local55 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static546.aClass15_16.method5350();
			@Pc(181) long local181 = (long) (local98 * 1000) / (Static376.method6088() - local55);
			Static546.aClass15_16.D(0);
			Static546.aClass15_16.method5342();
			return (int) local181;
		} catch (@Pc(190) Throwable local190) {
			local190.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8258(@OriginalArg(0) String arg0) {
		if (!Static535.aClass326_5.aBoolean802) {
			return -1;
		} else if (Static598.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static88.method2034(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static286.aString135 + local20;
			if (!Static128.aClass254_100.method6406("", local33)) {
				return -1;
			} else if (Static128.aClass254_100.method6425(local33)) {
				@Pc(61) byte[] local61 = Static128.aClass254_100.method6410("", local33);
				@Pc(65) File local65 = Static169.method3108(local20);
				if (local61 == null || local65 == null) {
					return -1;
				}
				@Pc(71) boolean local71 = true;
				@Pc(75) byte[] local75 = Static81.method1875(local65);
				if (local75 != null && local75.length == local61.length) {
					for (@Pc(88) int local88 = 0; local88 < local75.length; local88++) {
						if (local75[local88] != local61[local88]) {
							local71 = false;
							break;
						}
					}
				} else {
					local71 = false;
				}
				try {
					if (!local71) {
						Static535.aClass326_5.method7793(local61, local65);
					}
				} catch (@Pc(116) Throwable local116) {
					return -1;
				}
				Static66.method1650(arg0, local65);
				return 100;
			} else {
				return Static128.aClass254_100.method6402(local33);
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(BII)Z")
	public static boolean method8260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static434.method6852(arg1, arg0) & Static213.method3730(arg1, arg0);
	}
}
