import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!la;")
	public static Class96 aClass96_9;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Lclient!en;")
	public static final Class84 aClass84_6 = new Class84("", 14);

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	public static int anInt6245 = 0;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "S")
	public static short aShort66 = 256;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public static void method5062() {
		Static473.anInt8115 = -1;
		Static513.aClass5_37 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)[B")
	public static byte[] method5063(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub8_Sub7 local17 = (Class1_Sub8_Sub7) Static195.aClass16_4.method471((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static46.method765(local50, local28);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local17 = new Class1_Sub8_Sub7(local22);
			Static195.aClass16_4.method476((long) arg0, local17);
		}
		return local17.aByteArray37;
	}
}
