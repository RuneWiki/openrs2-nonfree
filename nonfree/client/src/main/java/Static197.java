import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
	public static int anInt4307;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_135 = new Class92(14, -1);

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
	public static int anInt4304 = 0;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_141 = new Class175("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!bt;II)V")
	public static void method3513(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (Static139.aClass240_5 == null) {
			return;
		}
		try {
			Static139.aClass240_5.method5504(0L);
			Static139.aClass240_5.method5503(arg0.aByteArray95, arg1, 24);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)[Lclient!vg;")
	public static Class247[] method3514() {
		return new Class247[] { Static12.aClass247_1, Static146.aClass247_3, Static182.aClass247_4 };
	}
}
