import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
	public static int anInt4619;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "S")
	public static short aShort70 = 32767;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3693(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static164.method2403(Static349.aClass208_81);
			Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(arg0));
			Static389.aClass2_Sub17_Sub1_2.method6151(arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLclient!pb;I)I")
	public static int method3696(@OriginalArg(1) Class194 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIILclient!mn;)Lclient!po;")
	public static Class2_Sub1_Sub14 method3697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class171 arg2) {
		@Pc(14) Class2_Sub17 local14 = new Class2_Sub17(arg2.method3658(arg0, arg1));
		@Pc(49) Class2_Sub1_Sub14 local49 = new Class2_Sub1_Sub14(arg1, local14.method6141(), local14.method6141(), local14.method6129(), local14.method6129(), local14.method6138() == 1, local14.method6138(), local14.method6138());
		@Pc(53) int local53 = local14.method6138();
		for (@Pc(55) int local55 = 0; local55 < local53; local55++) {
			local49.aClass181_30.method3973(new Class2_Sub24(local14.method6138(), local14.method6148(), local14.method6148(), local14.method6148(), local14.method6148(), local14.method6148(), local14.method6148(), local14.method6148(), local14.method6148()));
		}
		local49.method4555();
		return local49;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
	public static boolean method3698(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}
