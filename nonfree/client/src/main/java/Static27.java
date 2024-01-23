import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_4;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!oj;")
	public static Class84 aClass84_11 = new Class84(64);

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "J")
	public static long aLong26 = 0L;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "[S")
	public static short[] aShortArray4 = new short[500];

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "[Lclient!lk;")
	public static Class71[] aClass71Array1 = new Class71[50];

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
	public static int anInt540 = 0;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!hh;")
	public static Class50 aClass50_203 = Static186.method3527("www)2wtrc");

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	public static int anInt541 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[B")
	public static byte[] method394(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub7 local12 = (Class1_Sub1_Sub7) Static116.aClass4_5.method81((long) arg0);
		if (local12 == null) {
			@Pc(25) Random local25 = new Random((long) arg0);
			@Pc(28) byte[] local28 = new byte[512];
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local28[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(49) int local49 = 255 - local43;
				@Pc(54) int local54 = Static131.method2214(local49, local25);
				@Pc(58) byte local58 = local28[local54];
				local28[local54] = local28[local49];
				local28[local49] = local28[511 - local43] = local58;
			}
			local12 = new Class1_Sub1_Sub7(local28);
			Static116.aClass4_5.method83(local12, (long) arg0);
		}
		return local12.aByteArray11;
	}
}
