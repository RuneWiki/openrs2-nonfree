import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public static int anInt1618;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public static int anInt1617 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!so;B)Lclient!lw;")
	public static Class53 method1390(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(7) int local7 = arg0.method5900();
		@Pc(14) Class168 local14 = Static191.method2989()[arg0.method5866()];
		@Pc(21) Class339 local21 = Static324.method5108()[arg0.method5866()];
		@Pc(25) int local25 = arg0.method5890();
		@Pc(37) int local37 = arg0.method5890();
		return new Class53(local7, local14, local21, local25, local37);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILclient!mea;I)V")
	public static void method1391(@OriginalArg(1) int arg0, @OriginalArg(2) Class230 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte107 == 0) {
			arg1.anInt6725 = arg1.anInt6642;
		} else if (arg1.aByte107 == 1) {
			arg1.anInt6725 = arg1.anInt6642 + (arg0 - arg1.anInt6703) / 2;
		} else if (arg1.aByte107 == 2) {
			arg1.anInt6725 = arg0 - arg1.anInt6642 - arg1.anInt6703;
		} else if (arg1.aByte107 == 3) {
			arg1.anInt6725 = arg0 * arg1.anInt6642 >> 14;
		} else if (arg1.aByte107 == 4) {
			arg1.anInt6725 = (arg0 * arg1.anInt6642 >> 14) + (arg0 - arg1.anInt6703) / 2;
		} else {
			arg1.anInt6725 = arg0 - (arg1.anInt6642 * arg0 >> 14) - arg1.anInt6703;
		}
		if (arg1.aByte105 == 0) {
			arg1.anInt6676 = arg1.anInt6699;
		} else if (arg1.aByte105 == 1) {
			arg1.anInt6676 = arg1.anInt6699 + (arg2 - arg1.anInt6701) / 2;
		} else if (arg1.aByte105 == 2) {
			arg1.anInt6676 = arg2 - arg1.anInt6701 - arg1.anInt6699;
		} else if (arg1.aByte105 == 3) {
			arg1.anInt6676 = arg2 * arg1.anInt6699 >> 14;
		} else if (arg1.aByte105 == 4) {
			arg1.anInt6676 = (arg2 - arg1.anInt6701) / 2 + (arg2 * arg1.anInt6699 >> 14);
		} else {
			arg1.anInt6676 = arg2 - arg1.anInt6701 - (arg1.anInt6699 * arg2 >> 14);
		}
		if (!Static28.aBoolean59) {
			return;
		}
		if (Static78.method1481(arg1).anInt6586 == 0 && arg1.anInt6660 != 0) {
			return;
		}
		if (arg1.anInt6676 < 0) {
			arg1.anInt6676 = 0;
		} else if (arg1.anInt6676 + arg1.anInt6701 > arg2) {
			arg1.anInt6676 = arg2 - arg1.anInt6701;
		}
		if (arg1.anInt6725 < 0) {
			arg1.anInt6725 = 0;
			return;
		}
		if (arg1.anInt6725 + arg1.anInt6703 > arg0) {
			arg1.anInt6725 = arg0 - arg1.anInt6703;
			return;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIILclient!vn;)V")
	public static void method1392(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class12_Sub2_Sub2_Sub1 arg3) {
		Static210.method3320(arg3.anInt10998, arg2, arg3.anInt11002, arg3.aByte146, arg1, 0, arg0);
	}
}
