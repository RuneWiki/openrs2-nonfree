import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "Lclient!via;")
	public static Class358 aClass358_3;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_87 = new Class185(76, 7);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIB)I")
	public static int method6718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!mha;)V")
	public static void method6719(@OriginalArg(1) Class6_Sub4 arg0) {
		if (arg0.aClass6_Sub27_6 != null) {
			arg0.aClass6_Sub27_6.anInt5145 = 0;
		}
		arg0.aBoolean834 = false;
		for (@Pc(22) Class6_Sub4 local22 = arg0.method8632(); local22 != null; local22 = arg0.method8637()) {
			method6719(local22);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ni;ZLclient!d;)V")
	public static void method6720(@OriginalArg(0) Class223 arg0, @OriginalArg(2) Interface7 arg1) {
		Static637.aClass223_143 = arg0;
		Static132.anInterface7_6 = arg1;
	}
}
