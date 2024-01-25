import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ss", name = "P", descriptor = "Lclient!ve;")
	public static Class66 aClass66_4;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBII)I")
	public static int method5298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static255.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static255.aByteArrayArrayArray13[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLclient!ij;)V")
	public static void method5299(@OriginalArg(1) Class93 arg0) {
		Static163.aClass93_64 = arg0;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(III)V")
	public static void method5301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static1.aClass109_1 = new Class109(arg1);
		Static69.aClass109_18 = new Class109(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!ne;I)[Lclient!ip;")
	public static Class96[] method5302(@OriginalArg(0) Class139 arg0) {
		if (!arg0.method3875()) {
			return new Class96[0];
		}
		@Pc(14) Class16 local14 = arg0.method3865();
		while (local14.anInt381 == 0) {
			Static20.method408(10L);
		}
		if (local14.anInt381 == 2) {
			return new Class96[0];
		}
		@Pc(42) int[] local42 = (int[]) local14.anObject1;
		@Pc(48) Class96[] local48 = new Class96[local42.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(55) Class96 local55 = new Class96();
			local48[local50] = local55;
			local55.anInt2728 = local42[local50 << 2];
			local55.anInt2734 = local42[(local50 << 2) + 1];
			local55.anInt2731 = local42[(local50 << 2) + 2];
			local55.anInt2733 = local42[(local50 << 2) + 3];
		}
		return local48;
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(B)V")
	public static void method5303() {
		Static338.aClass201Array124 = null;
		Static232.method4187(0, Static168.anInt3376, Static32.anInt628, 0, -1, 0, Static256.anInt5066, 0);
		if (Static338.aClass201Array124 != null) {
			Static111.method1964(Static168.anInt3376, Static342.aClass201_13.anInt6501, 0, Static252.anInt4998, -1412584499, Static237.anInt4728, 0, Static338.aClass201Array124, Static256.anInt5066);
			Static338.aClass201Array124 = null;
		}
	}
}
