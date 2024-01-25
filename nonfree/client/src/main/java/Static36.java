import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bfa", name = "G", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_19 = new Class381(49, 3);

	@OriginalMember(owner = "client!bfa", name = "I", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_2 = new Class226(5, 3);

	@OriginalMember(owner = "client!bfa", name = "z", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_15 = new Class156(125, -1);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method620(@OriginalArg(0) String arg0) {
		return Static626.aHashtable15.containsKey(arg0);
	}

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "(B)I")
	public static int method621() {
		@Pc(17) byte local17;
		if (Static21.anInt299 < 96) {
			local17 = 1;
			Static388.method5742();
		} else {
			@Pc(27) int local27 = Static475.method8942();
			if (local27 <= 100) {
				local17 = 4;
				Static188.method9006();
			} else if (local27 <= 500) {
				local17 = 3;
				Static84.method1341();
			} else if (local27 > 1000) {
				Static388.method5742();
				local17 = 1;
			} else {
				Static277.method4480();
				local17 = 2;
			}
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != 0) {
			Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 0);
			Static462.method6506(false, 0);
		}
		Static111.method1655();
		return local17;
	}
}
