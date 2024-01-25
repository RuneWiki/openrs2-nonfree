import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!nja", name = "J", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_185 = new Class160(33, -2);

	@OriginalMember(owner = "client!nja", name = "M", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_170 = new Class251(80, 4);

	@OriginalMember(owner = "client!nja", name = "N", descriptor = "Z")
	public static boolean aBoolean499 = true;

	@OriginalMember(owner = "client!nja", name = "R", descriptor = "Lclient!av;")
	public static final Class27 aClass27_12 = new Class27(7, 8);

	@OriginalMember(owner = "client!nja", name = "T", descriptor = "I")
	public static int anInt7100 = 0;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!rg;II)Lclient!fia;")
	public static Class45 method6195(@OriginalArg(0) Class310 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class45 local16 = (Class45) Static119.aClass317_13.method7882((long) arg1);
		if (local16 == null) {
			if (Static490.aBoolean597) {
				local16 = Static103.aClass144_3.method6964(Static697.method6461(arg0, arg1), true);
			} else {
				local16 = Static431.method6455(arg0.method7795(arg1));
			}
			Static119.aClass317_13.method7875((long) arg1, local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = (Static587.aShort102 - Static436.aShort76) * local7 / 100 + Static436.aShort76;
		@Pc(37) int local37 = local31 * arg0 >> 8;
		Static481.anInt10749 = Static481.anInt10751 * local31 >> 8;
		@Pc(50) int local50 = 16384 - arg4 & 0x3FFF;
		@Pc(57) int local57 = 16384 - arg5 & 0x3FFF;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = local37;
		if (local50 != 0) {
			local61 = Class141.anIntArray207[local50] * -local37 >> 14;
			local63 = local37 * Class141.anIntArray208[local50] >> 14;
		}
		if (local57 != 0) {
			local59 = Class141.anIntArray207[local57] * local63 >> 14;
			local63 = Class141.anIntArray208[local57] * local63 >> 14;
		}
		Static126.anInt9524 = arg4;
		Static669.anInt10940 = arg5;
		Static470.anInt8100 = 0;
		Static229.anInt4393 = arg2 - local63;
		Static153.anInt2372 = arg3 - local61;
		Static70.anInt1085 = arg1 - local59;
	}

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "(B)V")
	public static void method6198() {
		@Pc(13) Class14_Sub54 local13 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static307.aClass251_134);
		local13.aClass14_Sub21_Sub2_2.method7747(Static141.method2141());
		local13.aClass14_Sub21_Sub2_2.method7751(Static563.anInt4939);
		local13.aClass14_Sub21_Sub2_2.method7751(Static506.anInt8791);
		local13.aClass14_Sub21_Sub2_2.method7747(Static181.aClass14_Sub26_9.aClass43_Sub17_2.method4949());
		Static277.aClass347_2.method8308(local13);
	}
}
