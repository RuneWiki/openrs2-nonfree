import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!gca;")
	public static Class111 aClass111_4;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_22 = new Class208(0, 12);

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "[I")
	public static final int[] anIntArray45 = new int[256];

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!mw;Lclient!hb;IBI)V")
	public static void method795(@OriginalArg(0) Class1_Sub3_Sub1 arg0, @OriginalArg(1) Class11_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(22) int local22;
		if ((arg2 & 0x40) != 0) {
			local18 = arg0.method7971();
			local22 = arg0.method7938();
			arg1.method6070(local18, local22, Static518.anInt9331);
			arg1.anInt7537 = Static518.anInt9331 + 300;
			arg1.anInt7531 = arg0.method7931();
		}
		if ((arg2 & 0x2000) != 0) {
			arg1.aString86 = arg0.method7951();
			if (arg1.aString86.charAt(0) == '~') {
				arg1.aString86 = arg1.aString86.substring(1);
				Static308.method4624(arg1.method2950(), 0, 2, arg1.method2947(), arg1.aString86, arg1.aString34);
			} else if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == arg1) {
				Static308.method4624(arg1.method2950(), 0, 2, arg1.method2947(), arg1.aString86, arg1.aString34);
			}
			arg1.anInt7571 = 150;
			arg1.anInt7573 = 0;
			arg1.anInt7546 = 0;
		}
		if ((arg2 & 0x800) != 0) {
			local18 = arg0.method7946();
			arg1.anInt7581 = arg0.method7974();
			arg1.anInt7534 = arg0.method7931();
			arg1.aBoolean576 = (local18 & 0x8000) != 0;
			arg1.anInt7550 = local18 & 0x7FFF;
			arg1.lb = arg1.anInt7550 + Static518.anInt9331 + arg1.anInt7581;
		}
		@Pc(186) int local186;
		if ((arg2 & 0x4) != 0) {
			@Pc(157) int[] local157 = new int[4];
			for (local22 = 0; local22 < 4; local22++) {
				local157[local22] = arg0.method7946();
				if (local157[local22] == 65535) {
					local157[local22] = -1;
				}
			}
			local186 = arg0.method7943();
			Static221.method3323(local157, local186, arg1);
		}
		if ((arg2 & 0x8000) != 0) {
			local7 = arg0.method7976();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.aBoolean259 = arg0.method7931() == 1;
		}
		if ((arg2 & 0x10) != 0) {
			local18 = arg0.method7945();
			local22 = arg0.method7940();
			if (local18 == 65535) {
				local18 = -1;
			}
			local186 = arg0.method7974();
			arg1.method6059(local18, local186, local22, false);
		}
		if ((arg2 & 0x10000) != 0) {
			arg1.aByte106 = arg0.method7963();
			arg1.aByte105 = arg0.method7927();
			arg1.aByte104 = arg0.method7927();
			arg1.aByte103 = (byte) arg0.method7943();
			arg1.anInt7589 = Static518.anInt9331 + arg0.method7916();
			arg1.anInt7599 = Static518.anInt9331 + arg0.method7916();
		}
		if ((arg2 & 0x1) != 0) {
			arg1.anInt3594 = arg0.method7945();
			if (arg1.anInt7604 == 0) {
				arg1.method6065(arg1.anInt3594);
				arg1.anInt3594 = -1;
			}
		}
		if ((arg2 & 0x2) != 0) {
			local18 = arg0.method7945();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg1.anInt7528 = local18;
		}
		if ((arg2 & 0x4000) != 0) {
			arg1.anInt7557 = arg0.method7976();
			arg1.anInt7569 = arg0.method7970();
			arg1.anInt7556 = arg0.method7976();
			arg1.anInt7598 = arg0.method7927();
			arg1.anInt7584 = arg0.method7946() + Static518.anInt9331;
			arg1.anInt7568 = arg0.method7946() + Static518.anInt9331;
			arg1.anInt7555 = arg0.method7943();
			if (arg1.aBoolean261) {
				arg1.anInt7604 = 0;
				arg1.anInt7556 += arg1.anInt3604;
				arg1.anInt7598 += arg1.anInt3605;
				arg1.anInt7557 += arg1.anInt3604;
				arg1.anInt7569 += arg1.anInt3605;
			} else {
				arg1.anInt7556 += arg1.anIntArray455[0];
				arg1.anInt7598 += arg1.anIntArray454[0];
				arg1.anInt7557 += arg1.anIntArray455[0];
				arg1.anInt7604 = 1;
				arg1.anInt7569 += arg1.anIntArray454[0];
			}
			arg1.anInt7607 = 0;
		}
		if ((arg2 & 0x20000) != 0) {
			local18 = Static518.anInt9331;
			local22 = arg0.method7971();
			local186 = arg0.method7974();
			arg1.method6070(local22, local186, local18);
		}
		@Pc(506) int local506;
		@Pc(514) int local514;
		@Pc(498) int[] local498;
		@Pc(501) int[] local501;
		if ((arg2 & 0x200) != 0) {
			local18 = arg0.method7974();
			local498 = new int[local18];
			local501 = new int[local18];
			@Pc(504) int[] local504 = new int[local18];
			for (local506 = 0; local506 < local18; local506++) {
				local514 = arg0.method7916();
				if (local514 == 65535) {
					local514 = -1;
				}
				local498[local506] = local514;
				local501[local506] = arg0.method7938();
				local504[local506] = arg0.method7945();
			}
			Static489.method6726(local501, local498, local504, arg1);
		}
		if ((arg2 & 0x100) != 0) {
			local18 = arg0.method7945();
			local22 = arg0.method7958();
			if (local18 == 65535) {
				local18 = -1;
			}
			local186 = arg0.method7943();
			arg1.method6059(local18, local186, local22, true);
		}
		if ((arg2 & 0x8) != 0) {
			Static226.aByteArray34[arg3] = arg0.method7927();
		}
		if ((arg2 & 0x80) != 0) {
			local18 = arg0.method7943();
			@Pc(606) byte[] local606 = new byte[local18];
			@Pc(611) Class1_Sub3 local611 = new Class1_Sub3(local606);
			arg0.method7957(local606, local18);
			Static351.aClass1_Sub3Array1[arg3] = local611;
			arg1.method2957(local611);
		}
		if ((arg2 & 0x40000) != 0) {
			local18 = arg0.method7974();
			local498 = new int[local18];
			local501 = new int[local18];
			for (@Pc(641) int local641 = 0; local641 < local18; local641++) {
				local506 = arg0.method7916();
				if ((local506 & 0xC000) == 49152) {
					local514 = arg0.method7967();
					local498[local641] = local514 | local506 << 16;
				} else {
					local498[local641] = local506;
				}
				local501[local641] = arg0.method7916();
			}
			arg1.method6077(local498, local501);
		}
		if (!arg1.aBoolean261) {
			return;
		}
		if (local7 == 127) {
			arg1.method2956(arg1.anInt3604, arg1.anInt3605);
			return;
		}
		@Pc(702) byte local702;
		if (local7 == -1) {
			local702 = Static226.aByteArray34[arg3];
		} else {
			local702 = local7;
		}
		arg1.method2948(local702, arg1.anInt3605, arg1.anInt3604);
	}
}
