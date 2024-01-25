import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "J")
	public static long aLong51;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!om;")
	public static Class246 aClass246_44;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_50 = new Class272(5, 3);

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public static int anInt2013 = -50;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method1727() {
		Static564.aClass46_32 = null;
		Static238.anInt4475 = -1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method1728() {
		if (Static88.anIntArray140 != null && Static548.anIntArray648 != null) {
			return;
		}
		Static88.anIntArray140 = new int[256];
		Static548.anIntArray648 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static88.anIntArray140[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static548.anIntArray648[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!fa;IILjava/awt/Canvas;Lclient!om;)Lclient!r;")
	public static Class43 method1730(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class246 arg3) {
		if (!Static71.method1657()) {
			throw new RuntimeException("");
		} else if (Static557.method7419("jaggl")) {
			@Pc(26) OpenGL local26 = new OpenGL();
			@Pc(36) long local36 = local26.init(arg2, 8, 8, 8, 24, 0, arg1);
			if (local36 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(57) Class43_Sub1_Sub2 local57 = new Class43_Sub1_Sub2(local26, arg2, local36, arg0, arg3, arg1);
			local57.method4280();
			return local57;
		} else {
			throw new RuntimeException("");
		}
	}
}
