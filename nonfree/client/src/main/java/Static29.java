import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!jo;")
	public static Class168 aClass168_15;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static final int anInt1014 = 1400;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!ep;Z)V")
	public static void method991(@OriginalArg(1) Class93 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) int local19 = arg0.anInt2798 == 0 ? arg0.anInt2777 : arg0.anInt2798;
		@Pc(28) int local28 = arg0.anInt2744 == 0 ? arg0.anInt2738 : arg0.anInt2744;
		Static340.method5374(local19, arg1, local28, Static336.aClass93ArrayArray2[arg0.anInt2790 >> 16], arg0.anInt2790);
		if (arg0.aClass93Array4 != null) {
			Static340.method5374(local19, arg1, local28, arg0.aClass93Array4, arg0.anInt2790);
		}
		@Pc(61) Class6_Sub48 local61 = (Class6_Sub48) Static459.aClass305_24.method7447((long) arg0.anInt2790);
		if (local61 != null) {
			Static254.method7738(local19, arg1, local28, local61.anInt9207);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z")
	public static boolean method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static184.method3598(arg0, arg1) | (arg0 & 0x70000) != 0 || Static155.method6202(arg1, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZILjava/net/Socket;)Lclient!qi;")
	public static Class64 method993(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class64_Sub1(arg0, 5000);
	}
}
