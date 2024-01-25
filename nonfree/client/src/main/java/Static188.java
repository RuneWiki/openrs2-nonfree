import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hda", name = "B", descriptor = "[I")
	public static final int[] anIntArray375 = new int[2];

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBIILclient!qd;)V")
	public static void method3454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub38 arg3) {
		@Pc(16) long local16 = (long) (arg0 | arg1 << 14 | arg2 << 28);
		@Pc(22) Class4_Sub15 local22 = (Class4_Sub15) Static486.aClass183_34.method4289(local16);
		if (local22 == null) {
			local22 = new Class4_Sub15();
			Static486.aClass183_34.method4282(local16, local22);
			local22.aClass124_18.method3275(arg3);
			return;
		}
		@Pc(49) Class222 local49 = Static195.aClass99_1.method2798(arg3.anInt7346);
		@Pc(52) int local52 = local49.anInt5833;
		if (local49.anInt5791 == 1) {
			local52 *= arg3.anInt7347 + 1;
		}
		for (@Pc(69) Class4_Sub38 local69 = (Class4_Sub38) local22.aClass124_18.method3267(); local69 != null; local69 = (Class4_Sub38) local22.aClass124_18.method3273()) {
			local49 = Static195.aClass99_1.method2798(local69.anInt7346);
			@Pc(80) int local80 = local49.anInt5833;
			if (local49.anInt5791 == 1) {
				local80 *= local69.anInt7347 + 1;
			}
			if (local52 > local80) {
				Static130.method2735(local69, arg3);
				return;
			}
		}
		local22.aClass124_18.method3275(arg3);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ae;IIZILclient!ae;Z)I")
	public static int method3455(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class7_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static179.method3354(arg0, arg2, arg4, arg1);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(35) int local35 = Static179.method3354(arg0, arg5, arg4, arg3);
			return arg5 ? -local35 : local35;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method3456(@OriginalArg(0) byte[] arg0) {
		@Pc(16) int local16 = arg0.length;
		@Pc(19) char[] local19 = new char[local16];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(31) int local31 = arg0[local23] & 0xFF;
			if (local31 < 128) {
				local19[local21++] = (char) local31;
			} else if (local31 >= 194) {
				@Pc(70) int local70;
				if (local31 >= 224) {
					if (local31 >= 240) {
						if (local31 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local31);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local16 <= local23 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local23++;
					local70 = arg0[local23] & 0xFF;
					if (local70 >= 128 && local70 <= 191) {
						local23++;
						@Pc(90) int local90 = arg0[local23] & 0xFF;
						if (local90 >= 128 && local90 <= 191) {
							local19[local21++] = (char) (local90 & 0xFFFFFF7F | (local70 & 0x3FFFF7F) << 6 | (local31 & 0xFFFFFF1F) << 12);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local23 + 1 < local16) {
					local23++;
					local70 = arg0[local23] & 0xFF;
					if (local70 < 128 || local70 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local19[local21++] = (char) ((local31 & 0xFFFFFF3F) << 6 | local70 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local31);
			}
		}
		return new String(local19, 0, local21);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIZ[B)[B")
	public static byte[] method3457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(14) byte[] local14;
		if (arg0 <= 0) {
			local14 = arg2;
		} else {
			local14 = new byte[arg1];
			for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
				local14[local21] = arg2[arg0 + local21];
			}
		}
		@Pc(43) Class274 local43 = new Class274();
		local43.method6043();
		local43.method6041((long) (arg1 * 8), local14);
		@Pc(57) byte[] local57 = new byte[64];
		local43.method6042(local57);
		return local57;
	}
}
