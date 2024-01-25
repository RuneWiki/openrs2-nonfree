import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)[B")
	public static byte[] method2645(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub3_Sub8 local14 = (Class3_Sub3_Sub8) Static209.aClass189_7.method4445((long) arg0);
		if (local14 == null) {
			@Pc(26) byte[] local26 = new byte[512];
			@Pc(32) Random local32 = new Random((long) arg0);
			for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
				local26[local34] = (byte) local34;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(53) int local53 = 255 - local47;
				@Pc(58) int local58 = Static231.method3920(local32, local53);
				@Pc(62) byte local62 = local26[local58];
				local26[local58] = local26[local53];
				local26[local53] = local26[511 - local47] = local62;
			}
			local14 = new Class3_Sub3_Sub8(local26);
			Static209.aClass189_7.method4442((long) arg0, local14);
		}
		return local14.aByteArray20;
	}
}
