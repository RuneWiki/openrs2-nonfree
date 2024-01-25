import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kq", name = "cb", descriptor = "Lclient!bq;")
	public static Class31 aClass31_5;

	@OriginalMember(owner = "client!kq", name = "fb", descriptor = "[Lclient!ar;")
	public static Class3_Sub1_Sub2[] aClass3_Sub1_Sub2Array1;

	@OriginalMember(owner = "client!kq", name = "Xb", descriptor = "I")
	public static int anInt5000;

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!kq", name = "db", descriptor = "Z")
	public static boolean aBoolean375 = false;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIILclient!ab;)V")
	public static void method4419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4) {
		@Pc(4) Class73 local4 = Static558.method7416(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9925 = (arg1 << Static273.anInt4424) + Static85.anInt1770;
		arg4.anInt9915 = arg3;
		arg4.anInt9917 = (arg2 << Static273.anInt4424) + Static85.anInt1770;
		local4.aClass3_Sub1_Sub1_1 = arg4;
		@Pc(33) int local33 = Static140.aClass42Array4 == Static146.aClass42Array3 ? 1 : 0;
		if (arg4.method8500()) {
			if (arg4.method8501()) {
				arg4.aClass3_Sub1_23 = Static506.aClass3_Sub1Array3[local33];
				Static506.aClass3_Sub1Array3[local33] = arg4;
				return;
			}
			arg4.aClass3_Sub1_23 = Static114.aClass3_Sub1Array1[local33];
			Static114.aClass3_Sub1Array1[local33] = arg4;
			Static42.aBoolean73 = true;
			return;
		}
		arg4.aClass3_Sub1_23 = Static596.aClass3_Sub1Array4[local33];
		Static596.aClass3_Sub1Array4[local33] = arg4;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!gha;)I")
	public static int method4424(@OriginalArg(1) Class134 arg0) {
		if (arg0 == Static587.aClass134_4) {
			return 9216;
		} else if (Static117.aClass134_1 == arg0) {
			return 34065;
		} else if (arg0 == Static274.aClass134_2) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(JIZLjava/lang/String;IJZIIIILjava/lang/String;Z)V")
	public static void method4431(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) boolean arg11) {
		if (!Static333.aBoolean400 && Static574.anInt8895 < 500) {
			@Pc(23) int local23 = arg4 == -1 ? Static530.anInt8205 : arg4;
			@Pc(39) Class4_Sub5_Sub17 local39 = new Class4_Sub5_Sub17(arg10, arg3, local23, arg8, arg1, arg5, arg9, arg7, arg11, arg6, arg0, arg2);
			Static171.method2839(local39);
		}
	}
}
