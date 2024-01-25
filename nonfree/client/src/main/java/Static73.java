import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public static int anInt1498;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "[S")
	public static short[] aShortArray27;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "[I")
	public static final int[] anIntArray157 = new int[4];

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_19 = new Class25(48, 11);

	@OriginalMember(owner = "client!di", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!di", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[1000][];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([IIIII)V")
	public static void method1404(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(7) int local7 = arg1 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (arg3 < local11) {
			@Pc(15) int local15 = arg3 + 1;
			arg0[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			arg3 = local45 + 1;
			arg0[arg3] = arg2;
		}
		while (local7 > arg3) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)Z")
	public static boolean method1405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static64.method1229(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static330.method3977(arg1, arg0) | Static272.method4135(arg0, arg1) ? true : (Static70.method1382(arg0, arg1) | Static92.method1588(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIBZI)I")
	public static int method1406(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class6_Sub17 local10 = Static85.method1523(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray289.length; local18++) {
			if (local10.anIntArray289[local18] >= 0 && Static354.aClass170_2.anInt4263 > local10.anIntArray289[local18]) {
				@Pc(44) Class32 local44 = Static354.aClass170_2.method3865(local10.anIntArray289[local18]);
				@Pc(54) int local54 = local44.method773(arg0, Static414.aClass258_2.method5882(arg0).anInt7133);
				if (arg1) {
					local16 += local54 * local10.anIntArray287[local18];
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IC)Z")
	public static boolean method1408(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static99.aCharArray3;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (arg0 == local35) {
					return true;
				}
			}
		}
		return false;
	}
}
