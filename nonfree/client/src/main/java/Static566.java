import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "[I")
	public static int[] anIntArray710;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "[I")
	public static final int[] anIntArray711 = new int[13];

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[B)V")
	public static synchronized void method7644(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static164.anInt9118 < 1000) {
			Static594.aByteArrayArray37[Static164.anInt9118++] = arg0;
		} else if (arg0.length == 5000 && Static200.anInt3987 < 250) {
			Static216.aByteArrayArray18[Static200.anInt3987++] = arg0;
		} else if (arg0.length == 30000 && Static362.anInt4053 < 50) {
			Static341.aByteArrayArray17[Static362.anInt4053++] = arg0;
		} else if (Static518.aByteArrayArrayArray18 != null) {
			for (@Pc(67) int local67 = 0; local67 < Static342.anIntArray467.length; local67++) {
				if (arg0.length == Static342.anIntArray467[local67] && Static518.aByteArrayArrayArray18[local67].length > Static556.anIntArray707[local67]) {
					Static518.aByteArrayArrayArray18[local67][Static556.anIntArray707[local67]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[BIII[BBII)V")
	public static void method7645(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(20) int local20 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg6; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg2++;
				arg5[local31] = (byte) (arg5[local31] - arg1[arg0++]);
				@Pc(44) int local44 = arg2++;
				arg5[local44] = (byte) (arg5[local44] - arg1[arg0++]);
				@Pc(57) int local57 = arg2++;
				arg5[local57] = (byte) (arg5[local57] - arg1[arg0++]);
				@Pc(70) int local70 = arg2++;
				arg5[local70] = (byte) (arg5[local70] - arg1[arg0++]);
			}
			for (@Pc(89) int local89 = local20; local89 < 0; local89++) {
				local31 = arg2++;
				arg5[local31] = (byte) (arg5[local31] - arg1[arg0++]);
			}
			arg2 += arg3;
			arg0 += arg7;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method7647(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local5 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local18);
			if (local27 >= 'A' && local27 <= 'Z') {
				local5 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local5 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local5 += local27 - 21;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method7648(@OriginalArg(1) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static164.anInt9118 > 0) {
			local26 = Static594.aByteArrayArray37[--Static164.anInt9118];
			Static594.aByteArrayArray37[Static164.anInt9118] = null;
			return local26;
		} else if (arg0 == 5000 && Static200.anInt3987 > 0) {
			local26 = Static216.aByteArrayArray18[--Static200.anInt3987];
			Static216.aByteArrayArray18[Static200.anInt3987] = null;
			return local26;
		} else if (arg0 == 30000 && Static362.anInt4053 > 0) {
			local26 = Static341.aByteArrayArray17[--Static362.anInt4053];
			Static341.aByteArrayArray17[Static362.anInt4053] = null;
			return local26;
		} else {
			if (Static518.aByteArrayArrayArray18 != null) {
				for (@Pc(81) int local81 = 0; local81 < Static342.anIntArray467.length; local81++) {
					if (arg0 == Static342.anIntArray467[local81] && Static556.anIntArray707[local81] > 0) {
						@Pc(107) byte[] local107 = Static518.aByteArrayArrayArray18[local81][--Static556.anIntArray707[local81]];
						Static518.aByteArrayArrayArray18[local81][Static556.anIntArray707[local81]] = null;
						return local107;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
