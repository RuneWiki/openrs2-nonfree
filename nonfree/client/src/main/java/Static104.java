import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_53 = new Class362(59, 8);

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "[Lclient!qw;")
	public static Class281[] aClass281Array1 = new Class281[50];

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "[I")
	public static final int[] anIntArray101 = new int[13];

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIBZII)V")
	public static void method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg3 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(22) Class4_Sub18 local22 = (Class4_Sub18) Static201.aClass350_15.method8207(local14);
		if (local22 == null) {
			local22 = new Class4_Sub18();
			Static201.aClass350_15.method8199(local14, local22);
		}
		if (local22.anIntArray144.length <= arg1) {
			@Pc(47) int[] local47 = new int[arg1 + 1];
			@Pc(52) int[] local52 = new int[arg1 + 1];
			for (@Pc(54) int local54 = 0; local54 < local22.anIntArray144.length; local54++) {
				local47[local54] = local22.anIntArray144[local54];
				local52[local54] = local22.anIntArray143[local54];
			}
			for (@Pc(80) int local80 = local22.anIntArray144.length; local80 < arg1; local80++) {
				local47[local80] = -1;
				local52[local80] = 0;
			}
			local22.anIntArray143 = local52;
			local22.anIntArray144 = local47;
		}
		local22.anIntArray144[arg1] = arg4;
		local22.anIntArray143[arg1] = arg0;
	}
}
