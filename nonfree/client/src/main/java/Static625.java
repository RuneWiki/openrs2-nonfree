import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Lclient!vm;")
	public static Class130 aClass130_4;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "Z")
	public static boolean aBoolean744 = false;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public static int anInt10415 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[B")
	public static byte[] method8858(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub5_Sub11 local12 = (Class5_Sub5_Sub11) Static398.aClass232_9.method5128((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(44) int local44 = 255 - local38;
				@Pc(49) int local49 = Static130.method1947(local44, local23);
				@Pc(53) byte local53 = local17[local49];
				local17[local49] = local17[local44];
				local17[local44] = local17[511 - local38] = local53;
			}
			local12 = new Class5_Sub5_Sub11(local17);
			Static398.aClass232_9.method5129(local12, (long) arg0);
		}
		return local12.aByteArray52;
	}
}
