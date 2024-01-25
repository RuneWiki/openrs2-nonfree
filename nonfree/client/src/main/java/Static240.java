import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "Z")
	public static boolean aBoolean266;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_95 = new Class25(14, 12);

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Lclient!gi;")
	public static Class93 aClass93_14 = null;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	public static int anInt4050 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[B")
	public static byte[] method3277(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub1_Sub9 local12 = (Class2_Sub1_Sub9) Static431.aClass111_3.method2310((long) arg0);
		if (local12 == null) {
			@Pc(21) byte[] local21 = new byte[512];
			@Pc(27) Random local27 = new Random((long) arg0);
			for (@Pc(29) int local29 = 0; local29 < 255; local29++) {
				local21[local29] = (byte) local29;
			}
			for (@Pc(42) int local42 = 0; local42 < 255; local42++) {
				@Pc(49) int local49 = 255 - local42;
				@Pc(54) int local54 = Static408.method1356(local27, local49);
				@Pc(58) byte local58 = local21[local54];
				local21[local54] = local21[local49];
				local21[local49] = local21[511 - local42] = local58;
			}
			local12 = new Class2_Sub1_Sub9(local21);
			Static431.aClass111_3.method2312(local12, (long) arg0);
		}
		return local12.aByteArray49;
	}
}
