import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
	public static int anInt1358;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "[B")
	public static final byte[] aByteArray33 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
	public static int anInt1356 = 0;

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
	public static int anInt1357 = 0;

	@OriginalMember(owner = "client!cf", name = "T", descriptor = "[I")
	public static final int[] anIntArray62 = new int[200];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILclient!pe;)V")
	public static void method986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3 arg3) {
		@Pc(4) Class113 local4 = Static363.method5062(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass4_Sub3_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)I")
	public static int method987() {
		@Pc(7) Class26 local7 = Static387.aClass26_9;
		@Pc(9) boolean local9 = false;
		if (Static281.anInt5126 != 0) {
			@Pc(16) Canvas local16 = new Canvas();
			local16.setSize(100, 100);
			local9 = true;
			local7 = Static312.method2282(null, 0, local16, null, 0);
		}
		@Pc(33) long local33 = Static208.method3182();
		for (@Pc(35) int local35 = 0; local35 < 10000; local35++) {
			local7.method2262();
		}
		@Pc(62) int local62 = (int) (Static208.method3182() - local33);
		local7.method2245(100, 0, 0, 100, -16777216);
		if (local9) {
			local7.method2258();
		}
		return local62;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZC)B")
	public static byte method988(@OriginalArg(1) char arg0) {
		@Pc(35) byte local35;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local35 = (byte) arg0;
		} else if (arg0 == '€') {
			local35 = -128;
		} else if (arg0 == '‚') {
			local35 = -126;
		} else if (arg0 == 'ƒ') {
			local35 = -125;
		} else if (arg0 == '„') {
			local35 = -124;
		} else if (arg0 == '…') {
			local35 = -123;
		} else if (arg0 == '†') {
			local35 = -122;
		} else if (arg0 == '‡') {
			local35 = -121;
		} else if (arg0 == 'ˆ') {
			local35 = -120;
		} else if (arg0 == '‰') {
			local35 = -119;
		} else if (arg0 == 'Š') {
			local35 = -118;
		} else if (arg0 == '‹') {
			local35 = -117;
		} else if (arg0 == 'Œ') {
			local35 = -116;
		} else if (arg0 == 'Ž') {
			local35 = -114;
		} else if (arg0 == '‘') {
			local35 = -111;
		} else if (arg0 == '’') {
			local35 = -110;
		} else if (arg0 == '“') {
			local35 = -109;
		} else if (arg0 == '”') {
			local35 = -108;
		} else if (arg0 == '•') {
			local35 = -107;
		} else if (arg0 == '–') {
			local35 = -106;
		} else if (arg0 == '—') {
			local35 = -105;
		} else if (arg0 == '˜') {
			local35 = -104;
		} else if (arg0 == '™') {
			local35 = -103;
		} else if (arg0 == 'š') {
			local35 = -102;
		} else if (arg0 == '›') {
			local35 = -101;
		} else if (arg0 == 'œ') {
			local35 = -100;
		} else if (arg0 == 'ž') {
			local35 = -98;
		} else if (arg0 == 'Ÿ') {
			local35 = -97;
		} else {
			local35 = 63;
		}
		return local35;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIII)V")
	public static void method990(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(7) int local7 = arg1 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (arg2 < local11) {
			@Pc(15) int local15 = arg2 + 1;
			arg0[local15] = arg3;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg3;
			arg2 = local45 + 1;
			arg0[arg2] = arg3;
		}
		while (local7 > arg2) {
			arg2++;
			arg0[arg2] = arg3;
		}
	}
}
