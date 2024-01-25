import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "Lclient!mq;")
	public static Class156 aClass156_8;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public static int anInt4523 = -2;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
	public static void method3577() {
		Static96.aClipboard1 = null;
		Static339.aBoolean493 = false;
		Static36.method725();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!gu;B)V")
	public static void method3578(@OriginalArg(0) Class3_Sub17 arg0) {
		if (Static263.aClass118ArrayArrayArray2 == null) {
			return;
		}
		@Pc(13) Interface8 local13 = null;
		if (arg0.anInt2906 == 0) {
			local13 = (Interface8) Static321.method4376(arg0.anInt2915, arg0.anInt2917, arg0.anInt2910);
		}
		if (arg0.anInt2906 == 1) {
			local13 = (Interface8) Static113.method4396(arg0.anInt2915, arg0.anInt2917, arg0.anInt2910);
		}
		if (arg0.anInt2906 == 2) {
			local13 = (Interface8) Static314.method4348(arg0.anInt2915, arg0.anInt2917, arg0.anInt2910, pa.class);
		}
		if (arg0.anInt2906 == 3) {
			local13 = (Interface8) Static166.method2721(arg0.anInt2915, arg0.anInt2917, arg0.anInt2910);
		}
		if (local13 == null) {
			arg0.anInt2907 = -1;
			arg0.anInt2913 = 0;
			arg0.anInt2918 = 0;
		} else {
			arg0.anInt2907 = local13.method4808();
			arg0.anInt2918 = local13.method4810();
			arg0.anInt2913 = local13.method4807();
		}
	}
}
