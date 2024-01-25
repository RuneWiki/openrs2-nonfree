import java.util.Random;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!rga", name = "i", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
	public static int anInt8595 = 0;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
	public static int anInt8597 = 0;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!gda;Lclient!gda;B)V")
	public static void method7159(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg1.aClass6_299 != null) {
			arg1.method8792();
		}
		arg1.aClass6_299 = arg0.aClass6_299;
		arg1.aClass6_300 = arg0;
		arg1.aClass6_299.aClass6_300 = arg1;
		arg1.aClass6_300.aClass6_299 = arg1;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)[B")
	public static byte[] method7160(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub5_Sub8 local12 = (Class6_Sub5_Sub8) Static152.aClass117_2.method3389((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static123.method2611(local47, local23);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class6_Sub5_Sub8(local17);
			Static152.aClass117_2.method3390(local12, (long) arg0);
		}
		return local12.aByteArray15;
	}
}
