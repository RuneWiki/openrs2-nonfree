import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_102 = new Class84("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Z")
	public static boolean aBoolean484 = false;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_103 = new Class84("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!pp;IIII)V")
	public static void method5892(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static45.method765(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static377.anInt6467) {
			Static45.method765(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static45.method765(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static378.anInt6480) {
			Static45.method765(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static378.anInt6480) {
			Static45.method765(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static377.anInt6467 && arg4 <= Static378.anInt6480) {
			Static45.method765(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static45.method765(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static377.anInt6467 && arg4 > 0) {
			Static45.method765(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5893(@OriginalArg(1) String arg0) {
		Static130.method1888("", 0, 0, arg0, "");
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public static void method5895() {
		if (Static12.anIntArray19 != null && Static292.anIntArray372 != null) {
			return;
		}
		Static292.anIntArray372 = new int[256];
		Static12.anIntArray19 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static12.anIntArray19[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static292.anIntArray372[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}
}
