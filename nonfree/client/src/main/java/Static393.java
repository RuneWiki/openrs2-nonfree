import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!nga", name = "G", descriptor = "Lclient!am;")
	public static final Class20 aClass20_8 = new Class20();

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z")
	public static boolean method5691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5693(@OriginalArg(1) String arg0) {
		return Static647.aHashtable6.containsKey(arg0);
	}
}
