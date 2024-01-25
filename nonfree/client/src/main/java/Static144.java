import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_23 = new Class137(260);

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_41 = new Class15("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "[I")
	public static final int[] anIntArray212 = new int[6];

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_43 = new Class146(62, -1);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBLclient!qi;I)V")
	public static void method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub36 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg0 << 28 | arg1 << 14 | arg3);
		@Pc(22) Class4_Sub6 local22 = (Class4_Sub6) Static41.aClass67_2.method1429(local16);
		if (local22 == null) {
			local22 = new Class4_Sub6();
			Static41.aClass67_2.method1426(local22, local16);
			local22.aClass244_3.method5273(arg2);
			return;
		}
		@Pc(45) Class80 local45 = Static416.aClass64_2.method1372(arg2.anInt5276);
		@Pc(48) int local48 = local45.anInt1989;
		if (local45.anInt2005 == 1) {
			local48 *= arg2.anInt5280 + 1;
		}
		for (@Pc(65) Class4_Sub36 local65 = (Class4_Sub36) local22.aClass244_3.method5263(); local65 != null; local65 = (Class4_Sub36) local22.aClass244_3.method5271()) {
			local45 = Static416.aClass64_2.method1372(local65.anInt5276);
			@Pc(85) int local85 = local45.anInt1989;
			if (local45.anInt2005 == 1) {
				local85 *= local65.anInt5280 + 1;
			}
			if (local85 < local48) {
				Static155.method2186(local65, arg2);
				return;
			}
		}
		local22.aClass244_3.method5273(arg2);
	}
}
