import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_10 = new Class198(8);

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!dr;")
	public static final Class4_Sub15 aClass4_Sub15_1 = new Class4_Sub15(0, 0);

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIILclient!fl;Lclient!fl;)V")
	public static void method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub2 arg3, @OriginalArg(4) Class8_Sub2 arg4) {
		if (Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static269.method4620(arg0, arg1, arg2);
		}
		Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2].aClass8_Sub2_1 = arg3;
		Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2].aClass8_Sub2_2 = arg4;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	public static void method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class50 local9 = Static162.aClass50ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static84.anInt2385 = local9.anInt1831;
			Static99.anInt2546 = local9.anInt1833;
			Static147.anInt3292 = local9.anInt1836;
		}
		Static262.method4562();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public static void method201() {
		@Pc(1) Class198 local1 = Static330.aClass198_235;
		synchronized (Static330.aClass198_235) {
			Static330.aClass198_235.method5209();
		}
		local1 = Static281.aClass198_202;
		synchronized (Static281.aClass198_202) {
			Static281.aClass198_202.method5209();
		}
	}
}
