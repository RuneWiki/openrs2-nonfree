import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!haa", name = "P", descriptor = "Lclient!kp;")
	public static Class205 aClass205_2;

	@OriginalMember(owner = "client!haa", name = "H", descriptor = "I")
	public static int anInt3435;

	// $FF: synthetic field
	@OriginalMember(owner = "client!haa", name = "M", descriptor = "Ljava/lang/Class;")
	public static Class aClass10;

	@OriginalMember(owner = "client!haa", name = "Q", descriptor = "[S")
	public static final short[] aShortArray20 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!haa", name = "U", descriptor = "[S")
	private static final short[] aShortArray21 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!haa", name = "A", descriptor = "[S")
	private static final short[] aShortArray22 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!haa", name = "N", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { aShortArray20, aShortArray22, aShortArray21 };

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZIII)V")
	public static void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(16) Class8_Sub6 local16 = (Class8_Sub6) Static270.aClass98_5.method1777(); local16 != null; local16 = (Class8_Sub6) Static270.aClass98_5.method1782()) {
			if (Static44.anInt740 >= local16.anInt6223) {
				local16.method8893();
			} else {
				Static148.method2088(arg0 >> 1, arg3 >> 1, local16.anInt6218 * 2, local16.anInt6216, (local16.anInt6220 << 9) + 256, (local16.anInt6217 << 9) + 256);
				Static533.aClass80_10.method8792(arg1 + Static13.anIntArray19[0], Static13.anIntArray19[1] + arg2, local16.anInt6225 | 0xFF000000, 0, local16.aString78);
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	public static void method3025(@OriginalArg(0) int arg0) {
		Static316.anInt5608 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!cn;IIBLclient!ha;)V")
	public static void method3033(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class57 arg4) {
		for (@Pc(8) int local8 = 7; local8 >= 0; local8--) {
			for (@Pc(14) int local14 = 127; local14 >= 0; local14--) {
				@Pc(32) int local32 = local14 & 0x7F | (arg2 & 0x3F) << 10 | (local8 & 0x7) << 7;
				Static303.method4654(false, true);
				@Pc(40) int local40 = Static560.anIntArray534[local32];
				Static147.method2073(true, false);
				arg4.aa((local14 * arg1.anInt1384 >> 7) + arg3, (arg1.anInt1394 * (-local8 + 7) >> 3) + arg0, (arg1.anInt1384 >> 7) + 1, (arg1.anInt1394 >> 3) + 1, local40, 0);
			}
		}
		anInt3435++;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)Lclient!dr;")
	public static Class8_Sub1_Sub1 method3036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass8_Sub1_Sub1_1 == null ? null : local7.aClass8_Sub1_Sub1_1;
	}
}
