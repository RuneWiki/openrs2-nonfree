import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public static final int anInt5342 = 2;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!em;")
	public static final Class83 aClass83_106 = new Class83(16, 2);

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public static int anInt5347 = 0;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	public static int anInt5348 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BILclient!ls;)V")
	public static void method4399(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub3 arg1) {
		if (arg1.anIntArray448 == null) {
			return;
		}
		@Pc(9) int local9 = arg1.anIntArray448[arg0 + 1];
		if (arg1.anInt7591 == local9) {
			return;
		}
		arg1.anInt7558 = 0;
		arg1.anInt7545 = 0;
		arg1.anInt7607 = arg1.anInt7604;
		arg1.anInt7591 = local9;
		arg1.anInt7595 = 1;
		arg1.anInt7580 = 0;
		if (arg1.anInt7591 != -1) {
			Static473.method6515(arg1, Static223.aClass245_1.method5312(arg1.anInt7591), arg1.anInt7558);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)Z")
	public static boolean method4402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static109.method1516(arg0, arg1) || Static519.method7180(arg0, arg1);
	}
}
