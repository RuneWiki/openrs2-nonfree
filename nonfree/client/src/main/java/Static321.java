import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[Lclient!ub;")
	public static Class1_Sub4[] aClass1_Sub4Array2;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "[[[Lclient!cq;")
	public static Class53[][][] aClass53ArrayArrayArray2;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static int anInt6261 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZI)Z")
	public static boolean method5320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public static void method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static591.method8355(local7.aClass1_Sub4_Sub5_2);
		Static591.method8355(local7.aClass1_Sub4_Sub5_1);
		if (local7.aClass1_Sub4_Sub5_2 != null) {
			local7.aClass1_Sub4_Sub5_2 = null;
		}
		if (local7.aClass1_Sub4_Sub5_1 != null) {
			local7.aClass1_Sub4_Sub5_1 = null;
		}
	}
}
