import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
	public static int anInt9295;

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "Lclient!uf;")
	public static Class357 aClass357_137;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_1 = new Class361(14, 0);

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_2 = new Class361(15, 4);

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_3 = new Class361(16, -2);

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_4 = new Class361(17, 0);

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_5 = new Class361(18, -2);

	@OriginalMember(owner = "client!ru", name = "D", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_6 = new Class361(19, -2);

	@OriginalMember(owner = "client!ru", name = "E", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_7 = new Class361(22, -2);

	@OriginalMember(owner = "client!ru", name = "F", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_8 = new Class361(23, 4);

	@OriginalMember(owner = "client!ru", name = "G", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_9 = new Class361(24, -1);

	@OriginalMember(owner = "client!ru", name = "H", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_10 = new Class361(26, 0);

	@OriginalMember(owner = "client!ru", name = "J", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_11 = new Class361(27, 0);

	@OriginalMember(owner = "client!ru", name = "K", descriptor = "Lclient!uo;")
	public static final Class361 aClass361_12 = new Class361(28, -2);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!eba;)V")
	public static void method8201(@OriginalArg(0) Class84 arg0) {
		if (Static262.anInt5002 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub13 local6 = arg0.aClass2_Sub13_1;
		Static320.aClass84Array8[Static262.anInt5002] = arg0;
		Static345.aBooleanArray36[Static262.anInt5002] = false;
		Static262.anInt5002++;
		@Pc(21) int local21 = arg0.anInt2418;
		if (arg0.aBoolean178) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2418;
		if (arg0.aBoolean179) {
			local29 = Static60.anInt1169 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method9406() + Static124.anInt2431 - local6.method9407() >> Static170.anInt3602;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method9406() + local6.method9407() - Static124.anInt2431 >> Static170.anInt3602;
			if (local73 >= Static202.anInt4238) {
				local73 = Static202.anInt4238 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray50[local41++];
				@Pc(105) int local105 = (local6.method9411() + Static124.anInt2431 - local6.method9407() >> Static170.anInt3602) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static585.anInt10170) {
					local113 = Static585.anInt10170 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static163.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static163.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static262.anInt5002;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static163.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static262.anInt5002 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static163.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static262.anInt5002 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static163.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static262.anInt5002 << 48;
					}
				}
			}
		}
	}
}
