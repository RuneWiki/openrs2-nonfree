import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!vw", name = "P", descriptor = "[I")
	public static final int[] anIntArray699 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vw", name = "R", descriptor = "Lclient!oq;")
	public static final Class217 aClass217_1 = new Class217();

	@OriginalMember(owner = "client!vw", name = "S", descriptor = "J")
	public static long aLong234 = 0L;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(III)Lclient!laa;")
	public static Class1_Sub2 method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub2_3;
	}

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)V")
	public static void method7596() {
		Static504.aFont1 = null;
		Static87.anImage1 = null;
	}

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)V")
	public static void method7597() {
		if (!Static251.aBoolean335) {
			return;
		}
		while (true) {
			while (Static31.anInt5632 < Static386.aClass178_Sub1Array2.length) {
				@Pc(29) Class178_Sub1 local29 = Static386.aClass178_Sub1Array2[Static31.anInt5632];
				if (local29 != null && local29.anInt5261 == -1) {
					if (Static468.aClass2_Sub51_2 == null) {
						Static468.aClass2_Sub51_2 = Static396.aClass101_1.method2730(local29.aString116);
					}
					@Pc(53) int local53 = Static468.aClass2_Sub51_2.anInt9385;
					if (local53 == -1) {
						return;
					}
					Static468.aClass2_Sub51_2 = null;
					Static31.anInt5632++;
					local29.anInt5261 = local53;
				} else {
					Static31.anInt5632++;
				}
			}
			return;
		}
	}
}
