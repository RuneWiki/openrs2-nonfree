import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "Lclient!in;")
	public static final Class169 aClass169_15 = new Class169(82, -1);

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "Lclient!in;")
	public static final Class169 aClass169_16 = new Class169(23, 3);

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Lclient!fe;")
	public static final Class103 aClass103_1 = new Class103();

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)Lclient!eq;")
	public static Class2_Sub1_Sub5 method466() {
		@Pc(8) Class2_Sub1_Sub5 local8 = (Class2_Sub1_Sub5) Static74.aClass279_12.method7293();
		if (local8 != null) {
			local8.method9825();
			local8.method9377();
			return local8;
		}
		do {
			local8 = (Class2_Sub1_Sub5) Static36.aClass279_2.method7293();
			if (local8 == null) {
				return null;
			}
			if (local8.method2485() > Static99.method1701()) {
				return null;
			}
			local8.method9825();
			local8.method9377();
		} while ((local8.aLong296 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)V")
	public static void method474() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static110.aBoolean800) {
			if (Static353.aBoolean517) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if ((float) local7 > Static320.aFloat118) {
			Static320.aFloat118 = (float) local7;
		}
		if ((float) local9 < Static320.aFloat118) {
			Static320.aFloat118 = (float) local9;
		}
		while (Static278.aFloat108 >= 16384.0F) {
			Static278.aFloat108 -= 16384.0F;
		}
		while (Static278.aFloat108 < 0.0F) {
			Static278.aFloat108 += 16384.0F;
		}
		@Pc(57) int local57 = Static461.anInt8253 >> 9;
		@Pc(61) int local61 = Static386.anInt7301 >> 9;
		@Pc(69) int local69 = Static10.method154(Static386.anInt7301, Static461.anInt8253, Static547.anInt9550);
		@Pc(71) int local71 = 0;
		@Pc(99) int local99;
		if (local57 > 3 && local61 > 3 && local57 < Static222.anInt4533 - 4 && local61 < Static668.anInt11370 - 4) {
			for (local99 = local57 - 4; local99 <= local57 + 4; local99++) {
				for (@Pc(105) int local105 = local61 - 4; local105 <= local61 + 4; local105++) {
					@Pc(109) int local109 = Static547.anInt9550;
					if (local109 < 3 && Static45.method947(local99, local105)) {
						local109++;
					}
					@Pc(120) int local120 = 0;
					if (Static223.aClass29_Sub1_1.aByteArrayArrayArray17 != null && Static223.aClass29_Sub1_1.aByteArrayArrayArray17[local109] != null) {
						local120 = (Static223.aClass29_Sub1_1.aByteArrayArrayArray17[local109][local99][local105] & 0xFF) * 8 << 2;
					}
					if (Static245.aClass18Array14 != null && Static245.aClass18Array14[local109] != null) {
						@Pc(162) int local162 = local69 + local120 - Static245.aClass18Array14[local109].method8537(local105, local99);
						if (local71 < local162) {
							local71 = local162;
						}
					}
				}
			}
		}
		local99 = (local71 >> 2) * 1536;
		if (local99 > 786432) {
			local99 = 786432;
		}
		if (local99 < 262144) {
			local99 = 262144;
		}
		if (local99 > Static612.anInt10754) {
			Static612.anInt10754 += (local99 - Static612.anInt10754) / 24;
		} else if (Static612.anInt10754 > local99) {
			Static612.anInt10754 += (local99 - Static612.anInt10754) / 80;
		}
	}
}
