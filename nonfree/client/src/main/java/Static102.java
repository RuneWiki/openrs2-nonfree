import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_11 = new Class114();

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
	public static final int[] anIntArray172 = new int[13];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
	public static int method1949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8;
		if (arg1 > 20000) {
			local8 = 4;
			Static140.method2560();
		} else if (arg1 > 10000) {
			local8 = 3;
			Static46.method4896();
		} else if (arg1 > 5000) {
			Static74.method7156();
			local8 = 2;
		} else {
			Static519.method7228();
			local8 = 1;
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != arg0) {
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, arg0);
			Static99.method1936(false, arg0);
		}
		Static531.method7366();
		return local8;
	}
}
