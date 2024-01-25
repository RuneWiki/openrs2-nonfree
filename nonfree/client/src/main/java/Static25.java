import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!av", name = "j", descriptor = "Lclient!ni;")
	public static Class223 aClass223_9;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_8 = new Class73(48, 3);

	@OriginalMember(owner = "client!av", name = "h", descriptor = "Lclient!rga;")
	public static final Class290 aClass290_5 = new Class290("stellardawn", 1);

	@OriginalMember(owner = "client!av", name = "p", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_9 = new Class73(73, 4);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZII)V")
	public static void method714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18;
		if (arg0 != Static53.anInt1787) {
			Static12.anIntArray15 = new int[arg0];
			for (local18 = 0; local18 < arg0; local18++) {
				Static12.anIntArray15[local18] = (local18 << 12) / arg0;
			}
			Static564.anInt9697 = arg0 - 1;
			Static339.anInt6745 = arg0 * 32;
			Static53.anInt1787 = arg0;
		}
		if (arg1 == Static123.anInt3099) {
			return;
		}
		if (Static53.anInt1787 == arg1) {
			Static603.anIntArray549 = Static12.anIntArray15;
		} else {
			Static603.anIntArray549 = new int[arg1];
			for (local18 = 0; local18 < arg1; local18++) {
				Static603.anIntArray549[local18] = (local18 << 12) / arg1;
			}
		}
		Static123.anInt3099 = arg1;
		Static117.anInt3013 = arg1 - 1;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)I")
	public static int method716(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = arg0 & 0x3F;
		@Pc(23) int local23 = arg0 >> 6 & 0x3;
		if (local17 == 18) {
			if (local23 == 0) {
				return 1;
			}
			if (local23 == 1) {
				return 2;
			}
			if (local23 == 2) {
				return 4;
			}
			if (local23 == 3) {
				return 8;
			}
		} else if (local17 == 19 || local17 == 21) {
			if (local23 == 0) {
				return 16;
			}
			if (local23 == 1) {
				return 32;
			}
			if (local23 == 2) {
				return 64;
			}
			if (local23 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!gg;IIIII)V")
	public static void method717(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static618.anInt10427) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static623.anInt10485) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static142.anInt3372 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class186 local62 = Static26.aClass186ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static148.aClass245Array1[local17].method7583(local32, local23) + Static148.aClass245Array1[local17].method7583(local32, local23 + 1) + Static148.aClass245Array1[local17].method7583(local32 + 1, local23) + Static148.aClass245Array1[local17].method7583(local32 + 1, local23 + 1)) / 4 - (Static148.aClass245Array1[arg1].method7583(arg3, arg2) + Static148.aClass245Array1[arg1].method7583(arg3, arg2 + 1) + Static148.aClass245Array1[arg1].method7583(arg3 + 1, arg2) + Static148.aClass245Array1[arg1].method7583(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class9_Sub4_Sub5 local151 = local62.aClass9_Sub4_Sub5_1;
									@Pc(154) Class9_Sub4_Sub5 local154 = local62.aClass9_Sub4_Sub5_2;
									if (local151 != null && local151.method8417()) {
										arg0.method8416(local151, local1, (local23 - arg2) * Static190.anInt4138 + (1 - arg4) * Static375.anInt7139, Static472.aClass5_14, local148, (local32 - arg3) * Static190.anInt4138 + (1 - arg5) * Static375.anInt7139);
									}
									if (local154 != null && local154.method8417()) {
										arg0.method8416(local154, local1, (local23 - arg2) * Static190.anInt4138 + (1 - arg4) * Static375.anInt7139, Static472.aClass5_14, local148, (local32 - arg3) * Static190.anInt4138 + (1 - arg5) * Static375.anInt7139);
									}
									for (@Pc(227) Class168 local227 = local62.aClass168_3; local227 != null; local227 = local227.aClass168_2) {
										@Pc(231) Class9_Sub4_Sub2 local231 = local227.aClass9_Sub4_Sub2_1;
										if (local231 != null && local231.method8417() && (local23 == local231.aShort115 || local23 == local3) && (local32 == local231.aShort114 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort117 + 1 - local231.aShort115;
											@Pc(268) int local268 = local231.aShort116 + 1 - local231.aShort114;
											arg0.method8416(local231, local1, (local231.aShort115 - arg2) * Static190.anInt4138 + (local260 - arg4) * Static375.anInt7139, Static472.aClass5_14, local148, (local231.aShort114 - arg3) * Static190.anInt4138 + (local268 - arg5) * Static375.anInt7139);
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
}
