import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
	public static int anInt4944;

	@OriginalMember(owner = "client!ke", name = "H", descriptor = "[Lclient!lda;")
	public static Class204[] aClass204Array1;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_134 = new Class363(67, 8);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
	public static void method4132(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) Class2_Sub39 local8 = (Class2_Sub39) Static418.aClass8_45.method210(); local8 != null; local8 = (Class2_Sub39) Static418.aClass8_45.method218()) {
			if (local8.aClass2_Sub10_Sub4_3 != null) {
				Static122.aClass2_Sub10_Sub1_2.method1012(local8.aClass2_Sub10_Sub4_3);
				local8.aClass2_Sub10_Sub4_3 = null;
			}
			if (local8.aClass2_Sub10_Sub4_2 != null) {
				Static122.aClass2_Sub10_Sub1_2.method1012(local8.aClass2_Sub10_Sub4_2);
				local8.aClass2_Sub10_Sub4_2 = null;
			}
			local8.method7966();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class2_Sub39 local57 = (Class2_Sub39) Static33.aClass8_2.method210(); local57 != null; local57 = (Class2_Sub39) Static33.aClass8_2.method218()) {
			if (local57.aClass2_Sub10_Sub4_3 != null) {
				Static122.aClass2_Sub10_Sub1_2.method1012(local57.aClass2_Sub10_Sub4_3);
				local57.aClass2_Sub10_Sub4_3 = null;
			}
			local57.method7966();
		}
		for (@Pc(84) Class2_Sub39 local84 = (Class2_Sub39) Static175.aClass162_19.method3527(); local84 != null; local84 = (Class2_Sub39) Static175.aClass162_19.method3523()) {
			if (local84.aClass2_Sub10_Sub4_3 != null) {
				Static122.aClass2_Sub10_Sub1_2.method1012(local84.aClass2_Sub10_Sub4_3);
				local84.aClass2_Sub10_Sub4_3 = null;
			}
			local84.method7966();
		}
	}
}
