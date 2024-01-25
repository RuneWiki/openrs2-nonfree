import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!fk;")
	public static final Class67 aClass67_7 = new Class67();

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public static int anInt4680 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!ul;Lclient!rd;ILjava/awt/Canvas;I)Lclient!ae;")
	public static synchronized Class4 method4241(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Class168 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static135.aBooleanArray13[local14]) {
				local7 = local14;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(47) Class4 local47;
		if (arg4 == 0) {
			local47 = Static38.method867(arg3, local7, arg0);
		} else if (arg4 == 1) {
			local47 = Static122.method3997(arg3, arg0, arg2, local7, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static135.aBooleanArray13[local7] = true;
		return local47;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method4296() {
		if (Static111.anInt2471 == -1) {
			return;
		}
		@Pc(11) int local11 = Static284.aClass61_1.method2658();
		@Pc(15) int local15 = Static284.aClass61_1.method2659();
		if (Static187.aClass2_Sub16_1 != null) {
			local11 = Static187.aClass2_Sub16_1.method1557();
			local15 = Static187.aClass2_Sub16_1.method1564();
		}
		Static343.method5926(Static111.anInt2471, Static198.anInt3876, local15, Static136.anInt2829, 0, local11, 0, 0, 0);
		if (Static162.aClass146_10 != null) {
			Static349.method5957(local15, local11);
		}
	}
}
