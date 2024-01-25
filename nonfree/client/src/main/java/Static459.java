import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public static int anInt10511;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt10513;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
	public static boolean aBoolean734 = false;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!av;")
	public static final Class27 aClass27_18 = new Class27(5, -1);

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	public static void method8984() {
		Static15.aClass2_1.method8987();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static124.aLongArray8[local8] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static590.aLongArray19[local28] = 0L;
		}
		Static465.anInt7805 = 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	public static void method8985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class14_Sub2_Sub9 local17 = Static499.method7527((long) arg3, 8);
		local17.method4004();
		local17.anInt4595 = arg0;
		local17.anInt4599 = arg1;
		local17.anInt4592 = arg2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZI)V")
	public static void method8986(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static11.method236(arg1, arg0, Static21.aClass21_11.method324(Static26.anInt352));
	}
}
