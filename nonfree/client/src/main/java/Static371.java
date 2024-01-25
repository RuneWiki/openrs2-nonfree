import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lclient!pl;")
	public static Class63 method5979() {
		try {
			return (Class63) Class.forName("Class63_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	public static void method5980() {
		if (Static494.anIntArray759 != null && Static246.anIntArray361 != null) {
			return;
		}
		Static246.anIntArray361 = new int[256];
		Static494.anIntArray759 = new int[256];
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(19) double local19 = (double) local11 / 255.0D * 6.283185307179586D;
			Static494.anIntArray759[local11] = (int) (Math.sin(local19) * 4096.0D);
			Static246.anIntArray361[local11] = (int) (Math.cos(local19) * 4096.0D);
		}
	}
}
