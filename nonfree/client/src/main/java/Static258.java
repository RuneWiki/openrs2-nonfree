import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	public static int anInt4309 = 0;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	public static int anInt4313 = 2;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!ts;")
	public static Class107 method3440(@OriginalArg(1) Component arg0) {
		return new Class107_Sub1(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3441(@OriginalArg(0) String[] arg0) {
		@Pc(15) String[] local15 = new String[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			local15[local17] = local17 + ": ";
			if (arg0 != null && arg0[local17] != null) {
				local15[local17] = local15[local17] + arg0[local17];
			}
		}
		return local15;
	}
}
