import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "Lclient!sn;")
	public static Class270 aClass270_1;

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_40 = new Class71();

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!eca;Lclient!kr;IZI)V")
	public static void method4153(@OriginalArg(0) Class6_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) Class3_Sub27_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13;
		@Pc(28) int local28;
		if ((arg3 & 0x80) != 0) {
			local13 = arg1.method7568();
			if (local13 == 65535) {
				local13 = -1;
			}
			local28 = arg1.method7561();
			Static193.method6463(local28, local13, arg0);
		}
		@Pc(35) byte local35 = -1;
		if ((arg3 & 0x40) != 0) {
			arg0.anInt2290 = arg1.method7566();
			if (arg0.anInt8599 == 0) {
				arg0.method7085(arg0.anInt2290);
				arg0.anInt2290 = -1;
			}
		}
		@Pc(72) int local72;
		if ((arg3 & 0x20000) != 0) {
			local13 = Static223.anInt4829;
			local28 = arg1.method7547();
			local72 = arg1.method7548();
			arg0.method7086(local13, local28, local72);
		}
		if ((arg3 & 0x10) != 0) {
			local13 = arg1.method7610();
			local28 = arg1.method7549();
			if (local13 == 65535) {
				local13 = -1;
			}
			local72 = arg1.method7561();
			arg0.method7080(false, local72, local13, local28);
		}
		if ((arg3 & 0x4) != 0) {
			Static459.aByteArray96[arg2] = arg1.method7598();
		}
		if ((arg3 & 0x8000) != 0) {
			arg0.anInt8561 = arg1.method7598();
			arg0.anInt8532 = arg1.method7598();
			arg0.anInt8559 = arg1.method7598();
			arg0.anInt8557 = arg1.method7584();
			arg0.anInt8555 = arg1.method7610() + Static223.anInt4829;
			arg0.anInt8589 = arg1.method7610() + Static223.anInt4829;
			arg0.anInt8541 = arg1.method7597();
			if (arg0.aBoolean164) {
				arg0.anInt8557 += arg0.anInt2308;
				arg0.anInt8561 += arg0.anInt2283;
				arg0.anInt8532 += arg0.anInt2308;
				arg0.anInt8599 = 0;
				arg0.anInt8559 += arg0.anInt2283;
			} else {
				arg0.anInt8532 += arg0.anIntArray734[0];
				arg0.anInt8557 += arg0.anIntArray734[0];
				arg0.anInt8599 = 1;
				arg0.anInt8561 += arg0.anIntArray733[0];
				arg0.anInt8559 += arg0.anIntArray733[0];
			}
			arg0.anInt8600 = 0;
		}
		if ((arg3 & 0x200) != 0) {
			local13 = arg1.method7568();
			if (local13 == 65535) {
				local13 = -1;
			}
			local28 = arg1.method7605();
			local72 = arg1.method7580();
			arg0.method7080(true, local72, local13, local28);
		}
		if ((arg3 & 0x4000) != 0) {
			arg0.aString80 = arg1.method7589();
			if (arg0.aString80.charAt(0) == '~') {
				arg0.aString80 = arg0.aString80.substring(1);
				Static536.method7668(arg0.aString28, 0, arg0.aString80, arg0.method2052(), 2, arg0.method2051());
			} else if (arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3) {
				Static536.method7668(arg0.aString28, 0, arg0.aString80, arg0.method2052(), 2, arg0.method2051());
			}
			arg0.anInt8528 = 0;
			arg0.anInt8567 = 150;
			arg0.anInt8546 = 0;
		}
		if ((arg3 & 0x2) != 0) {
			local13 = arg1.method7548();
			@Pc(364) byte[] local364 = new byte[local13];
			@Pc(369) Class3_Sub27 local369 = new Class3_Sub27(local364);
			arg1.method7590(local13, local364);
			Static485.aClass3_Sub27Array1[arg2] = local369;
			arg0.method2047(local369);
		}
		if ((arg3 & 0x10000) != 0) {
			arg0.aByte90 = arg1.method7557();
			arg0.aByte91 = arg1.method7557();
			arg0.aByte89 = arg1.method7586();
			arg0.aByte92 = (byte) arg1.method7561();
			arg0.anInt8547 = Static223.anInt4829 + arg1.method7610();
			arg0.anInt8523 = Static223.anInt4829 + arg1.method7591();
		}
		if ((arg3 & 0x100) != 0) {
			local35 = arg1.method7584();
		}
		if ((arg3 & 0x1) != 0) {
			local13 = arg1.method7591();
			if (local13 == 65535) {
				local13 = -1;
			}
			arg0.anInt8563 = local13;
		}
		if ((arg3 & 0x1000) != 0) {
			arg0.aBoolean165 = arg1.method7548() == 1;
		}
		if ((arg3 & 0x2000) != 0) {
			local13 = arg1.method7580();
			@Pc(478) int[] local478 = new int[local13];
			@Pc(481) int[] local481 = new int[local13];
			@Pc(484) int[] local484 = new int[local13];
			for (@Pc(486) int local486 = 0; local486 < local13; local486++) {
				@Pc(492) int local492 = arg1.method7610();
				if (local492 == 65535) {
					local492 = -1;
				}
				local478[local486] = local492;
				local481[local486] = arg1.method7561();
				local484[local486] = arg1.method7566();
			}
			Static51.method1082(arg0, local484, local478, local481);
		}
		if ((arg3 & 0x400) != 0) {
			local13 = arg1.method7591();
			arg0.anInt8577 = arg1.method7580();
			arg0.anInt8573 = arg1.method7597();
			arg0.anInt8591 = local13 & 0x7FFF;
			arg0.aBoolean629 = (local13 & 0x8000) != 0;
			arg0.anInt8538 = Static223.anInt4829 + arg0.anInt8591 + arg0.anInt8577;
		}
		if ((arg3 & 0x8) != 0) {
			local13 = arg1.method7547();
			local28 = arg1.method7548();
			arg0.method7086(Static223.anInt4829, local13, local28);
			arg0.anInt8553 = Static223.anInt4829 + 300;
			arg0.anInt8585 = arg1.method7580();
		}
		if (!arg0.aBoolean164) {
			return;
		}
		if (local35 == 127) {
			arg0.method2044(arg0.anInt2283, arg0.anInt2308);
			return;
		}
		@Pc(616) byte local616;
		if (local35 == -1) {
			local616 = Static459.aByteArray96[arg2];
		} else {
			local616 = local35;
		}
		arg0.method2053(arg0.anInt2283, arg0.anInt2308, local616);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()V")
	public static void method4154() {
		for (@Pc(1) int local1 = 0; local1 < Static167.anInt3855; local1++) {
			@Pc(6) Class6_Sub1 local6 = Static167.aClass6_Sub1Array1[local1];
			Static326.method5208(local6);
			Static167.aClass6_Sub1Array1[local1] = null;
		}
		Static167.anInt3855 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!kea;I)V")
	public static void method4155(@OriginalArg(0) Class161 arg0) {
		Static366.aClass161_83 = arg0;
	}
}
