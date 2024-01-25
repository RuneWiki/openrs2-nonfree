import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wr", name = "X", descriptor = "I")
	public static int anInt6754;

	@OriginalMember(owner = "client!wr", name = "Y", descriptor = "I")
	public static int anInt6755;

	@OriginalMember(owner = "client!wr", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString253 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!wr", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray99 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!wr", name = "ab", descriptor = "I")
	public static int anInt6757 = 0;

	@OriginalMember(owner = "client!wr", name = "db", descriptor = "I")
	public static final int anInt6760 = -9017772;

	@OriginalMember(owner = "client!wr", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString254 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZB)V")
	public static void method6005(@OriginalArg(0) boolean arg0) {
		@Pc(14) byte local14;
		@Pc(16) byte[][] local16;
		if (arg0) {
			local14 = 1;
			local16 = Static196.aByteArrayArray13;
		} else {
			local16 = Static334.aByteArrayArray26;
			local14 = 4;
		}
		@Pc(25) int local25 = local16.length;
		@Pc(41) int local41;
		@Pc(53) int local53;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(31) int[] local31 = null;
			@Pc(35) byte[] local35 = local16[local27];
			local41 = Static8.anIntArray9[local27] >> 8;
			@Pc(47) int local47 = Static8.anIntArray9[local27] & 0xFF;
			local53 = local41 * 64 - Static151.anInt3234;
			@Pc(60) int local60 = local47 * 64 - Static251.anInt3170;
			if (local35 != null) {
				Static151.method3006();
				local31 = Static353.method5965(arg0, Static75.aClass65Array1, local35, Static251.anInt3170, Static218.aClass46_5, Static151.anInt3234, local53, local60, local14);
			}
			if (!arg0 && local41 == Static217.anInt4356 / 8 && local47 == Static31.anInt735 / 8) {
				if (local31 == null) {
					Static253.aClass208_2 = null;
				} else {
					Static253.aClass208_2 = Static253.method1022(local31[0], local31[1], local31[3], local31[2]);
					Static58.anInt1407 = local31[4];
				}
			}
		}
		for (@Pc(119) int local119 = 0; local119 < local25; local119++) {
			@Pc(132) int local132 = (Static8.anIntArray9[local119] >> 8) * 64 - Static151.anInt3234;
			local41 = (Static8.anIntArray9[local119] & 0xFF) * 64 - Static251.anInt3170;
			@Pc(147) byte[] local147 = local16[local119];
			if (local147 == null && Static31.anInt735 < 800) {
				Static151.method3006();
				for (local53 = 0; local53 < local14; local53++) {
					Static153.method3017(local53, 64, 64, local41, local132);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
	public static void method6007() {
		for (@Pc(6) Class14_Sub23 local6 = (Class14_Sub23) Static95.aClass18_9.method459(); local6 != null; local6 = (Class14_Sub23) Static95.aClass18_9.method453()) {
			if (Static231.method4075(local6.anInt4355)) {
				Static257.method4008(local6);
			}
		}
		if (Static41.anInt980 == 1) {
			Static302.aBoolean409 = false;
			Static26.method683(Static127.anInt2787, Static147.anInt2656, Static349.anInt6632, Static124.anInt2716);
			return;
		}
		Static26.method683(Static127.anInt2787, Static147.anInt2656, Static349.anInt6632, Static124.anInt2716);
		@Pc(58) int local58 = Static223.aClass76_9.method2256(Static325.aString231);
		for (@Pc(63) Class14_Sub23 local63 = (Class14_Sub23) Static95.aClass18_9.method459(); local63 != null; local63 = (Class14_Sub23) Static95.aClass18_9.method453()) {
			@Pc(69) int local69 = Static343.method5862(local63);
			if (local58 < local69) {
				local58 = local69;
			}
		}
		Static147.anInt2656 = Static41.anInt980 * 16 + (Static45.aBoolean80 ? 26 : 22);
		Static124.anInt2716 = local58 + 8;
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)V")
	public static void method6008() {
		@Pc(5) Class11 local5 = Static94.aClass11_51;
		synchronized (Static94.aClass11_51) {
			Static94.aClass11_51.method213();
		}
	}
}
