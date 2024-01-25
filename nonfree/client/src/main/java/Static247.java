import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "[J")
	public static long[] aLongArray6;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	public static int anInt4163;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!aea;")
	public static final Class10 aClass10_4 = new Class10();

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_22 = new Class148(3, 19);

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_30 = new Class293(8);

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public static void method3786() {
		Static1.aClass293_43.method6930();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method3787(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg2;
		@Pc(17) int local17 = arg2 + arg1;
		while (local12 < local17) {
			@Pc(31) int local31 = arg0[local12++] & 0xFF;
			@Pc(38) int local38;
			if (local31 < 128) {
				if (local31 == 0) {
					local38 = 65533;
				} else {
					local38 = local31;
				}
			} else if (local31 < 192) {
				local38 = 65533;
			} else if (local31 >= 224) {
				if (local31 < 240) {
					if (local12 + 1 < local17 && (arg0[local12] & 0xC0) == 128 && (arg0[local12 + 1] & 0xC0) == 128) {
						local38 = (local31 & 0xF) << 12 | (arg0[local12++] & 0x3F) << 6 | arg0[local12++] & 0x3F;
						if (local38 < 2048) {
							local38 = 65533;
						}
					} else {
						local38 = 65533;
					}
				} else if (local31 >= 248) {
					local38 = 65533;
				} else if (local12 + 2 < local17 && (arg0[local12] & 0xC0) == 128 && (arg0[local12 + 1] & 0xC0) == 128 && (arg0[local12 + 2] & 0xC0) == 128) {
					local38 = (arg0[local12++] & 0x3F) << 12 | local31 << 18 & 0x1C0000 | (arg0[local12++] & 0x3F) << 6 | arg0[local12++] & 0x3F;
					if (local38 >= 65536 && local38 <= 1114111) {
						local38 = 65533;
					} else {
						local38 = 65533;
					}
				} else {
					local38 = 65533;
				}
			} else if (local12 < local17 && (arg0[local12] & 0xC0) == 128) {
				local38 = arg0[local12++] & 0x3F | (local31 & 0x1F) << 6;
				if (local38 < 128) {
					local38 = 65533;
				}
			} else {
				local38 = 65533;
			}
			local8[local10++] = (char) local38;
		}
		return new String(local8, 0, local10);
	}
}
