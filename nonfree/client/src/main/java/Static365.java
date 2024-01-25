import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!kea;")
	public static Class161 aClass161_80;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!kea;")
	public static Class161 aClass161_82;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIZII)Lclient!kea;")
	public static Class161 method5728(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(5) Class182 local5 = null;
		if (Static258.aClass196_3 != null) {
			local5 = new Class182(arg2, Static258.aClass196_3, Static227.aClass196Array1[arg2], 1000000);
		}
		Static400.aClass113_Sub1Array2[arg2] = Static4.aClass170_9.method4634(local5, arg2, Static238.aClass182_1);
		if (arg0) {
			Static400.aClass113_Sub1Array2[arg2].method5713();
		}
		return new Class161(Static400.aClass113_Sub1Array2[arg2], arg1, 1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method5730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
