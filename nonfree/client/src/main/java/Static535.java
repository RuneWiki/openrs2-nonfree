import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
	public static int anInt8296 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
	public static void method7191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 < arg1) {
			Static559.method7424(arg0, Static172.anIntArrayArray17[arg2], arg1, arg3);
		} else {
			Static559.method7424(arg0, Static172.anIntArrayArray17[arg2], arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!bn;)V")
	public static void method7192(@OriginalArg(1) Class4_Sub11_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static657.anInt10371; local7++) {
			@Pc(13) int local13 = Static170.anIntArray219[local7];
			@Pc(17) Class3_Sub1_Sub2_Sub2_Sub1 local17 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local13];
			@Pc(21) int local21 = arg0.method8865();
			if ((local21 & 0x20) != 0) {
				local21 += arg0.method8865() << 8;
			}
			if ((local21 & 0x200) != 0) {
				local21 += arg0.method8865() << 16;
			}
			Static59.method1325(local17, arg0, local21, local13);
		}
	}
}
