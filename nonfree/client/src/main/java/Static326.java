import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_96 = new Class237(60, 0);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZ)Z")
	public static boolean method4589(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static276.aClass109_10.method4687();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static276.aClass109_10.method4722();
		} else if (!Static276.aClass109_10.method4729()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static389.aClass128_Sub1_1.aBoolean239 = arg0;
			Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
			return true;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!lh;)V")
	public static void method4591(@OriginalArg(1) Class1_Sub1 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static165.aClass73_5 != null) {
			@Pc(20) int local20;
			try {
				Static165.aClass73_5.method1524(0L);
				Static165.aClass73_5.method1518(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4110(24, local8);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;")
	public static String[] method4592(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static317.method2976(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local19; arg0.charAt(local30) != arg1; local30++) {
			}
			local15[local17++] = arg0.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}
}
