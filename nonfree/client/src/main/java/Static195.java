import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_28 = new Class30();

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_51 = new Class32("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!lo;")
	public static final Class150 aClass150_2 = new Class150("runescape", 0);

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "[Lclient!cu;")
	public static final Class41[] aClass41Array1 = new Class41[16];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)I")
	public static int method3315(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBII)V")
	public static void method3316(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static79.anInt4624 == 2) {
			Static14.anInt360 = local11;
			Static235.anInt4191 = local15;
			Static288.anInt5007 = 0;
		}
		Static1.aFloat80 = local11;
		Static127.aFloat41 = local15;
		Static43.method732();
		Static285.aBoolean378 = true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!fq;)V")
	public static void method3318(@OriginalArg(0) Class2_Sub17_Sub1 arg0) {
		if (Static104.anInt2157 >= 65535) {
			return;
		}
		Static386.aClass2_Sub17_Sub1Array3[Static104.anInt2157] = arg0;
		Static196.aBooleanArray24[Static104.anInt2157] = false;
		Static104.anInt2157++;
		@Pc(18) int local18 = arg0.anInt2051;
		if (arg0.aBoolean141) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt2051;
		if (arg0.aBoolean140) {
			local26 = Static12.anInt311 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt2037 + Static241.anInt4320 - arg0.anInt2043 >> Static333.anInt5694;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt2037 + arg0.anInt2043 - Static241.anInt4320 >> Static333.anInt5694;
			if (local66 >= Static341.anInt5833) {
				local66 = Static341.anInt5833 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray30[local38++];
				@Pc(96) int local96 = (arg0.anInt2042 + Static241.anInt4320 - arg0.anInt2043 >> Static333.anInt5694) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static12.anInt312) {
					local104 = Static12.anInt312 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static223.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static223.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2157;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static223.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2157 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static223.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2157 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static223.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static104.anInt2157 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
	public static int method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static261.anIntArray888[arg1 & 0x3] : Static130.anIntArray547[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!vc;Lclient!uq;IIIII)V")
	public static void method3320(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static12.anInt311) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static12.anInt312) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static341.anInt5833 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class251 local62 = Static64.aClass251ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static350.aClass107Array4[local17].method4685(local23, local32) + Static350.aClass107Array4[local17].method4685(local23 + 1, local32) + Static350.aClass107Array4[local17].method4685(local23, local32 + 1) + Static350.aClass107Array4[local17].method4685(local23 + 1, local32 + 1)) / 4 - (Static350.aClass107Array4[arg2].method4685(arg3, arg4) + Static350.aClass107Array4[arg2].method4685(arg3 + 1, arg4) + Static350.aClass107Array4[arg2].method4685(arg3, arg4 + 1) + Static350.aClass107Array4[arg2].method4685(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class1_Sub1 local143 = local62.aClass1_Sub1_3;
									@Pc(146) Class1_Sub1 local146 = local62.aClass1_Sub1_2;
									if (local143 != null && local143.method5641()) {
										arg1.method5637(local1, arg0, (local23 - arg3) * Static180.anInt6489 + (1 - arg5) * Static241.anInt4320, (local32 - arg4) * Static180.anInt6489 + (1 - arg6) * Static241.anInt4320, local143, local140);
									}
									if (local146 != null && local146.method5641()) {
										arg1.method5637(local1, arg0, (local23 - arg3) * Static180.anInt6489 + (1 - arg5) * Static241.anInt4320, (local32 - arg4) * Static180.anInt6489 + (1 - arg6) * Static241.anInt4320, local146, local140);
									}
									for (@Pc(219) Class46 local219 = local62.aClass46_3; local219 != null; local219 = local219.aClass46_1) {
										@Pc(223) Class1_Sub5 local223 = local219.aClass1_Sub5_1;
										if (local223 != null && local223.method5641() && (local23 == local223.aShort96 || local23 == local3) && (local32 == local223.aShort97 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort94 + 1 - local223.aShort96;
											@Pc(260) int local260 = local223.aShort95 + 1 - local223.aShort97;
											arg1.method5637(local1, arg0, (local223.aShort96 - arg3) * Static180.anInt6489 + (local252 - arg5) * Static241.anInt4320, (local223.aShort97 - arg4) * Static180.anInt6489 + (local260 - arg6) * Static241.anInt4320, local223, local140);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
