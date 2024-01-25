import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I")
	public static int method5016() {
		return Static344.method5030(false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
	public static void method5017() {
		Static340.aClass10_37.method369(50);
		Static229.aClass10_18.method369(50);
		Static217.aClass10_16.method369(50);
		Static336.aClass10_35.method369(50);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static541.method5288(arg1, arg0) | (arg1 & 0x70000) != 0 || Static426.method6548(arg0, arg1);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!gga;B)Lclient!hq;")
	public static Class149 method5019(@OriginalArg(0) Class6_Sub23 arg0) {
		@Pc(15) int local15 = arg0.method8363();
		return new Class149(local15);
	}
}
