import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public static int anInt4678;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "[[Lclient!ec;")
	public static Class68[][] aClass68ArrayArray4;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	public static int anInt4679;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!dw;")
	public static final Class65 aClass65_6 = new Class65("", 14);

	@OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public static int anInt4680 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!em;)V")
	public static void method3597(@OriginalArg(0) Class75 arg0) {
		if (Static315.anInt5904 >= 65535) {
			return;
		}
		@Pc(6) Class1_Sub4 local6 = arg0.aClass1_Sub4_2;
		Static135.aClass75Array1[Static315.anInt5904] = arg0;
		Static278.aBooleanArray19[Static315.anInt5904] = false;
		Static315.anInt5904++;
		@Pc(21) int local21 = arg0.anInt2355;
		if (arg0.aBoolean154) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2355;
		if (arg0.aBoolean153) {
			local29 = Static220.anInt4418 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method3809() + Static333.anInt6111 - local6.method3805() >> Static198.anInt7947;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method3809() + local6.method3805() - Static333.anInt6111 >> Static198.anInt7947;
			if (local73 >= Static198.anInt7949) {
				local73 = Static198.anInt7949 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray55[local41++];
				@Pc(105) int local105 = (local6.method3813() + Static333.anInt6111 - local6.method3805() >> Static198.anInt7947) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static216.anInt4346) {
					local113 = Static216.anInt4346 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static457.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static457.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static315.anInt5904;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static457.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static315.anInt5904 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static457.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static315.anInt5904 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static457.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static315.anInt5904 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3599(@OriginalArg(0) String arg0) {
		return Static59.method1106(arg0, 10);
	}
}
