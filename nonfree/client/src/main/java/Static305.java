import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "Lclient!ao;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_59 = new Class243(0, 11);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)[B")
	public static byte[] method4769(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub13_Sub5 local12 = (Class2_Sub13_Sub5) Static75.aClass65_1.method1918((long) arg0);
		if (local12 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static202.method3259(local51, local28);
				@Pc(60) byte local60 = local22[local56];
				local22[local56] = local22[local51];
				local22[local51] = local22[511 - local45] = local60;
			}
			local12 = new Class2_Sub13_Sub5(local22);
			Static75.aClass65_1.method1921((long) arg0, local12);
		}
		return local12.aByteArray64;
	}
}
