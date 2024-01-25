import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)I")
	public static int method3851(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3853(@OriginalArg(0) String arg0) {
		if (Static276.aClass15Array2 != null) {
			Static429.method5476(Static438.aClass215_96);
			Static3.aClass4_Sub12_Sub1_5.method2551(method3856(arg0));
			Static3.aClass4_Sub12_Sub1_5.method2518(arg0);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method3854(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static153.method2605(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	public static void method3855() {
		if (Static164.aFloat142 < 1024.0F) {
			Static164.aFloat142 = 1024.0F;
		}
		while (Static368.aFloat192 >= 16384.0F) {
			Static368.aFloat192 -= 16384.0F;
		}
		if (Static164.aFloat142 > 3072.0F) {
			Static164.aFloat142 = 3072.0F;
		}
		while (Static368.aFloat192 < 0.0F) {
			Static368.aFloat192 += 16384.0F;
		}
		@Pc(49) int local49 = Static394.anInt6578 >> 7;
		@Pc(53) int local53 = Static325.anInt5636 >> 7;
		@Pc(59) int local59 = Static13.method135(Static394.anInt6578, Static263.anInt4963, Static325.anInt5636);
		@Pc(61) int local61 = 0;
		@Pc(87) int local87;
		if (local49 > 3 && local53 > 3 && local49 < Static326.anInt5666 - 4 && local53 < Static283.anInt5187 - 4) {
			for (local87 = local49 - 4; local87 <= local49 + 4; local87++) {
				for (@Pc(93) int local93 = local53 - 4; local93 <= local53 + 4; local93++) {
					@Pc(97) int local97 = Static263.anInt4963;
					if (local97 < 3 && Static378.method3229(local87, local93)) {
						local97++;
					}
					@Pc(110) int local110 = 0;
					if (Static67.aClass266_Sub1_1.aByteArrayArrayArray14 != null && Static67.aClass266_Sub1_1.aByteArrayArrayArray14[local97] != null) {
						local110 = (Static67.aClass266_Sub1_1.aByteArrayArrayArray14[local97][local87][local93] & 0xFF) * 8;
					}
					@Pc(143) int local143 = local110 + local59 - Static417.aClass65Array4[local97].l(local87, local93);
					if (local61 < local143) {
						local61 = local143;
					}
				}
			}
		}
		local87 = (local61 >> 0) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > Static149.anInt3012) {
			Static149.anInt3012 += (local87 - Static149.anInt3012) / 24;
		} else if (Static149.anInt3012 > local87) {
			Static149.anInt3012 += (local87 - Static149.anInt3012) / 80;
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public static int method3856(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
