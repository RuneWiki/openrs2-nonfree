import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!ula", name = "a", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_197 = new Class225(48, 6);

	@OriginalMember(owner = "client!ula", name = "c", descriptor = "Z")
	public static final boolean aBoolean884 = false;

	@OriginalMember(owner = "client!ula", name = "b", descriptor = "(I)V")
	public static void method8957() {
		if (Static611.anIntArray688 != null && Static519.anIntArray590 != null) {
			return;
		}
		Static519.anIntArray590 = new int[256];
		Static611.anIntArray688 = new int[256];
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(33) double local33 = (double) local24 / 255.0D * 6.283185307179586D;
			Static611.anIntArray688[local24] = (int) (Math.sin(local33) * 4096.0D);
			Static519.anIntArray590[local24] = (int) (Math.cos(local33) * 4096.0D);
		}
	}
}
