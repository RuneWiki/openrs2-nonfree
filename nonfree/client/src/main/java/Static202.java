import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
	public static int anInt4099;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
	public static int anInt4089 = 0;

	@OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
	public static int anInt4103 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!oa;")
	public static Class99 method3258(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("Class99_Sub1");
			@Pc(16) Class99 local16 = (Class99) local12.getDeclaredConstructor().newInstance();
			local16.method3510(arg1, arg2, arg0);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class99_Sub2 local29 = new Class99_Sub2();
			local29.method3510(arg1, arg2, arg0);
			return local29;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZLclient!in;B)V")
	public static void method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class71 arg3) {
		@Pc(8) int local8 = arg3.anInt2698;
		if (arg3.aByte11 == 0) {
			arg3.anInt2698 = arg3.anInt2669;
		} else if (arg3.aByte11 == 1) {
			arg3.anInt2698 = arg1 - arg3.anInt2669;
		} else if (arg3.aByte11 == 2) {
			arg3.anInt2698 = arg1 * arg3.anInt2669 >> 14;
		} else if (arg3.aByte11 == 3) {
			if (arg3.anInt2712 == 2) {
				arg3.anInt2698 = arg3.anInt2679 * (arg3.anInt2669 - 1) + arg3.anInt2669 * 32;
			} else if (arg3.anInt2712 == 7) {
				arg3.anInt2698 = arg3.anInt2669 * 12 + arg3.anInt2679 * (arg3.anInt2669 - 1);
			}
		}
		@Pc(96) int local96 = arg3.anInt2722;
		if (arg3.aByte8 == 0) {
			arg3.anInt2722 = arg3.anInt2706;
		} else if (arg3.aByte8 == 1) {
			arg3.anInt2722 = arg0 - arg3.anInt2706;
		} else if (arg3.aByte8 == 2) {
			arg3.anInt2722 = arg3.anInt2706 * arg0 >> 14;
		} else if (arg3.aByte8 == 3) {
			if (arg3.anInt2712 == 2) {
				arg3.anInt2722 = arg3.anInt2648 * (arg3.anInt2706 - 1) + arg3.anInt2706 * 32;
			} else if (arg3.anInt2712 == 7) {
				arg3.anInt2722 = arg3.anInt2648 * (arg3.anInt2706 - 1) + arg3.anInt2706 * 115;
			}
		}
		if (arg3.aByte8 == 4) {
			arg3.anInt2722 = arg3.anInt2698 * arg3.anInt2664 / arg3.anInt2716;
		}
		if (arg3.aByte11 == 4) {
			arg3.anInt2698 = arg3.anInt2722 * arg3.anInt2716 / arg3.anInt2664;
		}
		if (Static178.aBoolean303 && (Static36.method769(arg3).anInt1759 != 0 || arg3.anInt2712 == 0)) {
			if (arg3.anInt2698 < 5 && arg3.anInt2722 < 5) {
				arg3.anInt2698 = 5;
				arg3.anInt2722 = 5;
			} else {
				if (arg3.anInt2722 <= 0) {
					arg3.anInt2722 = 5;
				}
				if (arg3.anInt2698 <= 0) {
					arg3.anInt2698 = 5;
				}
			}
		}
		if (arg3.anInt2713 == 1337) {
			Static69.aClass71_9 = arg3;
		}
		if (arg2 && arg3.anObjectArray7 != null && (local96 != arg3.anInt2722 || local8 != arg3.anInt2698)) {
			@Pc(290) Class1_Sub14 local290 = new Class1_Sub14();
			local290.anObjectArray1 = arg3.anObjectArray7;
			local290.aClass71_8 = arg3;
			Static276.aClass61_16.method1839(local290);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public static void method3260() {
		Static194.aClass135_20.method3324();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!fj;I)I")
	public static int method3261(@OriginalArg(0) Class14_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt1725;
		@Pc(12) Class164 local12 = arg0.method3650();
		if (arg0.anInt4658 == local12.anInt5190) {
			local8 = arg0.anInt1742;
		} else if (arg0.anInt4658 == local12.anInt5207 || local12.anInt5215 == arg0.anInt4658 || local12.anInt5205 == arg0.anInt4658 || local12.anInt5222 == arg0.anInt4658) {
			local8 = arg0.anInt1714;
		} else if (arg0.anInt4658 == local12.anInt5221 || local12.anInt5192 == arg0.anInt4658 || arg0.anInt4658 == local12.anInt5195 || arg0.anInt4658 == local12.anInt5209) {
			local8 = arg0.anInt1739;
		}
		return local8;
	}
}
