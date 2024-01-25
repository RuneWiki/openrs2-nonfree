import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "[I")
	public static final int[] anIntArray489 = new int[1];

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "Lclient!cda;")
	public static final Class49 aClass49_4 = new Class49();

	@OriginalMember(owner = "client!mia", name = "l", descriptor = "[Lclient!pv;")
	public static final Class277_Sub1[] aClass277_Sub1Array1 = new Class277_Sub1[37];

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)I")
	public static int method5601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 << 13 ^ local15;
		@Pc(35) int local35 = Integer.MAX_VALUE & local21 * (local21 * local21 * 15731 + 789221) + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIBII)V")
	public static void method5603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static453.anInt7627 != 1) {
			return;
		}
		@Pc(13) int local13 = arg1 / Static133.anInt3875;
		@Pc(17) int local17 = arg0 / Static133.anInt3875;
		@Pc(26) int local26 = arg3 / Static549.anInt9105;
		@Pc(30) int local30 = arg2 / Static549.anInt9105;
		if (local13 >= Static116.anInt1804 || local17 < 0 || Static180.anInt3253 <= local26 || local30 < 0) {
			return;
		}
		if (Static180.anInt3253 <= local30) {
			local30 = Static180.anInt3253 - 1;
		}
		if (local26 < 0) {
			local26 = 0;
		}
		if (Static116.anInt1804 <= local17) {
			local17 = Static116.anInt1804 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		for (@Pc(85) int local85 = local26; local85 <= local30; local85++) {
			@Pc(96) int local96 = Static561.method7890(Static180.anInt3253, local85 + Static306.anInt4861) * Static116.anInt1804;
			for (@Pc(98) int local98 = local13; local98 <= local17; local98++) {
				@Pc(109) int local109 = Static561.method7890(Static116.anInt1804, local98 + Static607.anInt9954) + local96;
				Static583.anIntArray754[local109] = Static137.anInt2284;
			}
		}
	}
}
