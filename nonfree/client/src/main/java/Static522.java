import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!nl;")
	public static Class3_Sub7_Sub5 aClass3_Sub7_Sub5_4;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!us;")
	public static final Class344 aClass344_110 = new Class344(58, -1);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public static void method7467() {
		Static220.aClass108Array2 = null;
		if (Static349.aBoolean590 && Static626.method8490() != 1) {
			Static19.method263(0, Static66.method1485(), Static581.anInt9720 == 3 || Static581.anInt9720 == 7, Static210.method4143(), 0);
		}
		@Pc(34) int local34 = 0;
		@Pc(40) int local40 = 0;
		if (Static349.aBoolean590) {
			local34 = Static477.method7033();
			local40 = Static10.method114();
		}
		Static500.method7313(local40, Static530.anInt9144, local40 + Static256.anInt5669, local40, Static114.anInt2970 + local34, local34, -1, local34);
		if (Static220.aClass108Array2 != null) {
			Static642.method8648(local34 + Static114.anInt2970, Static344.anInt6764, Static256.anInt5669 + local40, local40, local34, Static28.anInt484, Static220.aClass108Array2, true, -1412584499, Static326.aClass108_8.anInt4060);
			Static220.aClass108Array2 = null;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V")
	public static void method7469() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static216.aBoolean440) {
			local9 = 4096;
			if (Static506.aBoolean756) {
				local7 = 2048;
			}
		}
		if (Static103.aFloat96 < (float) local7) {
			Static103.aFloat96 = local7;
		}
		if (Static103.aFloat96 > (float) local9) {
			Static103.aFloat96 = local9;
		}
		while (Static502.aFloat230 >= 16384.0F) {
			Static502.aFloat230 -= 16384.0F;
		}
		while (Static502.aFloat230 < 0.0F) {
			Static502.aFloat230 += 16384.0F;
		}
		@Pc(57) int local57 = Static242.anInt5467 >> 9;
		@Pc(61) int local61 = Static77.anInt3996 >> 9;
		@Pc(67) int local67 = Static202.method3958(Static77.anInt3996, Static552.anInt9440, Static242.anInt5467);
		@Pc(69) int local69 = 0;
		@Pc(97) int local97;
		if (local57 > 3 && local61 > 3 && Static394.anInt7540 - 4 > local57 && Static462.anInt8391 - 4 > local61) {
			for (local97 = local57 - 4; local97 <= local57 + 4; local97++) {
				for (@Pc(103) int local103 = local61 - 4; local103 <= local61 + 4; local103++) {
					@Pc(107) int local107 = Static552.anInt9440;
					if (local107 < 3 && Static525.method7485(local103, local97)) {
						local107++;
					}
					@Pc(120) int local120 = 0;
					if (Static593.aClass132_Sub1_2.aByteArrayArrayArray17 != null && Static593.aClass132_Sub1_2.aByteArrayArrayArray17[local107] != null) {
						local120 = (Static593.aClass132_Sub1_2.aByteArrayArrayArray17[local107][local97][local103] & 0xFF) * 8 << 2;
					}
					if (Static500.aClass274Array2 != null && Static500.aClass274Array2[local107] != null) {
						@Pc(163) int local163 = local120 + local67 - Static500.aClass274Array2[local107].method8041(local97, local103);
						if (local163 > local69) {
							local69 = local163;
						}
					}
				}
			}
		}
		local97 = (local69 >> 2) * 1536;
		if (local97 > 786432) {
			local97 = 786432;
		}
		if (local97 < 262144) {
			local97 = 262144;
		}
		if (Static239.anInt5443 < local97) {
			Static239.anInt5443 += (local97 - Static239.anInt5443) / 24;
		} else if (Static239.anInt5443 > local97) {
			Static239.anInt5443 += (local97 - Static239.anInt5443) / 80;
			return;
		}
	}
}
