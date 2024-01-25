import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static194 {

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	public static int anInt7614;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "[I")
	public static int[] anIntArray571 = new int[2];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!tn;Lclient!tn;)V")
	public static void method5862(@OriginalArg(1) Class229 arg0, @OriginalArg(2) Class229 arg1) {
		Static224.method3272(Static15.aClass254_12);
		Static201.aClass1_Sub14_Sub2_2.method4522(arg1.anInt6923);
		Static201.aClass1_Sub14_Sub2_2.method4495(arg1.anInt6860);
		Static201.aClass1_Sub14_Sub2_2.method4540(arg0.anInt6923);
		Static201.aClass1_Sub14_Sub2_2.method4495(arg0.anInt6860);
		Static201.aClass1_Sub14_Sub2_2.method4495(arg0.anInt6918);
		Static201.aClass1_Sub14_Sub2_2.method4505(arg1.anInt6918);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)I")
	public static int method5866(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
