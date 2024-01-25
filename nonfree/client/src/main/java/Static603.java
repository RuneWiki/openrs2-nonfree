import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static603 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_178 = new Class322(128, 7);

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[Lclient!dm;")
	public static final Class6_Sub13[] aClass6_Sub13Array1 = new Class6_Sub13[300];

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	public static int anInt9534 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Z")
	public static boolean method8318(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)[Lclient!hj;")
	public static Class158[] method8319() {
		return new Class158[] { Static108.aClass158_1, Static421.aClass158_10, Static241.aClass158_5, Static273.aClass158_6, Static678.aClass158_15, Static321.aClass158_8, Static320.aClass158_7, Static450.aClass158_11, Static538.aClass158_12, Static593.aClass158_14, Static544.aClass158_13, Static209.aClass158_4, Static443.aClass158_3, Static387.aClass158_9 };
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!lga;ZLclient!ng;IZ)V")
	public static void method8320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(4) Class6_Sub17_Sub4 arg3) {
		Static551.method7805(arg0, arg2, arg1);
		Static145.aClass6_Sub17_Sub4_2 = arg3;
	}
}
