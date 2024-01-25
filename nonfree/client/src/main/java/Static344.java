import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!lga", name = "P", descriptor = "Lclient!iha;")
	public static Class173 aClass173_5;

	@OriginalMember(owner = "client!lga", name = "Q", descriptor = "Lclient!dja;")
	public static final Class80 aClass80_7 = new Class80("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "(I)V")
	public static void method5260() {
		@Pc(5) Class283[] local5 = Class14_Sub22.aClass283Array1;
		synchronized (Class14_Sub22.aClass283Array1) {
			for (@Pc(14) int local14 = 0; local14 < Class14_Sub22.aClass283Array1.length; local14++) {
				Class14_Sub22.aClass283Array1[local14] = new Class283();
				Static245.anIntArray235[local14] = 0;
			}
		}
	}
}
