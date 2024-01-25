import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!au", name = "B", descriptor = "I")
	public static int anInt403;

	@OriginalMember(owner = "client!au", name = "C", descriptor = "I")
	public static int anInt404;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_7 = new Class187(2, 3);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method390(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg2];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = arg1;
		@Pc(19) int local19 = arg2 + arg1;
		while (local10 < local19) {
			@Pc(27) int local27 = arg0[local10++] & 0xFF;
			@Pc(65) int local65;
			if (local27 >= 128) {
				if (local27 < 192) {
					local65 = 65533;
				} else if (local27 < 224) {
					if (local10 < local19 && (arg0[local10] & 0xC0) == 128) {
						local65 = arg0[local10++] & 0x3F | (local27 & 0x1F) << 6;
						if (local65 < 128) {
							local65 = 65533;
						}
					} else {
						local65 = 65533;
					}
				} else if (local27 >= 240) {
					if (local27 >= 248) {
						local65 = 65533;
					} else if (local10 + 2 < local19 && (arg0[local10] & 0xC0) == 128 && (arg0[local10 + 1] & 0xC0) == 128 && (arg0[local10 + 2] & 0xC0) == 128) {
						local65 = (arg0[local10++] & 0x3F) << 12 | local27 << 18 & 0x1C0000 | (arg0[local10++] & 0x3F) << 6 | arg0[local10++] & 0x3F;
						if (local65 >= 65536 && local65 <= 1114111) {
							local65 = 65533;
						} else {
							local65 = 65533;
						}
					} else {
						local65 = 65533;
					}
				} else if (local19 > local10 + 1 && (arg0[local10] & 0xC0) == 128 && (arg0[local10 + 1] & 0xC0) == 128) {
					local65 = (arg0[local10++] & 0x3F) << 6 | (local27 & 0xF) << 12 | arg0[local10++] & 0x3F;
					if (local65 < 2048) {
						local65 = 65533;
					}
				} else {
					local65 = 65533;
				}
			} else if (local27 == 0) {
				local65 = 65533;
			} else {
				local65 = local27;
			}
			local6[local8++] = (char) local65;
		}
		return new String(local6, 0, local8);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BB)V")
	public static void method391(@OriginalArg(1) byte arg0) {
		if (Static664.aByteArrayArrayArray18 == null) {
			Static664.aByteArrayArrayArray18 = new byte[4][Static124.anInt2150][Static64.anInt1015];
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(24) int local24 = 0; local24 < Static124.anInt2150; local24++) {
				for (@Pc(27) int local27 = 0; local27 < Static64.anInt1015; local27++) {
					Static664.aByteArrayArrayArray18[local21][local24][local27] = arg0;
				}
			}
		}
	}
}
