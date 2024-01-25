import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
	public static int anInt10597;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "Lclient!la;")
	public static Class208 aClass208_145;

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "Lclient!el;")
	public static final Class109 aClass109_222 = new Class109(132, -1);

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_26 = new Class96(1, 2, 2, 0);

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
	public static int anInt10600 = 0;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
	public static void method9130() {
		Static280.aClass391_25.method9276(0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method9132(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[BIIZI)V")
	public static void method9133(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		arg0 += arg3;
		@Pc(24) int local24 = arg2 - arg3 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(36) int local36 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg1[local36] = 1;
			@Pc(46) int local46 = local41 + 1;
			arg1[local41] = 1;
			arg0 = local46 + 1;
			arg1[local46] = 1;
		}
	}
}
