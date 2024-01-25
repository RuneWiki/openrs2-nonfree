import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "J")
	public static long aLong40;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_6 = new Class94(8);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I[BIIII)Z")
	public static boolean method1731(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class6_Sub8 local17 = new Class6_Sub8(arg1);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method8225();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(105) Class356 local105;
				do {
					@Pc(74) int local74;
					@Pc(79) int local79;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method8214();
										if (local42 == 0) {
											continue label70;
										}
										local17.method8246();
									}
									local42 = local17.method8214();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(57) int local57 = local34 & 0x3F;
									@Pc(63) int local63 = local34 >> 6 & 0x3F;
									local69 = local17.method8246() >> 2;
									local74 = local63 + arg2;
									local79 = local57 + arg0;
								} while (local74 <= 0);
							} while (local79 <= 0);
						} while (arg3 - 1 <= local74);
					} while (local79 >= arg4 - 1);
					local105 = Static249.aClass310_1.method7474(local19);
				} while (local69 == 22 && Static87.aClass6_Sub33_6.aClass14_Sub11_1.method4084() == 0 && local105.anInt10253 == 0 && local105.anInt10254 != 1 && !local105.aBoolean799);
				if (!local105.method8327()) {
					Static254.anInt5479++;
					local12 = false;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!sba;B)V")
	public static void method1732(@OriginalArg(0) Class302 arg0) {
		if (arg0.anInt8904 != Static640.anInt10717) {
			return;
		}
		if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46 == null) {
			arg0.anInt8927 = 0;
			arg0.anInt8845 = 0;
			return;
		}
		arg0.anInt8907 = 150;
		arg0.anInt8849 = (int) (Math.sin((double) Static384.anInt7234 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt8927 = Static238.anInt5268;
		arg0.anInt8856 = 5;
		arg0.anInt8845 = Static367.method7656(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46);
		arg0.anInt8910 = 0;
		arg0.anInt8900 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4276;
		arg0.anInt8889 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4348;
		arg0.anInt8844 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4312;
		@Pc(78) Class113 local78 = arg0.anInt8844 == -1 ? null : Static528.aClass198_2.method5706(arg0.anInt8844);
		if (local78 != null) {
			Static493.method7164(arg0.anInt8900, local78);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II[S)[S")
	public static short[] method1735(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static653.method6538(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
