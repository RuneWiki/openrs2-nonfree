import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public static int anInt5487;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "F")
	public static float aFloat72 = 1024.0F;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	public static int method4400() {
		@Pc(10) Class77 local10 = Static309.aClass77_37;
		synchronized (Static309.aClass77_37) {
			return Static309.aClass77_37.method1388();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[B")
	public static byte[] method4404(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub3_Sub18 local17 = (Class1_Sub3_Sub18) Static223.aClass54_33.method922((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static133.method1697(local50, local28);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local17 = new Class1_Sub3_Sub18(local22);
			Static223.aClass54_33.method920(local17, (long) arg0);
		}
		return local17.aByteArray92;
	}
}
