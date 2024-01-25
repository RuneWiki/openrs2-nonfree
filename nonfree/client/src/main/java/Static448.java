import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!cg;")
	public static Class38 aClass38_4;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public static int anInt6973;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!ph;")
	public static Class187 aClass187_123;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "[I")
	public static final int[] anIntArray680 = new int[5];

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "[I")
	public static final int[] anIntArray681 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!cd;")
	public static final Class36 aClass36_13 = new Class36("", 16);

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	public static void method5473() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static432.aBooleanArray24[local3] = true;
		}
	}
}
