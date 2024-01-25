import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array19;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
	public static int[] anIntArray515;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_149 = new Class337(53, -2);

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	public static int anInt9402 = 0;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
	public static int anInt9403 = 0;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIZ)V")
	public static void method8104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(15) int local15 = arg3 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static150.method2216(arg1, arg3, arg4, arg2);
			}
		} else if (local15 == 0) {
			Static93.method1563(arg2, arg1, arg4, arg0);
		} else {
			@Pc(51) int local51 = (local15 << 12) / local10;
			@Pc(60) int local60 = arg4 - (arg1 * local51 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (arg0 < Static275.anInt4919) {
				local71 = (local51 * Static275.anInt4919 >> 12) + local60;
				local73 = Static275.anInt4919;
			} else if (Static529.anInt9089 < arg0) {
				local71 = (Static529.anInt9089 * local51 >> 12) + local60;
				local73 = Static529.anInt9089;
			} else {
				local73 = arg0;
				local71 = arg3;
			}
			@Pc(106) int local106;
			@Pc(108) int local108;
			if (arg1 < Static275.anInt4919) {
				local106 = Static275.anInt4919;
				local108 = local60 + (Static275.anInt4919 * local51 >> 12);
			} else if (arg1 <= Static529.anInt9089) {
				local106 = arg1;
				local108 = arg4;
			} else {
				local108 = (Static529.anInt9089 * local51 >> 12) + local60;
				local106 = Static529.anInt9089;
			}
			if (local71 < Static554.anInt9362) {
				local73 = (Static554.anInt9362 - local60 << 12) / local51;
				local71 = Static554.anInt9362;
			} else if (local71 > Static62.anInt1300) {
				local71 = Static62.anInt1300;
				local73 = (Static62.anInt1300 - local60 << 12) / local51;
			}
			if (Static554.anInt9362 > local108) {
				local106 = (Static554.anInt9362 - local60 << 12) / local51;
				local108 = Static554.anInt9362;
			} else if (local108 > Static62.anInt1300) {
				local106 = (Static62.anInt1300 - local60 << 12) / local51;
				local108 = Static62.anInt1300;
			}
			Static482.method7143(arg2, local73, local71, local106, local108);
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I")
	public static int method8106() {
		@Pc(25) byte local25;
		if (Static110.anInt2065 >= 96) {
			@Pc(16) int local16 = Static337.method5085();
			if (local16 <= 100) {
				Static111.method1715();
				local25 = 4;
			} else if (local16 <= 500) {
				Static459.method6830();
				local25 = 3;
			} else if (local16 <= 1000) {
				local25 = 2;
				Static339.method5106();
			} else {
				Static178.method2715();
				local25 = 1;
			}
		} else {
			Static178.method2715();
			local25 = 1;
		}
		if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != 0) {
			Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
			Static638.method9004(0, false);
		}
		Static273.method4418();
		return local25;
	}
}
