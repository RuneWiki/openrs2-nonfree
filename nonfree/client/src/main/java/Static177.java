import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!im", name = "C", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_78 = new Class129(58, -2);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!fi;IIZ)V")
	public static void method2451(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg1.anInt2127;
		@Pc(11) int local11 = arg1.anInt2106;
		if (arg1.aByte17 == 0) {
			arg1.anInt2127 = arg1.anInt2075;
		} else if (arg1.aByte17 == 1) {
			arg1.anInt2127 = arg0 - arg1.anInt2075;
		} else if (arg1.aByte17 == 2) {
			arg1.anInt2127 = arg0 * arg1.anInt2075 >> 14;
		}
		if (arg1.aByte19 == 0) {
			arg1.anInt2106 = arg1.anInt2077;
		} else if (arg1.aByte19 == 1) {
			arg1.anInt2106 = arg2 - arg1.anInt2077;
		} else if (arg1.aByte19 == 2) {
			arg1.anInt2106 = arg1.anInt2077 * arg2 >> 14;
		}
		if (arg1.aByte17 == 4) {
			arg1.anInt2127 = arg1.anInt2106 * arg1.anInt2104 / arg1.anInt2098;
		}
		if (arg1.aByte19 == 4) {
			arg1.anInt2106 = arg1.anInt2127 * arg1.anInt2098 / arg1.anInt2104;
		}
		if (Static97.aBoolean113 && (Static55.method885(arg1).anInt6805 != 0 || arg1.anInt2060 == 0)) {
			if (arg1.anInt2106 < 5 && arg1.anInt2127 < 5) {
				arg1.anInt2127 = 5;
				arg1.anInt2106 = 5;
			} else {
				if (arg1.anInt2106 <= 0) {
					arg1.anInt2106 = 5;
				}
				if (arg1.anInt2127 <= 0) {
					arg1.anInt2127 = 5;
				}
			}
		}
		if (arg1.anInt2107 == Static49.anInt898) {
			Static54.aClass76_3 = arg1;
		}
		if (arg3 && arg1.anObjectArray23 != null && (arg1.anInt2127 != local8 || local11 != arg1.anInt2106)) {
			@Pc(194) Class5_Sub33 local194 = new Class5_Sub33();
			local194.aClass76_12 = arg1;
			local194.anObjectArray35 = arg1.anObjectArray23;
			Static250.aClass177_26.method3615(local194);
		}
	}
}
