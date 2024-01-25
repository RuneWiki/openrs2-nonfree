import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	public static int anInt6160;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "I")
	public static int anInt6175;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "J")
	public static long aLong194 = 0L;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[B")
	public static byte[] method4916(@OriginalArg(0) int arg0) {
		@Pc(12) Class7_Sub4_Sub5 local12 = (Class7_Sub4_Sub5) Static59.aClass86_1.method2019((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(45) int local45 = 255 - local38;
				@Pc(50) int local50 = Static304.method4043(local45, local23);
				@Pc(54) byte local54 = local17[local50];
				local17[local50] = local17[local45];
				local17[local45] = local17[511 - local38] = local54;
			}
			local12 = new Class7_Sub4_Sub5(local17);
			Static59.aClass86_1.method2018(local12, (long) arg0);
		}
		return local12.aByteArray12;
	}
}
