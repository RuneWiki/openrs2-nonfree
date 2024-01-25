import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array16;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	public static int anInt2658;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
	public static int anInt2659;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_64 = new Class239(55, 2);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([BLjava/lang/String;BI)I")
	public static int method2512(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg1.charAt(local12);
			if (local18 <= '\u007f') {
				arg0[local10++] = (byte) local18;
			} else if (local18 > '\u07ff') {
				arg0[local10++] = (byte) (local18 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local18 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local18 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local18 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local18 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZII)V")
	public static void method2514(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub16 local12 = Static218.method3456(arg0, arg1);
		if (local12 != null) {
			local12.method7802();
		}
	}
}
