import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_83 = new Class134("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_14 = new Class225(10, 19);

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "[I")
	public static final int[] anIntArray518 = new int[4096];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Lclient!in;")
	public static Class3_Sub5 method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class270 local7 = Static309.aClass270ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass3_Sub5_2 == null ? null : local7.aClass3_Sub5_2;
	}
}
