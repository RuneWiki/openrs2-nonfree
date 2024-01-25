import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_46 = new Class216();

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "S")
	public static short aShort93 = 320;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!on;IZB)V")
	public static void method5994(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) int local8 = arg1.anInt4468;
		if (arg1.aByte37 == 0) {
			arg1.anInt4468 = arg1.anInt4451;
		} else if (arg1.aByte37 == 1) {
			arg1.anInt4468 = arg0 - arg1.anInt4451;
		} else if (arg1.aByte37 == 2) {
			arg1.anInt4468 = arg1.anInt4451 * arg0 >> 14;
		}
		@Pc(52) int local52 = arg1.anInt4414;
		if (arg1.aByte36 == 0) {
			arg1.anInt4414 = arg1.anInt4436;
		} else if (arg1.aByte36 == 1) {
			arg1.anInt4414 = arg2 - arg1.anInt4436;
		} else if (arg1.aByte36 == 2) {
			arg1.anInt4414 = arg2 * arg1.anInt4436 >> 14;
		}
		if (arg1.aByte37 == 4) {
			arg1.anInt4468 = arg1.anInt4422 * arg1.anInt4414 / arg1.anInt4488;
		}
		if (arg1.aByte36 == 4) {
			arg1.anInt4414 = arg1.anInt4488 * arg1.anInt4468 / arg1.anInt4422;
		}
		if (Static300.aBoolean520 && (Static43.method1056(arg1).anInt478 != 0 || arg1.anInt4419 == 0)) {
			if (arg1.anInt4414 < 5 && arg1.anInt4468 < 5) {
				arg1.anInt4468 = 5;
				arg1.anInt4414 = 5;
			} else {
				if (arg1.anInt4414 <= 0) {
					arg1.anInt4414 = 5;
				}
				if (arg1.anInt4468 <= 0) {
					arg1.anInt4468 = 5;
				}
			}
		}
		if (arg1.anInt4440 == 1337) {
			Static120.aClass146_9 = arg1;
		}
		if (arg3 && arg1.anObjectArray26 != null && (arg1.anInt4468 != local8 || arg1.anInt4414 != local52)) {
			@Pc(198) Class2_Sub44 local198 = new Class2_Sub44();
			local198.aClass146_18 = arg1;
			local198.anObjectArray35 = arg1.anObjectArray26;
			aClass216_46.method5995(local198);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)V")
	public static void method6002() {
		@Pc(5) Class119 local5 = Static32.aClass119_18;
		synchronized (Static32.aClass119_18) {
			Static32.aClass119_18.method3315(5);
		}
	}
}
