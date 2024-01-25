import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
	public static boolean aBoolean626 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIII)Lclient!vn;")
	public static Class12_Sub2_Sub2_Sub1 method7262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class58 local11 = Static486.aClass58ArrayArrayArray2[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(23) Class12_Sub2_Sub2_Sub1 local23 = null;
		@Pc(25) int local25 = -1;
		for (@Pc(28) Class43 local28 = local11.aClass43_4; local28 != null; local28 = local28.aClass43_3) {
			@Pc(32) Class12_Sub2_Sub2 local32 = local28.aClass12_Sub2_Sub2_1;
			if (local32 instanceof Class12_Sub2_Sub2_Sub1) {
				@Pc(38) Class12_Sub2_Sub2_Sub1 local38 = (Class12_Sub2_Sub2_Sub1) local32;
				@Pc(46) int local46 = local38.method2422() * 256 - 4;
				@Pc(54) int local54 = local38.anInt10998 - local46 >> 9;
				@Pc(62) int local62 = local38.anInt11002 - local46 >> 9;
				@Pc(70) int local70 = local38.anInt10998 + local46 >> 9;
				@Pc(77) int local77 = local46 + local38.anInt11002 >> 9;
				if (local54 <= arg2 && arg0 >= local62 && local70 >= arg2 && arg0 <= local77) {
					@Pc(111) int local111 = (local77 + 1 - arg0) * (local70 + 1 + -arg2);
					if (local111 > local25) {
						local23 = local38;
						local25 = local111;
					}
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!wia;I)V")
	public static void method7264(@OriginalArg(0) Class386 arg0) {
		Static607.aClass386_51 = arg0;
	}
}
