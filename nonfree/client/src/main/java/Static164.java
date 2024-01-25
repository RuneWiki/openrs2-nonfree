import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gaa", name = "L", descriptor = "Lclient!oga;")
	public static Class239 aClass239_1;

	@OriginalMember(owner = "client!gaa", name = "G", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_74 = new Class56(76, -1);

	@OriginalMember(owner = "client!gaa", name = "J", descriptor = "[Lclient!np;")
	public static final Class3_Sub11[] aClass3_Sub11Array1 = new Class3_Sub11[2048];

	@OriginalMember(owner = "client!gaa", name = "K", descriptor = "I")
	public static int anInt3319 = 0;

	@OriginalMember(owner = "client!gaa", name = "M", descriptor = "Lclient!gb;")
	public static final Class108 aClass108_3 = new Class108();

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method2981(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static259.method3984(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(44) int local44;
			do {
				local44 = arg0.nextInt();
			} while (local44 >= local41);
			return Static123.method2522(local44, arg1);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(IIB)V")
	public static void method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub7_Sub18 local13 = Static543.method7218(15, 0);
		local13.method7326();
		local13.anInt8802 = arg0;
		local13.anInt8806 = arg1;
	}
}
