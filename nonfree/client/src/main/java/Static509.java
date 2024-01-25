import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_440 = new Class305(54, 14);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BILclient!vi;Lclient!av;Lclient!cn;III)V")
	public static void method7776(@OriginalArg(1) int arg0, @OriginalArg(2) Class20_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) Class20_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) Class51 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub37 local7 = new Class1_Sub37();
		local7.anInt5957 = arg6;
		local7.anInt5960 = arg4 << 7;
		local7.anInt5962 = arg0 << 7;
		if (arg3 != null) {
			local7.aClass51_1 = arg3;
			@Pc(33) int local33 = arg3.anInt1636;
			@Pc(36) int local36 = arg3.anInt1615;
			if (arg5 == 1 || arg5 == 3) {
				local33 = arg3.anInt1615;
				local36 = arg3.anInt1636;
			}
			local7.anInt5968 = arg3.anInt1645 << 7;
			local7.anInt5958 = local33 + arg0 << 7;
			local7.anInt5956 = arg3.anInt1644;
			local7.anInt5966 = arg3.anInt1642;
			local7.anInt5959 = local36 + arg4 << 7;
			local7.anInt5954 = arg3.anInt1631;
			local7.anInt5961 = arg3.anInt1654;
			local7.anIntArray463 = arg3.anIntArray104;
			if (arg3.anIntArray108 != null) {
				local7.aBoolean453 = true;
				local7.method5395();
			}
			if (local7.anIntArray463 != null) {
				local7.anInt5965 = (int) ((double) (local7.anInt5966 - local7.anInt5954) * Math.random()) + local7.anInt5954;
			}
			Static307.aClass295_34.method7533(local7);
		} else if (arg1 != null) {
			local7.aClass20_Sub1_Sub1_Sub2_1 = arg1;
			@Pc(177) Class283 local177 = arg1.aClass283_1;
			if (local177.anIntArray743 != null) {
				local7.aBoolean453 = true;
				local177 = local177.method7368(Static417.aClass10_1);
			}
			if (local177 != null) {
				local7.anInt5958 = arg0 + local177.anInt8439 << 7;
				local7.anInt5959 = local177.anInt8439 + arg4 << 7;
				local7.anInt5956 = Static440.method6821(arg1);
				local7.anInt5968 = local177.anInt8446 << 7;
				local7.anInt5961 = local177.anInt8434;
			}
			Static406.aClass295_44.method7533(local7);
		} else if (arg2 != null) {
			local7.aClass20_Sub1_Sub1_Sub1_2 = arg2;
			local7.anInt5958 = arg2.method7808() + arg0 << 7;
			local7.anInt5959 = arg4 + arg2.method7808() << 7;
			local7.anInt5956 = Static209.method3848(arg2);
			local7.anInt5968 = arg2.anInt661 << 7;
			local7.anInt5961 = arg2.anInt681;
			Static61.aClass230_11.method6139((long) arg2.anInt8969, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!k;III[Z)V")
	public static void method7778(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static296.aClass7Array11 == Static207.aClass7Array7) {
			return;
		}
		@Pc(9) int local9 = Static411.aClass7Array12[arg1].aa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class7 local22 = Static411.aClass7Array12[local11];
				if (local22 != null) {
					local22.F(arg0, arg2, local9 - local22.aa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
	public static int method7779(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
