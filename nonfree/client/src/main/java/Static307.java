import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!td", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Lclient!iq;")
	public static Class104 aClass104_161;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_142 = new Class140(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_190 = new Class157(9, -1);

	@OriginalMember(owner = "client!td", name = "y", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_17 = new Class143(9, 6);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V")
	public static void method5137(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static80.aByteArrayArray3;
		} else {
			local11 = Static238.aByteArrayArray12;
			local9 = 4;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(40) int local40;
		@Pc(53) int local53;
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			@Pc(30) int[] local30 = null;
			@Pc(34) byte[] local34 = local11[local26];
			local40 = Static25.anIntArray50[local26] >> 8;
			@Pc(46) int local46 = Static25.anIntArray50[local26] & 0xFF;
			local53 = local40 * 64 - Static150.anInt3453;
			@Pc(60) int local60 = local46 * 64 - Static287.anInt5776;
			if (local34 != null) {
				Static276.method4761();
				local30 = Static330.method5382(Static150.anInt3453, local60, arg0, Static182.aClass61Array2, local9, Static51.aClass37_1, local34, local53, Static287.anInt5776);
			}
			if (!arg0 && local40 == Static208.anInt4568 / 8 && Static190.anInt6232 / 8 == local46) {
				if (local30 == null) {
					Static11.aClass162_1 = null;
				} else {
					Static11.aClass162_1 = Static228.method4212(local30[1], local30[0], local30[2], local30[3]);
					Static210.anInt4587 = local30[4];
				}
			}
		}
		for (@Pc(119) int local119 = 0; local119 < local20; local119++) {
			@Pc(132) int local132 = (Static25.anIntArray50[local119] >> 8) * 64 - Static150.anInt3453;
			local40 = (Static25.anIntArray50[local119] & 0xFF) * 64 - Static287.anInt5776;
			@Pc(147) byte[] local147 = local11[local119];
			if (local147 == null && Static190.anInt6232 < 800) {
				Static276.method4761();
				for (local53 = 0; local53 < local9; local53++) {
					Static72.method1480(64, local132, local40, local53, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method5138() {
		for (@Pc(10) int local10 = 0; local10 < Static161.anInt3751; local10++) {
			@Pc(18) Class59 local18 = Static91.method1825(local10);
			if (local18 != null && local18.anInt1323 == 0) {
				Static258.anIntArray417[local10] = 0;
				Static181.anIntArray308[local10] = 0;
			}
		}
		Static180.aClass41_19 = new Class41(128);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IC)C")
	public static char method5139(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
	public static void method5140(@OriginalArg(1) int arg0) {
		Static175.anInt3965 = arg0;
		Static165.aClass107_18.method3015();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
	public static void method5141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static108.anInt2266 <= arg0 && arg2 <= Static205.anInt4504 && Static197.anInt4298 <= arg4 && arg1 <= Static38.anInt553) {
			Static323.method5337(arg3, arg2, arg0, arg4, arg1);
		} else {
			Static292.method4860(arg3, arg4, arg0, arg1, arg2);
		}
	}
}
