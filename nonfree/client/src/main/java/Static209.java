import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_40;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array9;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!mi;")
	public static Class75 aClass75_21 = new Class75();

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array79 = new Class50[100];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	public static void method3278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static24.anIntArray49[arg1] = arg0;
		@Pc(14) Class1_Sub18 local14 = (Class1_Sub18) Static4.aClass90_1.method2819((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub18(Static179.method2941() + 500L);
			Static4.aClass90_1.method2817(local14, (long) arg1);
		} else {
			local14.aLong109 = Static179.method2941() + 500L;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
	public static void method3279(@OriginalArg(0) byte arg0) {
		if (Static217.aByteArrayArrayArray14 == null) {
			Static217.aByteArrayArrayArray14 = new byte[4][104][104];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < 104; local22++) {
				for (@Pc(26) int local26 = 0; local26 < 104; local26++) {
					Static217.aByteArrayArrayArray14[local18][local22][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method3280() {
		System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
		System.exit(1);
	}
}
