import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray87;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_126 = new Class175(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	public static final int[] anIntArray296 = new int[200];

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	public static final int[] anIntArray297 = new int[1000];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)I")
	public static int method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)I")
	public static int method3199(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
