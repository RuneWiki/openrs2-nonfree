import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array86;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method3137() {
		if (Static417.anInt1445 != -1) {
			Static381.method4864(-1, false, -1, Static417.anInt1445);
			Static417.anInt1445 = -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLclient!vg;II)V")
	public static void method3138(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = arg2.anInt7041;
		if (arg2.aByte99 == 0) {
			arg2.anInt7041 = arg2.anInt7022;
		} else if (arg2.aByte99 == 1) {
			arg2.anInt7041 = arg3 - arg2.anInt7022;
		} else if (arg2.aByte99 == 2) {
			arg2.anInt7041 = arg3 * arg2.anInt7022 >> 14;
		}
		@Pc(50) int local50 = arg2.anInt6997;
		if (arg2.aByte101 == 0) {
			arg2.anInt6997 = arg2.anInt6974;
		} else if (arg2.aByte101 == 1) {
			arg2.anInt6997 = arg0 - arg2.anInt6974;
		} else if (arg2.aByte101 == 2) {
			arg2.anInt6997 = arg2.anInt6974 * arg0 >> 14;
		}
		if (arg2.aByte99 == 4) {
			arg2.anInt7041 = arg2.anInt7034 * arg2.anInt6997 / arg2.anInt6967;
		}
		if (arg2.aByte101 == 4) {
			arg2.anInt6997 = arg2.anInt6967 * arg2.anInt7041 / arg2.anInt7034;
		}
		if (Static419.aBoolean556 && (Static52.method804(arg2).anInt2172 != 0 || arg2.anInt7009 == 0)) {
			if (arg2.anInt6997 < 5 && arg2.anInt7041 < 5) {
				arg2.anInt6997 = 5;
				arg2.anInt7041 = 5;
			} else {
				if (arg2.anInt7041 <= 0) {
					arg2.anInt7041 = 5;
				}
				if (arg2.anInt6997 <= 0) {
					arg2.anInt6997 = 5;
				}
			}
		}
		if (Static363.anInt6140 == arg2.anInt6983) {
			Static298.aClass250_7 = arg2;
		}
		if (arg1 && arg2.anObjectArray35 != null && (arg2.anInt7041 != local8 || local50 != arg2.anInt6997)) {
			@Pc(192) Class1_Sub31 local192 = new Class1_Sub31();
			local192.aClass250_8 = arg2;
			local192.anObjectArray5 = arg2.anObjectArray35;
			Static6.aClass254_1.method5430(local192);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public static void method3139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class82 local7 = Static159.aClass82ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass20_Sub4_1 != null) {
			local7.aClass20_Sub4_1 = null;
		}
		if (local7.aClass20_Sub4_2 != null) {
			local7.aClass20_Sub4_2 = null;
		}
	}
}
