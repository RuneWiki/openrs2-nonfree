import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public static int anInt4834 = 1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Z")
	public static boolean method4108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static619.method8540(arg1, arg0) || Static307.method4407(arg1, arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public static void method4109() {
		if (Static461.aClass132_12 != null) {
			Static461.aClass132_12.method7491();
			Static176.aClass19_6 = null;
			Static461.aClass132_12 = null;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
	public static String method4110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(22) int local22 = arg0 + arg1;
		while (local22 > local17) {
			@Pc(31) int local31 = arg2[local17++] & 0xFF;
			@Pc(41) int local41;
			if (local31 < 128) {
				if (local31 == 0) {
					local41 = 65533;
				} else {
					local41 = local31;
				}
			} else if (local31 < 192) {
				local41 = 65533;
			} else if (local31 >= 224) {
				if (local31 < 240) {
					if (local22 > local17 + 1 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128) {
						local41 = (local31 & 0xF) << 12 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
						if (local41 < 2048) {
							local41 = 65533;
						}
					} else {
						local41 = 65533;
					}
				} else if (local31 >= 248) {
					local41 = 65533;
				} else if (local17 + 2 < local22 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128 && (arg2[local17 + 2] & 0xC0) == 128) {
					local41 = (local31 & 0x7) << 18 | (arg2[local17++] & 0x3F) << 12 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
					if (local41 >= 65536 && local41 <= 1114111) {
						local41 = 65533;
					} else {
						local41 = 65533;
					}
				} else {
					local41 = 65533;
				}
			} else if (local22 > local17 && (arg2[local17] & 0xC0) == 128) {
				local41 = arg2[local17++] & 0x3F | (local31 & 0x1F) << 6;
				if (local41 < 128) {
					local41 = 65533;
				}
			} else {
				local41 = 65533;
			}
			local8[local10++] = (char) local41;
		}
		return new String(local8, 0, local10);
	}
}
