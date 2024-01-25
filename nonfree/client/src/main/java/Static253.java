import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!il", name = "P", descriptor = "Lclient!cb;")
	public static Class50 aClass50_66;

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	public static int anInt4032 = -1;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!wq;B)V")
	public static void method3554(@OriginalArg(0) Class394 arg0) {
		if (arg0.anInt10479 == 5 && arg0.anInt10469 != -1) {
			Static421.method6415(arg0, Static563.aClass143_13);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!cb;I)Lclient!kf;")
	public static Class198 method3556(@OriginalArg(2) Class50 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method916(0, arg1);
		return local14 == null ? null : new Class198(local14);
	}
}
