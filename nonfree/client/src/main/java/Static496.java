import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	public static int anInt8367;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray14 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void method7310() {
		if (Static471.anIntArray505 != null && Static510.anIntArray636 != null) {
			return;
		}
		Static510.anIntArray636 = new int[256];
		Static471.anIntArray505 = new int[256];
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(35) double local35 = (double) local26 / 255.0D * 6.283185307179586D;
			Static471.anIntArray505[local26] = (int) (Math.sin(local35) * 4096.0D);
			Static510.anIntArray636[local26] = (int) (Math.cos(local35) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public static void method7311() {
		if (!Static508.aBoolean255) {
			Static620.aFloat195 += (-24.0F - Static620.aFloat195) / 2.0F;
			Static508.aBoolean255 = true;
			Static114.aBoolean195 = true;
		}
	}
}
