import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!pp;BILclient!qf;)V")
	public static void method3751(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub21_Sub2 arg3) {
		@Pc(13) int local13;
		@Pc(24) int local24;
		@Pc(28) int local28;
		if ((arg0 & 0x8) != 0) {
			local13 = arg3.method6068();
			if (local13 == 65535) {
				local13 = -1;
			}
			local24 = arg3.method6036();
			local28 = arg3.method6040();
			arg1.method5898(local28, local24, local13, false);
		}
		@Pc(37) byte local37 = -1;
		if ((arg0 & 0x1000) != 0) {
			local13 = arg3.method6068();
			arg1.anInt7131 = arg3.method6069();
			arg1.anInt7063 = arg3.method6035();
			arg1.aBoolean494 = (local13 & 0x8000) != 0;
			arg1.anInt7094 = local13 & 0x7FFF;
			arg1.anInt7113 = Static312.anInt5688 + arg1.anInt7094 + arg1.anInt7131;
		}
		if ((arg0 & 0x10000) != 0) {
			arg1.aByte66 = arg3.method6059();
			arg1.aByte63 = arg3.method6067();
			arg1.aByte65 = arg3.method6059();
			arg1.aByte64 = (byte) arg3.method6048();
			arg1.anInt7125 = Static312.anInt5688 + arg3.method6026();
			arg1.anInt7078 = Static312.anInt5688 + arg3.method6056();
		}
		if ((arg0 & 0x1) != 0) {
			@Pc(145) int[] local145 = new int[4];
			for (local24 = 0; local24 < 4; local24++) {
				local145[local24] = arg3.method6026();
				if (local145[local24] == 65535) {
					local145[local24] = -1;
				}
			}
			local28 = arg3.method6048();
			Static104.method1870(arg1, local145, local28);
		}
		if ((arg0 & 0x10) != 0) {
			local13 = arg3.method6035();
			@Pc(190) byte[] local190 = new byte[local13];
			@Pc(195) Class6_Sub21 local195 = new Class6_Sub21(local190);
			arg3.method6065(local190, local13);
			Static439.aClass6_Sub21Array1[arg2] = local195;
			arg1.method5915(local195);
		}
		if ((arg0 & 0x80) != 0) {
			arg1.anInt7172 = arg3.method6026();
			if (arg1.anInt7132 == 0) {
				arg1.method5909(arg1.anInt7172);
				arg1.anInt7172 = -1;
			}
		}
		if ((arg0 & 0x800) != 0) {
			local13 = arg3.method6003();
			local24 = arg3.method6020();
			if (local13 == 65535) {
				local13 = -1;
			}
			local28 = arg3.method6035();
			arg1.method5898(local28, local24, local13, true);
		}
		if ((arg0 & 0x8000) != 0) {
			arg1.anInt7091 = arg3.method6055();
			arg1.anInt7086 = arg3.method6055();
			arg1.anInt7076 = arg3.method6059();
			arg1.anInt7057 = arg3.method6055();
			arg1.anInt7105 = arg3.method6056() + Static312.anInt5688;
			arg1.anInt7084 = arg3.method6056() + Static312.anInt5688;
			arg1.anInt7056 = arg3.method6048();
			if (arg1.aBoolean500) {
				arg1.anInt7057 += arg1.anInt7152;
				arg1.anInt7076 += arg1.anInt7160;
				arg1.anInt7086 += arg1.anInt7152;
				arg1.anInt7132 = 0;
				arg1.anInt7091 += arg1.anInt7160;
			} else {
				arg1.anInt7057 += arg1.anIntArray522[0];
				arg1.anInt7091 += arg1.anIntArray521[0];
				arg1.anInt7132 = 1;
				arg1.anInt7086 += arg1.anIntArray522[0];
				arg1.anInt7076 += arg1.anIntArray521[0];
			}
			arg1.anInt7133 = 0;
		}
		if ((arg0 & 0x4) != 0) {
			local13 = arg3.method6068();
			if (local13 == 65535) {
				local13 = -1;
			}
			arg1.anInt7123 = local13;
		}
		if ((arg0 & 0x2000) != 0) {
			arg1.aString62 = arg3.method6044();
			if (arg1.aString62.charAt(0) == '~') {
				arg1.aString62 = arg1.aString62.substring(1);
				Static417.method5982(arg1.method5922(), arg1.method5916(), arg1.aString64, arg1.aString62, 0, 2);
			} else if (Static328.aClass4_Sub1_Sub1_Sub2_2 == arg1) {
				Static417.method5982(arg1.method5922(), arg1.method5916(), arg1.aString64, arg1.aString62, 0, 2);
			}
			arg1.anInt7096 = 0;
			arg1.anInt7119 = 150;
			arg1.anInt7089 = 0;
		}
		if ((arg0 & 0x20) != 0) {
			Static308.aByteArray66[arg2] = arg3.method6055();
		}
		if ((arg0 & 0x200) != 0) {
			local13 = arg3.method6048();
			@Pc(506) int[] local506 = new int[local13];
			@Pc(509) int[] local509 = new int[local13];
			@Pc(512) int[] local512 = new int[local13];
			for (@Pc(514) int local514 = 0; local514 < local13; local514++) {
				@Pc(520) int local520 = arg3.method6068();
				if (local520 == 65535) {
					local520 = -1;
				}
				local506[local514] = local520;
				local509[local514] = arg3.method6035();
				local512[local514] = arg3.method6003();
			}
			Static148.method2861(local509, local506, local512, arg1);
		}
		if ((arg0 & 0x20000) != 0) {
			local13 = Static312.anInt5688;
			local24 = arg3.method6005();
			local28 = arg3.method6040();
			arg1.method5907(local13, local28, local24);
		}
		if ((arg0 & 0x100) != 0) {
			arg1.aBoolean498 = arg3.method6048() == 1;
		}
		if ((arg0 & 0x400) != 0) {
			local37 = arg3.method6038();
		}
		if ((arg0 & 0x40) != 0) {
			local13 = arg3.method6005();
			local24 = arg3.method6048();
			arg1.method5907(Static312.anInt5688, local24, local13);
			arg1.anInt7073 = Static312.anInt5688 + 300;
			arg1.anInt7068 = arg3.method6048();
		}
		if (!arg1.aBoolean500) {
			return;
		}
		if (local37 == 127) {
			arg1.method5913(arg1.anInt7160, arg1.anInt7152);
			return;
		}
		@Pc(654) byte local654;
		if (local37 == -1) {
			local654 = Static308.aByteArray66[arg2];
		} else {
			local654 = local37;
		}
		arg1.method5914(arg1.anInt7152, local654, arg1.anInt7160);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	public static void method3753() {
		Static122.aClass292Array1 = null;
		Static135.method2644(0, Static240.anInt4852, 0, -1, Static196.anInt4059, 0, Static468.anInt8036, 0);
		if (Static122.aClass292Array1 != null) {
			Static15.method325(-1412584499, Static196.anInt4059, Static473.aClass292_10.anInt7889, 0, Static122.aClass292Array1, Static240.anInt4852, 0, Static225.anInt4650, Static252.anInt2858);
			Static122.aClass292Array1 = null;
		}
	}
}
