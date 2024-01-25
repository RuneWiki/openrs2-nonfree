import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
	public static int anInt5655;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[BIIII[BII)V")
	public static void method4719(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(26) int local26 = -arg7; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg3++;
				arg1[local34] += arg6[arg5++];
				@Pc(46) int local46 = arg3++;
				arg1[local46] += arg6[arg5++];
				@Pc(58) int local58 = arg3++;
				arg1[local58] += arg6[arg5++];
				@Pc(70) int local70 = arg3++;
				arg1[local70] += arg6[arg5++];
			}
			for (@Pc(88) int local88 = local15; local88 < 0; local88++) {
				local34 = arg3++;
				arg1[local34] += arg6[arg5++];
			}
			arg5 += arg0;
			arg3 += arg2;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method4720(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg1];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			@Pc(19) int local19 = arg0[local10 + arg2] & 0xFF;
			if (local19 != 0) {
				if (local19 >= 128 && local19 < 160) {
					@Pc(40) char local40 = Static450.aCharArray8[local19 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local19 = local40;
				}
				local6[local8++] = (char) local19;
			}
		}
		return new String(local6, 0, local8);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!ha;BI)Lclient!fp;")
	public static Class114 method4722(@OriginalArg(0) Class87 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class164 local17 = Static85.method1547(arg0, arg1, true);
		return local17 == null ? null : local17.aClass114_20;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
	public static void method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static395.method2904(local7.aClass11_Sub1_Sub3_1);
		Static395.method2904(local7.aClass11_Sub1_Sub3_2);
		if (local7.aClass11_Sub1_Sub3_1 != null) {
			local7.aClass11_Sub1_Sub3_1 = null;
		}
		if (local7.aClass11_Sub1_Sub3_2 != null) {
			local7.aClass11_Sub1_Sub3_2 = null;
		}
	}
}
