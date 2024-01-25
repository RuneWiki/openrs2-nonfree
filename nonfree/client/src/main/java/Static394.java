import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "Lclient!oh;")
	public static Class237 aClass237_103;

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "[Lclient!gv;")
	public static Class124[] aClass124Array1;

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_74 = new Class257(73, 3);

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
	public static int anInt7610 = -1;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_75 = new Class257(59, 5);

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
	public static void method6291() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static183.aBoolean308) {
			local9 = 4096;
			if (Static187.aBoolean311) {
				local7 = 2048;
			}
		}
		if (Static64.aFloat44 < (float) local7) {
			Static64.aFloat44 = local7;
		}
		if (Static64.aFloat44 > (float) local9) {
			Static64.aFloat44 = local9;
		}
		while (Static499.aFloat185 >= 16384.0F) {
			Static499.aFloat185 -= 16384.0F;
		}
		while (Static499.aFloat185 < 0.0F) {
			Static499.aFloat185 += 16384.0F;
		}
		@Pc(57) int local57 = Static427.anInt8006 >> 9;
		@Pc(61) int local61 = Static572.anInt9826 >> 9;
		@Pc(67) int local67 = Static177.method3098(Static572.anInt9826, Static427.anInt8006, Static128.anInt3428);
		@Pc(69) int local69 = 0;
		@Pc(93) int local93;
		if (local57 > 3 && local61 > 3 && local57 < Static372.anInt7082 - 4 && Static218.anInt5023 - 4 > local61) {
			for (local93 = local57 - 4; local93 <= local57 + 4; local93++) {
				for (@Pc(99) int local99 = local61 - 4; local99 <= local61 + 4; local99++) {
					@Pc(103) int local103 = Static128.anInt3428;
					if (local103 < 3 && Static61.method1675(local99, local93)) {
						local103++;
					}
					@Pc(116) int local116 = 0;
					if (Static32.aClass19_Sub1_1.aByteArrayArrayArray12 != null && Static32.aClass19_Sub1_1.aByteArrayArrayArray12[local103] != null) {
						local116 = (Static32.aClass19_Sub1_1.aByteArrayArrayArray12[local103][local93][local99] & 0xFF) * 8 << 2;
					}
					if (Static34.aClass86Array5 != null && Static34.aClass86Array5[local103] != null) {
						@Pc(158) int local158 = local67 + local116 - Static34.aClass86Array5[local103].method8086(local99, local93);
						if (local158 > local69) {
							local69 = local158;
						}
					}
				}
			}
		}
		local93 = (local69 >> 2) * 1536;
		if (local93 > 786432) {
			local93 = 786432;
		}
		if (local93 < 262144) {
			local93 = 262144;
		}
		if (local93 > Static291.anInt5934) {
			Static291.anInt5934 += (local93 - Static291.anInt5934) / 24;
		} else if (Static291.anInt5934 > local93) {
			Static291.anInt5934 += (local93 - Static291.anInt5934) / 80;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILclient!ig;I)Ljava/lang/String;")
	public static String method6292(@OriginalArg(1) Class8_Sub8 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8565();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt10588 += Static554.aClass33_1.method1277(arg0.anInt10588, local7, local19, arg0.aByteArray107, 0);
			return Static287.method4822(0, local19, local7);
		} catch (@Pc(45) Exception local45) {
			return "Cabbage";
		}
	}
}
