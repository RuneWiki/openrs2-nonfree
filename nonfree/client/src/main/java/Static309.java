import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "[I")
	public static int[] anIntArray750;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!rk;")
	public static Class180 aClass180_87;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	public static int anInt5898 = 0;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString381 = " ";

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static final int anInt5901 = -9017772;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public static int anInt5902 = 0;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	public static void method5002() {
		@Pc(8) int[] local8 = new int[Static233.anInt4645];
		@Pc(10) int local10 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static233.anInt4645; local16++) {
			@Pc(22) Class138 local22 = Static17.method4472(local16);
			if (local22.anInt3964 >= 0 || local22.anInt3970 >= 0) {
				local8[local10++] = local16;
			}
		}
		Static326.anIntArray788 = new int[local10];
		for (@Pc(45) int local45 = 0; local45 < local10; local45++) {
			Static326.anIntArray788[local45] = local8[local45];
		}
	}
}
