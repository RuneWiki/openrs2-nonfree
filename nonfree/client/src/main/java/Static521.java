import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Lclient!fo;")
	public static Class112 aClass112_10;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_136 = new Class349(87, 20);

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
	public static final boolean aBoolean703 = false;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_137 = new Class349(27, 6);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!ps;)Lclient!ps;")
	public static Class273 method6725(@OriginalArg(1) Class273 arg0) {
		@Pc(14) Class273 local14 = Static70.method1169(arg0);
		if (local14 == null) {
			local14 = arg0.aClass273_11;
		}
		return local14;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIB)I")
	public static int method6726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = arg2 & 0xF;
		@Pc(24) int local24 = local15 >= 8 ? arg1 : arg3;
		@Pc(41) int local41 = local15 >= 4 ? (local15 == 12 || local15 == 14 ? arg3 : arg0) : arg1;
		return ((local15 & 0x1) == 0 ? local24 : -local24) + ((local15 & 0x2) == 0 ? local41 : -local41);
	}
}
