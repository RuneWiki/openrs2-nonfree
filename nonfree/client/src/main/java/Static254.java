import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "[I")
	public static final int[] anIntArray403 = new int[32];

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ra;B)V")
	public static void method4678(@OriginalArg(0) Class170 arg0) {
		Static72.aClass170_25 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public static void method4679() {
		for (@Pc(3) int local3 = 0; local3 < Static115.aClass6ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static115.aClass6ArrayArray1[local3].length; local7++) {
				Static115.aClass6ArrayArray1[local3][local7] = Static38.aClass6_2;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!am;Ljava/lang/String;ZZ)V")
	public static void method4680(@OriginalArg(1) Class10 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static21.method5515(arg0, 3, arg1);
			return;
		}
		@Pc(24) String local24;
		if (Static11.aString17.startsWith("win") && Static11.anInt349 != 3) {
			local24 = null;
			if (arg0.anApplet1 != null) {
				local24 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class60 local44 = Static21.method5515(arg0, 0, arg1);
				Static317.aString353 = arg1;
				Static34.aClass60_3 = local44;
				Static32.aClass10_1 = arg0;
				return;
			}
		}
		if (Static11.aString17.startsWith("mac")) {
			local24 = null;
			if (arg0.anApplet1 != null) {
				local24 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg2) {
				Static21.method5515(arg0, 1, arg1);
				return;
			}
		}
		Static21.method5515(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ql;ZII)V")
	public static void method4681(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 28 | arg0 << 14 | arg2);
		@Pc(22) Class5_Sub16 local22 = (Class5_Sub16) Static3.aClass42_56.method1052(local16);
		if (local22 == null) {
			local22 = new Class5_Sub16();
			Static3.aClass42_56.method1050(local16, local22);
			local22.aClass211_7.method5609(arg1);
			return;
		}
		@Pc(44) Class165 local44 = Static88.method1382(arg1.anInt5029);
		@Pc(47) int local47 = local44.anInt4967;
		if (local44.anInt4953 == 1) {
			local47 *= arg1.anInt5028 + 1;
		}
		for (@Pc(70) Class5_Sub36 local70 = (Class5_Sub36) local22.aClass211_7.method5608(); local70 != null; local70 = (Class5_Sub36) local22.aClass211_7.method5603()) {
			local44 = Static88.method1382(local70.anInt5029);
			@Pc(80) int local80 = local44.anInt4967;
			if (local44.anInt4953 == 1) {
				local80 *= local70.anInt5028 + 1;
			}
			if (local80 < local47) {
				Static220.method3857(arg1, local70);
				return;
			}
		}
		local22.aClass211_7.method5609(arg1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4682(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
