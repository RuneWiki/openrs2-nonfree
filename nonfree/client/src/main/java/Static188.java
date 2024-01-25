import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!he", name = "A", descriptor = "Z")
	public static boolean aBoolean268;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "[Lclient!baa;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "I")
	public static int anInt3737 = 0;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "[I")
	public static final int[] anIntArray182 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;[BZ)I")
	public static int method3044(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg1.charAt(local12);
			if (local18 <= '\u007f') {
				arg2[local10++] = (byte) local18;
			} else if (local18 > '\u07ff') {
				arg2[local10++] = (byte) (local18 >> 12 | 0xE0);
				arg2[local10++] = (byte) (local18 >> 6 & 0x3F | 0x80);
				arg2[local10++] = (byte) (local18 & 0x3F | 0x80);
			} else {
				arg2[local10++] = (byte) (local18 >> 6 | 0xC0);
				arg2[local10++] = (byte) (local18 & 0x3F | 0x80);
			}
		}
		return local10 - arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZI)V")
	public static void method3045(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static307.anInt7603 = arg1;
		Static133.anInt2648 = 3;
		Static247.method3623(Static293.aClass261_4.aString81, Static293.aClass261_4.anInt6921);
		if (arg0) {
			Static181.method2849("", false, "");
		} else {
			Static34.method640();
			Static181.method2849(Static271.aString56, false, Static436.aString87);
		}
	}
}
