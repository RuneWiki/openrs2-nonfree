import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "S")
	public static short aShort71 = 256;

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	public static int anInt5918 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5296(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(22) char local22 = arg0.charAt(local14);
			if (local22 == '%' && local12 > local14 + 2) {
				local22 = arg0.charAt(local14 + 1);
				@Pc(86) int local86;
				if (local22 >= '0' && local22 <= '9') {
					local86 = local22 - 48;
				} else if (local22 >= 'a' && local22 <= 'f') {
					local86 = local22 + 10 - 97;
				} else {
					if (local22 < 'A' || local22 > 'F') {
						local9.append('%');
						continue;
					}
					local86 = local22 - 55;
				}
				local86 *= 16;
				local22 = arg0.charAt(local14 + 2);
				if (local22 >= '0' && local22 <= '9') {
					local86 += local22 - 48;
				} else if (local22 >= 'a' && local22 <= 'f') {
					local86 += local22 + 10 - 97;
				} else {
					if (local22 < 'A' || local22 > 'F') {
						local9.append('%');
						continue;
					}
					local86 += local22 + '\n' - 65;
				}
				if (local86 != 0 && Static94.method1460(0x3F ^ 0x5B, (byte) local86)) {
					local9.append(Static639.method8672((byte) local86));
				}
				local14 += 2;
			} else if (local22 == '+') {
				local9.append(' ');
			} else {
				local9.append(local22);
			}
		}
		if (63 != 63) {
			aShort71 = 124;
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([I[[B[[BIII[B[I)I")
	public static int method5298(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg6[arg3];
		@Pc(15) int local15 = arg0[arg3] + local9;
		@Pc(19) int local19 = arg6[arg4];
		@Pc(25) int local25 = arg0[arg4] + local19;
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg5[arg3] & 0xFF;
		if (local53 > (arg5[arg4] & 0xFF)) {
			local53 = arg5[arg4] & 0xFF;
		}
		@Pc(77) byte[] local77 = arg2[arg3];
		@Pc(81) byte[] local81 = arg1[arg4];
		@Pc(86) int local86 = local27 - local9;
		@Pc(91) int local91 = local27 - local19;
		for (@Pc(93) int local93 = local27; local93 < local38; local93++) {
			@Pc(107) int local107 = local77[local86++] + local81[local91++];
			if (local53 > local107) {
				local53 = local107;
			}
		}
		return -local53;
	}
}
