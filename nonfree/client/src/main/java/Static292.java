import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "Z")
	public static boolean aBoolean386;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!wu;")
	public static Class384 aClass384_75;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_43 = new Class181(21, 7);

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
	public static int anInt4716 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIB)V")
	public static void method4306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = Static113.anInt1785 + arg0;
		@Pc(18) int local18 = Static622.anInt10087 + arg2;
		if (Static535.aClass156ArrayArrayArray2 == null || arg0 < 0 || arg2 < 0 || arg0 >= Static111.anInt1752 || arg2 >= Static279.anInt4567 || Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() == 0 && arg1 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) {
			return;
		}
		@Pc(62) long local62 = (long) (local14 | arg1 << 28 | local18 << 14);
		@Pc(68) Class5_Sub17 local68 = (Class5_Sub17) Static402.aClass81_65.method1599(local62);
		if (local68 == null) {
			Static21.method481(arg1, arg0, arg2);
			return;
		}
		@Pc(82) Class5_Sub32 local82 = (Class5_Sub32) local68.aClass306_14.method7313();
		if (local82 == null) {
			Static21.method481(arg1, arg0, arg2);
			return;
		}
		@Pc(96) Class14_Sub1_Sub4_Sub1 local96 = (Class14_Sub1_Sub4_Sub1) Static21.method481(arg1, arg0, arg2);
		if (local96 == null) {
			local96 = new Class14_Sub1_Sub4_Sub1(arg0 << 9, Static299.aClass40Array1[arg1].method8442(arg0, arg2), arg2 << 9, arg1, arg1);
		} else {
			local96.anInt2179 = local96.anInt2178 = -1;
		}
		local96.anInt2174 = local82.anInt5869;
		local96.anInt2180 = local82.anInt5871;
		label56: while (true) {
			@Pc(139) Class5_Sub32 local139 = (Class5_Sub32) local68.aClass306_14.method7301();
			if (local139 == null) {
				break;
			}
			if (local96.anInt2180 != local139.anInt5871) {
				local96.anInt2183 = local139.anInt5869;
				local96.anInt2179 = local139.anInt5871;
				while (true) {
					@Pc(164) Class5_Sub32 local164 = (Class5_Sub32) local68.aClass306_14.method7301();
					if (local164 == null) {
						break label56;
					}
					if (local96.anInt2180 != local164.anInt5871 && local164.anInt5871 != local96.anInt2179) {
						local96.anInt2178 = local164.anInt5871;
						local96.anInt2182 = local164.anInt5869;
					}
				}
			}
		}
		@Pc(208) int local208 = Static600.method8378((arg2 << 9) + 256, (arg0 << 9) + 256, arg1);
		local96.anInt9321 = local208;
		local96.anInt9315 = arg2 << 9;
		local96.anInt9317 = arg0 << 9;
		local96.anInt2181 = 0;
		local96.aByte126 = (byte) arg1;
		local96.aByte125 = (byte) arg1;
		if (Static353.method5596(arg0, arg2)) {
			local96.aByte126++;
		}
		Static285.method4276(arg1, arg0, arg2, local208, local96);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	public static void method4308() {
		Static441.aClass357ArrayArray1 = new Class357[Static42.aClass384_21.method8865()][];
		Static591.aClass357ArrayArray2 = new Class357[Static42.aClass384_21.method8865()][];
		Static128.aBooleanArray12 = new boolean[Static42.aClass384_21.method8865()];
	}
}
