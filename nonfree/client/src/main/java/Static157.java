import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1073 = Static186.method3527("Allocated memory");

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
	public static int anInt3238 = 1;

	@OriginalMember(owner = "client!ok", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1074 = Static186.method3527("runes");

	@OriginalMember(owner = "client!ok", name = "xb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1075 = aClass50_1073;

	@OriginalMember(owner = "client!ok", name = "Eb", descriptor = "Lclient!qc;")
	public static Class90 aClass90_19 = new Class90(8);

	@OriginalMember(owner = "client!ok", name = "Jb", descriptor = "I")
	public static int anInt3267 = 0;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	public static void method2602() {
		Static200.aClass1_Sub1_Sub8Array8 = null;
		Static212.aClass78Array8 = null;
		Static155.aClass78Array5 = null;
		Static82.aClass78Array2 = null;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
	public static void method2603() {
		Static144.aClass90_13.method2818();
		Static192.aClass121_4.method3376();
		Static47.aClass121_2.method3376();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!pa;I)I")
	public static int method2613(@OriginalArg(0) Class86 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3322(Static153.anInt3179)) {
			local10++;
		}
		if (arg0.method3322(Static73.anInt3190)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "(I)V")
	public static void method2620() {
		if (!Static79.method2552() && Static185.anInt3848 != Static212.anInt4195) {
			Static2.method45(Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], Static201.anInt4067, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static212.anInt4195, Static11.anInt230);
		} else if (Static212.anInt4195 != Static199.anInt4000) {
			Static199.anInt4000 = Static212.anInt4195;
			Static126.method2028(Static212.anInt4195);
			Static49.method763();
		}
	}
}
