import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString111;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "Lclient!m;")
	public static final Class235 aClass235_40 = new Class235(31);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)Z")
	public static boolean method6988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "(B)Ljava/lang/String;")
	public static String method6989() {
		@Pc(9) String local9 = "www";
		if (Static487.aClass371_7 == Static552.aClass371_10) {
			local9 = "www-wtrc";
		} else if (Static487.aClass371_7 == Static541.aClass371_5) {
			local9 = "www-wtqa";
		} else if (Static487.aClass371_7 == Static547.aClass371_9) {
			local9 = "www-wtwip";
		}
		@Pc(48) String local48 = "";
		if (Static236.aString77 != null) {
			local48 = "/p=" + Static236.aString77;
		}
		return "http://" + local9 + "." + Static667.aClass169_8.aString83 + ".com/l=" + Static141.anInt2658 + "/a=" + Static721.anInt3580 + local48 + "/";
	}
}
