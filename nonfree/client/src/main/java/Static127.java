import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!mo;")
	public static Class143 aClass143_59;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public static int anInt2787;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[Lclient!sk;")
	public static Class14_Sub13_Sub1[] aClass14_Sub13_Sub1Array1;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt2786 = 64;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt2789 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)I")
	public static int method2656(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!jg;I)V")
	public static void method2658(@OriginalArg(0) Class14_Sub4 arg0) {
		@Pc(16) byte[] local16 = new byte[24];
		if (Static231.aClass107_4 != null) {
			@Pc(28) int local28;
			try {
				Static231.aClass107_4.method3004(0L);
				Static231.aClass107_4.method3010(local16);
				for (local28 = 0; local28 < 24 && local16[local28] == 0; local28++) {
				}
				if (local28 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local28 = 0; local28 < 24; local28++) {
					local16[local28] = -1;
				}
			}
		}
		arg0.method2495(local16, 24);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
	public static int method2659(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
