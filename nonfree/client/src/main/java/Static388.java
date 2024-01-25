import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static388 {

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_34 = new Class22(8);

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!in;")
	public static final Class169 aClass169_182 = new Class169(44, 6);

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
	public static boolean aBoolean551 = true;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)Z")
	public static boolean method6538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)Z")
	public static boolean method6540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
