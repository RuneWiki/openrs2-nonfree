import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "Lclient!sfa;")
	public static Class4_Sub41 aClass4_Sub41_1;

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
	public static int anInt3312;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "[I")
	public static int[] anIntArray149 = new int[4];

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "Lclient!vfa;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIZ[B)Ljava/lang/String;")
	public static String method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg1 + arg0;
		while (local12 < local16) {
			@Pc(25) int local25 = arg2[local12++] & 0xFF;
			@Pc(35) int local35;
			if (local25 >= 128) {
				if (local25 < 192) {
					local35 = 65533;
				} else if (local25 >= 224) {
					if (local25 < 240) {
						if (local12 + 1 < local16 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128) {
							local35 = (local25 & 0xF) << 12 | (arg2[local12++] & 0x3F) << 6 | arg2[local12++] & 0x3F;
							if (local35 < 2048) {
								local35 = 65533;
							}
						} else {
							local35 = 65533;
						}
					} else if (local25 >= 248) {
						local35 = 65533;
					} else if (local16 > local12 + 2 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128 && (arg2[local12 + 2] & 0xC0) == 128) {
						local35 = (local25 & 0x7) << 18 | (arg2[local12++] & 0x3F) << 12 | (arg2[local12++] & 0x3F) << 6 | arg2[local12++] & 0x3F;
						if (local35 >= 65536 && local35 <= 1114111) {
							local35 = 65533;
						} else {
							local35 = 65533;
						}
					} else {
						local35 = 65533;
					}
				} else if (local12 < local16 && (arg2[local12] & 0xC0) == 128) {
					local35 = arg2[local12++] & 0x3F | (local25 & 0x1F) << 6;
					if (local35 < 128) {
						local35 = 65533;
					}
				} else {
					local35 = 65533;
				}
			} else if (local25 == 0) {
				local35 = 65533;
			} else {
				local35 = local25;
			}
			local8[local10++] = (char) local35;
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIILclient!kb;Lclient!ff;Lclient!vc;ILclient!r;)V")
	public static void method2965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class183 arg3, @OriginalArg(4) Class4_Sub17 arg4, @OriginalArg(5) Class338 arg5, @OriginalArg(7) Class44 arg6) {
		@Pc(14) int local14 = arg4.anInt2871 - arg0 / 2 - 5;
		@Pc(18) int local18 = arg1 + 2;
		if (arg5.anInt9759 != 0) {
			arg6.method5006(local14, arg0 + 10, local18, arg5.anInt9759, arg2 * arg3.method4386() + arg1 + 1 - local18);
		}
		if (arg5.anInt9761 != 0) {
			arg6.method5030(arg3.method4386() * arg2 + arg1 + 1 - local18, arg5.anInt9761, local18, arg0 + 10, local14);
		}
		@Pc(74) int local74 = arg5.anInt9740;
		if (arg4.aBoolean214 && arg5.anInt9754 != -1) {
			local74 = arg5.anInt9754;
		}
		for (@Pc(86) int local86 = 0; local86 < arg2; local86++) {
			@Pc(92) String local92 = Static283.aStringArray73[local86];
			if (local86 < arg2 - 1) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg3.method4387(arg6, local92, arg4.anInt2871, arg1, local74);
			arg1 += arg3.method4386();
		}
	}
}
