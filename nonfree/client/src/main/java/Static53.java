import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt1015;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean80 = true;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public static void method902(@OriginalArg(1) int arg0) {
		Static75.anInt1427 = arg0;
		Static140.anInt2753 = -1;
		Static140.anInt2753 = -1;
		Static97.method1402();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method904() {
		@Pc(8) Container local8;
		if (Static75.aFrame1 != null) {
			local8 = Static75.aFrame1;
		} else if (Static78.aFrame2 == null) {
			local8 = Static117.aClass117_3.anApplet1;
		} else {
			local8 = Static78.aFrame2;
		}
		Static21.anInt417 = local8.getSize().width;
		Static302.anInt5720 = local8.getSize().height;
		@Pc(36) Insets local36;
		if (local8 == Static78.aFrame2) {
			local36 = Static78.aFrame2.getInsets();
			Static302.anInt5720 -= local36.top + local36.bottom;
			Static21.anInt417 -= local36.left + local36.right;
		}
		if (Static230.method3622() < 2) {
			Static159.anInt3348 = 765;
			Static109.anInt2179 = (Static21.anInt417 - 765) / 2;
			Static136.anInt2696 = 503;
			Static60.anInt1203 = 0;
		} else {
			Static109.anInt2179 = 0;
			Static60.anInt1203 = 0;
			Static159.anInt3348 = Static21.anInt417;
			Static136.anInt2696 = Static302.anInt5720;
		}
		if (Static291.aBoolean404) {
			Static291.method4314(Static159.anInt3348, Static136.anInt2696);
		}
		Static304.aCanvas1.setSize(Static159.anInt3348, Static136.anInt2696);
		if (local8 == Static78.aFrame2) {
			local36 = Static78.aFrame2.getInsets();
			Static304.aCanvas1.setLocation(Static109.anInt2179 + local36.left, local36.top + Static60.anInt1203);
		} else {
			Static304.aCanvas1.setLocation(Static109.anInt2179, Static60.anInt1203);
		}
		if (Static287.anInt5450 != -1) {
			Static118.method1924(true);
		}
		Static231.method3665();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I")
	public static int method905(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lclient!nk;)V")
	public static void method907(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20[] arg1) {
		Static141.aClass1_Sub20ArrayArray3[arg0] = arg1;
	}
}
