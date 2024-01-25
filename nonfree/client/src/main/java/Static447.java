import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_129 = new Class237(33, -2);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IFLclient!av;IBFFIFIF)[B")
	public static byte[] method5987(@OriginalArg(1) float arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(17) byte[] local17 = new byte[262144];
		Static74.method1249(arg1, arg3, arg5, 0, local17, arg2, arg4, arg0);
		return local17;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZIIB)I")
	public static int method5988(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class1_Sub45 local13 = Static193.method906(arg0, arg1);
		if (local13 == null) {
			return 0;
		} else if (arg2 >= 0 && local13.anIntArray681.length > arg2) {
			return local13.anIntArray681[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method5989(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		@Pc(40) int local40 = arg0 / 10;
		while (local40 != 0) {
			local40 /= 10;
			local36++;
		}
		@Pc(55) char[] local55 = new char[local36];
		local55[0] = '+';
		for (@Pc(63) int local63 = local36 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 < 10) {
				local55[local63] = (char) (local78 + 48);
			} else {
				local55[local63] = (char) (local78 + 87);
			}
		}
		return new String(local55);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(JBLclient!qa;)V")
	public static void method5990(@OriginalArg(0) long arg0, @OriginalArg(2) Class109 arg1) {
		Static276.anInt4920 = Static63.anInt1320;
		Static119.anInt7599 = 0;
		Static63.anInt1320 = 0;
		@Pc(16) long local16 = Static101.method1557();
		for (@Pc(23) Class39_Sub8 local23 = (Class39_Sub8) Static138.aClass188_3.method4534(); local23 != null; local23 = (Class39_Sub8) Static138.aClass188_3.method4530()) {
			if (local23.method5619(arg1, arg0)) {
				Static119.anInt7599++;
			}
		}
		if (Static153.aBoolean405 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static138.aClass188_3.method4535() + ", running: " + Static119.anInt7599 + ". Particles: " + Static63.anInt1320 + ". Time taken: " + (Static101.method1557() - local16) + "ms");
		}
	}
}
