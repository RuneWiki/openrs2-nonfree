import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[B")
	public static byte[] method7947(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub7_Sub14 local17 = (Class3_Sub7_Sub14) Static421.aClass116_3.method3126((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static164.method2981(local28, local51);
				@Pc(60) byte local60 = local22[local56];
				local22[local56] = local22[local51];
				local22[local51] = local22[511 - local45] = local60;
			}
			local17 = new Class3_Sub7_Sub14(local22);
			Static421.aClass116_3.method3127(local17, (long) arg0);
		}
		return local17.aByteArray41;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)Z")
	public static boolean method7948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
