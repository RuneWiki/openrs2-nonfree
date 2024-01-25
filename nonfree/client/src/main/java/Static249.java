import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jga", name = "E", descriptor = "Lclient!tf;")
	public static Class322 aClass322_87;

	@OriginalMember(owner = "client!jga", name = "D", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_47 = new Class303(35, 11);

	@OriginalMember(owner = "client!jga", name = "F", descriptor = "Z")
	public static volatile boolean aBoolean332 = true;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBLclient!tf;)Lclient!f;")
	public static Class14 method3865(@OriginalArg(0) int arg0, @OriginalArg(2) Class322 arg1) {
		@Pc(15) Class14 local15 = (Class14) Static492.aClass6_61.method92((long) arg0);
		if (local15 == null) {
			if (Static214.aBoolean289) {
				local15 = Static505.aClass45_11.method7398(Static604.method6152(arg1, arg0), true);
			} else {
				local15 = Static251.method3879(arg1.method6807(arg0));
			}
			Static492.aClass6_61.method106((long) arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(II)S")
	public static short method3866(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(42) int local42 = local24 <= 64 ? local20 * local24 >> 7 : (127 - local24) * local20 >> 7;
		@Pc(46) int local46 = local42 + local24;
		@Pc(55) int local55;
		if (local46 == 0) {
			local55 = local42 << 1;
		} else {
			local55 = (local42 << 8) / local46;
		}
		return (short) (local46 | local14 << 10 | local55 >> 4 << 7);
	}
}
