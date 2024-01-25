import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "A", descriptor = "Lclient!ac;")
	public static Class4 aClass4_3;

	@OriginalMember(owner = "client!al", name = "sb", descriptor = "Lclient!pg;")
	public static Interface6 anInterface6_1;

	@OriginalMember(owner = "client!al", name = "V", descriptor = "[I")
	public static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!sb;)V")
	public static void method178(@OriginalArg(1) Class22_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt5099 - Static212.anInt4234;
		@Pc(21) int local21 = arg0.anInt5119 * 128 + arg0.method4421() * 64;
		@Pc(32) int local32 = arg0.anInt5080 * 128 + arg0.method4421() * 64;
		arg0.anInt5973 += (local21 - arg0.anInt5973) / local9;
		arg0.anInt5967 += (local32 - arg0.anInt5967) / local9;
		arg0.anInt5146 = 0;
		if (arg0.anInt5113 == 0) {
			arg0.method4405(8192);
		}
		if (arg0.anInt5113 == 1) {
			arg0.method4405(12288);
		}
		if (arg0.anInt5113 == 2) {
			arg0.method4405(0);
		}
		if (arg0.anInt5113 == 3) {
			arg0.method4405(4096);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public static void method179() {
		@Pc(9) Class103 local9 = Static307.aClass103_63;
		synchronized (Static307.aClass103_63) {
			Static307.aClass103_63.method2684();
		}
		local9 = Static294.aClass103_68;
		synchronized (Static294.aClass103_68) {
			Static294.aClass103_68.method2684();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZZ)V")
	public static void method181(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			Static339.anInt6445--;
			if (Static339.anInt6445 == 0) {
				Static80.anIntArray288 = null;
			}
		}
		Static155.anInt3276--;
		if (Static155.anInt3276 == 0) {
			Static200.anIntArray548 = null;
		}
	}
}
