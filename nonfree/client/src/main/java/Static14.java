import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aga", name = "K", descriptor = "[Lclient!mq;")
	public static Class71[] aClass71Array35;

	@OriginalMember(owner = "client!aga", name = "B", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray10 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!aga", name = "M", descriptor = "Lclient!in;")
	public static Class169 aClass169_207 = null;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7644(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(Z)V")
	public static void method7645() {
		Static595.aClass101_14.method8069(Static474.aFloat177, Static88.aFloat14, Static202.aFloat85);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "([[BBLclient!qv;)V")
	public static void method7646(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class29_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt8876; local3++) {
			Static25.method456();
			for (@Pc(9) int local9 = 0; local9 < Static222.anInt4533 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static668.anInt11370 >> 3; local13++) {
					@Pc(23) int local23 = Static232.anIntArrayArrayArray21[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean642 || local32 == 0) {
							@Pc(46) int local46 = local23 >> 1 & 0x3;
							@Pc(52) int local52 = local23 >> 14 & 0x3FF;
							@Pc(58) int local58 = local23 >> 3 & 0x7FF;
							@Pc(68) int local68 = (local52 / 8 << 8) + local58 / 8;
							for (@Pc(70) int local70 = 0; local70 < Static437.anIntArray399.length; local70++) {
								if (Static437.anIntArray399[local70] == local68 && arg0[local70] != null) {
									arg1.method7861(local9 * 8, local13 * 8, (local52 & 0x7) * 8, Static196.aClass200Array1, (local58 & 0x7) * 8, local3, arg0[local70], local46, local32, Static607.aClass101_15);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIII)V")
	public static void method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(26) Class291 local26 = Static193.aClass291ArrayArrayArray2[arg3][arg1][arg2];
			if (local26 != null) {
				if (arg0 == 1) {
					local26.aShort81 = 0;
				} else if (arg0 == 2) {
					local26.aShort82 = 0;
				}
			}
			Static306.method5022();
			return;
		}
		for (@Pc(51) int local51 = 0; local51 < Static527.anInt9295; local51++) {
			@Pc(57) Class348 local57 = Static544.aClass348Array3[local51];
			if (local57.aByte132 == arg0 && local57.aShort114 == arg1 && arg2 == local57.aShort116 || arg1 == local57.aShort115 && local57.aShort116 == arg2) {
				if (Static527.anInt9295 != local51) {
					Static679.method4131(Static544.aClass348Array3, local51 + 1, Static544.aClass348Array3, local51, Static544.aClass348Array3.length - local51 - 1);
				}
				Static527.anInt9295--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILclient!ea;)V")
	public static void method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class15_Sub3_Sub3_Sub1_Sub1 arg2) {
		@Pc(10) int[] local10 = new int[4];
		Static679.method4130(local10, 0, local10.length, arg0);
		Static106.method1933(local10, arg1, arg2);
	}
}
