import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	public static int anInt765;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	public static int anInt772 = -1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)I")
	public static int method744(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!sf;IIIII)V")
	public static void method745(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static202.anInt3256) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static665.anInt7330) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static92.anInt1526 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class313 local62 = Static129.aClass313ArrayArrayArray7[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static298.aClass88Array3[local17].method8749(local23, local32) + Static298.aClass88Array3[local17].method8749(local23 + 1, local32) + Static298.aClass88Array3[local17].method8749(local23, local32 + 1) + Static298.aClass88Array3[local17].method8749(local23 + 1, local32 + 1)) / 4 - (Static298.aClass88Array3[arg1].method8749(arg2, arg3) + Static298.aClass88Array3[arg1].method8749(arg2 + 1, arg3) + Static298.aClass88Array3[arg1].method8749(arg2, arg3 + 1) + Static298.aClass88Array3[arg1].method8749(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class41_Sub1_Sub3 local151 = local62.aClass41_Sub1_Sub3_2;
									@Pc(154) Class41_Sub1_Sub3 local154 = local62.aClass41_Sub1_Sub3_1;
									if (local151 != null && local151.method8653()) {
										arg0.method8658((local32 - arg3) * Static108.anInt1949 + (1 - arg5) * Static143.anInt2383, local151, Static267.aClass143_6, (local23 - arg2) * Static108.anInt1949 + (1 - arg4) * Static143.anInt2383, local148, local1);
									}
									if (local154 != null && local154.method8653()) {
										arg0.method8658((local32 - arg3) * Static108.anInt1949 + (1 - arg5) * Static143.anInt2383, local154, Static267.aClass143_6, (local23 - arg2) * Static108.anInt1949 + (1 - arg4) * Static143.anInt2383, local148, local1);
									}
									for (@Pc(227) Class40 local227 = local62.aClass40_3; local227 != null; local227 = local227.aClass40_1) {
										@Pc(231) Class41_Sub1_Sub1 local231 = local227.aClass41_Sub1_Sub1_1;
										if (local231 != null && local231.method8653() && (local23 == local231.aShort109 || local23 == local3) && (local32 == local231.aShort108 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort107 + 1 - local231.aShort109;
											@Pc(268) int local268 = local231.aShort110 + 1 - local231.aShort108;
											arg0.method8658((local231.aShort108 - arg3) * Static108.anInt1949 + (local268 - arg5) * Static143.anInt2383, local231, Static267.aClass143_6, (local231.aShort109 - arg2) * Static108.anInt1949 + (local260 - arg4) * Static143.anInt2383, local148, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ija;III)J")
	public static long method746(@OriginalArg(0) Interface10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(21) Class81 local21 = Static400.aClass140_4.method2839(arg0.method8668());
		@Pc(42) long local42 = (long) ((arg2 | 0x800000) << 7 | arg1 | arg0.method8670() << 14 | arg0.method8671() << 20);
		if (local21.anInt1885 == 0) {
			local42 |= local12;
		}
		if (local21.anInt1905 == 1) {
			local42 |= local10;
		}
		return local42 | (long) arg0.method8668() << 32;
	}
}
