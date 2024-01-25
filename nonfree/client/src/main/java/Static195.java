import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
	public static final int[] anIntArray449 = new int[13];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public static void method6165() {
		@Pc(9) int[] local9 = new int[Static367.aClass281_1.anInt8448];
		@Pc(11) int local11 = 0;
		for (@Pc(23) int local23 = 0; local23 < Static367.aClass281_1.anInt8448; local23++) {
			@Pc(30) Class237 local30 = Static367.aClass281_1.method6975(local23);
			if (local30.anInt7260 >= 0 || local30.anInt7314 >= 0) {
				local9[local11++] = local23;
			}
		}
		Static573.anIntArray589 = new int[local11];
		for (@Pc(55) int local55 = 0; local55 < local11; local55++) {
			Static573.anIntArray589[local55] = local9[local55];
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!kha;Lclient!d;Ljava/awt/Canvas;IIIIB)Lclient!ha;")
	public static synchronized Class33 method6180(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 == 0) {
			return Static251.method4762(arg1, arg5, arg2, arg4);
		} else if (arg6 == 2) {
			return Static126.method2896(arg1, arg2, arg4, arg5);
		} else if (arg6 == 1) {
			return Static37.method726(arg2, arg1, arg3);
		} else if (arg6 == 5) {
			return Static112.method2720(arg0, arg3, arg2, arg1);
		} else if (arg6 == 3) {
			return Static651.method1474(arg1, arg3, arg2, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!kha;ZIZII)V")
	public static void method6190(@OriginalArg(0) Class181 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static461.method6934(arg0, arg2, 0L, arg1);
	}
}
