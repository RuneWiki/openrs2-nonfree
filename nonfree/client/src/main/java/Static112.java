import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "Lclient!ae;")
	public static Class8 aClass8_30;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_35 = new Class289(79, -1);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ae;Z)V")
	public static void method1778(@OriginalArg(0) Class8 arg0) {
		Static357.aClass8_95 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIJLclient!sha;ILclient!aa;BI)V")
	public static void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) Class321 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg7 * arg7 + arg5 * arg5;
		if (arg3 < (long) local14) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg4.anInt9103 / 2, arg4.anInt9077 / 2);
		if (local14 <= local30 * local30) {
			Static474.method6310(arg6, arg5, Static441.aClass9Array128[arg0], arg4, arg2, arg7, arg1);
			return;
		}
		local30 -= 10;
		@Pc(46) int local46;
		if (Static407.anInt6820 == 4) {
			local46 = (int) Static228.aFloat26 & 0x3FFF;
		} else {
			local46 = Static553.anInt9285 + (int) Static228.aFloat26 & 0x3FFF;
		}
		@Pc(59) int local59 = Class6_Sub1_Sub3.anIntArray56[local46];
		@Pc(63) int local63 = Class6_Sub1_Sub3.anIntArray58[local46];
		if (Static407.anInt6820 != 4) {
			local59 = local59 * 256 / (Static605.anInt9842 + 256);
			local63 = local63 * 256 / (Static605.anInt9842 + 256);
		}
		@Pc(92) int local92 = arg7 * local63 + local59 * arg5 >> 14;
		@Pc(103) int local103 = local63 * arg5 - local59 * arg7 >> 14;
		@Pc(109) double local109 = Math.atan2((double) local92, (double) local103);
		@Pc(116) int local116 = (int) (Math.sin(local109) * (double) local30);
		@Pc(123) int local123 = (int) (Math.cos(local109) * (double) local30);
		Static543.aClass9Array180[arg0].method8917((float) local116 + (float) arg4.anInt9103 / 2.0F + (float) arg2, (float) arg4.anInt9077 / 2.0F + (float) arg1 - (float) local123, 4096, (int) (-local109 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1781(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static573.method4494(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static96.anInt1739; local25++) {
			@Pc(31) String local31 = Static480.aStringArray50[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static573.method4494(local31);
			if (local31 != null && local31.equals(local20)) {
				Static96.anInt1739--;
				for (@Pc(55) int local55 = local25; local55 < Static96.anInt1739; local55++) {
					Static480.aStringArray50[local55] = Static480.aStringArray50[local55 + 1];
					Static306.aStringArray38[local55] = Static306.aStringArray38[local55 + 1];
					Static577.anIntArray643[local55] = Static577.anIntArray643[local55 + 1];
					Static52.aStringArray10[local55] = Static52.aStringArray10[local55 + 1];
					Static188.anIntArray181[local55] = Static188.anIntArray181[local55 + 1];
					Static2.aBooleanArray32[local55] = Static2.aBooleanArray32[local55 + 1];
				}
				Static206.anInt3566 = Static94.anInt1719;
				@Pc(120) Class6_Sub26 local120 = Static268.method3981(Static377.aClass15_2, Static539.aClass289_128);
				local120.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(arg0));
				local120.aClass6_Sub23_Sub1_2.method8398(arg0);
				Static670.method9077(local120);
				break;
			}
		}
	}
}
