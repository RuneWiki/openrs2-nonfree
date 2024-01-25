import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "[Lclient!km;")
	public static Class180[] aClass180Array1;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
	public static int[] anIntArray580;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZB)I")
	public static int method8082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class4_Sub30 local8 = Static289.method4604(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray329.length) {
			return local8.anIntArray329[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public static void method8088() {
		for (@Pc(12) int local12 = 0; local12 < Static347.aClass116ArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static347.aClass116ArrayArray1[local12].length; local16++) {
				Static347.aClass116ArrayArray1[local12][local16] = Static308.aClass116_2;
			}
		}
	}
}
