import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[Lclient!lq;")
	public static Class28_Sub1[] aClass28_Sub1Array3;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	public static int anInt4555;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_86 = new Class359(0, -2);

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public static int anInt4552 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method3851() {
		if (Static173.anInt3397 == 3) {
			Static271.method4671(4);
		} else if (Static173.anInt3397 == 7) {
			Static271.method4671(8);
		} else if (Static173.anInt3397 == 10) {
			Static271.method4671(11);
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
	public static void method3854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class5_Sub3_Sub17 local13 = Static358.method5408(4, (long) arg0);
		local13.method7286();
		local13.anInt8545 = arg1;
		local13.anInt8546 = arg2;
		local13.anInt8549 = arg3;
	}
}
