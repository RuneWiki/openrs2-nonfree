import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Z")
	public static boolean aBoolean412 = true;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_5 = new Class210(11, 0, 1, 2);

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_65 = new Class61(82, 8);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBLclient!bi;)Lclient!kga;")
	public static Class196 method4643(@OriginalArg(1) int arg0, @OriginalArg(3) Class31 arg1) {
		@Pc(9) byte[] local9 = arg1.method667(arg0, 0);
		return local9 == null ? null : new Class196(local9);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLclient!gba;)V")
	public static void method4644(@OriginalArg(1) Class115 arg0) {
		if (arg0.anInt3519 == 5 && arg0.anInt3510 != -1) {
			Static248.method4207(Static185.aClass66_14, arg0);
		}
	}
}
