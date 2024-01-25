import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	public static int anInt5919 = 0;

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
	public static int anInt5921 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method5184(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZI)I")
	public static int method5185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static102.method8744(arg1 - 1, arg0 + -1) + Static102.method8744(arg1 - 1, arg0 + 1) + Static102.method8744(arg1 + 1, arg0 + -1) + Static102.method8744(arg1 + 1, arg0 + 1);
		@Pc(73) int local73 = Static102.method8744(arg1, arg0 - 1) + Static102.method8744(arg1, arg0 + 1) + Static102.method8744(arg1 + -1, arg0) + Static102.method8744(arg1 + 1, arg0);
		@Pc(78) int local78 = Static102.method8744(arg1, arg0);
		return local45 / 16 + local73 / 8 + local78 / 4;
	}
}
