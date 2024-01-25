import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_71 = new Class81(2, 3);

	@OriginalMember(owner = "client!id", name = "J", descriptor = "I")
	public static int anInt3255 = 0;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	public static int anInt3256 = -1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!cr;B)V")
	public static void method2616(@OriginalArg(0) Class41 arg0) {
		if (Static143.anInt7609 == arg0.anInt1616) {
			Static10.aBooleanArray5[arg0.anInt1653] = true;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method2620() {
		Static263.aClass265_42.method6003();
		for (@Pc(13) Class2_Sub26 local13 = (Class2_Sub26) Static288.aClass265_41.method6005(); local13 != null; local13 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
			if (local13.anInt4529 < 1000) {
				local13.method6072();
				Static263.aClass265_42.method5999(local13);
			}
		}
		Static263.aClass265_42.method5998(Static288.aClass265_41);
		@Pc(41) int local41 = -1;
		@Pc(46) Class2_Sub6 local46 = (Class2_Sub6) Static36.aClass265_2.method6005();
		if (local46 != null) {
			local41 = local46.method774();
		}
		if (!Static237.aBoolean384) {
			if (local41 == 0 && (Static296.anInt5336 == 1 && anInt3255 > 2 || Static269.method4013())) {
				local41 = 2;
			}
			if (local41 == 2 && anInt3255 > 0 && local46 != null) {
				if (Static191.aClass41_7 == null && Static93.anInt2136 == 0) {
					Static343.method4828(local46.method771(), local46.method772());
				} else {
					Static419.anInt7351 = 2;
				}
			}
			if (local41 == 0 && anInt3255 > 0) {
				Static285.method4199();
			}
			if (Static191.aClass41_7 == null && Static93.anInt2136 == 0) {
				Static76.aClass2_Sub26_1 = null;
				Static419.anInt7351 = 0;
			}
			return;
		}
		@Pc(126) int local126;
		@Pc(130) int local130;
		if (local41 == -1) {
			local126 = Static304.aClass40_1.method1164();
			local130 = Static304.aClass40_1.method1159();
			if (Static346.anInt6104 - 10 > local126 || local126 > Static346.anInt6104 + Static85.anInt3261 + 10 || local130 < Static117.anInt2356 - 10 || Static447.anInt4684 + Static117.anInt2356 + 10 < local130) {
				Static237.aBoolean384 = false;
				Static153.method2331(Static346.anInt6104, Static85.anInt3261, Static117.anInt2356, Static447.anInt4684);
			}
		}
		if (local41 != 0) {
			return;
		}
		local126 = Static346.anInt6104;
		local130 = Static117.anInt2356;
		@Pc(178) int local178 = Static85.anInt3261;
		@Pc(182) int local182 = local46.method772();
		@Pc(186) int local186 = local46.method771();
		@Pc(188) int local188 = -1;
		@Pc(206) int local206;
		for (@Pc(190) int local190 = 0; local190 < anInt3255; local190++) {
			if (Static417.aBoolean624) {
				local206 = (anInt3255 - local190 - 1) * 16 + local130 + 33;
				if (local182 > local126 && local126 + local178 > local182 && local186 > local206 - 13 && local206 + 4 > local186) {
					local188 = local190;
				}
			} else {
				local206 = (anInt3255 - local190 - 1) * 16 + local130 + 31;
				if (local182 > local126 && local182 < local126 + local178 && local206 - 13 < local186 && local206 + 3 > local186) {
					local188 = local190;
				}
			}
		}
		if (local188 != -1) {
			local206 = 0;
			@Pc(291) Class247 local291 = new Class247(Static288.aClass265_41);
			for (@Pc(296) Class2_Sub26 local296 = (Class2_Sub26) local291.method5532(); local296 != null; local296 = (Class2_Sub26) local291.method5528()) {
				if (local188 == local206) {
					Static139.method2010(local182, local186, local296);
				}
				local206++;
			}
		}
		Static237.aBoolean384 = false;
		Static153.method2331(Static346.anInt6104, Static85.anInt3261, Static117.anInt2356, Static447.anInt4684);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIII)V")
	public static void method2626(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static239.aLong133 = 0L;
		@Pc(8) int local8 = Static405.method5498();
		if (arg3 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (!Static387.aClass26_9.method2238()) {
			arg0 = true;
		}
		Static365.method5074(arg0, local8, arg1, arg3, arg2);
	}
}
