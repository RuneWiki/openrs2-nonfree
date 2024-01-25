import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "E", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_5 = new Class181(85, -1);

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B[S)[S")
	public static short[] method432(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static655.method4111(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	public static void method435() {
		Static181.aClass44_14 = null;
		Static540.aClass44_30 = null;
		Static42.aClass44_2 = null;
		Static327.aClass44_18 = null;
		Static158.aClass44Array7 = null;
		Static146.aClass44_9 = null;
		Static646.aClass44_38 = null;
		Static192.aClass44_29 = null;
		Static87.aClass44_5 = null;
	}
}
