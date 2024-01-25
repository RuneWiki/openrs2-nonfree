import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!cm", name = "Y", descriptor = "Lclient!la;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!cm", name = "L", descriptor = "[B")
	public static final byte[] aByteArray9 = new byte[2048];

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "[I")
	public static final int[] anIntArray46 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)V")
	public static void method924() {
		Static57.method934();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static217.aClass197_2 == Static369.aClass197_4) {
			if (!Static159.method2246(-2, 1, 0, arg1, 1, false, arg0, 0)) {
				Static159.method2246(-3, 1, 0, arg1, 1, false, arg0, 0);
			}
		} else if (!Static159.method2246(-3, 1, 0, arg1, 1, false, arg0, 0)) {
			Static159.method2246(-2, 1, 0, arg1, 1, false, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(Z)V")
	public static void method929() {
		if (Static451.anIntArray501 != null && Static412.anIntArray467 != null) {
			return;
		}
		Static451.anIntArray501 = new int[256];
		Static412.anIntArray467 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static451.anIntArray501[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static412.anIntArray467[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)V")
	public static void method930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub2_Sub9 local13 = Static72.method1073(6, arg0);
		local13.method3026();
		local13.anInt3818 = arg1;
	}
}
