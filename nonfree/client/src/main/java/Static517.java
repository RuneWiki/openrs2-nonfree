import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public static int anInt8884 = 0;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt8886 = 0;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
	public static final int[] anIntArray461 = new int[6];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	public static void method7660() {
		Static595.aClass317_66.method7873();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method7662() {
		if (Static624.aByteArray106 != null) {
			Static429.method6443();
		} else if (Static325.anInt5631 == -1) {
			Static602.method8508(Static314.aString72, Static187.aString36);
		} else {
			Static509.method7629();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBII)V")
	public static void method7663(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static680.aFloat210 = (float) local15;
		if (Static304.anInt5410 == 2) {
			Static470.anInt8100 = 0;
			Static669.anInt10940 = local11;
			Static126.anInt9524 = local15;
		}
		Static139.aFloat16 = (float) local11;
		Static54.method988();
		Static5.aBoolean5 = true;
	}
}
