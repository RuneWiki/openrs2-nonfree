import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)[B")
	public static byte[] method6207(@OriginalArg(0) int arg0) {
		@Pc(20) Class4_Sub5_Sub10 local20 = (Class4_Sub5_Sub10) Static92.aClass245_1.method5976((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(52) int local52 = 255 - local46;
				@Pc(57) int local57 = Static406.method6391(local31, local52);
				@Pc(61) byte local61 = local25[local57];
				local25[local57] = local25[local52];
				local25[local52] = local25[511 - local46] = local61;
			}
			local20 = new Class4_Sub5_Sub10(local25);
			Static92.aClass245_1.method5975(local20, (long) arg0);
		}
		return local20.aByteArray56;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIZ)I")
	public static int method6208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(30) double local30 = local22 + Math.random() * (local10 - local22);
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}
}
