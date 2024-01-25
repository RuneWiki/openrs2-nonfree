import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
	public static int anInt9458;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
	public static int anInt9447 = 0;

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "Lclient!mo;")
	public static final Class218 aClass218_11 = new Class218("WTI", 5);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public static void method7814() {
		Static254.method4033();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)I")
	public static int method7818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!jo;I)V")
	public static void method7819(@OriginalArg(0) Class20_Sub6 arg0) {
		arg0.aClass20_Sub2_Sub4_Sub1_1 = null;
		if (Static269.anInt5041 < 20) {
			Static392.aClass349_11.method7655(arg0);
			Static269.anInt5041++;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!ga;I)Lclient!aga;")
	public static Class13 method7820(@OriginalArg(0) int arg0, @OriginalArg(2) Class111 arg1) {
		@Pc(11) byte[] local11 = arg1.method2441(0, arg0);
		return local11 == null ? null : new Class13(local11);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	public static void method7821() {
		if (!Static561.method5043()) {
			return;
		}
		if (Static35.aStringArray3 == null) {
			Static98.method1829();
		}
		Static132.anInt2642 = 0;
		Static539.aBoolean655 = true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lclient!mo;")
	public static Class218 method7822(@OriginalArg(1) int arg0) {
		@Pc(6) Class218[] local6 = Static466.method2185();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(17) Class218 local17 = local6[local8];
			if (local17.anInt5906 == arg0) {
				return local17;
			}
		}
		return null;
	}
}
