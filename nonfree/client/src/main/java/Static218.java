import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_124 = new Class129(83, -2);

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_80 = new Class198("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
	public static final int[] anIntArray351 = new int[1024];

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_125 = new Class129(73, 8);

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "Lclient!d;")
	public static final Class44 aClass44_42 = new Class44(64);

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString55 = null;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Lclient!li;")
	public static Class21 method3700() {
		try {
			return new Class21_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class21) Class.forName("Class21_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class21_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBI)Z")
	public static boolean method3702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(17) Interface2 local17 = (Interface2) Static73.method1080(arg0, arg1, arg2);
		if (local17 != null) {
			local11 = Static397.method5161(local17) & true;
		}
		local17 = (Interface2) Static12.method194(arg0, arg1, arg2, bs.class);
		if (local17 != null) {
			local11 &= Static397.method5161(local17);
		}
		local17 = (Interface2) Static285.method3519(arg0, arg1, arg2);
		if (local17 != null) {
			local11 &= Static397.method5161(local17);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII)Z")
	public static boolean method3703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static171.method2361(arg0, arg1) | (arg1 & 0x10000) != 0 || Static291.method3608(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static452.method5943(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!gt;ILjava/awt/Frame;)V")
	public static void method3704(@OriginalArg(0) Class93 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(15) Class268 local15 = arg0.method2081(arg1);
			while (local15.anInt7420 == 0) {
				Static140.method2004(10L);
			}
			if (local15.anInt7420 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static140.method2004(100L);
		}
	}
}
