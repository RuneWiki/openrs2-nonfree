import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Lclient!vu;")
	public static Class260 aClass260_9;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!wi", name = "B", descriptor = "Lclient!wg;")
	public static Class265 aClass265_5;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_158 = new Class211(111, 4);

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	public static int anInt7168 = -1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIB)V")
	public static void method5635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static253.aByteArrayArrayArray11 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)Z")
	public static boolean method5637(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
	public static void method5638(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub5_Sub11 local16 = Static316.method4316(10, arg0);
		local16.method3101();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZ)V")
	public static void method5639(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) Class2_Sub36 local16 = Static382.method4911(arg1, arg0);
		if (local16 != null) {
			for (@Pc(21) int local21 = 0; local21 < local16.anIntArray395.length; local21++) {
				local16.anIntArray395[local21] = -1;
				local16.anIntArray396[local21] = 0;
			}
		}
	}
}
