import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
	public static int anInt9107;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "Lclient!lb;")
	public static Class221 aClass221_138;

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
	public static int anInt9108 = 0;

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "[I")
	public static final int[] anIntArray499 = new int[6];

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method7616(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg0;
			return arg1 ? Static456.method6762(local20) : local20;
		} else if (arg0 instanceof Class150) {
			@Pc(35) Class150 local35 = (Class150) arg0;
			return local35.method9041();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!hi;I)V")
	public static void method7617(@OriginalArg(0) Class151 arg0) {
		Static301.aClass151_1 = arg0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(FIFFBIFIILclient!bo;F)[B")
	public static byte[] method7618(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(9) Class34 arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static717.method9353(0, arg1, arg5, local10, arg3, arg4, arg2, arg0);
		return local10;
	}
}
