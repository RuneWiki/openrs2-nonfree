import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "F")
	public static float aFloat206;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_125 = new Class387(53, 5);

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)[B")
	public static byte[] method9057(@OriginalArg(0) int arg0) {
		@Pc(21) Class5_Sub5_Sub3 local21 = (Class5_Sub5_Sub3) Static74.aClass90_3.method1632((long) arg0);
		if (local21 == null) {
			@Pc(26) byte[] local26 = new byte[512];
			@Pc(32) Random local32 = new Random((long) arg0);
			for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
				local26[local34] = (byte) local34;
			}
			for (@Pc(49) int local49 = 0; local49 < 255; local49++) {
				@Pc(58) int local58 = 255 - local49;
				@Pc(63) int local63 = Static547.method7966(local58, local32);
				@Pc(67) byte local67 = local26[local63];
				local26[local63] = local26[local58];
				local26[local58] = local26[511 - local49] = local67;
			}
			local21 = new Class5_Sub5_Sub3(local26);
			Static74.aClass90_3.method1631(local21, (long) arg0);
		}
		return local21.aByteArray11;
	}
}
