import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static531 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
	public static boolean aBoolean660 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!wp;III)V")
	public static void method7100(@OriginalArg(0) Class361 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte127 == 0) {
			arg0.anInt9606 = arg0.anInt9587;
		} else if (arg0.aByte127 == 1) {
			arg0.anInt9606 = arg0.anInt9587 + (arg2 - arg0.anInt9668) / 2;
		} else if (arg0.aByte127 == 2) {
			arg0.anInt9606 = arg2 - arg0.anInt9587 - arg0.anInt9668;
		} else if (arg0.aByte127 == 3) {
			arg0.anInt9606 = arg2 * arg0.anInt9587 >> 14;
		} else if (arg0.aByte127 == 4) {
			arg0.anInt9606 = (arg2 - arg0.anInt9668) / 2 + (arg2 * arg0.anInt9587 >> 14);
		} else {
			arg0.anInt9606 = arg2 - (arg2 * arg0.anInt9587 >> 14) - arg0.anInt9668;
		}
		if (arg0.aByte129 == 0) {
			arg0.anInt9659 = arg0.anInt9600;
		} else if (arg0.aByte129 == 1) {
			arg0.anInt9659 = arg0.anInt9600 + (arg1 - arg0.anInt9650) / 2;
		} else if (arg0.aByte129 == 2) {
			arg0.anInt9659 = arg1 - arg0.anInt9600 - arg0.anInt9650;
		} else if (arg0.aByte129 == 3) {
			arg0.anInt9659 = arg0.anInt9600 * arg1 >> 14;
		} else if (arg0.aByte129 == 4) {
			arg0.anInt9659 = (arg0.anInt9600 * arg1 >> 14) + (arg1 - arg0.anInt9650) / 2;
		} else {
			arg0.anInt9659 = arg1 - arg0.anInt9650 - (arg1 * arg0.anInt9600 >> 14);
		}
		if (!Static425.aBoolean541) {
			return;
		}
		if (Static71.method1520(arg0).anInt6063 == 0 && arg0.anInt9665 != 0) {
			return;
		}
		if (arg0.anInt9606 < 0) {
			arg0.anInt9606 = 0;
		} else if (arg0.anInt9606 + arg0.anInt9668 > arg2) {
			arg0.anInt9606 = arg2 - arg0.anInt9668;
		}
		if (arg0.anInt9659 < 0) {
			arg0.anInt9659 = 0;
			return;
		}
		if (arg0.anInt9659 + arg0.anInt9650 > arg1) {
			arg0.anInt9659 = arg1 - arg0.anInt9650;
			return;
		}
	}
}
