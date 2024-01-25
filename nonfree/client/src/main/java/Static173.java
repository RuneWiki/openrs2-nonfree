import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	public static int anInt3502;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_7;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "[I")
	public static final int[] anIntArray229 = new int[14];

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_71 = new Class200(105, 7);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Lclient!fba;")
	public static Class108 method2997(@OriginalArg(1) int arg0) {
		@Pc(15) Class108 local15 = (Class108) Static378.aClass69_55.method1919((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static192.aClass238_93.method5567(arg0, 0);
		local15 = new Class108();
		if (local25 != null) {
			local15.method2636(new Class2_Sub17(local25), arg0);
		}
		Static378.aClass69_55.method1917((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!vl;)V")
	public static void method2998(@OriginalArg(1) Class16_Sub1_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt8117 - Static389.anInt6694;
		@Pc(24) int local24 = arg0.anInt8071 * 512 + arg0.method6999() * 256;
		@Pc(35) int local35 = arg0.anInt8050 * 512 + arg0.method6999() * 256;
		arg0.anInt8037 += (local24 - arg0.anInt8037) / local9;
		arg0.anInt8136 = 0;
		arg0.anInt8034 += (local35 - arg0.anInt8034) / local9;
		if (arg0.anInt8056 == 0) {
			arg0.method7003(8192);
		}
		if (arg0.anInt8056 == 1) {
			arg0.method7003(12288);
		}
		if (arg0.anInt8056 == 2) {
			arg0.method7003(0);
		}
		if (arg0.anInt8056 == 3) {
			arg0.method7003(4096);
		}
	}
}
