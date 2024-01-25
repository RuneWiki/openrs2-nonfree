import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!tfa", name = "j", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas9;

	@OriginalMember(owner = "client!tfa", name = "q", descriptor = "Lclient!nr;")
	public static Class241 aClass241_5;

	@OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
	public static int anInt4149;

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!tfa", name = "l", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_123 = new Class235(48, -2);

	@OriginalMember(owner = "client!tfa", name = "o", descriptor = "Lclient!uc;")
	public static final Class324 aClass324_18 = new Class324("", 12);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIII)V")
	public static void method3356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static505.anInt8616 == 1) {
			Static172.aClass22Array11[Static576.anInt9487 / 100].method7662(Static497.anInt6024 - 8, Static12.anInt5207 + -8);
		}
		if (Static505.anInt8616 == 2) {
			Static172.aClass22Array11[Static576.anInt9487 / 100 + 4].method7662(Static497.anInt6024 - 8, Static12.anInt5207 + -8);
		}
		Static543.method7406();
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)V")
	public static void method3357() {
		if (Static508.anIntArray651 != null && Static359.anIntArray435 != null) {
			return;
		}
		Static359.anIntArray435 = new int[256];
		Static508.anIntArray651 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static508.anIntArray651[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static359.anIntArray435[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
