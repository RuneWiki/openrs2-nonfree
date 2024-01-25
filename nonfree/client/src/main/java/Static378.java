import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_93 = new Class158(4, 2);

	@OriginalMember(owner = "client!po", name = "d", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_119 = new Class67("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	public static void method5907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 5);
		local8.method6211();
		local8.anInt7557 = arg1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public static void method5908() {
		Static12.method649();
	}
}
