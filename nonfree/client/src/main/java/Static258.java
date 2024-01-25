import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	public static int anInt5240;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString54;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public static int anInt5238 = -1;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!an;Lclient!an;BLclient!an;Lclient!an;)V")
	public static void method4390(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) Class16 arg3) {
		Static196.aClass16_52 = arg1;
		Static314.aClass16_78 = arg2;
		Static266.aClass16_72 = arg0;
		Static510.aClass16_116 = arg3;
		Static71.aClass198ArrayArray1 = new Class198[Static314.aClass16_78.method407()][];
		Static126.aBooleanArray46 = new boolean[Static314.aClass16_78.method407()];
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ik;ILclient!ik;)V")
	public static void method4393(@OriginalArg(0) Class12 arg0, @OriginalArg(2) Class12 arg1) {
		if (arg1.aClass12_284 != null) {
			arg1.method7967();
		}
		arg1.aClass12_284 = arg0.aClass12_284;
		arg1.aClass12_283 = arg0;
		arg1.aClass12_284.aClass12_283 = arg1;
		arg1.aClass12_283.aClass12_284 = arg1;
	}
}
