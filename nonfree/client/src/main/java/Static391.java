import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(B)Lclient!cl;")
	public static Class3_Sub6_Sub7 method5677() {
		@Pc(8) Class3_Sub6_Sub7 local8 = (Class3_Sub6_Sub7) Static610.aClass258_8.method5934();
		if (local8 != null) {
			local8.method8770();
			local8.method8342();
			return local8;
		}
		do {
			local8 = (Class3_Sub6_Sub7) Static136.aClass258_2.method5934();
			if (local8 == null) {
				return null;
			}
			if (local8.method1708() > Static131.method2268()) {
				return null;
			}
			local8.method8770();
			local8.method8342();
		} while ((Long.MIN_VALUE & local8.aLong290) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BLclient!kh;ZII)V")
	public static void method5678(@OriginalArg(1) Class208 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt5639;
		if (arg0.aByte83 == 0) {
			arg0.anInt5639 = arg0.anInt5657;
		} else if (arg0.aByte83 == 1) {
			arg0.anInt5639 = arg2 - arg0.anInt5657;
		} else if (arg0.aByte83 == 2) {
			arg0.anInt5639 = arg2 * arg0.anInt5657 >> 14;
		}
		@Pc(50) int local50 = arg0.anInt5630;
		if (arg0.aByte81 == 0) {
			arg0.anInt5630 = arg0.anInt5633;
		} else if (arg0.aByte81 == 1) {
			arg0.anInt5630 = arg3 - arg0.anInt5633;
		} else if (arg0.aByte81 == 2) {
			arg0.anInt5630 = arg3 * arg0.anInt5633 >> 14;
		}
		if (arg0.aByte83 == 4) {
			arg0.anInt5639 = arg0.anInt5630 * arg0.anInt5617 / arg0.anInt5588;
		}
		if (arg0.aByte81 == 4) {
			arg0.anInt5630 = arg0.anInt5639 * arg0.anInt5588 / arg0.anInt5617;
		}
		if (Static605.aBoolean708 && (Static82.method1754(arg0).anInt19 != 0 || arg0.anInt5643 == 0)) {
			if (arg0.anInt5630 < 5 && arg0.anInt5639 < 5) {
				arg0.anInt5639 = 5;
				arg0.anInt5630 = 5;
			} else {
				if (arg0.anInt5639 <= 0) {
					arg0.anInt5639 = 5;
				}
				if (arg0.anInt5630 <= 0) {
					arg0.anInt5630 = 5;
				}
			}
		}
		if (arg0.anInt5659 == Static62.anInt1560) {
			Static663.aClass208_14 = arg0;
		}
		if (arg1 && arg0.anObjectArray32 != null && (local8 != arg0.anInt5639 || local50 != arg0.anInt5630)) {
			@Pc(193) Class3_Sub13 local193 = new Class3_Sub13();
			local193.aClass208_2 = arg0;
			local193.anObjectArray1 = arg0.anObjectArray32;
			Static257.aClass193_27.method4462(local193);
		}
	}
}
