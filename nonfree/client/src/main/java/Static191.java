import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "Lclient!cea;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_2;

	@OriginalMember(owner = "client!gm", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
	public static int anInt3815 = 0;

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_78 = new Class200(61, 6);

	@OriginalMember(owner = "client!gm", name = "N", descriptor = "[I")
	public static final int[] anIntArray245 = new int[6];

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V")
	public static void method3265() {
		Static248.anInt4780 = -1;
		Static196.aClass31_9 = null;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!aca;)V")
	public static void method3267(@OriginalArg(1) Class2_Sub2 arg0) {
		if (Static348.aClass84ArrayArrayArray5 == null) {
			return;
		}
		@Pc(8) Interface25 local8 = null;
		if (arg0.anInt120 == 0) {
			local8 = (Interface25) Static587.method8331(arg0.anInt125, arg0.anInt129, arg0.anInt119);
		}
		if (arg0.anInt120 == 1) {
			local8 = (Interface25) Static212.method3540(arg0.anInt125, arg0.anInt129, arg0.anInt119);
		}
		if (arg0.anInt120 == 2) {
			local8 = (Interface25) Static22.method567(arg0.anInt125, arg0.anInt129, arg0.anInt119, rca.class);
		}
		if (arg0.anInt120 == 3) {
			local8 = (Interface25) Static366.method5446(arg0.anInt125, arg0.anInt129, arg0.anInt119);
		}
		if (local8 == null) {
			arg0.anInt124 = 0;
			arg0.anInt128 = -1;
			arg0.anInt121 = 0;
		} else {
			arg0.anInt128 = local8.method6207();
			arg0.anInt124 = local8.method6212();
			arg0.anInt121 = local8.method6210();
		}
	}
}
