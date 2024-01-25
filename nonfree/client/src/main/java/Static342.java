import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!lfa", name = "q", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_145 = new Class251(70, 7);

	@OriginalMember(owner = "client!lfa", name = "k", descriptor = "I")
	public static int anInt5820 = 0;

	@OriginalMember(owner = "client!lfa", name = "m", descriptor = "Lclient!sca;")
	public static final Class62 aClass62_1 = Static214.method3273();

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(B)Z")
	public static boolean method5223() {
		@Pc(13) boolean local13 = true;
		if (Static142.aClass266_1 == null) {
			if (Static99.aClass310_23.method7785(Static187.anInt3095)) {
				Static142.aClass266_1 = Static697.method6461(Static99.aClass310_23, Static187.anInt3095);
			} else {
				local13 = false;
			}
		}
		if (Static631.aClass266_3 == null) {
			if (Static99.aClass310_23.method7785(Static148.anInt2313)) {
				Static631.aClass266_3 = Static697.method6461(Static99.aClass310_23, Static148.anInt2313);
			} else {
				local13 = false;
			}
		}
		if (Static190.aClass266_2 == null) {
			if (Static99.aClass310_23.method7785(Static615.anInt10126)) {
				Static190.aClass266_2 = Static697.method6461(Static99.aClass310_23, Static615.anInt10126);
			} else {
				local13 = false;
			}
		}
		if (Static52.aClass350_1 == null) {
			if (Static130.aClass310_31.method7785(Static315.anInt5524)) {
				Static52.aClass350_1 = Static63.method1038(Static315.anInt5524, Static130.aClass310_31);
			} else {
				local13 = false;
			}
		}
		if (Static123.aClass266Array1 == null) {
			if (Static99.aClass310_23.method7785(Static315.anInt5524)) {
				Static123.aClass266Array1 = Static697.method6468(Static99.aClass310_23, Static315.anInt5524);
			} else {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	public static void method5224() {
		Static137.method2082();
		Static599.method8480();
	}
}
