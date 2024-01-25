import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!ov;")
	public static Class226 aClass226_10;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
	public static boolean aBoolean637 = false;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBII)V")
	public static void method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
		Static455.aClass1_Sub6_Sub2_2.method3937(Static295.aClass158_7.anInt4745);
		Static455.aClass1_Sub6_Sub2_2.method3937(arg0);
		Static455.aClass1_Sub6_Sub2_2.method3937(arg2);
		Static455.aClass1_Sub6_Sub2_2.method3919(arg1);
		Static455.aClass1_Sub6_Sub2_2.method3919(arg3);
		Static458.anInt7794 = 0;
		Static179.anInt3165 = 1;
		Static270.anInt5118 = -3;
		Static184.anInt7342 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qa;Lclient!lb;III)V")
	public static void method7514(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class255 local12;
		if (arg3 < Static93.anInt1898) {
			local12 = Static242.aClass255ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass49_Sub5_2 != null && local12.aClass49_Sub5_2.method7451()) {
				arg1.method7456(0, 0, arg0, Static201.anInt3950, true, local12.aClass49_Sub5_2);
			}
		}
		if (arg4 < Static93.anInt1898) {
			local12 = Static242.aClass255ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass49_Sub5_2 != null && local12.aClass49_Sub5_2.method7451()) {
				arg1.method7456(Static201.anInt3950, 0, arg0, 0, true, local12.aClass49_Sub5_2);
			}
		}
		if (arg3 < Static93.anInt1898 && arg4 < Static382.anInt6965) {
			local12 = Static242.aClass255ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass49_Sub5_2 != null && local12.aClass49_Sub5_2.method7451()) {
				arg1.method7456(Static201.anInt3950, 0, arg0, Static201.anInt3950, true, local12.aClass49_Sub5_2);
			}
		}
		if (arg3 < Static93.anInt1898 && arg4 > 0) {
			local12 = Static242.aClass255ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass49_Sub5_2 != null && local12.aClass49_Sub5_2.method7451()) {
				arg1.method7456(-Static201.anInt3950, 0, arg0, Static201.anInt3950, true, local12.aClass49_Sub5_2);
			}
		}
	}
}
