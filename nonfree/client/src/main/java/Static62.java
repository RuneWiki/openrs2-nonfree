import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)I")
	public static int method9400(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method9404(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg0];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = arg2;
		@Pc(24) int local24 = arg2 + arg0;
		while (local24 > local10) {
			@Pc(32) int local32 = arg1[local10++] & 0xFF;
			@Pc(41) int local41;
			if (local32 < 128) {
				if (local32 == 0) {
					local41 = 65533;
				} else {
					local41 = local32;
				}
			} else if (local32 < 192) {
				local41 = 65533;
			} else if (local32 >= 224) {
				if (local32 >= 240) {
					if (local32 >= 248) {
						local41 = 65533;
					} else if (local10 + 2 < local24 && (arg1[local10] & 0xC0) == 128 && (arg1[local10 + 1] & 0xC0) == 128 && (arg1[local10 + 2] & 0xC0) == 128) {
						local41 = (arg1[local10++] & 0x3F) << 12 | local32 << 18 & 0x1C0000 | (arg1[local10++] & 0x3F) << 6 | arg1[local10++] & 0x3F;
						if (local41 >= 65536 && local41 <= 1114111) {
							local41 = 65533;
						} else {
							local41 = 65533;
						}
					} else {
						local41 = 65533;
					}
				} else if (local24 > local10 + 1 && (arg1[local10] & 0xC0) == 128 && (arg1[local10 + 1] & 0xC0) == 128) {
					local41 = (local32 & 0xF) << 12 | (arg1[local10++] & 0x3F) << 6 | arg1[local10++] & 0x3F;
					if (local41 < 2048) {
						local41 = 65533;
					}
				} else {
					local41 = 65533;
				}
			} else if (local24 > local10 && (arg1[local10] & 0xC0) == 128) {
				local41 = arg1[local10++] & 0x3F | (local32 & 0x1F) << 6;
				if (local41 < 128) {
					local41 = 65533;
				}
			} else {
				local41 = 65533;
			}
			local6[local8++] = (char) local41;
		}
		return new String(local6, 0, local8);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ega;")
	public static RuntimeException_Sub1 method9405(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString29 = local12.aString29 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public static void method9407(@OriginalArg(0) int arg0) {
		@Pc(14) Class14_Sub2_Sub9 local14 = Static499.method7527((long) arg0, 17);
		local14.method4001();
	}
}
