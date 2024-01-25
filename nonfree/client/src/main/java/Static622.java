import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array20;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!du;")
	public static Class81_Sub1 aClass81_Sub1_2;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!aba;")
	public static final Class3_Sub1 aClass3_Sub1_1 = new Class3_Sub1(0, 0);

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public static int anInt10061 = 0;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_146 = new Class200(54, 7);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method8622(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!la;)V")
	public static void method8624(@OriginalArg(1) Class196 arg0) {
		Static400.aClass196_81 = arg0;
	}
}
