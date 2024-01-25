import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "L", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILclient!ql;BLclient!uea;)V")
	public static void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub12_Sub2 arg2, @OriginalArg(4) Class15_Sub2_Sub4_Sub2 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		if ((arg1 & 0x40) != 0) {
			local18 = arg2.method6014();
			@Pc(21) byte[] local21 = new byte[local18];
			@Pc(26) Class6_Sub12 local26 = new Class6_Sub12(local21);
			arg2.method6031(local21, local18);
			Static76.aClass6_Sub12Array1[arg0] = local26;
			arg3.method7154(local26);
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		if ((arg1 & 0x2) != 0) {
			local18 = arg2.method6044();
			if (local18 == 65535) {
				local18 = -1;
			}
			local57 = arg2.method6008();
			local61 = arg2.method6011();
			arg3.method7139(false, local57, local61, local18);
		}
		if ((arg1 & 0x4) != 0) {
			local18 = arg2.method6034();
			local57 = arg2.method6014();
			arg3.method7127(Static363.anInt6671, local57, local18);
			arg3.anInt8987 = Static363.anInt6671 + 300;
			arg3.anInt8938 = arg2.method6014();
		}
		if ((arg1 & 0x400) != 0) {
			local7 = arg2.method6013();
		}
		if ((arg1 & 0x8) != 0) {
			local18 = arg2.method6044();
			if (local18 == 65535) {
				local18 = -1;
			}
			local57 = arg2.method6011();
			Static440.method6242(local57, local18, arg3);
		}
		if ((arg1 & 0x4000) != 0) {
			arg3.aString81 = arg2.method6040();
			if (arg3.aString81.charAt(0) == '~') {
				arg3.aString81 = arg3.aString81.substring(1);
				Static170.method2697(arg3.method7145(), arg3.method7148(), arg3.aString83, 2, arg3.aString81, 0);
			} else if (Static461.aClass15_Sub2_Sub4_Sub2_2 == arg3) {
				Static170.method2697(arg3.method7145(), arg3.method7148(), arg3.aString83, 2, arg3.aString81, 0);
			}
			arg3.anInt8994 = 150;
			arg3.anInt8953 = 0;
			arg3.anInt8960 = 0;
		}
		if ((arg1 & 0x100) != 0) {
			local18 = arg2.method6048();
			if (local18 == 65535) {
				local18 = -1;
			}
			local57 = arg2.method6004();
			local61 = arg2.method6019();
			arg3.method7139(true, local57, local61, local18);
		}
		if ((arg1 & 0x1000) != 0) {
			local18 = arg2.method6048();
			arg3.anInt8920 = arg2.method6027();
			arg3.anInt8937 = arg2.method6014();
			arg3.anInt8950 = local18 & 0x7FFF;
			arg3.aBoolean578 = (local18 & 0x8000) != 0;
			arg3.anInt8962 = arg3.anInt8920 + Static363.anInt6671 + arg3.anInt8950;
		}
		if ((arg1 & 0x800) != 0) {
			arg3.lb = arg2.method6049();
			arg3.anInt8942 = arg2.method6049();
			arg3.anInt8939 = arg2.method6007();
			arg3.anInt8977 = arg2.method6013();
			arg3.anInt8991 = arg2.method6057() + Static363.anInt6671;
			arg3.anInt8961 = arg2.method6057() + Static363.anInt6671;
			arg3.anInt8986 = arg2.method6011();
			arg3.anInt8997 = 0;
			if (arg3.aBoolean584) {
				arg3.anInt8939 += arg3.anInt9019;
				arg3.anInt8942 += arg3.anInt9017;
				arg3.lb += arg3.anInt9019;
				arg3.anInt8977 += arg3.anInt9017;
				arg3.anInt8998 = 0;
			} else {
				arg3.lb += arg3.anIntArray638[0];
				arg3.anInt8939 += arg3.anIntArray638[0];
				arg3.anInt8998 = 1;
				arg3.anInt8977 += arg3.anIntArray637[0];
				arg3.anInt8942 += arg3.anIntArray637[0];
			}
		}
		if ((arg1 & 0x200) != 0) {
			local18 = arg2.method6027();
			@Pc(429) int[] local429 = new int[local18];
			@Pc(432) int[] local432 = new int[local18];
			@Pc(435) int[] local435 = new int[local18];
			for (@Pc(437) int local437 = 0; local437 < local18; local437++) {
				@Pc(443) int local443 = arg2.method6057();
				if (local443 == 65535) {
					local443 = -1;
				}
				local429[local437] = local443;
				local432[local437] = arg2.method6011();
				local435[local437] = arg2.method6044();
			}
			Static440.method6245(local432, local429, local435, arg3);
		}
		if ((arg1 & 0x80) != 0) {
			local18 = arg2.method6048();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg3.anInt8927 = local18;
		}
		if ((arg1 & 0x10) != 0) {
			arg3.anInt9036 = arg2.method6057();
			if (arg3.anInt8998 == 0) {
				arg3.method7125(arg3.anInt9036);
				arg3.anInt9036 = -1;
			}
		}
		if ((arg1 & 0x20000) != 0) {
			local18 = Static363.anInt6671;
			local57 = arg2.method6034();
			local61 = arg2.method6014();
			arg3.method7127(local18, local61, local57);
		}
		if ((arg1 & 0x2000) != 0) {
			arg3.aBoolean586 = arg2.method6019() == 1;
		}
		if ((arg1 & 0x10000) != 0) {
			arg3.aByte99 = arg2.method6051();
			arg3.aByte102 = arg2.method6049();
			arg3.aByte101 = arg2.method6049();
			arg3.aByte100 = (byte) arg2.method6011();
			arg3.anInt8963 = Static363.anInt6671 + arg2.method6055();
			arg3.anInt8988 = Static363.anInt6671 + arg2.method6055();
		}
		if ((arg1 & 0x1) != 0) {
			Static507.aByteArray104[arg0] = arg2.method6049();
		}
		if (!arg3.aBoolean584) {
			return;
		}
		if (local7 == 127) {
			arg3.method7146(arg3.anInt9019, arg3.anInt9017);
			return;
		}
		@Pc(635) byte local635;
		if (local7 == -1) {
			local635 = Static507.aByteArray104[arg0];
		} else {
			local635 = local7;
		}
		arg3.method7151(arg3.anInt9019, local635, arg3.anInt9017);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([BI)[B")
	public static byte[] method542(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static596.method7719(arg0, 0, local9, 0, local6);
		return local9;
	}
}
