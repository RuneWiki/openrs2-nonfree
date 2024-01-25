import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt4446 = -50;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!lk;")
	public static Class4_Sub23 aClass4_Sub23_2 = null;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
	public static final int[] anIntArray353 = new int[50];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)Lclient!fh;")
	public static Class73 method3820(@OriginalArg(1) int arg0) {
		@Pc(8) Class73[] local8 = Static361.method5179();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class73 local21 = local8[local15];
			if (local21.anInt2322 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
