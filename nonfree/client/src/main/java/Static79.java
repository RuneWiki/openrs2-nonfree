import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Ljava/awt/Image;")
	public static Image anImage43;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
	public static int anInt6694 = 0;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_109 = new Class37(50);

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString272 = "K";

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "[I")
	public static final int[] anIntArray672 = new int[1024];

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
	public static int anInt6704 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIIIIIFI)[[I")
	public static int[][] method5803(@OriginalArg(7) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub5_Sub6 local13 = new Class1_Sub5_Sub6();
		local13.anInt1698 = 8;
		local13.anInt1688 = 4;
		local13.anInt1694 = 3;
		local13.aBoolean119 = false;
		local13.anInt1696 = (int) (arg0 * 4096.0F);
		local13.method5801();
		Static91.method1439(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method1427(local9[local48], local48);
		}
		return local9;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V")
	public static void method5804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class207 local10 = new Class207(16);
		for (@Pc(15) Class1_Sub17 local15 = (Class1_Sub17) Static98.aClass207_12.method5560(); local15 != null; local15 = (Class1_Sub17) Static98.aClass207_12.method5559()) {
			local15.method5796();
			@Pc(26) int local26 = (int) (local15.aLong214 >> 28);
			@Pc(37) int local37 = (int) (local15.aLong214 >> 14 & 0x3FFFL) - arg1;
			@Pc(46) int local46 = (int) (local15.aLong214 & 0x3FFFL) - arg0;
			if (local46 >= 0 && local37 >= 0 && local46 < Static43.anInt1151 && Static260.anInt5348 > local37) {
				local10.method5552(local15, (long) (local37 << 14 | local26 << 28 | local46));
			}
		}
		Static98.aClass207_12 = local10;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method5808() {
		@Pc(5) Class75 local5 = Static61.aClass75_1;
		synchronized (Static61.aClass75_1) {
			Static61.aClass75_1.method1459();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
	public static void method5813(@OriginalArg(0) int arg0) {
		Static8.anInt111 = arg0;
		Static83.aClass37_31.method919();
	}
}
