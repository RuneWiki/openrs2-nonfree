import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "F")
	public static float aFloat261;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!io;")
	public static final Class148 aClass148_9 = new Class148(6, 0, 4, 2);

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "[I")
	public static final int[] anIntArray416 = new int[13];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!oh;IZII)V")
	public static void method5041(@OriginalArg(0) Class220 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt6627;
		if (arg0.aByte68 == 0) {
			arg0.anInt6627 = arg0.anInt6630;
		} else if (arg0.aByte68 == 1) {
			arg0.anInt6627 = arg2 - arg0.anInt6630;
		} else if (arg0.aByte68 == 2) {
			arg0.anInt6627 = arg0.anInt6630 * arg2 >> 14;
		}
		@Pc(45) int local45 = arg0.anInt6681;
		if (arg0.aByte66 == 0) {
			arg0.anInt6681 = arg0.anInt6634;
		} else if (arg0.aByte66 == 1) {
			arg0.anInt6681 = arg3 - arg0.anInt6634;
		} else if (arg0.aByte66 == 2) {
			arg0.anInt6681 = arg3 * arg0.anInt6634 >> 14;
		}
		if (arg0.aByte68 == 4) {
			arg0.anInt6627 = arg0.anInt6681 * arg0.anInt6645 / arg0.anInt6673;
		}
		if (arg0.aByte66 == 4) {
			arg0.anInt6681 = arg0.anInt6673 * arg0.anInt6627 / arg0.anInt6645;
		}
		if (Static525.aBoolean645 && (Static68.method1303(arg0).anInt2112 != 0 || arg0.anInt6669 == 0)) {
			if (arg0.anInt6681 < 5 && arg0.anInt6627 < 5) {
				arg0.anInt6681 = 5;
				arg0.anInt6627 = 5;
			} else {
				if (arg0.anInt6681 <= 0) {
					arg0.anInt6681 = 5;
				}
				if (arg0.anInt6627 <= 0) {
					arg0.anInt6627 = 5;
				}
			}
		}
		if (Static256.anInt5129 == arg0.anInt6618) {
			Static24.aClass220_9 = arg0;
		}
		if (arg1 && arg0.anObjectArray6 != null && (local8 != arg0.anInt6627 || local45 != arg0.anInt6681)) {
			@Pc(198) Class5_Sub17 local198 = new Class5_Sub17();
			local198.anObjectArray3 = arg0.anObjectArray6;
			local198.aClass220_5 = arg0;
			Static287.aClass99_49.method2513(local198);
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public static void method5042() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static460.anInt7894; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static235.anInt4493; local17++) {
				if (Static137.method1273(true, local13, local17, Static152.aClass37ArrayArrayArray1, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
