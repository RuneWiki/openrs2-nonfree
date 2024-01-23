import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "Lclient!vm;")
	public static Class177 aClass177_3 = new Class177();

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
	public static void method1150() {
		aClass177_3 = null;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(BI)[B")
	public static byte[] method1151(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub2_Sub5 local16 = (Class4_Sub2_Sub5) Static200.aClass69_8.method1930((long) arg0);
		if (local16 == null) {
			@Pc(26) byte[] local26 = new byte[512];
			@Pc(32) Random local32 = new Random((long) arg0);
			@Pc(34) int local34;
			for (local34 = 0; local34 < 255; local34++) {
				local26[local34] = (byte) local34;
			}
			for (local34 = 0; local34 < 255; local34++) {
				@Pc(57) int local57 = 255 - local34;
				@Pc(62) int local62 = Static241.method3695(local57, local32);
				@Pc(66) byte local66 = local26[local62];
				local26[local62] = local26[local57];
				local26[local57] = local26[511 - local34] = local66;
			}
			local16 = new Class4_Sub2_Sub5(local26);
			Static200.aClass69_8.method1933((long) arg0, local16);
		}
		return local16.aByteArray20;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)V")
	public static void method1152(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub2_Sub21 local16 = Static39.method4121(arg0, 12);
		local16.method4361();
	}
}
