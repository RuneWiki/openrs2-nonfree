import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public static int anInt1486 = -1;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "Z")
	public static boolean aBoolean99 = true;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)I")
	public static int method1474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static382.anIntArray396[arg1 & 0x3] : Static388.anIntArray398[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)[B")
	public static byte[] method1476(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub3_Sub10 local12 = (Class3_Sub3_Sub10) Static20.aClass85_9.method2040((long) arg0);
		if (local12 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static438.method2068(local28, local52);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local12 = new Class3_Sub3_Sub10(local22);
			Static20.aClass85_9.method2039(local12, (long) arg0);
		}
		return local12.aByteArray50;
	}
}
