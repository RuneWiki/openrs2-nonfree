import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
	public static int anInt9347;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public static final int anInt9349 = 1405;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "[I")
	public static final int[] anIntArray698 = new int[14];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZII)Z")
	public static boolean method7639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public static void method7641() {
		if (Static435.anIntArray543 != null && Static300.anIntArray410 != null) {
			return;
		}
		Static435.anIntArray543 = new int[256];
		Static300.anIntArray410 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static435.anIntArray543[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static300.anIntArray410[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
