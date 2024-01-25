import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public static int anInt6770;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_57 = new Class107(50);

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_161 = new Class140("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!ef;)Lclient!cl;")
	public static Class18_Sub1 method5663(@OriginalArg(1) Class2_Sub12 arg0) {
		return new Class18_Sub1(arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3108(), arg0.method3163(), arg0.method3124());
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BC)Z")
	public static boolean method5664(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z")
	public static boolean method5666() {
		@Pc(8) Class2_Sub31 local8 = (Class2_Sub31) Static103.aClass180_24.aClass2_207.aClass2_252;
		if (local8 == null || local8 == Static103.aClass180_24.aClass2_207) {
			return false;
		} else {
			if (local8.anInt5368 >= 2000) {
				local8.anInt5368 -= 2000;
			}
			return local8.anInt5368 == 1006;
		}
	}
}
