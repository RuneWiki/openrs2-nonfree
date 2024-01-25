import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!dh;")
	public static Class71 aClass71_103;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
	public static boolean aBoolean567 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)I")
	public static int method6518(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = Static105.anInt2774;
		if (local11 == 0) {
			return arg0 ? 0 : Static384.anInt7465;
		} else if (local11 == 1) {
			return Static384.anInt7465;
		} else if (local11 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	public static int method6519() {
		return Static609.aClass42_3.method1402();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method6520() {
		Static572.aClass236_98.method6245();
		Static529.aClass236_87.method6245();
		Static385.aClass236_99.method6245();
		Static479.aClass236_80.method6245();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	public static void method6522(@OriginalArg(0) int arg0) {
		Static344.anInt6676 = arg0;
		@Pc(15) Class236 local15 = Static120.aClass236_20;
		synchronized (Static120.aClass236_20) {
			Static120.aClass236_20.method6253();
		}
		local15 = Static438.aClass236_75;
		synchronized (Static438.aClass236_75) {
			Static438.aClass236_75.method6253();
		}
	}
}
