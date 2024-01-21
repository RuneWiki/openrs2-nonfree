import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!og", name = "nc", descriptor = "Lclient!nb;")
	public static Class66 aClass66_7;

	@OriginalMember(owner = "client!og", name = "Pb", descriptor = "I")
	public static int anInt3102 = 0;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1 method2182() {
		@Pc(5) byte[] local5 = Static8.aByteArrayArray1[0];
		@Pc(19) int local19 = Static138.anIntArray256[0] * Static86.anIntArray298[0];
		@Pc(22) int[] local22 = new int[local19];
		for (@Pc(28) int local28 = 0; local28 < local19; local28++) {
			local22[local28] = Static108.anIntArray222[local5[local28] & 0xFF];
		}
		@Pc(67) Class2_Sub1_Sub2_Sub1 local67 = new Class2_Sub1_Sub2_Sub1(Static138.anInt2900, Static127.anInt2808, Static19.anIntArray38[0], Static25.anIntArray57[0], Static86.anIntArray298[0], Static138.anIntArray256[0], local22);
		Static169.method2456();
		return local67;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBII)I")
	public static int method2183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 >= arg1) {
			return arg2 < arg0 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2184(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static63.aClass12_1);
		arg0.removeMouseMotionListener(Static63.aClass12_1);
		arg0.removeFocusListener(Static63.aClass12_1);
		Static74.anInt1523 = 0;
	}
}
