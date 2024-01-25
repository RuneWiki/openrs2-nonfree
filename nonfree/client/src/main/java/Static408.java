import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Lclient!pe;")
	public static final Class258 aClass258_6 = new Class258();

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "Z")
	public static boolean aBoolean535 = true;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(CII)I")
	public static int method6470(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(22) char local22 = Character.toLowerCase(arg0);
			local13 = (local22 << 4) + 1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
	public static int method6471(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg1.charAt(local17);
			if (local23 <= '\u007f') {
				arg0[local10++] = (byte) local23;
			} else if (local23 > '\u07ff') {
				arg0[local10++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!un;I)V")
	public static void method6472(@OriginalArg(0) Class4_Sub11 arg0) {
		if (arg0.aByteArray68.length - arg0.anInt5831 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method4905();
		if (local18 < 0 || local18 > 1 || arg0.aByteArray68.length - arg0.anInt5831 < 2) {
			return;
		}
		@Pc(48) int local48 = arg0.method4936();
		if (arg0.aByteArray68.length - arg0.anInt5831 < local48 * 6) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local48; local62++) {
			@Pc(70) int local70 = arg0.method4936();
			@Pc(74) int local74 = arg0.method4931();
			if (Static419.anIntArray414.length > local70 && Static225.aBooleanArray11[local70] && (Static323.aClass130_1.method3225(local70).aChar1 != '1' || local74 >= -1 && local74 <= 1)) {
				Static419.anIntArray414[local70] = local74;
			}
		}
	}
}
