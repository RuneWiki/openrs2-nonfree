import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "Lclient!vr;")
	public static Class2_Sub47 aClass2_Sub47_1;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "[I")
	public static final int[] anIntArray263 = new int[3];

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_7 = new Class117(13, 0, 1, 0);

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3507(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V")
	public static void method3510() {
		@Pc(5) short local5 = 1024;
		@Pc(7) short local7 = 3072;
		if (Static582.aBoolean678) {
			local7 = 4096;
			if (Static56.aBoolean129) {
				local5 = 2048;
			}
		}
		if ((float) local5 > Static464.aFloat130) {
			Static464.aFloat130 = (float) local5;
		}
		if (Static464.aFloat130 > (float) local7) {
			Static464.aFloat130 = (float) local7;
		}
		while (Static225.aFloat85 >= 16384.0F) {
			Static225.aFloat85 -= 16384.0F;
		}
		while (Static225.aFloat85 < 0.0F) {
			Static225.aFloat85 += 16384.0F;
		}
		@Pc(53) int local53 = Static145.anInt3035 >> 9;
		@Pc(57) int local57 = Static553.anInt9177 >> 9;
		@Pc(63) int local63 = Static392.method5799(Static531.anInt8550, Static145.anInt3035, Static553.anInt9177);
		@Pc(65) int local65 = 0;
		@Pc(85) int local85;
		if (local53 > 3 && local57 > 3 && local53 < Static456.anInt7428 - 4 && local57 < Static5.anInt112 - 4) {
			for (local85 = local53 - 4; local85 <= local53 + 4; local85++) {
				for (@Pc(90) int local90 = local57 - 4; local90 <= local57 + 4; local90++) {
					@Pc(93) int local93 = Static531.anInt8550;
					if (local93 < 3 && Static481.method6813(local90, local85)) {
						local93++;
					}
					@Pc(106) int local106 = 0;
					if (Static348.aClass309_Sub1_1.aByteArrayArrayArray10 != null && Static348.aClass309_Sub1_1.aByteArrayArrayArray10[local93] != null) {
						local106 = (Static348.aClass309_Sub1_1.aByteArrayArrayArray10[local93][local85][local90] & 0xFF) * 8 << 2;
					}
					if (Static511.aClass91Array3 != null && Static511.aClass91Array3[local93] != null) {
						@Pc(147) int local147 = local106 + local63 - Static511.aClass91Array3[local93].method7447(local90, local85);
						if (local147 > local65) {
							local65 = local147;
						}
					}
				}
			}
		}
		local85 = (local65 >> 2) * 1536;
		if (local85 > 786432) {
			local85 = 786432;
		}
		if (local85 < 262144) {
			local85 = 262144;
		}
		if (Static561.anInt9242 < local85) {
			Static561.anInt9242 += (local85 - Static561.anInt9242) / 24;
		} else if (Static561.anInt9242 > local85) {
			Static561.anInt9242 += (local85 - Static561.anInt9242) / 80;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3513(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static568.anInt9305; local14++) {
			if (arg0.equalsIgnoreCase(Static307.aStringArray33[local14])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static204.aStringArray26[local14])) {
				return true;
			}
		}
		return false;
	}
}
