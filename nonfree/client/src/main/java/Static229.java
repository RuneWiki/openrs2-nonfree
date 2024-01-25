import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "Lclient!tw;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(Z)V")
	public static void method4152() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static423.aBoolean622) {
			local9 = 4096;
			if (Static130.aBoolean784) {
				local7 = 2048;
			}
		}
		if ((float) local7 > Static532.aFloat179) {
			Static532.aFloat179 = (float) local7;
		}
		if (Static532.aFloat179 > (float) local9) {
			Static532.aFloat179 = (float) local9;
		}
		while (Static595.aFloat184 >= 16384.0F) {
			Static595.aFloat184 -= 16384.0F;
		}
		while (Static595.aFloat184 < 0.0F) {
			Static595.aFloat184 += 16384.0F;
		}
		@Pc(57) int local57 = Static369.anInt7056 >> 9;
		@Pc(61) int local61 = Static387.anInt7286 >> 9;
		@Pc(67) int local67 = Static150.method2982(Static86.anInt10575, Static387.anInt7286, Static369.anInt7056);
		@Pc(73) int local73 = 0;
		@Pc(105) int local105;
		if (local57 > 3 && local61 > 3 && Static306.anInt6176 - 4 > local57 && Static108.anInt2930 - 4 > local61) {
			for (local105 = local57 - 4; local105 <= local57 + 4; local105++) {
				for (@Pc(111) int local111 = local61 - 4; local111 <= local61 + 4; local111++) {
					@Pc(115) int local115 = Static86.anInt10575;
					if (local115 < 3 && Static3.method52(local111, local105)) {
						local115++;
					}
					@Pc(126) int local126 = 0;
					if (Static479.aClass210_Sub1_2.aByteArrayArrayArray12 != null && Static479.aClass210_Sub1_2.aByteArrayArrayArray12[local115] != null) {
						local126 = (Static479.aClass210_Sub1_2.aByteArrayArrayArray12[local115][local105][local111] & 0xFF) * 8 << 2;
					}
					if (Static148.aClass245Array1 != null && Static148.aClass245Array1[local115] != null) {
						@Pc(168) int local168 = local67 + local126 - Static148.aClass245Array1[local115].method7583(local111, local105);
						if (local168 > local73) {
							local73 = local168;
						}
					}
				}
			}
		}
		local105 = (local73 >> 2) * 1536;
		if (local105 > 786432) {
			local105 = 786432;
		}
		if (local105 < 262144) {
			local105 = 262144;
		}
		if (Static86.anInt10555 < local105) {
			Static86.anInt10555 += (local105 - Static86.anInt10555) / 24;
		} else if (Static86.anInt10555 > local105) {
			Static86.anInt10555 += (local105 - Static86.anInt10555) / 80;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!eda;)[I")
	public static int[] method4153(@OriginalArg(1) Class6_Sub17 arg0) {
		@Pc(10) Class6_Sub8 local10 = new Class6_Sub8(518);
		@Pc(18) int[] local18 = new int[4];
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			local18[local20] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8211(10);
		local10.method8202(local18[0]);
		local10.method8202(local18[1]);
		local10.method8202(local18[2]);
		local10.method8202(local18[3]);
		for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
			local10.method8202((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8241((int) (Math.random() * 9.9999999E7D));
		local10.method8222(Static548.aBigInteger6, Static265.aBigInteger4);
		arg0.aClass6_Sub8_Sub1_2.method8234(local10.aByteArray102, local10.anInt10061, 0);
		return local18;
	}
}
