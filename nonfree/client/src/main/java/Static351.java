import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
	public static int anInt6666;

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "Lclient!tj;")
	public static Class193 aClass193_110;

	@OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
	public static int anInt6675;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!pl;III)V")
	public static void method5596(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static134.anIntArrayArrayArray17[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt5989 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass4_Sub33_Sub1Array3[arg0.anInt5989++] = Static25.aClass4_Sub33_Sub1Array1[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt5989; local19 < 4; local19++) {
			arg0.aClass4_Sub33_Sub1Array3[local19] = null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lclient!uj;")
	public static Class201 method5597(@OriginalArg(1) int arg0) {
		@Pc(10) Class201 local10 = (Class201) Static244.aClass198_176.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static322.aClass193_37.method5047(30, arg0);
		local10 = new Class201();
		if (local20 != null) {
			local10.method5270(arg0, new Class4_Sub11(local20));
		}
		Static244.aClass198_176.method5201(local10, (long) arg0);
		return local10;
	}
}
