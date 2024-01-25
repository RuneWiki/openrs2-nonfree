import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Lclient!lm;")
	public static Class134 aClass134_104;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString175 = "wave:";

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)[B")
	public static byte[] method4016(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub20 local12 = (Class1_Sub2_Sub20) Static274.aClass88_9.method1652((long) arg0);
		if (local12 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static304.method5274(local28, local50);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local12 = new Class1_Sub2_Sub20(local22);
			Static274.aClass88_9.method1651((long) arg0, local12);
		}
		return local12.aByteArray81;
	}
}
