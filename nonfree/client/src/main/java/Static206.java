import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt3873;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_3;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public static int anInt3874;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIZI)V")
	public static void method3294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 0) {
			Static586.method8062(false);
		} else {
			Static573.anInt9346 = Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616();
			Static428.method6321(0, true);
		}
		Static66.anInt6448 = arg0;
		Static144.anInt2921 = arg3;
		Static169.aBoolean275 = arg2;
		Static330.method680(arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI[BIIIII[B)V")
	public static void method3295(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(35) int local35;
			for (@Pc(31) int local31 = local10; local31 < 0; local31++) {
				local35 = arg2++;
				arg1[local35] += arg7[arg0++];
				@Pc(47) int local47 = arg2++;
				arg1[local47] += arg7[arg0++];
				@Pc(59) int local59 = arg2++;
				arg1[local59] += arg7[arg0++];
				@Pc(71) int local71 = arg2++;
				arg1[local71] += arg7[arg0++];
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local35 = arg2++;
				arg1[local35] += arg7[arg0++];
			}
			arg0 += arg6;
			arg2 += arg5;
		}
	}
}
