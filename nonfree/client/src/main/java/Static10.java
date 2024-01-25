import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)I")
	public static int method114() {
		return Static178.anInt4220 == 1 ? Static613.anInt10162 : 0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIB)V")
	public static void method116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 + Static446.anInt8090;
		@Pc(13) int local13 = Static124.anInt3150 + arg1;
		if (Static170.aClass106ArrayArrayArray1 == null || arg2 < 0 || arg1 < 0 || arg2 >= Static394.anInt7540 || arg1 >= Static462.anInt8391 || Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 0 && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 != arg0) {
			return;
		}
		@Pc(60) long local60 = (long) (local9 | arg0 << 28 | local13 << 14);
		@Pc(68) Class3_Sub46 local68 = (Class3_Sub46) Static644.aClass307_55.method7424(local60);
		if (local68 == null) {
			Static295.method5068(arg0, arg2, arg1);
			return;
		}
		@Pc(82) Class3_Sub32 local82 = (Class3_Sub32) local68.aClass276_56.method6907();
		if (local82 == null) {
			Static295.method5068(arg0, arg2, arg1);
			return;
		}
		@Pc(96) Class2_Sub3_Sub4_Sub1 local96 = (Class2_Sub3_Sub4_Sub1) Static295.method5068(arg0, arg2, arg1);
		if (local96 == null) {
			local96 = new Class2_Sub3_Sub4_Sub1(arg2 << 9, Static500.aClass274Array2[arg0].method8041(arg2, arg1), arg1 << 9, arg0, arg0);
		} else {
			local96.anInt5430 = local96.anInt5439 = -1;
		}
		local96.anInt5437 = local82.anInt7689;
		local96.anInt5427 = local82.anInt7685;
		label56: while (true) {
			@Pc(139) Class3_Sub32 local139 = (Class3_Sub32) local68.aClass276_56.method6912();
			if (local139 == null) {
				break;
			}
			if (local96.anInt5437 != local139.anInt7689) {
				local96.anInt5431 = local139.anInt7685;
				local96.anInt5430 = local139.anInt7689;
				while (true) {
					@Pc(162) Class3_Sub32 local162 = (Class3_Sub32) local68.aClass276_56.method6912();
					if (local162 == null) {
						break label56;
					}
					if (local96.anInt5437 != local162.anInt7689 && local96.anInt5430 != local162.anInt7689) {
						local96.anInt5429 = local162.anInt7685;
						local96.anInt5439 = local162.anInt7689;
					}
				}
			}
		}
		@Pc(210) int local210 = Static202.method3958((arg1 << 9) + 256, arg0, (arg2 << 9) + 256);
		local96.anInt10424 = arg1 << 9;
		local96.aByte129 = (byte) arg0;
		local96.aByte128 = (byte) arg0;
		local96.anInt10429 = local210;
		local96.anInt10428 = arg2 << 9;
		local96.anInt5434 = 0;
		if (Static525.method7485(arg1, arg2)) {
			local96.aByte129++;
		}
		Static369.method5902(arg0, arg2, arg1, local210, local96);
	}
}
