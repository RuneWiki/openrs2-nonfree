import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Z")
	public static boolean aBoolean233;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "S")
	public static short aShort50 = 1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI)V")
	public static void method3382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 * Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404() >> 8;
		if (arg1 == -1 && !Static627.aBoolean651) {
			Static625.method8226();
		} else if (arg1 != -1 && (Static659.anInt10097 != arg1 || !Static38.method1145()) && local12 != 0 && !Static627.aBoolean651) {
			Static359.method5010(local12, arg0, arg1, Static185.aClass182_50);
			Static217.method3246();
		}
		if (Static659.anInt10097 != arg1) {
			Static638.aClass3_Sub33_Sub3_3 = null;
		}
		Static659.anInt10097 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BIZ)Ljava/lang/String;")
	public static String method3384(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(19) char[] local19 = new char[arg2];
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg0;
		@Pc(27) int local27 = arg2 + arg0;
		while (local23 < local27) {
			@Pc(36) int local36 = arg1[local23++] & 0xFF;
			@Pc(48) int local48;
			if (local36 < 128) {
				if (local36 == 0) {
					local48 = 65533;
				} else {
					local48 = local36;
				}
			} else if (local36 < 192) {
				local48 = 65533;
			} else if (local36 < 224) {
				if (local23 < local27 && (arg1[local23] & 0xC0) == 128) {
					local48 = arg1[local23++] & 0x3F | (local36 & 0x1F) << 6;
					if (local48 < 128) {
						local48 = 65533;
					}
				} else {
					local48 = 65533;
				}
			} else if (local36 < 240) {
				if (local23 + 1 < local27 && (arg1[local23] & 0xC0) == 128 && (arg1[local23 + 1] & 0xC0) == 128) {
					local48 = (arg1[local23++] & 0x3F) << 6 | (local36 & 0xF) << 12 | arg1[local23++] & 0x3F;
					if (local48 < 2048) {
						local48 = 65533;
					}
				} else {
					local48 = 65533;
				}
			} else if (local36 >= 248) {
				local48 = 65533;
			} else if (local23 + 2 < local27 && (arg1[local23] & 0xC0) == 128 && (arg1[local23 + 1] & 0xC0) == 128 && (arg1[local23 + 2] & 0xC0) == 128) {
				local48 = (local36 & 0x7) << 18 | arg1[local23++] << 12 & 0x3F000 | (arg1[local23++] & 0x3F) << 6 | arg1[local23++] & 0x3F;
				if (local48 >= 65536 && local48 <= 1114111) {
					local48 = 65533;
				} else {
					local48 = 65533;
				}
			} else {
				local48 = 65533;
			}
			local19[local21++] = (char) local48;
		}
		return new String(local19, 0, local21);
	}
}
