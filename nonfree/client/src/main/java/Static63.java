import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public static int anInt1315 = 0;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString48 = "scroll:";

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)I")
	public static int method1119() {
		if ((double) Static249.aFloat101 == 3.0D) {
			return 37;
		} else if ((double) Static249.aFloat101 == 4.0D) {
			return 50;
		} else if ((double) Static249.aFloat101 == 6.0D) {
			return 75;
		} else if ((double) Static249.aFloat101 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)[Lclient!lj;")
	public static Class1_Sub5_Sub6[] method1128() {
		@Pc(4) Class1_Sub5_Sub6[] local4 = new Class1_Sub5_Sub6[Static48.anInt1075];
		for (@Pc(11) int local11 = 0; local11 < Static48.anInt1075; local11++) {
			@Pc(22) int local22 = Static206.anIntArray419[local11] * Static69.anIntArray119[local11];
			@Pc(26) byte[] local26 = Static25.aByteArrayArray19[local11];
			if (Static154.aBooleanArray10[local11]) {
				@Pc(103) byte[] local103 = Static194.aByteArrayArray15[local11];
				@Pc(106) int[] local106 = new int[local22];
				for (@Pc(108) int local108 = 0; local108 < local22; local108++) {
					local106[local108] = (local103[local108] & 0xFF) << 24 | Static5.anIntArray17[local26[local108] & 0xFF];
				}
				if (Static71.aBoolean165) {
					local4[local11] = new Class1_Sub5_Sub6_Sub2_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local11], Static173.anIntArray353[local11], Static69.anIntArray119[local11], Static206.anIntArray419[local11], local106);
				} else {
					local4[local11] = new Class1_Sub5_Sub6_Sub1_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local11], Static173.anIntArray353[local11], Static69.anIntArray119[local11], Static206.anIntArray419[local11], local106);
				}
			} else {
				@Pc(33) int[] local33 = new int[local22];
				for (@Pc(35) int local35 = 0; local35 < local22; local35++) {
					local33[local35] = Static5.anIntArray17[local26[local35] & 0xFF];
				}
				if (Static71.aBoolean165) {
					local4[local11] = new Class1_Sub5_Sub6_Sub2(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local11], Static173.anIntArray353[local11], Static69.anIntArray119[local11], Static206.anIntArray419[local11], local33);
				} else {
					local4[local11] = new Class1_Sub5_Sub6_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local11], Static173.anIntArray353[local11], Static69.anIntArray119[local11], Static206.anIntArray419[local11], local33);
				}
			}
		}
		Static176.method3009();
		return local4;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BII)I")
	public static int method1129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
