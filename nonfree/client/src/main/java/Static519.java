import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!sfa", name = "r", descriptor = "[B")
	public static byte[] aByteArray84;

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_1 = new Class238(14, 0);

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_2 = new Class238(15, 4);

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_3 = new Class238(16, -2);

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_4 = new Class238(17, 0);

	@OriginalMember(owner = "client!sfa", name = "i", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_5 = new Class238(18, -2);

	@OriginalMember(owner = "client!sfa", name = "j", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_6 = new Class238(19, -2);

	@OriginalMember(owner = "client!sfa", name = "k", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_7 = new Class238(22, -2);

	@OriginalMember(owner = "client!sfa", name = "l", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_8 = new Class238(23, 4);

	@OriginalMember(owner = "client!sfa", name = "m", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_9 = new Class238(24, -1);

	@OriginalMember(owner = "client!sfa", name = "n", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_10 = new Class238(26, 0);

	@OriginalMember(owner = "client!sfa", name = "o", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_11 = new Class238(27, 0);

	@OriginalMember(owner = "client!sfa", name = "p", descriptor = "Lclient!oe;")
	public static final Class238 aClass238_12 = new Class238(28, -2);

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!ji;I)Lclient!kr;")
	public static Class177 method7424(@OriginalArg(0) Class6_Sub8 arg0) {
		@Pc(15) int local15 = arg0.method8236();
		return new Class177(local15);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Z")
	public static boolean method7425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static191.method3516(arg1, arg0) || Static422.method6593(arg1, arg0);
	}
}
