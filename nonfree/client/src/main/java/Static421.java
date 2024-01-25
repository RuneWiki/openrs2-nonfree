import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[Lclient!hg;")
	public static final Class130[] aClass130Array2 = new Class130[14];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lclient!dfa;")
	public static Class2_Sub6_Sub4 method6788() {
		return Static303.aClass2_Sub6_Sub4_2;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method6790() {
		@Pc(5) Class169 local5 = Static118.aClass169_19;
		synchronized (Static118.aClass169_19) {
			Static118.aClass169_19.method5006();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([IZ)Ljava/lang/String;")
	public static String method6792(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static15.anInt272;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class64 local22 = Static361.aClass278_1.method7123(arg0[local13]);
			if (local22.anInt2494 != -1) {
				@Pc(35) Class46 local35 = (Class46) Static232.aClass169_31.method5002((long) local22.anInt2494);
				if (local35 == null) {
					@Pc(43) Class296 local43 = Static652.method7583(Static214.aClass157_106, local22.anInt2494, 0);
					if (local43 != null) {
						local35 = Static186.aClass20_4.method7294(local43, true);
						Static232.aClass169_31.method5001(local35, (long) local22.anInt2494);
					}
				}
				if (local35 != null) {
					Static117.aClass46Array5[local11] = local35;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ks;)V")
	public static void method6793(@OriginalArg(0) Class182 arg0) {
		Static292.aClass182_1 = arg0;
	}
}
