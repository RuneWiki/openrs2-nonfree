import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
	public static int anInt9367;

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "[I")
	public static final int[] anIntArray534 = new int[4];

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)I")
	public static int method7214() {
		@Pc(12) Class7 local12 = Static39.aClass7_2;
		@Pc(14) boolean local14 = false;
		if (Static453.anInt8614 != 0) {
			@Pc(20) Canvas local20 = new Canvas();
			local20.setSize(100, 100);
			local12 = Static447.method7798(0, null, local20, 0, null);
			local14 = true;
		}
		@Pc(37) long local37 = Static112.method2047();
		for (@Pc(39) int local39 = 0; local39 < 10000; local39++) {
			local12.method7841();
		}
		@Pc(64) int local64 = (int) (Static112.method2047() - local37);
		local12.method7825(100, 100, 0, -16777216, 0);
		if (local14) {
			local12.method7792();
		}
		return local64;
	}

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "(I)Lclient!bp;")
	public static Class40 method7216() {
		try {
			return (Class40) Class.forName("Class40_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
