import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_28 = new Class397(99, -2);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!aea;)V")
	public static void method1779(@OriginalArg(0) Class8 arg0) {
		if (Static309.anInt4982 >= 65535) {
			return;
		}
		@Pc(7) Class3_Sub5 local7 = arg0.aClass3_Sub5_1;
		Static660.aClass8Array1[Static309.anInt4982] = arg0;
		Static677.aBooleanArray33[Static309.anInt4982] = false;
		Static309.anInt4982++;
		@Pc(22) int local22 = arg0.anInt245;
		if (arg0.aBoolean5) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt245;
		if (arg0.aBoolean6) {
			local30 = Static169.anInt2992 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method7177() + Static434.anInt10639 - local7.method7173() >> Static626.anInt9669;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method7177() + local7.method7173() - Static434.anInt10639 >> Static626.anInt9669;
			if (local74 >= Static448.anInt6835) {
				local74 = Static448.anInt6835 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray1[local42++];
				@Pc(106) int local106 = (local7.method7174() + Static434.anInt10639 - local7.method7173() >> Static626.anInt9669) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static128.anInt2531) {
					local114 = Static128.anInt2531 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static136.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static136.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static309.anInt4982;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static136.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static309.anInt4982 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static136.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static309.anInt4982 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static136.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static309.anInt4982 << 48;
					}
				}
			}
		}
	}
}
