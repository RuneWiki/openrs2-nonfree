import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!up;")
	public static final Class321 aClass321_7 = new Class321();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BII)V")
	public static void method5301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(7, arg0);
		local8.method3826();
		local8.anInt4403 = arg1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IC)Z")
	public static boolean method5303(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static454.aCharArray8;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (arg0 == local40) {
					return true;
				}
			}
		}
		return false;
	}
}
