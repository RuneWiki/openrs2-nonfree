import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
	public static int[] anIntArray760;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[I")
	public static final int[] anIntArray758 = new int[1];

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
	public static final int[] anIntArray759 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method7748() {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(13) Class20 local13 = Static531.aClass283_6.method7180("2", true);
			while (local13.anInt593 == 0) {
				Static379.method5233(1L);
			}
			if (local13.anInt593 == 1) {
				local7 = (Class133) local13.anObject2;
				@Pc(43) Class2_Sub29 local43 = new Class2_Sub29(Static465.anInt8385 * 6 + 3);
				local43.method5172(1);
				local43.method5217(Static465.anInt8385);
				for (@Pc(53) int local53 = 0; local53 < Static399.anIntArray113.length; local53++) {
					if (Static432.aBooleanArray35[local53]) {
						local43.method5217(local53);
						local43.method5185(Static399.anIntArray113[local53]);
					}
				}
				local7.method3307(0, local43.anInt6132, local43.aByteArray96);
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local7 != null) {
				local7.method3306();
			}
		} catch (@Pc(99) Exception local99) {
		}
		Class75_Sub1.lb = Static143.method2502();
		Static242.aBoolean326 = false;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public static void method7752() {
		if (Static23.anInt476 != -1) {
			Static246.method3901(-1, -1, false, Static23.anInt476);
			Static23.anInt476 = -1;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method7753(@OriginalArg(0) Class39 arg0) {
		if (Static435.aClass249_62.method6522() == 0) {
			return;
		}
		@Pc(51) Class2_Sub45 local51;
		if (Static266.anInt4923 == 0) {
			for (local51 = (Class2_Sub45) Static435.aClass249_62.method6527(); local51 != null; local51 = (Class2_Sub45) Static435.aClass249_62.method6525()) {
				Static464.aClass115_1.method2972(arg0, local51.anInt8877, local51.aBoolean642 ? Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1 : null, Static301.aClass47_3, false, local51.anInt8880, local51.anInt8876, arg0, local51.anInt8879, local51.anInt8875, false);
				local51.method7802();
			}
			Static190.method3102();
			return;
		}
		if (Static269.aClass39_7 == null) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(36, 32);
			Static269.aClass39_7 = Static384.method6029(0, local21, Static19.aClass53_4, Static11.anInterface12_10, 0);
			Static228.aClass47_2 = Static269.aClass39_7.method6078(Static337.method5338(Static281.anInt5177, Static36.aClass53_10), Static558.method6365(Static460.aClass53_147, Static281.anInt5177));
		}
		for (local51 = (Class2_Sub45) Static435.aClass249_62.method6527(); local51 != null; local51 = (Class2_Sub45) Static435.aClass249_62.method6525()) {
			Static464.aClass115_1.method2972(arg0, local51.anInt8877, local51.aBoolean642 ? Static266.aClass1_Sub1_Sub2_Sub1_1.aClass146_1 : null, Static228.aClass47_2, false, local51.anInt8880, local51.anInt8876, Static269.aClass39_7, local51.anInt8879, local51.anInt8875, false);
			local51.method7802();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBI)Z")
	public static boolean method7755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([BIZIIILclient!os;I)Lclient!gg;")
	public static Class19_Sub2_Sub1 method7756(@OriginalArg(0) byte[] arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class39_Sub3 arg2, @OriginalArg(7) int arg3) {
		if (arg2.aBoolean490 || Static150.method2607(arg3) && Static150.method2607(arg1)) {
			return new Class19_Sub2_Sub1(arg2, 3553, 6406, arg3, arg1, false, arg0, 6406);
		} else if (arg2.aBoolean506) {
			return new Class19_Sub2_Sub1(arg2, 34037, 6406, arg3, arg1, false, arg0, 6406);
		} else {
			return new Class19_Sub2_Sub1(arg2, 6406, arg3, arg1, Static131.method2413(arg3), Static131.method2413(arg1), arg0, 6406);
		}
	}
}
