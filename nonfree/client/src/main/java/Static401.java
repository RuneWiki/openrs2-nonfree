import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "Z")
	public static boolean aBoolean564 = true;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)[B")
	public static byte[] method6112(@OriginalArg(1) int arg0) {
		@Pc(20) Class4_Sub6_Sub17 local20 = (Class4_Sub6_Sub17) Static3.aClass340_1.method7723((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(55) int local55 = 255 - local48;
				@Pc(60) int local60 = Static319.method4997(local31, local55);
				@Pc(64) byte local64 = local25[local60];
				local25[local60] = local25[local55];
				local25[local55] = local25[511 - local48] = local64;
			}
			local20 = new Class4_Sub6_Sub17(local25);
			Static3.aClass340_1.method7724((long) arg0, local20);
		}
		return local20.aByteArray83;
	}
}
