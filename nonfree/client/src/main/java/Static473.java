import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "(I)I")
	public static int method6803() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static499.aClass231_4.aBoolean482 && !Static499.aClass231_4.aBoolean484) {
			local7 = true;
			if (Static447.aClass3_Sub34_1.anInt6531 < 512 && Static447.aClass3_Sub34_1.anInt6531 != 0) {
				local7 = false;
			}
			if (Static353.aString80.startsWith("win")) {
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (Static464.aBoolean601) {
			local7 = false;
		}
		if (Static402.aBoolean517) {
			local9 = false;
		}
		if (Static134.aBoolean208) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static114.method2119();
		}
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		@Pc(74) int local74 = -1;
		if (local7) {
			try {
				local70 = Static671.method8691(2, 1000);
			} catch (@Pc(83) Exception local83) {
			}
		}
		if (local11) {
			try {
				local74 = Static671.method8691(3, 1000);
				if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 3) {
					@Pc(102) Class18 local102 = Static582.aClass16_12.method8193();
					@Pc(107) long local107 = local102.aLong7 & 0xFFFFFFFFFFFFL;
					@Pc(110) int local110 = local102.anInt679;
					if (local110 == 4318) {
						local9 &= local107 >= 64425238954L;
					} else if (local110 == 4098) {
						local9 &= local107 >= 60129613779L;
					}
				}
			} catch (@Pc(146) Exception local146) {
			}
		}
		if (local9) {
			try {
				local72 = Static671.method8691(1, 1000);
			} catch (@Pc(156) Exception local156) {
			}
		}
		if (local70 == -1 && local72 == -1 && local74 == -1) {
			return Static114.method2119();
		}
		local72 = (int) ((float) local72 * 1.1F);
		local74 = (int) ((float) local74 * 1.1F);
		if (local70 > local74 && local72 < local70) {
			return Static530.method7398(local70);
		} else if (local74 > local72) {
			return Static164.method2755(local74, 3);
		} else {
			return Static164.method2755(local72, 1);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Z")
	public static boolean method6805(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)Z")
	public static boolean method6806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
