import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_75 = new Class205(49, -1);

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_46 = new Class32("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)I")
	public static int method3208() {
		if ((double) Static338.aFloat52 == 3.0D) {
			return 37;
		} else if ((double) Static338.aFloat52 == 4.0D) {
			return 50;
		} else if ((double) Static338.aFloat52 == 6.0D) {
			return 75;
		} else if ((double) Static338.aFloat52 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZLclient!ae;B)V")
	public static void method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class4 arg3) {
		@Pc(8) int local8 = arg3.anInt101;
		if (arg3.aByte1 == 0) {
			arg3.anInt101 = arg3.anInt114;
		} else if (arg3.aByte1 == 1) {
			arg3.anInt101 = arg0 - arg3.anInt114;
		} else if (arg3.aByte1 == 2) {
			arg3.anInt101 = arg0 * arg3.anInt114 >> 14;
		}
		@Pc(50) int local50 = arg3.anInt113;
		if (arg3.aByte2 == 0) {
			arg3.anInt113 = arg3.anInt96;
		} else if (arg3.aByte2 == 1) {
			arg3.anInt113 = arg1 - arg3.anInt96;
		} else if (arg3.aByte2 == 2) {
			arg3.anInt113 = arg1 * arg3.anInt96 >> 14;
		}
		if (arg3.aByte1 == 4) {
			arg3.anInt101 = arg3.anInt113 * arg3.anInt89 / arg3.anInt63;
		}
		if (arg3.aByte2 == 4) {
			arg3.anInt113 = arg3.anInt63 * arg3.anInt101 / arg3.anInt89;
		}
		if (Static226.aBoolean445 && (Static45.method784(arg3).anInt750 != 0 || arg3.anInt125 == 0)) {
			if (arg3.anInt113 < 5 && arg3.anInt101 < 5) {
				arg3.anInt113 = 5;
				arg3.anInt101 = 5;
			} else {
				if (arg3.anInt113 <= 0) {
					arg3.anInt113 = 5;
				}
				if (arg3.anInt101 <= 0) {
					arg3.anInt101 = 5;
				}
			}
		}
		if (arg3.anInt133 == Static150.anInt2971) {
			Static68.aClass4_8 = arg3;
		}
		if (arg2 && arg3.anObjectArray15 != null && (arg3.anInt101 != local8 || arg3.anInt113 != local50)) {
			@Pc(191) Class2_Sub22 local191 = new Class2_Sub22();
			local191.aClass4_15 = arg3;
			local191.anObjectArray33 = arg3.anObjectArray15;
			Static206.aClass30_29.method685(local191);
		}
	}
}
