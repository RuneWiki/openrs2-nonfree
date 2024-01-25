import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[B")
	public static byte[] method2482(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub5_Sub13 local12 = (Class6_Sub5_Sub13) Static248.aClass146_2.method3536((long) arg0);
		if (local12 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(53) int local53 = 255 - local46;
				@Pc(58) int local58 = Static309.method4643(local31, local53);
				@Pc(62) byte local62 = local25[local58];
				local25[local58] = local25[local53];
				local25[local53] = local25[511 - local46] = local62;
			}
			local12 = new Class6_Sub5_Sub13(local25);
			Static248.aClass146_2.method3534((long) arg0, local12);
		}
		return local12.aByteArray84;
	}
}
