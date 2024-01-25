import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
	public static int anInt1424;

	@OriginalMember(owner = "client!daa", name = "J", descriptor = "[Lclient!eh;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "(I)V")
	public static void method1250() {
		Static570.anInt9302 = 0;
		Static172.anInt2629 = 0;
		Static196.anInt2848 = 0;
		Static440.anInt7076 = 0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)V")
	public static void method1251(@OriginalArg(1) int arg0) {
		Static399.anInt6591 = arg0;
		Static124.aClass21_95.method313();
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(II)I")
	public static int method1252(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!hg;)V")
	public static void method1253(@OriginalArg(0) Class141 arg0) {
		if (Static312.anInt5136 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub11 local6 = arg0.aClass2_Sub11_1;
		Static375.aClass141Array1[Static312.anInt5136] = arg0;
		Static463.aBooleanArray25[Static312.anInt5136] = false;
		Static312.anInt5136++;
		@Pc(21) int local21 = arg0.anInt2907;
		if (arg0.aBoolean206) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2907;
		if (arg0.aBoolean207) {
			local29 = Static450.anInt7223 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method7271() + Static437.anInt7021 - local6.method7277() >> Static562.anInt9207;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method7271() + local6.method7277() - Static437.anInt7021 >> Static562.anInt9207;
			if (local73 >= Static405.anInt6657) {
				local73 = Static405.anInt6657 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray69[local41++];
				@Pc(105) int local105 = (local6.method7276() + Static437.anInt7021 - local6.method7277() >> Static562.anInt9207) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static83.anInt1434) {
					local113 = Static83.anInt1434 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static94.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static94.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5136;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static94.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5136 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static94.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5136 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static94.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static312.anInt5136 << 48;
					}
				}
			}
		}
	}
}
