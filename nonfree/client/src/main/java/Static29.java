import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	public static int[] anIntArray73;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_435 = Static122.method531("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!sc;")
	public static Class72 aClass72_11 = new Class72();

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static int anInt764 = 0;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int anInt765 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method568() {
		Static10.aClass7_3.method190();
		Static112.aClass7_19.method190();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public static void method569() {
		anIntArray73 = null;
		aClass73_435 = null;
		aClass72_11 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIILclient!vd;)V")
	public static void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class83 arg6) {
		if (Static143.aBoolean221) {
			Static110.anInt2525 = 32;
		} else {
			Static110.anInt2525 = 0;
		}
		Static143.aBoolean221 = false;
		@Pc(117) int local117;
		if (Static45.anInt1056 != 0) {
			if (arg0 <= arg2 && arg0 + 16 > arg2 && arg3 >= arg5 && arg5 + 16 > arg3) {
				arg6.anInt3689 -= 4;
				Static60.method1104(arg6);
			} else if (arg0 <= arg2 && arg2 < arg0 + 16 && arg3 >= arg5 + arg1 - 16 && arg3 < arg5 + arg1) {
				arg6.anInt3689 += 4;
				Static60.method1104(arg6);
			} else if (arg2 >= arg0 - Static110.anInt2525 && Static110.anInt2525 + arg0 + 16 > arg2 && arg5 + 16 <= arg3 && arg1 + arg5 - 16 > arg3) {
				local117 = (arg1 - 32) * arg1 / arg4;
				if (local117 < 8) {
					local117 = 8;
				}
				@Pc(134) int local134 = arg3 - arg5 - local117 / 2 - 16;
				@Pc(141) int local141 = arg1 - local117 - 32;
				arg6.anInt3689 = (arg4 - arg1) * local134 / local141;
				Static60.method1104(arg6);
				Static143.aBoolean221 = true;
			}
		}
		if (Static28.anInt751 == 0) {
			return;
		}
		local117 = arg6.anInt3670;
		if (arg2 >= arg0 - local117 && arg5 <= arg3 && arg2 < arg0 + 16 && arg5 + arg1 >= arg3) {
			arg6.anInt3689 += Static28.anInt751 * 45;
			Static60.method1104(arg6);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method571(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static5.method65(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static130.aClass39_3.anApplet1 != null) {
				@Pc(106) Class29 local106 = Static130.aClass39_3.method1234(new URL(Static130.aClass39_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static144.anInt3456 + "&u=" + Static38.aLong148 + "&v1=" + Static70.aString4 + "&v2=" + Static70.aString5 + "&e=" + local7));
				while (local106.anInt1375 == 0) {
					Static166.method2609(1L);
				}
				if (local106.anInt1375 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local106.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method572(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static8.aClass3_Sub1_Sub3_Sub4_3.anIntArray336;
		@Pc(7) int local7 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			local4[local13] = 1;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local39 = (52736 - local25 * 512) * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static110.aByteArrayArrayArray5[arg0][local41][local25] & 0x18) == 0) {
					Static119.aClass35_1.method1172(local4, local39, arg0, local41, local25);
				}
				if (arg0 < 3 && (Static110.aByteArrayArrayArray5[arg0 + 1][local41][local25] & 0x8) != 0) {
					Static119.aClass35_1.method1172(local4, local39, arg0 + 1, local41, local25);
				}
				local39 += 4;
			}
		}
		Static8.aClass3_Sub1_Sub3_Sub4_3.method2320();
		local39 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 238 - 10;
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local151 = 1; local151 < 103; local151++) {
				if ((Static110.aByteArrayArrayArray5[arg0][local151][local147] & 0x18) == 0) {
					Static48.method875(local39, local151, arg0, local41, local147);
				}
				if (arg0 < 3 && (Static110.aByteArrayArrayArray5[arg0 + 1][local151][local147] & 0x8) != 0) {
					Static48.method875(local39, local151, arg0 + 1, local41, local147);
				}
			}
		}
		Static72.anInt1640 = 0;
		for (local151 = 0; local151 < 104; local151++) {
			for (@Pc(213) int local213 = 0; local213 < 104; local213++) {
				@Pc(221) int local221 = Static119.aClass35_1.method1154(Static147.anInt3309, local151, local213);
				if (local221 != 0) {
					local221 = local221 >> 14 & 0x7FFF;
					@Pc(234) int local234 = Static151.method2466(local221).anInt3005;
					if (local234 >= 0) {
						@Pc(241) int local241 = local151;
						@Pc(243) int local243 = local213;
						if (local234 != 22 && local234 != 29 && local234 != 34 && local234 != 36 && local234 != 46 && local234 != 47 && local234 != 48) {
							@Pc(277) int[][] local277 = Static41.aClass60Array1[Static147.anInt3309].anIntArrayArray34;
							for (@Pc(279) int local279 = 0; local279 < 10; local279++) {
								@Pc(286) int local286 = (int) (Math.random() * 4.0D);
								if (local286 == 0 && local241 > 0 && local241 > local151 - 3 && (local277[local241 - 1][local243] & 0x12C0108) == 0) {
									local241--;
								}
								if (local286 == 1 && local241 < 103 && local151 + 3 > local241 && (local277[local241 + 1][local243] & 0x12C0180) == 0) {
									local241++;
								}
								if (local286 == 2 && local243 > 0 && local213 - 3 < local243 && (local277[local241][local243 - 1] & 0x12C0102) == 0) {
									local243--;
								}
								if (local286 == 3 && local243 < 103 && local213 + 3 > local243 && (local277[local241][local243 + 1] & 0x12C0120) == 0) {
									local243++;
								}
							}
						}
						Static56.aClass3_Sub1_Sub3_Sub4Array5[Static72.anInt1640] = Static104.aClass3_Sub1_Sub3_Sub4Array8[local234];
						Static37.anIntArray90[Static72.anInt1640] = local241;
						Static90.anIntArray216[Static72.anInt1640] = local243;
						Static72.anInt1640++;
					}
				}
			}
		}
		Static87.aClass30_1.method2023();
	}
}
