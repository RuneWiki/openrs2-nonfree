import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_1;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public static int anInt1151;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	public static int anInt1156;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	public static int anInt1149 = 0;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "[I")
	public static int[] anIntArray107 = new int[64];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public static void method876() {
		Static50.aClass155_10.method4362();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!im;)V")
	public static void method878(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (Static164.aClass14_4 == null) {
			return;
		}
		try {
			Static164.aClass14_4.method236(0L);
			Static164.aClass14_4.method232(arg1.aByteArray39, arg0, 24);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!sa;")
	public static Class143 method880(@OriginalArg(0) int arg0) {
		@Pc(10) Class143 local10 = (Class143) Static178.aClass155_34.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static247.aClass83_168.method2306(Static164.method3045(arg0), Static267.method2731(arg0));
		local10 = new Class143();
		local10.anInt5182 = arg0;
		if (local25 != null) {
			local10.method4066(new Class1_Sub16(local25));
		}
		local10.method4074();
		Static178.aClass155_34.method4360((long) arg0, local10);
		return local10;
	}
}
