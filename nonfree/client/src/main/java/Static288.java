import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public static int anInt5766 = -1;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_11 = new Class88(64);

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "[S")
	public static final short[] aShortArray100 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIB)V")
	public static void method5030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= Static41.anInt1131 && arg2 <= Static165.anInt3409) {
			@Pc(15) int local15 = Static54.method1088(Static60.anInt1399, arg3, Static138.anInt6334);
			@Pc(21) int local21 = Static54.method1088(Static60.anInt1399, arg1, Static138.anInt6334);
			Static117.method1844(arg0, local15, arg2, local21);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method5031(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static80.method5798(arg0, arg1, arg0.length - 1, 0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([[IZ)V")
	public static void method5032(@OriginalArg(0) int[][] arg0) {
		Static319.anIntArrayArray31 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I")
	public static int method5033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	public static void method5034() {
		if (Static244.aBoolean511) {
			return;
		}
		Static209.aBoolean344 = true;
		if (Static317.aBoolean521) {
			Static318.aFloat77 = (int) Static318.aFloat77 - 17 & 0xFFFFFFF0;
		} else {
			Static81.aFloat8 += (-Static81.aFloat8 - 12.0F) / 2.0F;
		}
		Static244.aBoolean511 = true;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method5035(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(17) int local17 = arg2.indexOf(arg0); local17 != -1; local17 = arg2.indexOf(arg0, local17 + arg1.length())) {
			arg2 = arg2.substring(0, local17) + arg1 + arg2.substring(local17 + arg0.length());
		}
		return arg2;
	}
}
