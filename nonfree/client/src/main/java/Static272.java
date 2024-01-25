import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_102 = new Class298(3, 4);

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public static int anInt5060 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!og;IILclient!bw;)V")
	public static void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub11_Sub1 arg3) {
		@Pc(16) int local16;
		if ((arg2 & 0x10) != 0) {
			local16 = arg3.method3099();
			@Pc(19) byte[] local19 = new byte[local16];
			@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(local19);
			arg3.method3112(local16, local19);
			Static375.aClass3_Sub11Array1[arg0] = local24;
			arg1.method5589(local24);
		}
		@Pc(42) byte local42 = -1;
		@Pc(59) int local59;
		if ((arg2 & 0x2) != 0) {
			local16 = arg3.method3138();
			local59 = arg3.method3120();
			arg1.method5575(local59, Static305.anInt5560, local16);
			arg1.anInt6431 = Static305.anInt5560 + 300;
			arg1.anInt6460 = arg3.method3110();
		}
		if ((arg2 & 0x40) != 0) {
			arg1.anInt6497 = arg3.method3115();
			if (arg1.anInt6468 == 0) {
				arg1.method5557(arg1.anInt6497);
				arg1.anInt6497 = -1;
			}
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt6450 = arg3.method3123();
			arg1.anInt6449 = arg3.method3123();
			arg1.anInt6389 = arg3.method3121();
			arg1.anInt6416 = arg3.method3096();
			arg1.anInt6430 = arg3.method3115() + Static305.anInt5560;
			arg1.anInt6421 = arg3.method3109() + Static305.anInt5560;
			arg1.anInt6417 = arg3.method3118();
			if (arg1.aBoolean532) {
				arg1.anInt6416 += arg1.anInt6502;
				arg1.anInt6450 += arg1.anInt6505;
				arg1.anInt6449 += arg1.anInt6502;
				arg1.anInt6389 += arg1.anInt6505;
				arg1.anInt6468 = 0;
			} else {
				arg1.anInt6389 += arg1.anIntArray518[0];
				arg1.anInt6449 += arg1.anIntArray517[0];
				arg1.anInt6416 += arg1.anIntArray517[0];
				arg1.anInt6468 = 1;
				arg1.anInt6450 += arg1.anIntArray518[0];
			}
			arg1.anInt6469 = 0;
		}
		if ((arg2 & 0x2000) != 0) {
			local16 = arg3.method3117();
			arg1.anInt6446 = arg3.method3099();
			arg1.anInt6406 = arg3.method3110();
			arg1.anInt6413 = local16 & 0x7FFF;
			arg1.aBoolean526 = (local16 & 0x8000) != 0;
			arg1.anInt6442 = Static305.anInt5560 + arg1.anInt6413 + arg1.anInt6446;
		}
		@Pc(305) int local305;
		if ((arg2 & 0x8) != 0) {
			@Pc(278) int[] local278 = new int[4];
			for (local59 = 0; local59 < 4; local59++) {
				local278[local59] = arg3.method3139();
				if (local278[local59] == 65535) {
					local278[local59] = -1;
				}
			}
			local305 = arg3.method3110();
			Static155.method2826(arg1, local278, local305);
		}
		if ((arg2 & 0x4) != 0) {
			Static203.aByteArray38[arg0] = arg3.method3096();
		}
		if ((arg2 & 0x100) != 0) {
			arg1.aString93 = arg3.method3133();
			if (arg1.aString93.charAt(0) == '~') {
				arg1.aString93 = arg1.aString93.substring(1);
				Static483.method6585(arg1.method5581(), arg1.method5577(), arg1.aString95, 2, 0, arg1.aString93);
			} else if (arg1 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2) {
				Static483.method6585(arg1.method5581(), arg1.method5577(), arg1.aString95, 2, 0, arg1.aString93);
			}
			arg1.anInt6452 = 0;
			arg1.anInt6414 = 150;
			arg1.anInt6433 = 0;
		}
		if ((arg2 & 0x80) != 0) {
			local16 = arg3.method3139();
			if (local16 == 65535) {
				local16 = -1;
			}
			local59 = arg3.method3116();
			local305 = arg3.method3118();
			arg1.method5566(local59, false, local305, local16);
		}
		if ((arg2 & 0x10000) != 0) {
			arg1.aByte91 = arg3.method3096();
			arg1.aByte90 = arg3.method3078();
			arg1.aByte92 = arg3.method3121();
			arg1.aByte89 = (byte) arg3.method3118();
			arg1.anInt6456 = Static305.anInt5560 + arg3.method3139();
			arg1.anInt6388 = Static305.anInt5560 + arg3.method3117();
		}
		if ((arg2 & 0x8000) != 0) {
			local16 = arg3.method3118();
			@Pc(488) int[] local488 = new int[local16];
			@Pc(491) int[] local491 = new int[local16];
			@Pc(494) int[] local494 = new int[local16];
			for (@Pc(496) int local496 = 0; local496 < local16; local496++) {
				@Pc(502) int local502 = arg3.method3139();
				if (local502 == 65535) {
					local502 = -1;
				}
				local488[local496] = local502;
				local491[local496] = arg3.method3120();
				local494[local496] = arg3.method3139();
			}
			Static259.method6927(local494, arg1, local491, local488);
		}
		if ((arg2 & 0x400) != 0) {
			local42 = arg3.method3123();
		}
		if ((arg2 & 0x800) != 0) {
			local16 = arg3.method3115();
			if (local16 == 65535) {
				local16 = -1;
			}
			local59 = arg3.method3074();
			local305 = arg3.method3110();
			arg1.method5566(local59, true, local305, local16);
		}
		if ((arg2 & 0x20000) != 0) {
			local16 = Static305.anInt5560;
			local59 = arg3.method3138();
			local305 = arg3.method3118();
			arg1.method5575(local305, local16, local59);
		}
		if ((arg2 & 0x1000) != 0) {
			arg1.aBoolean535 = arg3.method3118() == 1;
		}
		if ((arg2 & 0x1) != 0) {
			local16 = arg3.method3109();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg1.anInt6463 = local16;
		}
		if (!arg1.aBoolean532) {
			return;
		}
		if (local42 == 127) {
			arg1.method5585(arg1.anInt6505, arg1.anInt6502);
			return;
		}
		@Pc(649) byte local649;
		if (local42 == -1) {
			local649 = Static203.aByteArray38[arg0];
		} else {
			local649 = local42;
		}
		arg1.method5587(arg1.anInt6502, arg1.anInt6505, local649);
	}
}
