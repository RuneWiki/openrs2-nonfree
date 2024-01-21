import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "[I")
	public static int[] anIntArray380;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2087 = Static193.method3027("M");

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2086 = aClass70_2087;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
	public static final int[] anIntArray379 = new int[5];

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	public static int anInt4233 = 1;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2088 = Static193.method3027("Konfig geladen)3");

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public static int anInt4238 = 0;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2089 = Static193.method3027("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2090 = Static193.method3027("Mem:");

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2091 = aClass70_2087;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method3299(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static52.aClass44_1);
		arg0.removeFocusListener(Static52.aClass44_1);
		Static88.anInt1710 = -1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZZILclient!ke;II)V")
	public static void method3300(@OriginalArg(3) Class52 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static210.anInt4241 = arg1;
		Static78.aClass52_18 = arg0;
		Static185.anInt3774 = 0;
		Static79.anInt1588 = 1;
		Static26.anInt553 = 10000;
		Static6.anInt123 = arg2;
		Static81.aBoolean92 = false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method3301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) Class3_Sub22 local12 = null;
		for (@Pc(19) Class3_Sub22 local19 = (Class3_Sub22) Static95.aClass10_53.method267(); local19 != null; local19 = (Class3_Sub22) Static95.aClass10_53.method268()) {
			if (arg0 == local19.anInt3549 && arg2 == local19.anInt3540 && local19.anInt3542 == arg7 && local19.anInt3545 == arg8) {
				local12 = local19;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class3_Sub22();
			local12.anInt3540 = arg2;
			local12.anInt3549 = arg0;
			local12.anInt3545 = arg8;
			local12.anInt3542 = arg7;
			Static196.method3058(local12);
			Static95.aClass10_53.method261(local12);
		}
		local12.anInt3546 = arg1;
		local12.anInt3543 = arg5;
		local12.anInt3535 = arg3;
		local12.anInt3550 = arg6;
		local12.anInt3537 = arg4;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)Z")
	public static boolean method3303(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)V")
	public static void method3304(@OriginalArg(0) int arg0) {
		if (Static79.anInt1588 == 0) {
			Static175.aClass3_Sub19_Sub2_2.method2849(arg0);
		} else {
			Static210.anInt4241 = arg0;
		}
	}
}
