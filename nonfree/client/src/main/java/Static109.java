import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_791 = Static64.method1101("<)4col> x");

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_792 = Static64.method1101("::fps ");

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!ia;")
	public static Class51 aClass51_793 = Static64.method1101("Hidden)2");

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_794 = Static64.method1101("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt2430 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1858(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static103.aClass50_2);
		arg0.removeMouseMotionListener(Static103.aClass50_2);
		arg0.removeFocusListener(Static103.aClass50_2);
		Static169.anInt3809 = 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!k;Z)V")
	public static void method1859(@OriginalArg(0) Class1_Sub16 arg0) {
		if (arg0.aByteArray62.length - arg0.anInt4860 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method3793();
		if (local24 < 0 || local24 > 2) {
			return;
		}
		@Pc(37) byte local37;
		if (local24 == 2) {
			local37 = 22;
		} else if (local24 == 1) {
			local37 = 23;
		} else {
			local37 = 19;
		}
		if (arg0.aByteArray62.length - arg0.anInt4860 < local37) {
			return;
		}
		Static42.anInt4800 = arg0.method3793();
		if (Static42.anInt4800 < 1) {
			Static42.anInt4800 = 1;
		} else if (Static42.anInt4800 > 4) {
			Static42.anInt4800 = 4;
		}
		Static107.method1834(arg0.method3793() == 1);
		Static51.aBoolean60 = arg0.method3793() == 1;
		Static107.aBoolean98 = arg0.method3793() == 1;
		Static18.aBoolean17 = arg0.method3793() == 1;
		Static6.aBoolean6 = arg0.method3793() == 1;
		Static184.aBoolean185 = arg0.method3793() == 1;
		Static103.aBoolean214 = arg0.method3793() == 1;
		Static21.aBoolean22 = arg0.method3793() == 1;
		Static16.anInt387 = arg0.method3793();
		if (Static16.anInt387 > 2) {
			Static16.anInt387 = 2;
		}
		if (local24 >= 2) {
			Static142.aBoolean140 = arg0.method3793() == 1;
		} else {
			Static142.aBoolean140 = arg0.method3793() == 1;
			arg0.method3793();
		}
		Static19.aBoolean195 = arg0.method3793() == 1;
		Static68.aBoolean73 = arg0.method3793() == 1;
		Static161.anInt3478 = arg0.method3793();
		if (Static161.anInt3478 > 2) {
			Static161.anInt3478 = 2;
		}
		Static18.aBoolean16 = arg0.method3793() == 1;
		Static84.anInt1961 = arg0.method3793();
		if (Static84.anInt1961 > 127) {
			Static84.anInt1961 = 127;
		}
		Static155.anInt3424 = arg0.method3793();
		Static123.anInt2717 = arg0.method3793();
		if (Static123.anInt2717 > 127) {
			Static123.anInt2717 = 127;
		}
		if (local24 >= 1) {
			Static216.anInt4593 = arg0.method3805();
			Static216.anInt4587 = arg0.method3805();
		}
	}
}
