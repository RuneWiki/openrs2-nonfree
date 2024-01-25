import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sc", name = "G", descriptor = "Lclient!la;")
	public static Class208 aClass208_117;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(III)V")
	public static void method7630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static260.aClass174ArrayArrayArray2[0][arg1][arg2] != null && Static260.aClass174ArrayArrayArray2[0][arg1][arg2].aClass174_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static260.aClass174ArrayArrayArray2[local25][arg1][arg2] == null) {
				@Pc(47) Class174 local47 = Static260.aClass174ArrayArrayArray2[local25][arg1][arg2] = new Class174(local25);
				if (local23) {
					local47.aByte65++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZI)I")
	public static int method7631(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(25) char local25 = Character.toLowerCase(arg0);
			local14 = (local25 << 4) + 1;
		}
		return local14;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!aaa;)V")
	public static void method7632(@OriginalArg(0) Class2 arg0) {
		if (Static581.anInt9734 >= 65535) {
			return;
		}
		@Pc(7) Class5_Sub43 local7 = arg0.aClass5_Sub43_1;
		Static252.aClass2Array1[Static581.anInt9734] = arg0;
		Static92.aBooleanArray2[Static581.anInt9734] = false;
		Static581.anInt9734++;
		@Pc(22) int local22 = arg0.anInt14;
		if (arg0.aBoolean2) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt14;
		if (arg0.aBoolean1) {
			local30 = Static490.anInt9715 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method8255() + Static349.anInt6143 - local7.method8254() >> Static611.anInt10115;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method8255() + local7.method8254() - Static349.anInt6143 >> Static611.anInt10115;
			if (local74 >= Static526.anInt8863) {
				local74 = Static526.anInt8863 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray1[local42++];
				@Pc(106) int local106 = (local7.method8251() + Static349.anInt6143 - local7.method8254() >> Static611.anInt10115) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static328.anInt5870) {
					local114 = Static328.anInt5870 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static63.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static63.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static581.anInt9734;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static63.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static581.anInt9734 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static63.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static581.anInt9734 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static63.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static581.anInt9734 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIILjava/lang/String;III)V")
	public static void method7634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) Class8_Sub6 local15 = new Class8_Sub6();
		local15.anInt6223 = Static44.anInt740 + arg1;
		local15.anInt6220 = arg4;
		local15.anInt6225 = arg5;
		local15.anInt6217 = arg2;
		local15.anInt6216 = arg6;
		local15.aString78 = arg3;
		local15.anInt6218 = arg0;
		Static270.aClass98_5.method1780(local15);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I")
	public static int method7635(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local14 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local14 == 19 || local14 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)I")
	public static int method7636(@OriginalArg(0) boolean arg0) {
		@Pc(12) int local12 = Static659.anInt10597;
		if (local12 == 0) {
			return arg0 ? 0 : Static136.anInt2254;
		} else if (local12 == 1) {
			return Static136.anInt2254;
		} else if (local12 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
