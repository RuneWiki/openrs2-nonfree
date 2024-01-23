import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Lclient!lb;")
	public static Class97 aClass97_12 = new Class97(16);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public static void method2281() {
		aClass97_12 = null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!cc;II)V")
	public static void method2282(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte2 == 0) {
			arg0.anInt593 = arg0.anInt608;
		} else if (arg0.aByte2 == 1) {
			arg0.anInt593 = arg0.anInt608 + (arg2 - arg0.anInt602) / 2;
		} else if (arg0.aByte2 == 2) {
			arg0.anInt593 = arg2 - arg0.anInt602 - arg0.anInt608;
		} else if (arg0.aByte2 == 3) {
			arg0.anInt593 = arg2 * arg0.anInt608 >> 14;
		} else if (arg0.aByte2 == 4) {
			arg0.anInt593 = (arg2 - arg0.anInt602) / 2 + (arg2 * arg0.anInt608 >> 14);
		} else {
			arg0.anInt593 = arg2 - (arg2 * arg0.anInt608 >> 14) - arg0.anInt602;
		}
		if (arg0.aByte4 == 0) {
			arg0.anInt569 = arg0.anInt538;
		} else if (arg0.aByte4 == 1) {
			arg0.anInt569 = (arg1 - arg0.anInt546) / 2 + arg0.anInt538;
		} else if (arg0.aByte4 == 2) {
			arg0.anInt569 = arg1 - arg0.anInt546 - arg0.anInt538;
		} else if (arg0.aByte4 == 3) {
			arg0.anInt569 = arg0.anInt538 * arg1 >> 14;
		} else if (arg0.aByte4 == 4) {
			arg0.anInt569 = (arg1 - arg0.anInt546) / 2 + (arg0.anInt538 * arg1 >> 14);
		} else {
			arg0.anInt569 = arg1 - arg0.anInt546 - (arg1 * arg0.anInt538 >> 14);
		}
		if (!Static255.aBoolean311 || Static40.method681(arg0).anInt3558 == 0 && arg0.anInt542 != 0) {
			return;
		}
		if (arg0.anInt569 < 0) {
			arg0.anInt569 = 0;
		} else if (arg1 < arg0.anInt546 + arg0.anInt569) {
			arg0.anInt569 = arg1 - arg0.anInt546;
		}
		if (arg0.anInt593 < 0) {
			arg0.anInt593 = 0;
		} else if (arg0.anInt602 + arg0.anInt593 > arg2) {
			arg0.anInt593 = arg2 - arg0.anInt602;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)Z")
	public static boolean method2283(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static58.method942();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static58.method939();
		} else if (!Static58.method930() || !Static58.method934() || !Static58.method936()) {
			arg0 = false;
		}
		Static92.aBoolean144 = arg0;
		Static102.method1649(Static87.aClass164_2);
		if (local13 == arg0) {
			return false;
		} else {
			((Class71_Sub1) Static204.anInterface2_1).method1986();
			return true;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!lc;B)V")
	public static void method2284(@OriginalArg(0) Class98 arg0) {
		Static200.aClass98_119 = arg0;
	}
}
