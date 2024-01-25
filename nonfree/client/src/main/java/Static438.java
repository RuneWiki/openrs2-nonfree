import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
	public static int anInt7333;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_160 = new Class217(88, 3);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)V")
	public static void method5780(@OriginalArg(1) int arg0) {
		@Pc(16) Class10_Sub1_Sub17 local16 = Static154.method2630(6, arg0);
		local16.method5346();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public static void method5781() {
		try {
			if (Static152.anInt3124 == 1) {
				@Pc(14) int local14 = Static114.aClass10_Sub7_Sub4_1.method4854();
				if (local14 > 0 && Static114.aClass10_Sub7_Sub4_1.method4840()) {
					local14 -= Static124.anInt2565;
					if (local14 < 0) {
						local14 = 0;
					}
					Static114.aClass10_Sub7_Sub4_1.method4849(local14);
				} else {
					Static114.aClass10_Sub7_Sub4_1.method4853();
					Static114.aClass10_Sub7_Sub4_1.method4843();
					Static301.aClass10_Sub43_1 = null;
					if (Static285.aClass187_87 == null) {
						Static152.anInt3124 = 0;
					} else {
						Static152.anInt3124 = 2;
					}
					Static450.aClass269_1 = null;
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static114.aClass10_Sub7_Sub4_1.method4853();
			Static152.anInt3124 = 0;
			Static450.aClass269_1 = null;
			Static301.aClass10_Sub43_1 = null;
			Static285.aClass187_87 = null;
		}
	}
}
