import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!wh", name = "xb", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_103;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "Lclient!we;")
	public static final Class94 aClass94_1 = new Class94();

	@OriginalMember(owner = "client!wh", name = "yb", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_52 = new Class66(30);

	@OriginalMember(owner = "client!wh", name = "Eb", descriptor = "I")
	public static int anInt4186 = -1;

	@OriginalMember(owner = "client!wh", name = "Jb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1522 = Static177.method3050("jolt");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!ad;")
	public static Class4_Sub1_Sub2 method3182(@OriginalArg(1) int arg0) {
		@Pc(18) Class4_Sub1_Sub2 local18 = (Class4_Sub1_Sub2) Static32.aClass66_17.method2225((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static136.aClass62_33.method2878(Static100.method1919(arg0), Static5.method96(arg0));
		local18 = new Class4_Sub1_Sub2();
		if (local32 != null) {
			local18.method92(new Class4_Sub11(local32));
		}
		Static32.aClass66_17.method2222(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lclient!p;")
	public static Class4_Sub1_Sub15 method3191(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub1_Sub15 local17 = (Class4_Sub1_Sub15) Static182.aClass66_49.method2225((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static68.aClass62_18.method2878(1, arg0);
		local17 = new Class4_Sub1_Sub15();
		if (local27 != null) {
			local17.method2259(new Class4_Sub11(local27), arg0);
		}
		Static182.aClass66_49.method2222(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZ[B)Z")
	public static boolean method3192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(9) int local9 = -1;
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg2);
		label70: while (true) {
			@Pc(18) int local18 = local14.method1278();
			if (local18 == 0) {
				return local3;
			}
			@Pc(25) boolean local25 = false;
			@Pc(27) int local27 = 0;
			local9 += local18;
			while (true) {
				@Pc(58) int local58;
				@Pc(88) Class4_Sub1_Sub19 local88;
				do {
					@Pc(72) int local72;
					@Pc(68) int local68;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local25) {
										local37 = local14.method1240();
										if (local37 == 0) {
											continue label70;
										}
										local14.method1253();
									}
									local37 = local14.method1240();
									if (local37 == 0) {
										continue label70;
									}
									local27 += local37 - 1;
									@Pc(52) int local52 = local27 & 0x3F;
									local58 = local14.method1253() >> 2;
									@Pc(64) int local64 = local27 >> 6 & 0x3F;
									local68 = local52 + arg1;
									local72 = arg0 + local64;
								} while (local72 <= 0);
							} while (local68 <= 0);
						} while (local72 >= 103);
					} while (local68 >= 103);
					local88 = Static113.method2090(local9);
				} while (local58 == 22 && Static103.aBoolean113 && local88.anInt4175 == 0 && local88.anInt4156 != 1 && !local88.aBoolean173);
				if (!local88.method3180()) {
					local3 = false;
					Static25.anInt617++;
				}
				local25 = true;
			}
		}
	}
}
