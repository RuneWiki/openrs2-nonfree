import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!eda;")
	public static Class35 aClass35_6;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom6 = new Random();

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public static int anInt4208 = 999999;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3437(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(2, arg0);
		local8.method3509();
		local8.aString55 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
	public static int method3438() {
		if ((double) Static110.aFloat177 == 3.0D) {
			return 37;
		} else if ((double) Static110.aFloat177 == 4.0D) {
			return 50;
		} else if ((double) Static110.aFloat177 == 6.0D) {
			return 75;
		} else if ((double) Static110.aFloat177 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!oh;III)Lclient!ur;")
	public static Class345 method3439(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method6314(arg1, 0);
		return local9 == null ? null : new Class345(local9);
	}
}
