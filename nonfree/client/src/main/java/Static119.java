import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!du", name = "q", descriptor = "Lclient!ha;")
	public static Class95 aClass95_4;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "Lclient!og;")
	public static final Class266 aClass266_7 = new Class266();

	@OriginalMember(owner = "client!du", name = "o", descriptor = "Lclient!eo;")
	public static final Class108 aClass108_4 = new Class108(4, 1);

	@OriginalMember(owner = "client!du", name = "p", descriptor = "Lclient!eo;")
	public static final Class108 aClass108_5 = new Class108(0, 1);

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(I)[Lclient!aka;")
	public static Class16[] method1809() {
		return new Class16[] { Static422.aClass16_2, Static225.aClass16_1, Static555.aClass16_4 };
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!ofa;)V")
	public static void method1811(@OriginalArg(1) Class265 arg0) {
		@Pc(7) Class265 local7 = Static26.method591(arg0);
		@Pc(18) int local18;
		@Pc(16) int local16;
		if (local7 == null) {
			local16 = Static13.anInt306;
			local18 = Static531.anInt8327;
		} else {
			local16 = local7.anInt6997;
			local18 = local7.anInt7024;
		}
		Static563.method7423(false, local16, local18, arg0);
		Static285.method4138(local16, arg0, local18);
	}
}
