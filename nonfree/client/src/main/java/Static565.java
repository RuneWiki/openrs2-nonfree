import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_85 = new Class181(49, 6);

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "[I")
	public static final int[] anIntArray717 = new int[14];

	@OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
	public static int anInt9287 = 0;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IZ)V")
	public static void method7926(@OriginalArg(0) int arg0) {
		if (Static292.anInt4716 == arg0) {
			return;
		}
		Static111.anInt1752 = Static279.anInt4567 = Static220.anIntArray308[arg0];
		Static587.method8246();
		Static56.anIntArrayArray5 = new int[Static111.anInt1752][Static279.anInt4567];
		Static414.anIntArrayArrayArray10 = new int[4][Static111.anInt1752 >> 3][Static279.anInt4567 >> 3];
		Static574.anIntArrayArray58 = new int[Static111.anInt1752][Static279.anInt4567];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static308.aClass182Array1[local36] = Static488.method7155(Static111.anInt1752, Static279.anInt4567);
		}
		Static479.aByteArrayArrayArray21 = new byte[4][Static111.anInt1752][Static279.anInt4567];
		Static191.method3043(Static111.anInt1752, Static279.anInt4567);
		Static299.method4347(Static279.anInt4567 >> 3, Static485.aClass126_17, Static111.anInt1752 >> 3);
		Static292.anInt4716 = arg0;
	}
}
