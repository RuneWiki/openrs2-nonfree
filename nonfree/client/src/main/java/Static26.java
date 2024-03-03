import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!je;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)I", line = 46)
	public static int method870(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return (arg0 & 0xFF80) + local42;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)I", line = 113)
	public static int method872(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!bt;B)V", line = 202)
	public static void method875(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static294.aClass205_6 != null) {
			@Pc(20) int local20;
			try {
				Static294.aClass205_6.method5215(0L);
				Static294.aClass205_6.method5221(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4858(local8, 24);
	}
}
