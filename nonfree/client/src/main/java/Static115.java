import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public static int anInt2115;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public static int anInt2116;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_87 = new Class56(102, 12);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!fw;I)Z")
	public static boolean method1682(@OriginalArg(0) Interface4 arg0) {
		@Pc(15) Class114 local15 = Static51.aClass151_1.method2917(arg0.method5603());
		if (local15.anInt2866 == -1) {
			return true;
		} else {
			@Pc(28) Class194 local28 = Static357.aClass122_3.method2324(local15.anInt2866);
			return local28.anInt4888 == -1 ? true : local28.method3890();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!hd;ZI)V")
	public static void method1686(@OriginalArg(0) int arg0, @OriginalArg(2) Class110 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt2617;
		@Pc(11) int local11 = arg1.anInt2590;
		if (arg1.aByte50 == 0) {
			arg1.anInt2617 = arg1.anInt2608;
		} else if (arg1.aByte50 == 1) {
			arg1.anInt2617 = arg3 - arg1.anInt2608;
		} else if (arg1.aByte50 == 2) {
			arg1.anInt2617 = arg1.anInt2608 * arg3 >> 14;
		}
		if (arg1.aByte47 == 0) {
			arg1.anInt2590 = arg1.anInt2644;
		} else if (arg1.aByte47 == 1) {
			arg1.anInt2590 = arg0 - arg1.anInt2644;
		} else if (arg1.aByte47 == 2) {
			arg1.anInt2590 = arg0 * arg1.anInt2644 >> 14;
		}
		if (arg1.aByte50 == 4) {
			arg1.anInt2617 = arg1.anInt2590 * arg1.anInt2645 / arg1.anInt2609;
		}
		if (arg1.aByte47 == 4) {
			arg1.anInt2590 = arg1.anInt2609 * arg1.anInt2617 / arg1.anInt2645;
		}
		if (Static37.aBoolean35 && (Static55.method752(arg1).anInt3514 != 0 || arg1.anInt2627 == 0)) {
			if (arg1.anInt2590 < 5 && arg1.anInt2617 < 5) {
				arg1.anInt2590 = 5;
				arg1.anInt2617 = 5;
			} else {
				if (arg1.anInt2590 <= 0) {
					arg1.anInt2590 = 5;
				}
				if (arg1.anInt2617 <= 0) {
					arg1.anInt2617 = 5;
				}
			}
		}
		if (arg1.anInt2638 == Static215.anInt5488) {
			Static73.aClass110_3 = arg1;
		}
		if (arg2 && arg1.anObjectArray10 != null && (local8 != arg1.anInt2617 || local11 != arg1.anInt2590)) {
			@Pc(195) Class4_Sub34 local195 = new Class4_Sub34();
			local195.aClass110_14 = arg1;
			local195.anObjectArray34 = arg1.anObjectArray10;
			Static302.aClass244_29.method5273(local195);
		}
	}
}
