import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mca", name = "J", descriptor = "I")
	public static int anInt6182;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
	public static int anInt6186;

	@OriginalMember(owner = "client!mca", name = "E", descriptor = "I")
	public static final int anInt6183 = -1;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
	public static void method5557(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class6_Sub2_Sub11 local10 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local10 != null; local10 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
			if (Static274.method3026(local10.anInt5173)) {
				Static172.method3337(local10);
			}
		}
		if (arg0 >= -43) {
			anInt6186 = -64;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
	public static void method5558() {
		if (Static42.aClass331Array1 == null) {
			Static42.aClass331Array1 = Static564.method7956();
			Static420.aClass331_1 = Static42.aClass331Array1[0];
			Static682.aLong344 = Static549.method7758();
		}
		if (Static616.aClass339_1 == null) {
			Static253.method4388();
		}
		@Pc(38) Class331 local38 = Static420.aClass331_1;
		@Pc(41) int local41 = Static503.method7341();
		if (Static420.aClass331_1 == local38) {
			Static467.aString88 = Static420.aClass331_1.aClass43_64.method596(Static601.anInt9518);
			if (Static420.aClass331_1.aBoolean687) {
				Static353.anInt6008 = local41 * (Static420.aClass331_1.anInt9107 - Static420.aClass331_1.anInt9109) / 100 + Static420.aClass331_1.anInt9109;
			}
			if (Static420.aClass331_1.aBoolean688) {
				Static467.aString88 = Static467.aString88 + Static353.anInt6008 + "%";
			}
		} else if (Static420.aClass331_1 == Static564.aClass331_22) {
			Static616.aClass339_1 = null;
			Static307.method4889(3);
		} else {
			Static467.aString88 = local38.aClass43_63.method596(Static601.anInt9518);
			if (Static420.aClass331_1.aBoolean688) {
				Static467.aString88 = Static467.aString88 + local38.anInt9107 + "%";
			}
			Static353.anInt6008 = local38.anInt9107;
			if (Static420.aClass331_1.aBoolean687 || local38.aBoolean687) {
				Static682.aLong344 = Static549.method7758();
			}
		}
		if (Static616.aClass339_1 == null) {
			return;
		}
		Static616.aClass339_1.method8119(Static420.aClass331_1, Static353.anInt6008, Static682.aLong344, Static467.aString88);
		if (Static119.anInterface9Array1 == null) {
			return;
		}
		for (@Pc(161) int local161 = Static226.anInt4400 + 1; local161 < Static119.anInterface9Array1.length; local161++) {
			if (Static119.anInterface9Array1[local161].method3096() >= 100 && Static226.anInt4400 == local161 - 1 && Static37.anInt498 >= 1 && Static616.aClass339_1.method8111()) {
				try {
					Static119.anInterface9Array1[local161].method3095();
				} catch (@Pc(203) Exception local203) {
					Static119.anInterface9Array1 = null;
					return;
				}
				Static616.aClass339_1.method8108(Static119.anInterface9Array1[local161]);
				Static226.anInt4400++;
				if (Static119.anInterface9Array1.length - 1 <= Static226.anInt4400 && Static119.anInterface9Array1.length > 1) {
					Static226.anInt4400 = Static385.aClass132_1.method3525() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III[II)V")
	public static void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		arg1--;
		@Pc(7) int local7 = arg4 - 1;
		@Pc(11) int local11 = local7 + arg0;
		while (arg1 < local11) {
			@Pc(15) int local15 = arg1 + 1;
			arg3[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg2;
			arg1 = local45 + 1;
			arg3[arg1] = arg2;
		}
		while (arg1 < local7) {
			arg1++;
			arg3[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!da;)V")
	public static void method5560(@OriginalArg(0) Class67 arg0) {
		Static456.aClass67_11 = arg0;
	}
}
