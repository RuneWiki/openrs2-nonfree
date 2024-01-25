import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	public static int anInt7634;

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "Lclient!dia;")
	public static Class79 aClass79_1 = new Class79();

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "[I")
	public static final int[] anIntArray414 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "J")
	public static long aLong210 = 0L;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
	public static final int anInt7636 = 1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ofa;ILclient!ofa;)V")
	public static void method6354(@OriginalArg(0) Class265 arg0, @OriginalArg(2) Class265 arg1) {
		@Pc(12) Class3_Sub37 local12 = Static90.method1509(Static592.aClass240_105, Static226.aClass144_2);
		local12.aClass3_Sub4_Sub1_2.method7909(arg1.anInt7032);
		local12.aClass3_Sub4_Sub1_2.method7936(arg1.anInt7005);
		local12.aClass3_Sub4_Sub1_2.method7920(arg0.anInt7004);
		local12.aClass3_Sub4_Sub1_2.method7920(arg0.anInt7005);
		local12.aClass3_Sub4_Sub1_2.method7913(arg0.anInt7032);
		local12.aClass3_Sub4_Sub1_2.method7920(arg1.anInt7004);
		Static301.method2678(local12);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!uq;)V")
	public static void method6355(@OriginalArg(1) Class362 arg0) {
		Static368.aClass362_76 = arg0;
	}
}
