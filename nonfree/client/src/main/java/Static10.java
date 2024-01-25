import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "H", descriptor = "Lclient!mb;")
	public static Class132 aClass132_2;

	@OriginalMember(owner = "client!al", name = "L", descriptor = "Lclient!cj;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!al", name = "K", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!al", name = "O", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method191(@OriginalArg(0) Class6_Sub10 arg0) {
		if (arg0.aByteArray67.length - arg0.anInt4188 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method3972();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray67.length - arg0.anInt4188 < 2) {
			return;
		}
		@Pc(53) int local53 = arg0.method4021();
		if (arg0.aByteArray67.length - arg0.anInt4188 != local53 * 6) {
			return;
		}
		while (true) {
			@Pc(73) int local73;
			@Pc(79) int local79;
			do {
				do {
					do {
						if (arg0.aByteArray67.length <= arg0.anInt4188) {
							return;
						}
						local73 = arg0.method4021();
						local79 = arg0.method3979();
					} while (Static295.anIntArray624.length <= local73);
				} while (!Static6.aBooleanArray1[local73]);
			} while (Static205.method5713(local73).aChar7 == '1' && (local79 < -1 || local79 > 1));
			Static295.anIntArray624[local73] = local79;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BZZ)V")
	public static void method192(@OriginalArg(2) boolean arg0) {
		Static152.anInt2871++;
		Static244.method4298();
		if (arg0) {
			Static278.anInt5833++;
			Static301.method5176();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method193(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static337.aClass198_1);
		arg0.removeFocusListener(Static337.aClass198_1);
		Static69.anInt484 = -1;
	}
}
