import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
	public static int anInt2689 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)Z")
	public static boolean method2273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static673.method9097(arg0, arg1) | (arg0 & 0x10000) != 0 || Static179.method2535(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static307.method4407(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)I")
	public static int method2274() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static569.aClass380_6.aBoolean729 && !Static569.aClass380_6.aBoolean728) {
			local7 = true;
			if (Static296.aClass6_Sub33_1.anInt4998 < 512 && Static296.aClass6_Sub33_1.anInt4998 != 0) {
				local7 = false;
			}
			if (Static647.aString144.startsWith("win")) {
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (Static423.aBoolean488) {
			local11 = false;
		}
		if (Static158.aBoolean163) {
			local9 = false;
		}
		if (Static407.aBoolean443) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static399.method5766();
		}
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		@Pc(74) int local74 = -1;
		if (local7) {
			try {
				local70 = Static27.method6638(1000, 2);
			} catch (@Pc(83) Exception local83) {
			}
		}
		if (local11) {
			try {
				local74 = Static27.method6638(1000, 3);
				if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 3) {
					@Pc(100) Class297 local100 = Static546.aClass132_13.method7439();
					@Pc(105) long local105 = local100.aLong251 & 0xFFFFFFFFFFFFL;
					@Pc(108) int local108 = local100.anInt8434;
					if (local108 == 4318) {
						local9 &= local105 >= 64425238954L;
					} else if (local108 == 4098) {
						local9 &= local105 >= 60129613779L;
					}
				}
			} catch (@Pc(142) Exception local142) {
			}
		}
		if (local9) {
			try {
				local72 = Static27.method6638(1000, 1);
			} catch (@Pc(152) Exception local152) {
			}
		}
		if (local70 == -1 && local72 == -1 && local74 == -1) {
			return Static399.method5766();
		}
		local72 = (int) ((float) local72 * 1.1F);
		local74 = (int) ((float) local74 * 1.1F);
		if (local70 > local74 && local70 > local72) {
			return Static6.method244(local70);
		} else if (local74 <= local72) {
			return Static678.method9180(1, local72);
		} else {
			return Static678.method9180(3, local74);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2275(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static96.anInt1739; local19++) {
			if (arg0.equalsIgnoreCase(Static480.aStringArray50[local19])) {
				return local19;
			}
		}
		return -1;
	}
}
