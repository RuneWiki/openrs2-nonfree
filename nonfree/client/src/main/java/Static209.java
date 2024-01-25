import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray149;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
	public static int anInt7824;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray212 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
	public static final int[] anIntArray688 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public static void method6067() {
		Static322.anInt5636 = -1;
		Static280.aClass80_12 = null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLclient!kj;Ljava/lang/String;ZB)V")
	public static void method6068(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg0) {
			Static185.method2824(arg1, arg2, 3);
			return;
		}
		@Pc(22) String local22;
		if (Static210.aString25.startsWith("win") && Static210.anInt3860 != 3) {
			local22 = null;
			if (arg1.anApplet1 != null) {
				local22 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(42) Class100 local42 = Static185.method2824(arg1, arg2, 0);
				Static230.aClass138_2 = arg1;
				Static238.aString35 = arg2;
				Static227.aClass100_7 = local42;
				return;
			}
		}
		if (Static210.aString25.startsWith("mac")) {
			local22 = null;
			if (arg1.anApplet1 != null) {
				local22 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg3) {
				Static185.method2824(arg1, arg2, 1);
				return;
			}
		}
		Static185.method2824(arg1, arg2, 2);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIBIII)V")
	public static void method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static452.method6064(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(28) int local28 = arg1;
		@Pc(31) int local31 = -arg1;
		@Pc(33) int local33 = local15;
		@Pc(36) int local36 = -local15;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static59.anIntArrayArray34[arg0];
		@Pc(49) int local49 = arg3 - local15;
		@Pc(53) int local53 = local15 + arg3;
		Static217.method3280(local44, arg3 - arg1, arg5, local49);
		Static217.method3280(local44, local49, arg2, local53);
		Static217.method3280(local44, local53, arg5, arg1 + arg3);
		while (local28 > local10) {
			local38 += 2;
			local40 += 2;
			local31 += local38;
			local36 += local40;
			if (local36 >= 0 && local33 >= 1) {
				Static387.anIntArray560[local33] = local10;
				local33--;
				local36 -= local33 << 1;
			}
			local10++;
			@Pc(127) int[] local127;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(148) int local148;
			@Pc(152) int local152;
			@Pc(157) int local157;
			if (local31 >= 0) {
				local28--;
				if (local28 < local15) {
					local127 = Static59.anIntArrayArray34[arg0 + local28];
					local134 = Static59.anIntArrayArray34[arg0 - local28];
					local138 = Static387.anIntArray560[local28];
					local143 = arg3 + local10;
					local148 = arg3 - local10;
					local152 = arg3 + local138;
					local157 = arg3 - local138;
					Static217.method3280(local127, local148, arg5, local157);
					Static217.method3280(local127, local157, arg2, local152);
					Static217.method3280(local127, local152, arg5, local143);
					Static217.method3280(local134, local148, arg5, local157);
					Static217.method3280(local134, local157, arg2, local152);
					Static217.method3280(local134, local152, arg5, local143);
				} else {
					local127 = Static59.anIntArrayArray34[local28 + arg0];
					local134 = Static59.anIntArrayArray34[arg0 - local28];
					local138 = local10 + arg3;
					local143 = arg3 - local10;
					Static217.method3280(local127, local143, arg5, local138);
					Static217.method3280(local134, local143, arg5, local138);
				}
				local31 -= local28 << 1;
			}
			local127 = Static59.anIntArrayArray34[local10 + arg0];
			local134 = Static59.anIntArrayArray34[arg0 - local10];
			local138 = local28 + arg3;
			local143 = arg3 - local28;
			if (local10 >= local15) {
				Static217.method3280(local127, local143, arg5, local138);
				Static217.method3280(local134, local143, arg5, local138);
			} else {
				local148 = local10 > local33 ? Static387.anIntArray560[local10] : local33;
				local152 = local148 + arg3;
				local157 = arg3 - local148;
				Static217.method3280(local127, local143, arg5, local157);
				Static217.method3280(local127, local157, arg2, local152);
				Static217.method3280(local127, local152, arg5, local138);
				Static217.method3280(local134, local143, arg5, local157);
				Static217.method3280(local134, local157, arg2, local152);
				Static217.method3280(local134, local152, arg5, local138);
			}
		}
	}
}
