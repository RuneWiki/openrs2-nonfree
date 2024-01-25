import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "[Lclient!qu;")
	public static Class279[] aClass279Array1;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_97 = new Class257(29, 4);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method7412() {
		Static99.anInt2642 = -1;
		Static475.anInt8512 = 1;
		if (Static193.aString58 == null) {
			Static590.method8155(35);
		} else {
			@Pc(32) Class8_Sub8 local32 = new Class8_Sub8(Static609.method7964(Static190.method6073(Static193.aString58)));
			@Pc(36) long local36 = local32.method8549();
			Static34.aLong209 = local32.method8549();
			Static252.method4534(Static418.method6564(local36), true, "");
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILclient!ha;ILclient!vc;)V")
	public static void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(5) Class352 arg4) {
		@Pc(9) Class190 local9 = Static76.aClass67_1.method2155(arg4.anInt10094);
		if (local9.anInt5996 == -1) {
			return;
		}
		if (arg4.aBoolean718) {
			@Pc(27) int local27 = arg1 + arg4.anInt10131;
			arg1 = local27 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(39) Class21 local39 = local9.method4918(arg3, arg4.aBoolean723, arg1);
		if (local39 == null) {
			return;
		}
		@Pc(53) int local53 = arg4.anInt10116;
		@Pc(56) int local56 = arg4.anInt10132;
		if ((arg1 & 0x1) == 1) {
			local56 = arg4.anInt10116;
			local53 = arg4.anInt10132;
		}
		@Pc(72) int local72 = local39.method5779();
		@Pc(75) int local75 = local39.method5785();
		if (local9.aBoolean430) {
			local72 = local53 * 4;
			local75 = local56 * 4;
		}
		if (local9.anInt5997 == 0) {
			local39.method5777(arg2, arg0 - (local56 - 1) * 4, local72, local75);
		} else {
			local39.method5788(arg2, arg0 - (local56 - 1) * 4, local72, local75, 0, local9.anInt5997 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!pk;[II[I[I)V")
	public static void method7414(@OriginalArg(0) Class15_Sub1_Sub2_Sub2_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = arg1[local11];
			@Pc(21) int local21 = arg2[local11];
			@Pc(25) int local25 = arg3[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && arg0.aClass96Array3.length > local27; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg0.aClass96Array3[local27] = null;
					} else {
						@Pc(54) Class97 local54 = Static28.aClass220_1.method5670(local17);
						@Pc(57) int local57 = local54.anInt3603;
						@Pc(62) Class96 local62 = arg0.aClass96Array3[local27];
						if (local62 != null) {
							if (local62.anInt3579 == local17) {
								if (local57 == 0) {
									local62 = arg0.aClass96Array3[local27] = null;
								} else if (local57 == 1) {
									local62.anInt3581 = 0;
									local62.anInt3587 = local25;
									local62.anInt3586 = 0;
									local62.anInt3584 = 1;
									local62.anInt3585 = 0;
									if (!arg0.aBoolean583) {
										Static522.method7447(arg0, local54, 0);
									}
								} else if (local57 == 2) {
									local62.anInt3585 = 0;
								}
							} else if (local54.anInt3613 >= Static28.aClass220_1.method5670(local62.anInt3579).anInt3613) {
								local62 = arg0.aClass96Array3[local27] = null;
							}
						}
						if (local62 == null) {
							local62 = arg0.aClass96Array3[local27] = new Class96();
							local62.anInt3584 = 1;
							local62.anInt3587 = local25;
							local62.anInt3586 = 0;
							local62.anInt3585 = 0;
							local62.anInt3579 = local17;
							local62.anInt3581 = 0;
							if (!arg0.aBoolean583) {
								Static522.method7447(arg0, local54, 0);
							}
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}
}
