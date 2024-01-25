import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZ)I")
	public static int method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(31) double local31 = (local10 - local22) * Math.random() + local22;
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZBII)I")
	public static int method5128(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub37 local8 = Static498.method7299(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray553.length > arg2) {
			return local8.anIntArray553[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!pf;III)V")
	public static void method5129(@OriginalArg(1) Class5_Sub40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.aClass5_Sub12_Sub2_2.method8622(arg1);
		arg0.aClass5_Sub12_Sub2_2.method8604(arg3);
		arg0.aClass5_Sub12_Sub2_2.method8604(arg2);
	}
}
