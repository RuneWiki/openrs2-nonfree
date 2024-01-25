import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "Lclient!ha;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "[Lclient!ou;")
	public static final Interface16[] anInterface16Array1 = new Interface16[128];

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	public static void method320() {
		Static548.method7647(-1, 255);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILclient!eq;I)Lclient!fp;")
	public static Class114 method322(@OriginalArg(2) Class97 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method2545(0, arg1);
		return local14 == null ? null : new Class114(local14);
	}
}
