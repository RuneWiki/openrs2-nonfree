import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public static int anInt5317;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[6][];

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public static int anInt5291 = -1;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_108 = new Class256("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_11 = new Class208(9, 0, 4, 1);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!np;B)Z")
	public static boolean method4286(@OriginalArg(0) Interface9 arg0) {
		@Pc(17) Class250 local17 = Static406.aClass150_3.method3508(arg0.method5901());
		if (local17.anInt7168 == -1) {
			return true;
		} else {
			@Pc(30) Class99 local30 = Static325.aClass221_4.method5014(local17.anInt7168);
			return local30.anInt2694 == -1 ? true : local30.method2008();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)J")
	public static long method4289() {
		return Static256.aClass59_1.method4364();
	}
}
