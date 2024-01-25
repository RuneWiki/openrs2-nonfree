import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public static int anInt6876 = 0;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_45 = new Class229();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[FI)[F")
	public static float[] method5355(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static464.method5798(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(CI)Z")
	public static boolean method5362(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static353.method5000(arg0)) {
			return true;
		} else {
			@Pc(21) char[] local21 = Static279.aCharArray12;
			for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
				@Pc(28) char local28 = local21[local23];
				if (arg0 == local28) {
					return true;
				}
			}
			@Pc(44) char[] local44 = Static124.aCharArray3;
			for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
				@Pc(51) char local51 = local44[local46];
				if (arg0 == local51) {
					return true;
				}
			}
			return false;
		}
	}
}
