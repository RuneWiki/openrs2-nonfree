import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!ia;")
	public static Class116 aClass116_5;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Z")
	public static boolean aBoolean455 = false;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[Ljava/lang/String;BI)Ljava/lang/String;")
	public static String method5290(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(21) String local21 = arg1[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg0;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg2; local36 < local32; local36++) {
				@Pc(42) String local42 = arg1[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(61) StringBuffer local61 = new StringBuffer(local34);
			for (@Pc(63) int local63 = arg2; local63 < local32; local63++) {
				@Pc(69) String local69 = arg1[local63];
				if (local69 == null) {
					local61.append("null");
				} else {
					local61.append(local69);
				}
			}
			return local61.toString();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)I")
	public static int method5291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static17.anIntArray36[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
	public static void method5292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static416.aFloat208 = local11;
		Static146.aFloat82 = local15;
		if (Static134.anInt2621 == 2) {
			Static185.anInt6759 = 0;
			Static183.anInt3503 = local11;
			Static142.anInt2687 = local15;
		}
		Static449.method5768();
		Static280.aBoolean347 = true;
	}
}
