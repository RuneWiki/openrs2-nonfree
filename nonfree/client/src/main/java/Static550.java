import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "[S")
	public static short[] aShortArray136;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
	public static int anInt9398;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!mea;IIB)V")
	public static void method7766(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg1.anInt6703;
		@Pc(11) int local11 = arg1.anInt6701;
		if (arg1.aByte106 == 0) {
			arg1.anInt6703 = arg1.anInt6656;
		} else if (arg1.aByte106 == 1) {
			arg1.anInt6703 = arg2 - arg1.anInt6656;
		} else if (arg1.aByte106 == 2) {
			arg1.anInt6703 = arg1.anInt6656 * arg2 >> 14;
		}
		if (arg1.aByte108 == 0) {
			arg1.anInt6701 = arg1.anInt6684;
		} else if (arg1.aByte108 == 1) {
			arg1.anInt6701 = arg3 - arg1.anInt6684;
		} else if (arg1.aByte108 == 2) {
			arg1.anInt6701 = arg3 * arg1.anInt6684 >> 14;
		}
		if (arg1.aByte106 == 4) {
			arg1.anInt6703 = arg1.anInt6701 * arg1.anInt6669 / arg1.anInt6707;
		}
		if (arg1.aByte108 == 4) {
			arg1.anInt6701 = arg1.anInt6703 * arg1.anInt6707 / arg1.anInt6669;
		}
		if (Static28.aBoolean59 && (Static78.method1481(arg1).anInt6586 != 0 || arg1.anInt6660 == 0)) {
			if (arg1.anInt6701 < 5 && arg1.anInt6703 < 5) {
				arg1.anInt6701 = 5;
				arg1.anInt6703 = 5;
			} else {
				if (arg1.anInt6703 <= 0) {
					arg1.anInt6703 = 5;
				}
				if (arg1.anInt6701 <= 0) {
					arg1.anInt6701 = 5;
				}
			}
		}
		if (arg1.anInt6693 == Static243.anInt4385) {
			Static459.aClass230_8 = arg1;
		}
		if (arg0 && arg1.anObjectArray4 != null && (local8 != arg1.anInt6703 || arg1.anInt6701 != local11)) {
			@Pc(190) Class14_Sub55 local190 = new Class14_Sub55();
			local190.aClass230_14 = arg1;
			local190.anObjectArray33 = arg1.anObjectArray4;
			Static576.aClass262_67.method6314(local190);
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(II)Z")
	public static boolean method7769(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
