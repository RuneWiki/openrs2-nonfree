import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[S")
	public static short[] aShortArray86;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
	public static int[] anIntArray551;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public static int anInt5252 = 0;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	public static int anInt5254 = 0;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
	public static int anInt5255 = -1;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString185 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
	public static int anInt5259 = 0;

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString186 = "Cancel";

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
	public static int anInt5260 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Lclient!cd;")
	public static Class24 method4308(@OriginalArg(1) int arg0) {
		@Pc(10) Class24 local10 = (Class24) Static274.aClass98_44.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static229.aClass155_93.method4121(16, arg0);
		local10 = new Class24();
		if (local22 != null) {
			local10.method506(new Class3_Sub26(local22));
		}
		Static274.aClass98_44.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V")
	public static void method4309() {
		Static29.aClass98_7.method2565(5);
		Static28.aClass98_5.method2565(5);
		Static20.aClass98_3.method2565(5);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!nc;I)V")
	public static void method4310(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		if ((arg0 & 0x2) != 0) {
			local23 = Static249.aClass3_Sub26_Sub1_3.method3908();
			if (local23 == 65535) {
				local23 = -1;
			}
			local34 = Static249.aClass3_Sub26_Sub1_3.method3939();
			Static174.method2870(arg1, local23, local34);
		}
		if ((arg0 & 0x4) != 0) {
			arg1.aString176 = Static249.aClass3_Sub26_Sub1_3.method3931();
			if (arg1.aString176.charAt(0) == '~') {
				arg1.aString176 = arg1.aString176.substring(1);
				Static291.method4774(arg1.method3041(false), arg1.method3041(true), arg1.aString176, 0, 2);
			} else if (arg1 == Static136.aClass10_Sub5_Sub1_1) {
				Static291.method4774(arg1.method3041(false), arg1.method3041(true), arg1.aString176, 0, 2);
			}
			arg1.anInt5048 = 0;
			arg1.anInt5093 = 150;
			arg1.anInt5092 = 0;
		}
		@Pc(127) int local127;
		if ((arg0 & 0x1) != 0) {
			local23 = Static249.aClass3_Sub26_Sub1_3.method3908();
			local34 = Static249.aClass3_Sub26_Sub1_3.method3921();
			@Pc(124) int local124 = Static249.aClass3_Sub26_Sub1_3.method3941();
			local127 = Static249.aClass3_Sub26_Sub1_3.anInt4615;
			@Pc(138) boolean local138 = (local23 & 0x8000) != 0;
			if (arg1.aString124 != null && arg1.aClass131_2 != null) {
				@Pc(148) boolean local148 = false;
				if (local34 <= 1) {
					if (!local138 && (Static264.aBoolean376 && !Static78.aBoolean128 || Static191.aBoolean264)) {
						local148 = true;
					} else if (Static288.method4745(arg1.aString124)) {
						local148 = true;
					}
				}
				if (!local148 && Static293.anInt5842 == 0) {
					Static236.aClass3_Sub26_6.anInt4615 = 0;
					Static249.aClass3_Sub26_Sub1_3.method3923(Static236.aClass3_Sub26_6.aByteArray64, local124);
					Static236.aClass3_Sub26_6.anInt4615 = 0;
					@Pc(197) int local197 = -1;
					@Pc(206) String local206;
					if (local138) {
						local23 &= 0x7FFF;
						@Pc(216) Class35 local216 = Static131.method2213(Static236.aClass3_Sub26_6);
						local197 = local216.anInt1010;
						local206 = local216.aClass3_Sub4_Sub9_1.method1585(Static236.aClass3_Sub26_6);
					} else {
						local206 = Static24.method3703(Static291.method4776(Static152.method2564(Static236.aClass3_Sub26_6)));
					}
					@Pc(241) int local241;
					if (local34 == 1 || local34 == 2) {
						local241 = local138 ? 17 : 1;
					} else {
						local241 = local138 ? 17 : 2;
					}
					arg1.aString176 = local206.trim();
					arg1.anInt5093 = 150;
					arg1.anInt5092 = local23 >> 8;
					arg1.anInt5048 = local23 & 0xFF;
					if (local34 == 2) {
						Static251.method4236("<img=1>" + arg1.method3041(false), local206, "<img=1>" + arg1.method3041(true), 0, null, local241, local197);
					} else if (local34 == 1) {
						Static251.method4236("<img=0>" + arg1.method3041(false), local206, "<img=0>" + arg1.method3041(true), 0, null, local241, local197);
					} else {
						Static251.method4236(arg1.method3041(false), local206, arg1.method3041(true), 0, null, local241, local197);
					}
				}
			}
			Static249.aClass3_Sub26_Sub1_3.anInt4615 = local124 + local127;
		}
		if ((arg0 & 0x80) != 0) {
			local23 = Static249.aClass3_Sub26_Sub1_3.method3904();
			local34 = Static249.aClass3_Sub26_Sub1_3.method3939();
			arg1.method4185(local34, Static124.anInt2371, local23);
			arg1.anInt5064 = Static124.anInt2371 + 300;
			arg1.anInt5026 = Static249.aClass3_Sub26_Sub1_3.method3941();
		}
		if ((arg0 & 0x400) != 0) {
			local23 = Static249.aClass3_Sub26_Sub1_3.method3939();
			@Pc(399) int[] local399 = new int[local23];
			@Pc(402) int[] local402 = new int[local23];
			@Pc(405) int[] local405 = new int[local23];
			for (@Pc(407) int local407 = 0; local407 < local23; local407++) {
				@Pc(414) int local414 = Static249.aClass3_Sub26_Sub1_3.method3908();
				if (local414 == 65535) {
					local414 = -1;
				}
				local399[local407] = local414;
				local402[local407] = Static249.aClass3_Sub26_Sub1_3.method3941();
				local405[local407] = Static249.aClass3_Sub26_Sub1_3.method3895();
			}
			Static178.method2937(arg1, local405, local402, local399);
		}
		if ((arg0 & 0x800) != 0) {
			local23 = Static249.aClass3_Sub26_Sub1_3.method3904();
			local34 = Static249.aClass3_Sub26_Sub1_3.method3921();
			arg1.method4185(local34, Static124.anInt2371, local23);
		}
		if ((arg0 & 0x8) != 0) {
			arg1.anInt5083 = Static249.aClass3_Sub26_Sub1_3.method3895();
			arg1.anInt5052 = Static249.aClass3_Sub26_Sub1_3.method3895();
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt5040 = Static249.aClass3_Sub26_Sub1_3.method3921();
			arg1.anInt5012 = Static249.aClass3_Sub26_Sub1_3.method3921();
			arg1.anInt5032 = Static249.aClass3_Sub26_Sub1_3.method3915();
			arg1.anInt5096 = Static249.aClass3_Sub26_Sub1_3.method3941();
			arg1.anInt5094 = Static249.aClass3_Sub26_Sub1_3.method3909() + Static124.anInt2371;
			arg1.anInt5088 = Static249.aClass3_Sub26_Sub1_3.method3908() + Static124.anInt2371;
			arg1.anInt5070 = Static249.aClass3_Sub26_Sub1_3.method3915();
			arg1.anInt5021 = 0;
			arg1.anInt5044 = 1;
		}
		if ((arg0 & 0x10) != 0) {
			arg1.anInt5076 = Static249.aClass3_Sub26_Sub1_3.method3908();
			if (arg1.anInt5076 == 65535) {
				arg1.anInt5076 = -1;
			}
		}
		if ((arg0 & 0x100) != 0) {
			local23 = Static249.aClass3_Sub26_Sub1_3.method3895();
			if (local23 == 65535) {
				local23 = -1;
			}
			local34 = Static249.aClass3_Sub26_Sub1_3.method3891();
			@Pc(583) boolean local583 = true;
			if (local23 != -1 && arg1.anInt5023 != -1 && Static253.method4288(Static297.method1843(local23).anInt5489).anInt420 < Static253.method4288(Static297.method1843(arg1.anInt5023).anInt5489).anInt420) {
				local583 = false;
			}
			if (local583) {
				arg1.anInt5069 = 1;
				arg1.anInt5023 = local23;
				arg1.anInt5050 = Static124.anInt2371 + (local34 & 0xFFFF);
				arg1.anInt5101 = 0;
				arg1.anInt5047 = 0;
				arg1.anInt5033 = local34 >> 16;
				if (Static124.anInt2371 < arg1.anInt5050) {
					arg1.anInt5047 = -1;
				}
				if (arg1.anInt5023 != -1 && Static124.anInt2371 == arg1.anInt5050) {
					local127 = Static297.method1843(arg1.anInt5023).anInt5489;
					if (local127 != -1) {
						@Pc(677) Class15 local677 = Static253.method4288(local127);
						if (local677 != null && local677.anIntArray35 != null) {
							Static158.method2622(arg1.anInt5073, 0, local677, arg1 == Static136.aClass10_Sub5_Sub1_1, arg1.anInt5016);
						}
					}
				}
			}
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		local23 = Static249.aClass3_Sub26_Sub1_3.method3915();
		@Pc(709) byte[] local709 = new byte[local23];
		@Pc(714) Class3_Sub26 local714 = new Class3_Sub26(local709);
		Static249.aClass3_Sub26_Sub1_3.method3923(local709, local23);
		Static302.aClass3_Sub26Array1[arg2] = local714;
		arg1.method3049(local714, arg2);
	}
}
