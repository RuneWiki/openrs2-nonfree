import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "Lclient!uu;")
	public static Class250 aClass250_55;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	public static int anInt3334 = 0;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "[S")
	public static final short[] aShortArray46 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZLjava/lang/Object;)[B")
	public static byte[] method2856(@OriginalArg(0) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static264.method3662(arg0, local18);
		} else if (arg1 instanceof Class207) {
			@Pc(30) Class207 local30 = (Class207) arg1;
			return local30.method6071(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lclient!ga;")
	public static Class82 method2857(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static298.aClass82ArrayArray2[local7] == null || Static298.aClass82ArrayArray2[local7][local16] == null) {
			@Pc(30) boolean local30 = Static163.method5702(local7);
			if (!local30) {
				return null;
			}
		}
		return Static298.aClass82ArrayArray2[local7][local16];
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)Z")
	public static boolean method2862(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)V")
	public static void method2864(@OriginalArg(1) int arg0) {
		Static204.anIntArray311 = new int[arg0];
		Static256.anIntArray280 = new int[arg0];
		Static124.anIntArray113 = new int[arg0];
		Static123.anIntArray103 = new int[arg0];
		Static130.anIntArray120 = new int[arg0];
	}
}
