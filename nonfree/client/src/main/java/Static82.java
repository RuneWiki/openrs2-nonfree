import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "[S")
	public static short[] aShortArray32;

	@OriginalMember(owner = "client!gk", name = "H", descriptor = "Lclient!vj;")
	public static Class145 aClass145_4;

	@OriginalMember(owner = "client!gk", name = "I", descriptor = "Lclient!hc;")
	public static Class51 aClass51_25;

	@OriginalMember(owner = "client!gk", name = "M", descriptor = "Lclient!hc;")
	public static Class51 aClass51_26;

	@OriginalMember(owner = "client!gk", name = "K", descriptor = "[I")
	public static int[] anIntArray172 = new int[1000];

	@OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
	public static int anInt2220 = 0;

	@OriginalMember(owner = "client!gk", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString136 = "M";

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public static void method1654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < Static128.anInt3212; local3++) {
			@Pc(9) Class66 local9 = Static182.method3126(local3);
			if (local9 != null) {
				@Pc(14) int local14 = local9.anInt2938;
				if (local14 >= 0 && !Static235.anInterface1_1.method392(local14)) {
					local14 = -1;
				}
				@Pc(76) int local76;
				@Pc(35) int local35;
				@Pc(41) int local41;
				@Pc(69) int local69;
				if (local9.anInt2948 >= 0) {
					local35 = local9.anInt2948;
					local41 = (local35 & 0x7F) + arg1;
					if (local41 < 0) {
						local41 = 0;
					} else if (local41 > 127) {
						local41 = 127;
					}
					local69 = local41 + (local35 + arg0 & 0xFC00) + (local35 & 0x380);
					local76 = Static235.anIntArray443[Static153.method2745(96, local69)];
				} else if (local14 >= 0) {
					local76 = Static235.anIntArray443[Static153.method2745(96, Static235.anInterface1_1.method391(local14))];
				} else if (local9.anInt2949 == -1) {
					local76 = -1;
				} else {
					local35 = local9.anInt2949;
					local41 = (local35 & 0x7F) + arg1;
					if (local41 < 0) {
						local41 = 0;
					} else if (local41 > 127) {
						local41 = 127;
					}
					local69 = (local35 + arg0 & 0xFC00) - (-(local35 & 0x380) - local41);
					local76 = Static235.anIntArray443[Static153.method2745(96, local69)];
				}
				Static93.anIntArray191[local3 + 1] = local76;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZILclient!se;)V")
	public static void method1655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2) {
		if (Static63.aClass122_7 != null || Static259.aBoolean280 || (arg2 == null || Static26.method381(arg2) == null)) {
			return;
		}
		Static63.aClass122_7 = arg2;
		Static37.aClass122_2 = Static26.method381(arg2);
		Static255.aBoolean276 = false;
		Static181.anInt4153 = arg0;
		Static198.anInt4594 = arg1;
		Static21.anInt739 = 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)I")
	public static int method1656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class132.anIntArray439[arg3 * 1024 / arg1] >> 1;
		return (arg2 * local15 >> 16) + ((65536 - local15) * arg0 >> 16);
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V")
	public static void method1658() {
		Static13.aClass1_Sub4_Sub2_1.method1220();
		Static39.aClass51_14 = null;
		Static143.anInt3473 = 1;
	}
}
