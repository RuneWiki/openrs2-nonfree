import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "[Lclient!pf;")
	public static Class284[] aClass284Array1;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	public static int anInt4629;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array14;

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_114 = new Class381(17, 8);

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZIILclient!gda;III)V")
	public static void method4182(@OriginalArg(2) int arg0, @OriginalArg(3) Class126 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg0 <= 0) {
			Static420.method6160(arg1, arg3, arg2);
			return;
		}
		Static168.aBoolean240 = false;
		Static310.anInt5335 = 1;
		Static524.anInt8330 = arg2;
		Static680.anInt10888 = arg3;
		Static342.aClass126_159 = arg1;
		Static180.anInt3389 = 0;
		Static27.aClass5_Sub4_Sub2_1 = null;
		Static395.anInt6666 = Static445.aClass5_Sub4_Sub2_6.method1809() / arg0;
		if (Static395.anInt6666 < 1) {
			Static395.anInt6666 = 1;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BLclient!rd;)V")
	public static void method4183(@OriginalArg(1) Class311 arg0) {
		Static209.aClass311_1 = arg0;
	}
}
