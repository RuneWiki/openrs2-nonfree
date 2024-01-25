import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_195 = new Class12(102, 8);

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_100 = new Class151(4);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZBII[Lclient!tn;)V")
	public static void method3223(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class229[] arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg4.length; local5++) {
			@Pc(13) Class229 local13 = arg4[local5];
			if (local13 != null && arg3 == local13.anInt6882) {
				Static99.method1609(arg2, arg1, arg0, local13);
				Static160.method5104(arg0, local13, arg2);
				if (local13.lb - local13.anInt6905 < local13.anInt6886) {
					local13.anInt6886 = local13.lb - local13.anInt6905;
				}
				if (local13.anInt6871 > local13.anInt6884 - local13.anInt6895) {
					local13.anInt6871 = local13.anInt6884 - local13.anInt6895;
				}
				if (local13.anInt6886 < 0) {
					local13.anInt6886 = 0;
				}
				if (local13.anInt6871 < 0) {
					local13.anInt6871 = 0;
				}
				if (local13.anInt6863 == 0) {
					Static319.method4586(local13, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
	public static void method3225() {
		@Pc(1) Class151 local1 = Static299.aClass151_126;
		synchronized (Static299.aClass151_126) {
			Static299.aClass151_126.method3299();
		}
		local1 = Static241.aClass151_108;
		synchronized (Static241.aClass151_108) {
			Static241.aClass151_108.method3299();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!hh;I)V")
	public static void method3226(@OriginalArg(0) Class109 arg0) {
		Static72.anInt1368 = 0;
		Static336.anInt6116 = 0;
		Static158.aClass242_2 = new Class242();
		Static220.aClass36_Sub3_Sub1_Sub1Array2 = new Class36_Sub3_Sub1_Sub1[1024];
		Static160.method5108(arg0);
		Static324.method4563(arg0);
	}
}
