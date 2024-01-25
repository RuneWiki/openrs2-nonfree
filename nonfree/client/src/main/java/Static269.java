import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "[Lclient!mp;")
	public static Class155[] aClass155Array2;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!eu;")
	public static Class70 aClass70_27;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_159 = new Class189("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
	public static void method3870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class11 local13 = new Class11(16);
		for (@Pc(18) Class3_Sub39 local18 = (Class3_Sub39) Static441.aClass11_43.method313(); local18 != null; local18 = (Class3_Sub39) Static441.aClass11_43.method316()) {
			local18.method5977();
			@Pc(28) int local28 = (int) (local18.aLong234 >> 28);
			@Pc(39) int local39 = (int) (local18.aLong234 >> 14 & 0x3FFFL) - arg0;
			@Pc(47) int local47 = (int) (local18.aLong234 & 0x3FFFL) - arg1;
			if (local47 >= 0 && local39 >= 0 && Static40.anInt1089 > local47 && Static44.anInt7276 > local39) {
				local13.method319(local18, (long) (local47 | local39 << 14 | local28 << 28));
			}
		}
		Static441.aClass11_43 = local13;
	}
}
