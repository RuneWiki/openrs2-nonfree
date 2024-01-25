import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "J")
	public static long aLong221;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[200];

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[BIII[BII)V")
	public static void method6667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg2[local26] += arg6[arg5++];
				@Pc(38) int local38 = arg0++;
				arg2[local38] += arg6[arg5++];
				@Pc(50) int local50 = arg0++;
				arg2[local50] += arg6[arg5++];
				@Pc(62) int local62 = arg0++;
				arg2[local62] += arg6[arg5++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg0++;
				arg2[local26] += arg6[arg5++];
			}
			arg5 += arg1;
			arg0 += arg4;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)Lclient!jb;")
	public static Class11_Sub1_Sub4 method6668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub1_Sub4_1 == null ? null : local7.aClass11_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!ac;)V")
	public static void method6670(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aByteArray104.length - arg0.anInt9802 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method7974();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray104.length - arg0.anInt9802 < 2) {
			return;
		}
		@Pc(44) int local44 = arg0.method7945();
		if (arg0.aByteArray104.length - arg0.anInt9802 < local44 * 6) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < local44; local58++) {
			@Pc(66) int local66 = arg0.method7945();
			@Pc(70) int local70 = arg0.method7940();
			if (Static250.anIntArray251.length > local66 && Static166.aBooleanArray34[local66] && (Static439.aClass331_7.method7271(local66).aChar1 != '1' || local70 >= -1 && local70 <= 1)) {
				Static250.anIntArray251[local66] = local70;
			}
		}
	}
}
