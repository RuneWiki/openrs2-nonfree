import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_1 = new Class183(8, 7);

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!nq;IZI[I)Lclient!ld;")
	public static Class137_Sub1_Sub1 method146(@OriginalArg(0) int arg0, @OriginalArg(1) Class167_Sub1 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3) {
		if (arg1.aBoolean357 || Static94.method1600(arg0) && Static94.method1600(arg2)) {
			return new Class137_Sub1_Sub1(arg1, 3553, arg0, arg2, false, arg3);
		} else if (arg1.aBoolean365) {
			return new Class137_Sub1_Sub1(arg1, 34037, arg0, arg2, false, arg3);
		} else {
			return new Class137_Sub1_Sub1(arg1, arg0, arg2, Static342.method4774(arg0), Static342.method4774(arg2), arg3);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class23_Sub7 local7 = new Class23_Sub7();
		local7.aString64 = arg2;
		local7.anInt6973 = arg4;
		local7.anInt6974 = arg6;
		local7.anInt6966 = Static172.anInt3107 + arg5;
		local7.anInt6977 = arg1;
		local7.anInt6970 = arg0;
		local7.anInt6968 = arg3;
		Static125.aClass194_3.method4582(local7);
	}
}
