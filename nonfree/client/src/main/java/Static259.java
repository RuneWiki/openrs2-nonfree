import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "Lclient!da;")
	public static Class25 aClass25_9;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "F")
	public static float aFloat167;

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "Lclient!kh;")
	public static final Class180 aClass180_5 = new Class180();

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
	public static int anInt5717 = 0;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)Lclient!fq;")
	public static Class104 method4850(@OriginalArg(0) int arg0) {
		@Pc(13) Class104[] local13 = Static20.method265();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt3889 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILclient!gaa;)V")
	public static void method4852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class108 arg2) {
		if (arg2.aByte48 == 0) {
			arg2.anInt4053 = arg2.anInt4029;
		} else if (arg2.aByte48 == 1) {
			arg2.anInt4053 = arg2.anInt4029 + (arg1 - arg2.anInt4037) / 2;
		} else if (arg2.aByte48 == 2) {
			arg2.anInt4053 = arg1 - arg2.anInt4029 - arg2.anInt4037;
		} else if (arg2.aByte48 == 3) {
			arg2.anInt4053 = arg2.anInt4029 * arg1 >> 14;
		} else if (arg2.aByte48 == 4) {
			arg2.anInt4053 = (arg2.anInt4029 * arg1 >> 14) + (arg1 - arg2.anInt4037) / 2;
		} else {
			arg2.anInt4053 = arg1 - arg2.anInt4037 - (arg1 * arg2.anInt4029 >> 14);
		}
		if (arg2.aByte49 == 0) {
			arg2.anInt4070 = arg2.anInt4096;
		} else if (arg2.aByte49 == 1) {
			arg2.anInt4070 = (arg0 - arg2.anInt4067) / 2 + arg2.anInt4096;
		} else if (arg2.aByte49 == 2) {
			arg2.anInt4070 = arg0 - arg2.anInt4096 - arg2.anInt4067;
		} else if (arg2.aByte49 == 3) {
			arg2.anInt4070 = arg0 * arg2.anInt4096 >> 14;
		} else if (arg2.aByte49 == 4) {
			arg2.anInt4070 = (arg0 - arg2.anInt4067) / 2 + (arg0 * arg2.anInt4096 >> 14);
		} else {
			arg2.anInt4070 = arg0 - arg2.anInt4067 - (arg2.anInt4096 * arg0 >> 14);
		}
		if (!Static401.aBoolean650) {
			return;
		}
		if (Static71.method1836(arg2).anInt1134 == 0 && arg2.anInt4018 != 0) {
			return;
		}
		if (arg2.anInt4053 < 0) {
			arg2.anInt4053 = 0;
		} else if (arg1 < arg2.anInt4037 + arg2.anInt4053) {
			arg2.anInt4053 = arg1 - arg2.anInt4037;
		}
		if (arg2.anInt4070 < 0) {
			arg2.anInt4070 = 0;
			return;
		}
		if (arg2.anInt4067 + arg2.anInt4070 > arg0) {
			arg2.anInt4070 = arg0 - arg2.anInt4067;
			return;
		}
	}
}
