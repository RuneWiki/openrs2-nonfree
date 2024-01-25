import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_38 = new Class116();

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public static int anInt4410 = 0;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	public static int anInt4411 = 0;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public static int anInt4413 = -1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!br;II)V")
	public static void method3920(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class118 local8 = arg1.method545(Static274.aClass47_9);
		if (local8 == null) {
			return;
		}
		Static274.aClass47_9.method2709(arg2, arg0, arg2 + arg1.anInt740, arg0 + arg1.anInt758);
		if (Static249.anInt5064 >= 3) {
			Static274.aClass47_9.method2720(local8, arg2, arg0);
		} else {
			Static345.aClass58_47.method4277((float) arg1.anInt740 / 2.0F + (float) arg2, (float) arg1.anInt758 / 2.0F + (float) arg0, ((int) -Static106.aFloat31 & 0x3FFF) << 2, local8, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
	public static void method3921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg1, 6);
		local8.method4908();
		local8.anInt5705 = arg0;
	}
}
