import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public static int anInt5015 = 0;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public static void method4558() {
		Static207.aClass140_104.method3824(5);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZII)I")
	public static int method4559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!aa;Lclient!tm;IIIIZLclient!rg;)V")
	public static void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class177 arg7) {
		@Pc(18) Class202 local18 = Static221.method4034(arg4);
		if (local18 == null || !local18.aBoolean516 || !local18.method5175()) {
			return;
		}
		@Pc(37) int local37;
		if (local18.anIntArray744 != null) {
			@Pc(35) int[] local35 = new int[local18.anIntArray744.length];
			@Pc(49) int local49;
			for (local37 = 0; local37 < local35.length / 2; local37++) {
				if (Static81.anInt1609 == 4) {
					local49 = (int) Static304.aFloat110 & 0x3FFF;
				} else {
					local49 = Static277.anInt6206 + (int) Static304.aFloat110 & 0x3FFF;
				}
				@Pc(60) int local60 = Class1_Sub1_Sub16.anIntArray587[local49];
				@Pc(64) int local64 = Class1_Sub1_Sub16.anIntArray586[local49];
				if (Static81.anInt1609 != 4) {
					local64 = local64 * 256 / (Static311.anInt5996 + 256);
					local60 = local60 * 256 / (Static311.anInt5996 + 256);
				}
				local35[local37 * 2] = ((local18.anIntArray744[local37 * 2] * 4 + arg5) * local64 + (arg6 + local18.anIntArray744[local37 * 2 + 1] * 4) * local60 >> 15) + arg7.anInt5179 / 2 + arg0;
				local35[local37 * 2 + 1] = arg7.anInt5209 / 2 + arg3 - ((local18.anIntArray744[local37 * 2 + 1] * 4 + arg6) * local64 - local60 * (arg5 + local18.anIntArray744[local37 * 2] * 4) >> 15);
			}
			Static146.method2778(arg1, local35, local18.anInt5889, arg7.anIntArray669, arg7.anIntArray664);
			for (local49 = 0; local49 < local35.length / 2 - 1; local49++) {
				arg1.method3296(local35[local49 * 2], local35[local49 * 2 + 1], local35[(local49 + 1) * 2], local35[local49 * 2 + 1 + 2], local18.anInt5885, arg2, arg0, arg3);
			}
			arg1.method3296(local35[local35.length - 2], local35[local35.length - 1], local35[0], local35[1], local18.anInt5885, arg2, arg0, arg3);
		}
		@Pc(269) Class90 local269 = null;
		if (local18.anInt5886 != -1) {
			local269 = local18.method5169(false, arg1);
			if (local269 != null) {
				Static120.method2166(arg7, arg5, arg6, local269, arg0, arg3, arg2);
			}
		}
		if (local18.aString234 == null) {
			return;
		}
		local37 = 0;
		if (local269 != null) {
			local37 = local269.method5466();
		}
		@Pc(302) Class13 local302 = Static105.aClass13_4;
		@Pc(304) Class38 local304 = Static95.aClass38_3;
		if (local18.anInt5900 == 1) {
			local304 = Static273.aClass38_8;
			local302 = Static9.aClass13_1;
		}
		if (local18.anInt5900 == 2) {
			local304 = Static180.aClass38_5;
			local302 = Static302.aClass13_7;
		}
		Static165.method3184(local18.aString234, arg7, arg5, local37, local304, local302, local18.anInt5906, arg3, arg0, arg6, arg2);
		return;
	}
}
