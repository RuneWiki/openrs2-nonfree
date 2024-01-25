import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!vl;")
	public static final Class379 aClass379_5 = new Class379(16);

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	public static int anInt8550 = 0;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_65 = new Class340();

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_161 = new Class322(51, -1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZLclient!vo;)V")
	public static void method7497(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class381 arg1) {
		@Pc(23) int local23 = arg1.anInt10100 == 0 ? arg1.anInt10159 : arg1.anInt10100;
		@Pc(36) int local36 = arg1.anInt10142 == 0 ? arg1.anInt10131 : arg1.anInt10142;
		Static83.method1220(local23, arg1.anInt10089, arg0, local36, Static686.aClass381ArrayArray2[arg1.anInt10089 >> 16]);
		if (arg1.aClass381Array2 != null) {
			Static83.method1220(local23, arg1.anInt10089, arg0, local36, arg1.aClass381Array2);
		}
		@Pc(71) Class6_Sub25 local71 = (Class6_Sub25) Static477.aClass74_31.method1401((long) arg1.anInt10089);
		if (local71 != null) {
			Static530.method7616(local23, arg0, local36, local71.anInt5007);
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)I")
	public static int method7498() {
		return Static427.method6510(false, -17827);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public static void method7499() {
		Static273.anIntArray276 = null;
		Static409.aClass75_13 = null;
		Static25.anInterface24Array1 = null;
		Static500.anInt8393 = -1;
		Static568.aClass109_13 = null;
		Static391.anInterface24_1 = null;
		Static150.anInt3123 = -1;
		Static290.anInt10204 = -1;
		Static604.aClass109_11 = null;
		Static47.aClass109_1 = null;
		Static35.anInt464 = -1;
		Static23.aClass284_1.method7015();
	}
}
