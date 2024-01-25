import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
	public static int anInt5758;

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
	public static int anInt5763;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_75 = new Class160(46, -1);

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_134 = new Class40(2, 0);

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "Z")
	public static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Z")
	public static boolean method4937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static112.method1760(arg0, arg1) & Static345.method5205(arg0, arg1);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public static void method4939() {
		if (Static475.aFloat174 < (float) 1024) {
			Static475.aFloat174 = 1024.0F;
		}
		while (Static399.aFloat167 >= 16384.0F) {
			Static399.aFloat167 -= 16384.0F;
		}
		if (Static475.aFloat174 > 3072.0F) {
			Static475.aFloat174 = 3072.0F;
		}
		while (Static399.aFloat167 < 0.0F) {
			Static399.aFloat167 += 16384.0F;
		}
		@Pc(42) int local42 = Static141.anInt2539 >> 9;
		@Pc(46) int local46 = Static285.anInt4695 >> 9;
		@Pc(52) int local52 = Static490.method6768(Static141.anInt2539, Static282.anInt4677, Static285.anInt4695);
		@Pc(54) int local54 = 0;
		@Pc(76) int local76;
		if (local42 > 3 && local46 > 3 && Static301.anInt4912 - 4 > local42 && Static473.anInt7969 - 4 > local46) {
			for (local76 = local42 - 4; local76 <= local42 + 4; local76++) {
				for (@Pc(82) int local82 = local46 - 4; local82 <= local46 + 4; local82++) {
					@Pc(86) int local86 = Static282.anInt4677;
					if (local86 < 3 && Static26.method401(local82, local76)) {
						local86++;
					}
					@Pc(97) int local97 = 0;
					if (Static416.aClass193_Sub1_2.aByteArrayArrayArray11 != null && Static416.aClass193_Sub1_2.aByteArrayArrayArray11[local86] != null) {
						local97 = (Static416.aClass193_Sub1_2.aByteArrayArrayArray11[local86][local76][local82] & 0xFF) * 8;
					}
					@Pc(129) int local129 = local97 + local52 - Static285.aClass60Array8[local86].JA(local76, local82);
					if (local129 > local54) {
						local54 = local129;
					}
				}
			}
		}
		local76 = (local54 >> 2) * 1536;
		if (local76 > 786432) {
			local76 = 786432;
		}
		if (local76 < 262144) {
			local76 = 262144;
		}
		if (local76 > Static179.anInt3180) {
			Static179.anInt3180 += (local76 - Static179.anInt3180) / 24;
		} else if (local76 < Static179.anInt3180) {
			Static179.anInt3180 += (local76 - Static179.anInt3180) / 80;
		}
	}
}
