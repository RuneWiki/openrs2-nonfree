import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_73 = new Class40(74, 8);

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Lclient!bc;")
	public static final Class24 aClass24_1 = new Class24(2);

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Lclient!fo;")
	public static final Class107 aClass107_4 = new Class107();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Z")
	public static boolean method2652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static485.method6714(arg1, arg0) | (arg0 & 0x800) != 0 || Static252.method3570(arg1, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public static void method2653() {
		Static106.aClass162_1 = new Class162(8);
		Static17.anInt337 = 0;
		for (@Pc(22) Class102_Sub6 local22 = (Class102_Sub6) Static430.aClass249_5.method5817(); local22 != null; local22 = (Class102_Sub6) Static430.aClass249_5.method5815()) {
			local22.method6837();
		}
	}
}
