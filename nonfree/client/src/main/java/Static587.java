import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!iu;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8091(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(23) Class6_Sub17 local23 = Static330.method7824(Static270.aClass185_58, Static569.aClass134_2);
			local23.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(arg0));
			local23.aClass6_Sub8_Sub1_2.method8205(arg0);
			Static452.method6867(local23);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)I")
	public static int method8092(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return (arg0 & 0xFF80) + local43;
		}
	}
}
