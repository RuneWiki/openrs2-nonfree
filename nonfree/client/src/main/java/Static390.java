import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
	public static int anInt6562;

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "Lclient!ja;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "J")
	public static long aLong195 = 0L;

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_154 = new Class265(88, 10);

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "Lclient!di;")
	public static final Class54 aClass54_96 = new Class54(54, 7);

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)[B")
	public static byte[] method5183(@OriginalArg(0) int arg0) {
		@Pc(20) Class2_Sub5_Sub8 local20 = (Class2_Sub5_Sub8) Static418.aClass147_3.method3340((long) arg0);
		if (local20 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(53) int local53 = 255 - local46;
				@Pc(58) int local58 = Static149.method2451(local53, local31);
				@Pc(62) byte local62 = local25[local58];
				local25[local58] = local25[local53];
				local25[local53] = local25[511 - local46] = local62;
			}
			local20 = new Class2_Sub5_Sub8(local25);
			Static418.aClass147_3.method3336(local20, (long) arg0);
		}
		return local20.aByteArray61;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method5185(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static59.method1151(0, arg0, arg1, arg0.length - 1);
	}
}
