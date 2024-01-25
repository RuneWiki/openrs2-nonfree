import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!po", name = "N", descriptor = "Lclient!tb;")
	public static Class189 aClass189_7;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_163 = new Class157(25, 8);

	@OriginalMember(owner = "client!po", name = "K", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_176 = new Class221(1, -2);

	@OriginalMember(owner = "client!po", name = "M", descriptor = "[S")
	public static final short[] aShortArray96 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(CI)Z")
	public static boolean method4495(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!fh;B)Lclient!fh;")
	public static Class68 method4497(@OriginalArg(0) Class68 arg0) {
		@Pc(6) Class68 local6 = Static46.method879(arg0);
		if (local6 == null) {
			local6 = arg0.aClass68_13;
		}
		return local6;
	}
}
