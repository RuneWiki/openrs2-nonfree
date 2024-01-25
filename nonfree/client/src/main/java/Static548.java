import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "[[Lclient!rb;")
	public static Class41_Sub2[][] aClass41_Sub2ArrayArray3;

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "Z")
	public static boolean aBoolean670 = false;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!wp;BI)Ljava/lang/String;")
	public static String method7287(@OriginalArg(0) Class361 arg0, @OriginalArg(2) int arg1) {
		if (!Static71.method1520(arg0).method5122(arg1) && arg0.anObjectArray4 == null) {
			return null;
		} else if (arg0.aStringArray40 == null || arg0.aStringArray40.length <= arg1 || arg0.aStringArray40[arg1] == null || arg0.aStringArray40[arg1].trim().length() == 0) {
			return Static425.aBoolean541 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray40[arg1];
		}
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
	public static void method7289() {
		Static444.aClass354_35.method7687();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!wn;Lclient!ce;III)V")
	public static void method7290(@OriginalArg(0) Class41_Sub2_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) Class3_Sub11_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) byte local12 = -1;
		if ((arg3 & 0x2) != 0) {
			Static477.aByteArray89[arg2] = arg1.method5212();
		}
		@Pc(30) int local30;
		if ((arg3 & 0x4) != 0) {
			local30 = arg1.method5198();
			if (local30 == 65535) {
				local30 = -1;
			}
			arg0.anInt9483 = local30;
		}
		if ((arg3 & 0x10000) != 0) {
			arg0.aByte122 = arg1.method5173();
			arg0.aByte121 = arg1.method5187();
			arg0.aByte123 = arg1.method5212();
			arg0.aByte120 = (byte) arg1.method5206();
			arg0.anInt9493 = Static506.anInt8251 + arg1.method5178();
			arg0.anInt9511 = Static506.anInt8251 + arg1.method5178();
		}
		@Pc(92) int local92;
		@Pc(121) int local121;
		if ((arg3 & 0x1) != 0) {
			@Pc(90) int[] local90 = new int[4];
			for (local92 = 0; local92 < 4; local92++) {
				local90[local92] = arg1.method5205();
				if (local90[local92] == 65535) {
					local90[local92] = -1;
				}
			}
			local121 = arg1.method5204();
			Static280.method4136(arg0, local121, local90);
		}
		if ((arg3 & 0x1000) != 0) {
			arg0.aBoolean743 = arg1.method5185() == 1;
		}
		if ((arg3 & 0x200) != 0) {
			local12 = arg1.method5187();
		}
		if ((arg3 & 0x2000) != 0) {
			arg0.aString94 = arg1.method5181();
			if (arg0.aString94.charAt(0) == '~') {
				arg0.aString94 = arg0.aString94.substring(1);
				Static180.method3112(arg0.aString94, arg0.method7884(), arg0.method7879(), 0, 2, arg0.aString96);
			} else if (arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2) {
				Static180.method3112(arg0.aString94, arg0.method7884(), arg0.method7879(), 0, 2, arg0.aString96);
			}
			arg0.anInt9495 = 0;
			arg0.anInt9494 = 150;
			arg0.anInt9475 = 0;
		}
		if ((arg3 & 0x8000) != 0) {
			arg0.anInt9492 = arg1.method5212();
			arg0.anInt9453 = arg1.method5166();
			arg0.anInt9507 = arg1.method5187();
			arg0.anInt9516 = arg1.method5212();
			arg0.anInt9506 = arg1.method5205() + Static506.anInt8251;
			arg0.anInt9529 = arg1.method5198() + Static506.anInt8251;
			arg0.anInt9524 = arg1.method5204();
			arg0.anInt9534 = 0;
			if (arg0.aBoolean747) {
				arg0.anInt9507 += arg0.anInt9537;
				arg0.anInt9453 += arg0.anInt9550;
				arg0.anInt9492 += arg0.anInt9537;
				arg0.anInt9535 = 0;
				arg0.anInt9516 += arg0.anInt9550;
			} else {
				arg0.anInt9453 += arg0.anIntArray628[0];
				arg0.anInt9535 = 1;
				arg0.anInt9492 += arg0.anIntArray629[0];
				arg0.anInt9516 += arg0.anIntArray628[0];
				arg0.anInt9507 += arg0.anIntArray629[0];
			}
		}
		if ((arg3 & 0x10) != 0) {
			local30 = arg1.method5175();
			@Pc(363) byte[] local363 = new byte[local30];
			@Pc(368) Class3_Sub11 local368 = new Class3_Sub11(local363);
			arg1.method5183(local30, local363);
			Static164.aClass3_Sub11Array1[arg2] = local368;
			arg0.method7873(local368);
		}
		if ((arg3 & 0x400) != 0) {
			local30 = arg1.method5178();
			arg0.anInt9458 = arg1.method5206();
			arg0.anInt9469 = arg1.method5204();
			arg0.aBoolean738 = (local30 & 0x8000) != 0;
			arg0.anInt9471 = local30 & 0x7FFF;
			arg0.anInt9518 = arg0.anInt9471 + Static506.anInt8251 + arg0.anInt9458;
		}
		if ((arg3 & 0x40) != 0) {
			arg0.anInt9560 = arg1.method5178();
			if (arg0.anInt9535 == 0) {
				arg0.method7865(arg0.anInt9560);
				arg0.anInt9560 = -1;
			}
		}
		if ((arg3 & 0x8) != 0) {
			local30 = arg1.method5217();
			local92 = arg1.method5185();
			arg0.method7867(local30, Static506.anInt8251, local92);
			arg0.anInt9501 = Static506.anInt8251 + 300;
			arg0.anInt9465 = arg1.method5185();
		}
		if ((arg3 & 0x20000) != 0) {
			local30 = Static506.anInt8251;
			local92 = arg1.method5217();
			local121 = arg1.method5204();
			arg0.method7867(local92, local30, local121);
		}
		if ((arg3 & 0x4000) != 0) {
			local30 = arg1.method5175();
			@Pc(515) int[] local515 = new int[local30];
			@Pc(518) int[] local518 = new int[local30];
			@Pc(521) int[] local521 = new int[local30];
			for (@Pc(523) int local523 = 0; local523 < local30; local523++) {
				@Pc(529) int local529 = arg1.method5198();
				if (local529 == 65535) {
					local529 = -1;
				}
				local515[local523] = local529;
				local518[local523] = arg1.method5185();
				local521[local523] = arg1.method5205();
			}
			Static311.method4559(arg0, local515, local521, local518);
		}
		if ((arg3 & 0x20) != 0) {
			local30 = arg1.method5205();
			local92 = arg1.method5229();
			if (local30 == 65535) {
				local30 = -1;
			}
			local121 = arg1.method5175();
			arg0.method7857(local92, local121, local30, false);
		}
		if ((arg3 & 0x100) != 0) {
			local30 = arg1.method5198();
			if (local30 == 65535) {
				local30 = -1;
			}
			local92 = arg1.method5186();
			local121 = arg1.method5185();
			arg0.method7857(local92, local121, local30, true);
		}
		if (!arg0.aBoolean747) {
			return;
		}
		if (local12 == 127) {
			arg0.method7871(arg0.anInt9537, arg0.anInt9550);
			return;
		}
		@Pc(649) byte local649;
		if (local12 == -1) {
			local649 = Static477.aByteArray89[arg2];
		} else {
			local649 = local12;
		}
		arg0.method7880(arg0.anInt9537, arg0.anInt9550, local649);
	}
}
