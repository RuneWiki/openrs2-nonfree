import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt5860;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Lclient!wn;")
	public static Class95 aClass95_13;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!vc;")
	public static final Class5_Sub44 aClass5_Sub44_1 = new Class5_Sub44(0, -1);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!cg;)V")
	public static void method5272(@OriginalArg(0) Class5_Sub9_Sub1 arg0) {
		if (Static303.anInt5904 >= 255) {
			return;
		}
		Static182.aClass5_Sub9_Sub1Array2[Static303.anInt5904] = arg0;
		Static29.aBooleanArray4[Static303.anInt5904] = false;
		Static303.anInt5904++;
		@Pc(18) int local18 = arg0.anInt722;
		if (arg0.aBoolean52) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt722;
		if (arg0.aBoolean53) {
			local26 = Static345.anInt6647 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt708 + 64 - arg0.anInt705 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt708 + arg0.anInt705 - 64 >> 7;
			if (local66 >= Static236.anInt4222) {
				local66 = Static236.anInt4222 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray7[local38++];
				@Pc(96) int local96 = (arg0.anInt703 + 64 - arg0.anInt705 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static350.anInt6715) {
					local104 = Static350.anInt6715 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static308.anIntArrayArrayArray9[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static308.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static303.anInt5904;
					} else if ((local126 & 0xFF00) == 0) {
						Static308.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static303.anInt5904 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static308.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static303.anInt5904 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static308.anIntArrayArrayArray9[local35][local117][local75] = local126 | Static303.anInt5904 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public static void method5273() {
		if (Static278.anInt5495 == 10) {
			Static50.method822(28);
		}
		if (Static278.anInt5495 == 30) {
			Static50.method822(25);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	public static void method5274() {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			Static287.aBooleanArray23[local10] = true;
		}
	}
}
