import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static196 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt4275;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
	public static int anInt4273 = 0;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt4274 = 64;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt4277 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public static void method3128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static132.anInt3051 = Static87.aClass61ArrayArray1[arg1][arg0].anInt1942;
		Static216.anInt4667 = Static87.aClass61ArrayArray1[arg1][arg0].anInt1946;
		Static302.anInt6008 = Static87.aClass61ArrayArray1[arg1][arg0].anInt1938;
		Static180.method2903((float) Static132.anInt3051, (float) Static216.anInt4667, (float) Static302.anInt6008);
	}
}
