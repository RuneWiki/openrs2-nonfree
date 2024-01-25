import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!oi;)V")
	public static void method3568(@OriginalArg(1) Class9_Sub4_Sub2_Sub1 arg0) {
		if (arg0.anIntArray191 == null && arg0.anIntArray188 == null) {
			return;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray191.length; local20++) {
			@Pc(24) int local24 = -1;
			if (arg0.anIntArray191 != null) {
				local24 = arg0.anIntArray191[local20];
			}
			if (local24 != -1) {
				local18 = false;
				@Pc(79) int local79;
				@Pc(95) int local95;
				@Pc(62) int local62;
				if ((local24 & 0xC0000000) == -1073741824) {
					local62 = local24 & 0xFFFFFFF;
					@Pc(66) int local66 = local62 >> 14;
					local79 = arg0.anInt10360 - (local66 + -Static477.anInt8412) * 512 - 256;
					@Pc(83) int local83 = local62 & 0x3FFF;
					local95 = arg0.anInt10357 - (local83 - Static227.anInt5049) * 512 - 256;
				} else if ((local24 & 0x8000) == 0) {
					@Pc(144) Class6_Sub42 local144 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local24);
					if (local144 == null) {
						arg0.method3629(local20, -1);
						continue;
					}
					@Pc(149) Class9_Sub4_Sub2_Sub1_Sub1 local149 = local144.aClass9_Sub4_Sub2_Sub1_Sub1_1;
					local95 = arg0.anInt10357 - local149.anInt10357;
					local79 = arg0.anInt10360 - local149.anInt10360;
				} else {
					local62 = local24 & 0x7FFF;
					@Pc(112) Class9_Sub4_Sub2_Sub1_Sub2 local112 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local62];
					if (local112 == null) {
						arg0.method3629(local20, -1);
						continue;
					}
					local95 = arg0.anInt10357 - local112.anInt10357;
					local79 = arg0.anInt10360 - local112.anInt10360;
				}
				if (local79 != 0 || local95 != 0) {
					arg0.method3629(local20, (int) (Math.atan2((double) local79, (double) local95) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method3629(local20, -1)) {
				local18 = false;
			}
		}
		if (local18) {
			arg0.anIntArray188 = null;
			arg0.anIntArray191 = null;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!bi;I)V")
	public static void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8_Sub1 arg1) {
		Static570.aBoolean776 = false;
		Static76.anInt2534 = 0;
		Static403.method6330(arg1);
		Static285.method4961(arg1);
		if (Static570.aBoolean776) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt10061) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt10061 + " psize:" + arg0);
		}
	}
}
