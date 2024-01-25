import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Z")
	public static boolean method7806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!mq;)V")
	public static void method7807(@OriginalArg(0) Class248 arg0) {
		if (Static488.anInt7862 >= 65535) {
			return;
		}
		@Pc(7) Class2_Sub7 local7 = arg0.aClass2_Sub7_3;
		Static292.aClass248Array1[Static488.anInt7862] = arg0;
		Static336.aBooleanArray24[Static488.anInt7862] = false;
		Static488.anInt7862++;
		@Pc(22) int local22 = arg0.anInt6688;
		if (arg0.aBoolean571) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt6688;
		if (arg0.aBoolean570) {
			local30 = Static97.anInt1761 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method8172() + Static328.anInt5032 - local7.method8173() >> Static260.anInt4053;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method8172() + local7.method8173() - Static328.anInt5032 >> Static260.anInt4053;
			if (local74 >= Static545.anInt8590) {
				local74 = Static545.anInt8590 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray111[local42++];
				@Pc(106) int local106 = (local7.method8171() + Static328.anInt5032 - local7.method8173() >> Static260.anInt4053) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static372.anInt5930) {
					local114 = Static372.anInt5930 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static255.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static255.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static488.anInt7862;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static255.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static488.anInt7862 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static255.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static488.anInt7862 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static255.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static488.anInt7862 << 48;
					}
				}
			}
		}
	}
}
