import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!sc;")
	public static Class2_Sub2_Sub14 aClass2_Sub2_Sub14_1;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	public static int anInt588;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!bg;")
	public static Class11 aClass11_29;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_331 = Static32.method683("::autoshadow on");

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_332 = Static32.method683("au");

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_333 = Static32.method683(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Lclient!lf;")
	public static Class49 aClass49_334 = Static32.method683(" (X");

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!lf;")
	private static Class49 aClass49_335 = Static32.method683("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_336 = Static32.method683("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public static int anInt591 = 0;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_337 = aClass49_335;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
	public static int anInt594 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public static void method480() {
		aClass49_332 = null;
		anIntArrayArrayArray2 = null;
		aClass49_331 = null;
		aClass49_334 = null;
		aClass49_336 = null;
		aClass49_337 = null;
		aClass2_Sub2_Sub14_1 = null;
		aClass49_335 = null;
		aClass11_29 = null;
		aClass49_333 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB[Lclient!lf;I)Lclient!lf;")
	public static Class49 method482(@OriginalArg(0) int arg0, @OriginalArg(2) Class49[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg1[arg2 + local9] == null) {
				arg1[local9 + arg2] = Static94.aClass49_963;
			}
			local7 += arg1[local9 + arg2].anInt2058;
		}
		@Pc(44) byte[] local44 = new byte[local7];
		@Pc(46) int local46 = 0;
		@Pc(56) Class49 local56;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			local56 = arg1[arg2 + local48];
			Static191.method1826(local56.aByteArray28, 0, local44, local46, local56.anInt2058);
			local46 += local56.anInt2058;
		}
		local56 = new Class49();
		local56.anInt2058 = local7;
		local56.aByteArray28 = local44;
		return local56;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)I")
	public static int method484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub19 local18 = (Class2_Sub19) Static70.aClass25_6.method836((long) arg1);
		if (local18 == null) {
			return 0;
		} else if (arg0 >= 0 && local18.anIntArray199.length > arg0) {
			return local18.anIntArray199[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIILclient!ja;)V")
	public static void method485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub13 arg6) {
		@Pc(21) int local21;
		if (arg4 < 0 || arg4 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local21 = arg6.method2962();
				if (local21 == 0) {
					break;
				}
				if (local21 == 1) {
					arg6.method2962();
					break;
				}
				if (local21 <= 49) {
					arg6.method2962();
				}
			}
			return;
		}
		Static81.aByteArrayArrayArray2[arg0][arg4][arg3] = 0;
		while (true) {
			local21 = arg6.method2962();
			if (local21 == 0) {
				if (arg0 == 0) {
					Static162.anIntArrayArrayArray7[0][arg4][arg3] = -Static90.method1572(arg3 + arg1 + 556238, arg5 + arg4 + 932731) * 8;
				} else {
					Static162.anIntArrayArrayArray7[arg0][arg4][arg3] = Static162.anIntArrayArrayArray7[arg0 - 1][arg4][arg3] - 240;
				}
				break;
			}
			if (local21 == 1) {
				@Pc(119) int local119 = arg6.method2962();
				if (local119 == 1) {
					local119 = 0;
				}
				if (arg0 == 0) {
					Static162.anIntArrayArrayArray7[0][arg4][arg3] = -local119 * 8;
				} else {
					Static162.anIntArrayArrayArray7[arg0][arg4][arg3] = Static162.anIntArrayArrayArray7[arg0 - 1][arg4][arg3] - local119 * 8;
				}
				break;
			}
			if (local21 <= 49) {
				Static126.aByteArrayArrayArray7[arg0][arg4][arg3] = arg6.method2948();
				Static8.aByteArrayArrayArray6[arg0][arg4][arg3] = (byte) ((local21 - 2) / 4);
				Static94.aByteArrayArrayArray5[arg0][arg4][arg3] = (byte) (arg2 + local21 - 2 & 0x3);
			} else if (local21 <= 81) {
				Static81.aByteArrayArrayArray2[arg0][arg4][arg3] = (byte) (local21 - 49);
			} else {
				Static81.aByteArrayArrayArray3[arg0][arg4][arg3] = (byte) (local21 - 81);
			}
		}
	}
}
