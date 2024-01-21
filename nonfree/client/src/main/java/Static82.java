import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_679 = Static120.method1824("Hidden)2use");

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_680 = Static120.method1824("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!rd;")
	public static Class80 aClass80_681 = aClass80_680;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!af;")
	public static final Class5 aClass5_22 = new Class5(260);

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public static int anInt1743 = 0;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
	public static final int[] anIntArray215 = new int[50];

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!af;")
	public static final Class5 aClass5_23 = new Class5(64);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
	public static void method1216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 << 16) + arg1);
		@Pc(22) Class3_Sub1_Sub19 local22 = (Class3_Sub1_Sub19) Static62.aClass54_6.method1496(local12);
		if (local22 != null) {
			Static143.aClass58_2.method1574(local22);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII[BI[Lclient!rh;IBI)V")
	public static void method1217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class82[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg0 + local7 > 0 && local7 + arg0 < 103 && local11 + arg2 > 0 && local11 + arg2 < 103) {
					arg6[arg7].anIntArrayArray38[arg0 + local7][local11 + arg2] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(79) Class3_Sub17 local79 = new Class3_Sub17(arg4);
		for (@Pc(81) int local81 = 0; local81 < 4; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
					if (local81 == arg8 && local85 >= arg5 && local85 < arg5 + 8 && local89 >= arg1 && arg1 + 8 > local89) {
						Static56.method826(arg0 + Static16.method269(local89 & 0x7, arg3, local85 & 0x7), 0, arg3, arg7, 0, local79, arg2 + Static36.method570(local85 & 0x7, arg3, local89 & 0x7));
					} else {
						Static56.method826(-1, 0, 0, 0, 0, local79, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!rd;ZI)V")
	public static void method1218(@OriginalArg(0) Class80 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) Class80 local11 = arg0.method2465();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static58.anInt1289; local18++) {
			@Pc(24) Class3_Sub1_Sub2 local24 = Static173.method2793(local18);
			if ((!arg1 || local24.aBoolean22) && local24.aClass80_116.method2465().method2460(local11) != -1) {
				if (local16 >= 250) {
					Static8.anInt227 = -1;
					Static9.aShortArray5 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(56) short[] local56 = new short[local14.length * 2];
					for (@Pc(58) int local58 = 0; local58 < local16; local58++) {
						local56[local58] = local14[local58];
					}
					local14 = local56;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static188.anInt4344 = 0;
		Static9.aShortArray5 = local14;
		Static8.anInt227 = local16;
		@Pc(99) Class80[] local99 = new Class80[Static8.anInt227];
		for (@Pc(101) int local101 = 0; local101 < Static8.anInt227; local101++) {
			local99[local101] = Static173.method2793(local14[local101]).aClass80_116;
		}
		Static7.method157(local99, Static9.aShortArray5);
	}
}
