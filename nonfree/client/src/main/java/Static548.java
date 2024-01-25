import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_302 = new Class288(50, -1);

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_12 = new Class168(10, 4);

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_13 = new Class168(8, 3);

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "Lclient!ow;")
	public static final Class260 aClass260_10 = new Class260("", 10);

	@OriginalMember(owner = "client!tia", name = "f", descriptor = "Lclient!eaa;")
	public static final Class80 aClass80_6 = new Class80("WTI", 5);

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!ha;ZLclient!bd;)I")
	public static int method7557(@OriginalArg(0) Class95 arg0, @OriginalArg(2) Class26 arg1) {
		if (arg1.anInt741 != -1) {
			return arg1.anInt741;
		}
		if (arg1.anInt751 != -1) {
			@Pc(25) Class175 local25 = arg0.anInterface6_27.method1492(arg1.anInt751);
			if (!local25.aBoolean308) {
				return local25.aShort44;
			}
		}
		return arg1.anInt743;
	}
}
