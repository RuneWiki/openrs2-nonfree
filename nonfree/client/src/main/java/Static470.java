import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Lclient!iga;")
	public static Class176 aClass176_2;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
	public static int anInt7566 = -1;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLclient!tt;)V")
	public static void method6734(@OriginalArg(1) Class2_Sub6_Sub20 arg0) {
		if (arg0 == null) {
			return;
		}
		Static273.aClass60_88.method1233(arg0);
		Static535.anInt8486++;
		@Pc(42) Class2_Sub6_Sub7 local42;
		if (arg0.aBoolean828 || "".equals(arg0.aString106)) {
			local42 = new Class2_Sub6_Sub7(arg0.aString106);
			Static7.anInt82++;
		} else {
			@Pc(50) long local50 = arg0.aLong303;
			for (local42 = (Class2_Sub6_Sub7) Static678.aClass218_43.method5095(local50, 0); local42 != null && !local42.aString51.equals(arg0.aString106); local42 = (Class2_Sub6_Sub7) Static678.aClass218_43.method5100((byte) 117)) {
			}
			if (local42 == null) {
				local42 = (Class2_Sub6_Sub7) Static279.aClass85_31.method1737(local50);
				if (local42 != null && !local42.aString51.equals(arg0.aString106)) {
					local42 = null;
				}
				if (local42 == null) {
					local42 = new Class2_Sub6_Sub7(arg0.aString106);
				}
				Static678.aClass218_43.method5099(local42, local50);
				Static7.anInt82++;
			}
		}
		if (local42.method4061(arg0)) {
			Static681.method9204(local42);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I")
	public static int method6736() {
		return Static585.anInt9211;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	public static void method6737() {
		Static506.method7169();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static626.aClass226Array1[local8].method5280();
		}
		Static145.method2135();
		Static248.method3462();
		Static7.method97();
		System.gc();
		Static396.aClass145_6.ya();
	}
}
