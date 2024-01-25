import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "B")
	public static byte aByte115;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
	public static final int[] anIntArray490 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public static final int anInt9077 = 1;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method7419(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 11);
		local8.method7134();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
	public static void method7421() {
		@Pc(1) Class223 local1 = Static267.aClass223_36;
		synchronized (Static267.aClass223_36) {
			Static267.aClass223_36.method5399(5);
		}
		local1 = Static571.aClass223_66;
		synchronized (Static571.aClass223_66) {
			Static571.aClass223_66.method5399(5);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lclient!cq;")
	public static Class53 method7422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static60.aClass53ArrayArrayArray1[0][arg1][arg2] != null && Static60.aClass53ArrayArrayArray1[0][arg1][arg2].aClass53_1 != null;
			if (local28 && arg0 >= Static345.anInt6662 - 1) {
				return null;
			}
			Static74.method1212(arg0, arg1, arg2);
		}
		return Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLclient!ft;II)V")
	public static void method7423(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 28 | arg0 << 14 | arg2);
		@Pc(28) Class4_Sub13 local28 = (Class4_Sub13) Static251.aClass350_19.method8207(local16);
		if (local28 == null) {
			local28 = new Class4_Sub13();
			Static251.aClass350_19.method8199(local16, local28);
			local28.aClass244_19.method5960(arg1);
			return;
		}
		@Pc(51) Class242 local51 = Static521.aClass273_2.method6712(arg1.anInt3139);
		@Pc(54) int local54 = local51.anInt7108;
		if (local51.anInt7140 == 1) {
			local54 *= arg1.anInt3138 + 1;
		}
		for (@Pc(71) Class4_Sub20 local71 = (Class4_Sub20) local28.aClass244_19.method5963(); local71 != null; local71 = (Class4_Sub20) local28.aClass244_19.method5965()) {
			local51 = Static521.aClass273_2.method6712(local71.anInt3139);
			@Pc(82) int local82 = local51.anInt7108;
			if (local51.anInt7140 == 1) {
				local82 *= local71.anInt3138 + 1;
			}
			if (local82 < local54) {
				Static80.method7918(local71, arg1);
				return;
			}
		}
		local28.aClass244_19.method5960(arg1);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V")
	public static void method7424(@OriginalArg(1) int arg0) {
		Static209.method3499();
		@Pc(11) int local11 = Static121.aClass141_1.method3346(arg0).anInt3875;
		if (local11 == 0) {
			return;
		}
		@Pc(27) int local27 = Static45.aClass148_1.anIntArray188[arg0];
		if (local11 == 6) {
			Static27.anInt405 = local27;
		}
		if (local11 == 5) {
			Static297.anInt6005 = local27;
		}
	}
}
