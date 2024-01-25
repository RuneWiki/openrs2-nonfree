import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_77 = new Class305(26, 3);

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Z")
	public static boolean aBoolean723 = true;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLclient!mc;)Lclient!bo;")
	public static Class46_Sub1 method7248(@OriginalArg(1) Class5_Sub41 arg0) {
		@Pc(7) Class46 local7 = Static200.method3266(arg0);
		@Pc(16) int local16 = arg0.method7801();
		return new Class46_Sub1(local7.anInt777, local7.aClass275_5, local7.aClass81_3, local7.anInt784, local7.anInt783, local16);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILclient!fda;)V")
	public static void method7249(@OriginalArg(1) int arg0, @OriginalArg(2) Class28_Sub1_Sub4_Sub2 arg1) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (arg1.anInt5463 > Static26.anInt350) {
			Static633.method8534(arg1);
		} else if (Static26.anInt350 <= arg1.anInt5473) {
			Static414.method6155(arg1);
		} else {
			Static250.method3864(false, arg1);
			local7 = Static79.anInt1139;
			local5 = Static399.anInt7112;
		}
		@Pc(117) int local117;
		if (arg1.anInt10781 < 512 || arg1.anInt10784 < 512 || arg1.anInt10781 >= Static201.anInt3834 * 512 - 512 || arg1.anInt10784 >= Static626.anInt10238 * 512 - 512) {
			local7 = 0;
			arg1.anInt5463 = 0;
			local5 = -1;
			arg1.anInt5473 = 0;
			arg1.anInt5482 = -1;
			arg1.anIntArray305 = null;
			arg1.anInt10781 = arg1.anIntArray308[0] * 512 + arg1.method4599() * 256;
			arg1.anInt10784 = arg1.anIntArray307[0] * 512 + arg1.method4599() * 256;
			arg1.method4594();
			for (local117 = 0; local117 < arg1.aClass227Array3.length; local117++) {
				arg1.aClass227Array3[local117].anInt6677 = -1;
			}
		}
		if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 == arg1 && (arg1.anInt10781 < 6144 || arg1.anInt10784 < 6144 || Static201.anInt3834 * 512 - 6144 <= arg1.anInt10781 || arg1.anInt10784 >= Static626.anInt10238 * 512 - 6144)) {
			local7 = 0;
			arg1.anInt5482 = -1;
			arg1.anInt5463 = 0;
			local5 = -1;
			arg1.anInt5473 = 0;
			arg1.anIntArray305 = null;
			arg1.anInt10781 = arg1.anIntArray308[0] * 512 + arg1.method4599() * 256;
			arg1.anInt10784 = arg1.anIntArray307[0] * 512 + arg1.method4599() * 256;
			arg1.method4594();
			for (local117 = 0; local117 < arg1.aClass227Array3.length; local117++) {
				arg1.aClass227Array3[local117].anInt6677 = -1;
			}
		}
		local117 = Static306.method4845(arg1);
		Static461.method6596(arg1);
		Static321.method5000(local117, local7, arg1, local5);
		Static117.method2216(local5, arg1);
		Static561.method7744(arg1);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!uaa;III)V")
	public static void method7259(@OriginalArg(0) Class345 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte133 == 0) {
			arg0.anInt9651 = arg0.anInt9582;
		} else if (arg0.aByte133 == 1) {
			arg0.anInt9651 = arg0.anInt9582 + (arg1 - arg0.anInt9649) / 2;
		} else if (arg0.aByte133 == 2) {
			arg0.anInt9651 = arg1 - arg0.anInt9649 - arg0.anInt9582;
		} else if (arg0.aByte133 == 3) {
			arg0.anInt9651 = arg1 * arg0.anInt9582 >> 14;
		} else if (arg0.aByte133 == 4) {
			arg0.anInt9651 = (arg0.anInt9582 * arg1 >> 14) + (arg1 - arg0.anInt9649) / 2;
		} else {
			arg0.anInt9651 = arg1 - (arg1 * arg0.anInt9582 >> 14) - arg0.anInt9649;
		}
		if (arg0.aByte132 == 0) {
			arg0.anInt9588 = arg0.anInt9647;
		} else if (arg0.aByte132 == 1) {
			arg0.anInt9588 = (arg2 - arg0.anInt9606) / 2 + arg0.anInt9647;
		} else if (arg0.aByte132 == 2) {
			arg0.anInt9588 = arg2 - arg0.anInt9606 - arg0.anInt9647;
		} else if (arg0.aByte132 == 3) {
			arg0.anInt9588 = arg2 * arg0.anInt9647 >> 14;
		} else if (arg0.aByte132 == 4) {
			arg0.anInt9588 = (arg0.anInt9647 * arg2 >> 14) + (arg2 - arg0.anInt9606) / 2;
		} else {
			arg0.anInt9588 = arg2 - arg0.anInt9606 - (arg2 * arg0.anInt9647 >> 14);
		}
		if (!Static202.aBoolean307) {
			return;
		}
		if (Static84.method1822(arg0).anInt507 == 0 && arg0.anInt9591 != 0) {
			return;
		}
		if (arg0.anInt9651 < 0) {
			arg0.anInt9651 = 0;
		} else if (arg0.anInt9649 + arg0.anInt9651 > arg1) {
			arg0.anInt9651 = arg1 - arg0.anInt9649;
		}
		if (arg0.anInt9588 < 0) {
			arg0.anInt9588 = 0;
			return;
		}
		if (arg0.anInt9588 + arg0.anInt9606 > arg2) {
			arg0.anInt9588 = arg2 - arg0.anInt9606;
			return;
		}
	}
}
