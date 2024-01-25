import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public static int anInt6727;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gda;B)I")
	public static int method5824(@OriginalArg(0) Class126 arg0) {
		@Pc(16) int local16 = 0;
		if (arg0.method3077(Static176.anInt3345)) {
			local16++;
		}
		if (arg0.method3077(Static644.anInt10532)) {
			local16++;
		}
		if (arg0.method3077(Static522.anInt8282)) {
			local16++;
		}
		if (arg0.method3077(Static53.anInt930)) {
			local16++;
		}
		if (arg0.method3077(Static246.anInt4309)) {
			local16++;
		}
		if (arg0.method3077(Static445.anInt6595)) {
			local16++;
		}
		if (arg0.method3077(Static677.anInt8510)) {
			local16++;
		}
		if (arg0.method3077(Static518.anInt8220)) {
			local16++;
		}
		if (arg0.method3077(Static628.anInt10021)) {
			local16++;
		}
		if (arg0.method3077(Static125.anInt2088)) {
			local16++;
		}
		if (arg0.method3077(Static148.anInt2916)) {
			local16++;
		}
		if (arg0.method3077(Static52.anInt913)) {
			local16++;
		}
		if (arg0.method3077(Static605.anInt9763)) {
			local16++;
		}
		if (arg0.method3077(Static104.anInt1716)) {
			local16++;
		}
		if (arg0.method3077(Static493.anInt7983)) {
			local16++;
		}
		if (arg0.method3077(Static214.anInt10029)) {
			local16++;
		}
		return local16;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!oi;Z)I")
	public static int method5825(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt6855 == 0) {
			return 0;
		}
		@Pc(76) int local76;
		@Pc(69) int local69;
		if (arg0.anInt6863 != -1) {
			@Pc(25) Class4_Sub1_Sub1_Sub2 local25 = null;
			if (arg0.anInt6863 < 32768) {
				@Pc(55) Class5_Sub9 local55 = (Class5_Sub9) Static677.aClass306_37.method6943((long) arg0.anInt6863);
				if (local55 != null) {
					local25 = local55.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				}
			} else if (arg0.anInt6863 >= 32768) {
				local25 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[arg0.anInt6863 - 32768];
			}
			if (local25 != null) {
				local69 = arg0.anInt9805 - local25.anInt9805;
				local76 = arg0.anInt9803 - local25.anInt9803;
				if (local69 != 0 || local76 != 0) {
					arg0.method5928((int) (Math.atan2((double) local69, (double) local76) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class4_Sub1_Sub1_Sub2_Sub1) {
			@Pc(181) Class4_Sub1_Sub1_Sub2_Sub1 local181 = (Class4_Sub1_Sub1_Sub2_Sub1) arg0;
			if (local181.anInt4558 != -1 && (local181.anInt6895 == 0 || local181.anInt6896 > 0)) {
				local181.method5928(local181.anInt4558);
				local181.anInt4558 = -1;
			}
		} else if (arg0 instanceof Class4_Sub1_Sub1_Sub2_Sub2) {
			@Pc(108) Class4_Sub1_Sub1_Sub2_Sub2 local108 = (Class4_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local108.anInt6918 != -1 && (local108.anInt6895 == 0 || local108.anInt6896 > 0)) {
				local69 = local108.anInt9805 - (local108.anInt6918 - Static315.anInt5380 - Static315.anInt5380) * 256;
				local76 = local108.anInt9803 - (local108.anInt6907 - Static290.anInt5128 - Static290.anInt5128) * 256;
				if (local69 != 0 || local76 != 0) {
					local108.method5928((int) (Math.atan2((double) local69, (double) local76) * 2607.5945876176133D) & 0x3FFF);
				}
				local108.anInt6918 = -1;
			}
		}
		return arg0.method5929();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIILclient!tk;I)V")
	public static void method5826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class354 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(21) Class5_Sub20 local21 = (Class5_Sub20) Static435.aClass20_38.method378(); local21 != null; local21 = (Class5_Sub20) Static435.aClass20_38.method366()) {
			if (arg3 == local21.anInt2975 && arg1 << 9 == local21.anInt2972 && arg0 << 9 == local21.anInt2983 && arg2.anInt9392 == local21.aClass354_1.anInt9392) {
				if (local21.aClass5_Sub4_Sub4_1 != null) {
					Static265.aClass5_Sub4_Sub1_2.method332(local21.aClass5_Sub4_Sub4_1);
					local21.aClass5_Sub4_Sub4_1 = null;
				}
				if (local21.aClass5_Sub4_Sub4_2 != null) {
					Static265.aClass5_Sub4_Sub1_2.method332(local21.aClass5_Sub4_Sub4_2);
					local21.aClass5_Sub4_Sub4_2 = null;
				}
				local21.method9222();
				return;
			}
		}
	}
}
