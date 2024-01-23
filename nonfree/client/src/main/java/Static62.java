import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!el", name = "Y", descriptor = "Lclient!ph;")
	public static Class138 aClass138_15;

	@OriginalMember(owner = "client!el", name = "V", descriptor = "I")
	public static int anInt1244 = 0;

	@OriginalMember(owner = "client!el", name = "Z", descriptor = "Lclient!th;")
	public static Class169 aClass169_45 = new Class169(30);

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(B)Z")
	public static boolean method1046() {
		return Static291.aBoolean404 ? true : Static85.aBoolean121;
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
	public static void method1047() {
		if (Static246.anInt4882 != -1) {
			Static307.method4558(-1, -1, false, Static246.anInt4882);
			Static246.anInt4882 = -1;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method1048(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(46) int local46 = arg0 / 10;
		@Pc(48) int local48 = 2;
		while (local46 != 0) {
			local46 /= 10;
			local48++;
		}
		@Pc(60) char[] local60 = new char[local48];
		local60[0] = '+';
		for (@Pc(68) int local68 = local48 - 1; local68 > 0; local68--) {
			@Pc(75) int local75 = arg0;
			arg0 /= 10;
			@Pc(85) int local85 = local75 - arg0 * 10;
			if (local85 >= 10) {
				local60[local68] = (char) (local85 + 87);
			} else {
				local60[local68] = (char) (local85 + 48);
			}
		}
		return new String(local60);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1050(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static268.aClass2_5);
		arg0.removeMouseMotionListener(Static268.aClass2_5);
		arg0.removeFocusListener(Static268.aClass2_5);
		Static190.anInt3899 = 0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
	public static void method1051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static312.anInt5850 <= arg1 && Static214.anInt4216 >= arg1) {
			@Pc(24) int local24 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg2);
			@Pc(30) int local30 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg0);
			Static1.method29(arg1, arg3, local30, local24);
		}
	}
}
