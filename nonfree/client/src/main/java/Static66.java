import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
	public static int[] anIntArray135 = new int[5];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public static void method1201(@OriginalArg(0) int arg0) {
		if (!Static268.method4233(arg0)) {
			return;
		}
		@Pc(14) Class56[] local14 = Static262.aClass56ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(24) Class56 local24 = local14[local16];
			if (local24 != null) {
				local24.anInt2047 = 1;
				local24.anInt2095 = 0;
				local24.anInt2093 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)I")
	public static int method1202(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V")
	public static void method1204(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub8_Sub10 local4 = Static92.method1633(11, arg0);
		local4.method2043();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	public static void method1205() {
		if (Static80.anIntArray164 != null && Static290.anIntArray541 != null) {
			return;
		}
		Static80.anIntArray164 = new int[256];
		Static290.anIntArray541 = new int[256];
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			@Pc(32) double local32 = (double) local20 / 255.0D * 6.283185307179586D;
			Static80.anIntArray164[local20] = (int) (Math.sin(local32) * 4096.0D);
			Static290.anIntArray541[local20] = (int) (Math.cos(local32) * 4096.0D);
		}
	}
}
