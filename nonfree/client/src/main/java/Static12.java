import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_5 = new Class267(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!an", name = "s", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_21 = new Class123(66, -2);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)I")
	public static int method347(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(B)V")
	public static void method348() {
		Static110.anInt6979 = 0;
		Static2.anInt6389 = 0;
		Static222.anInt4030 = 0;
		Static343.anInt6130 = 0;
	}
}
