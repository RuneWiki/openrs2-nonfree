import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_15 = new Class40("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
	public static int anInt1093 = 0;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!aj;Lclient!bda;II)V")
	public static void method1061(@OriginalArg(1) Class5_Sub3_Sub1 arg0, @OriginalArg(2) Class15_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16;
		if ((arg2 & 0x4) != 0) {
			local16 = arg0.method4226();
			@Pc(19) byte[] local19 = new byte[local16];
			@Pc(24) Class5_Sub3 local24 = new Class5_Sub3(local19);
			arg0.method4173(local16, local19);
			Static294.aClass5_Sub3Array2[arg3] = local24;
			arg1.method803(local24);
		}
		@Pc(40) byte local40 = -1;
		if ((arg2 & 0x8000) != 0) {
			arg1.anInt4684 = arg0.method4215();
			arg1.anInt4729 = arg0.method4189();
			arg1.anInt4683 = arg0.method4196();
			arg1.anInt4698 = arg0.method4189();
			arg1.anInt4721 = arg0.method4227() + Static481.anInt8318;
			arg1.anInt4718 = arg0.method4205() + Static481.anInt8318;
			arg1.anInt4680 = arg0.method4226();
			arg1.anInt4756 = 0;
			if (arg1.aBoolean31) {
				arg1.anInt4684 += arg1.anInt846;
				arg1.anInt4729 += arg1.anInt840;
				arg1.anInt4683 += arg1.anInt846;
				arg1.anInt4698 += arg1.anInt840;
				arg1.anInt4753 = 0;
			} else {
				arg1.anInt4753 = 1;
				arg1.anInt4683 += arg1.anIntArray306[0];
				arg1.anInt4729 += arg1.anIntArray307[0];
				arg1.anInt4684 += arg1.anIntArray306[0];
				arg1.anInt4698 += arg1.anIntArray307[0];
			}
		}
		@Pc(177) int local177;
		@Pc(186) int local186;
		if ((arg2 & 0x40000) != 0) {
			local16 = arg0.method4232();
			local177 = arg0.method4198();
			if (local16 == 65535) {
				local16 = -1;
			}
			local186 = arg0.method4226();
			arg1.method4027(local177, local16, true, local186);
		}
		if ((arg2 & 0x10000) != 0) {
			arg1.aByte50 = arg0.method4215();
			arg1.aByte49 = arg0.method4196();
			arg1.aByte47 = arg0.method4196();
			arg1.aByte48 = (byte) arg0.method4171();
			arg1.lb = Static481.anInt8318 + arg0.method4227();
			arg1.anInt4717 = Static481.anInt8318 + arg0.method4227();
		}
		if ((arg2 & 0x8) != 0) {
			arg1.anInt861 = arg0.method4202();
			if (arg1.anInt4753 == 0) {
				arg1.method4036(arg1.anInt861);
				arg1.anInt861 = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			local16 = arg0.method4205();
			if (local16 == 65535) {
				local16 = -1;
			}
			local177 = arg0.method4220();
			Static420.method7302(arg1, local16, local177);
		}
		if ((arg2 & 0x80) != 0) {
			local16 = arg0.method4231();
			local177 = arg0.method4171();
			arg1.method4041(local16, Static481.anInt8318, local177);
			arg1.anInt4739 = Static481.anInt8318 + 300;
			arg1.anInt4740 = arg0.method4183();
		}
		if ((arg2 & 0x1000) != 0) {
			local16 = Static481.anInt8318;
			local177 = arg0.method4231();
			local186 = arg0.method4220();
			arg1.method4041(local177, local16, local186);
		}
		if ((arg2 & 0x20000) != 0) {
			local16 = arg0.method4171();
			@Pc(355) int[] local355 = new int[local16];
			@Pc(358) int[] local358 = new int[local16];
			@Pc(361) int[] local361 = new int[local16];
			for (@Pc(363) int local363 = 0; local363 < local16; local363++) {
				@Pc(369) int local369 = arg0.method4232();
				if (local369 == 65535) {
					local369 = -1;
				}
				local355[local363] = local369;
				local358[local363] = arg0.method4226();
				local361[local363] = arg0.method4227();
			}
			Static68.method1291(arg1, local361, local355, local358);
		}
		if ((arg2 & 0x800) != 0) {
			local40 = arg0.method4189();
		}
		if ((arg2 & 0x2000) != 0) {
			local16 = arg0.method4227();
			local177 = arg0.method4230();
			if (local16 == 65535) {
				local16 = -1;
			}
			local186 = arg0.method4183();
			arg1.method4027(local177, local16, false, local186);
		}
		if ((arg2 & 0x400) != 0) {
			local16 = arg0.method4202();
			arg1.anInt4679 = arg0.method4226();
			arg1.anInt4722 = arg0.method4226();
			arg1.aBoolean301 = (local16 & 0x8000) != 0;
			arg1.anInt4700 = local16 & 0x7FFF;
			arg1.anInt4691 = arg1.anInt4700 + Static481.anInt8318 + arg1.anInt4679;
		}
		if ((arg2 & 0x10) != 0) {
			Static444.aByteArray110[arg3] = arg0.method4215();
		}
		if ((arg2 & 0x1) != 0) {
			local16 = arg0.method4227();
			local177 = arg0.method4226();
			local186 = arg0.method4220();
			@Pc(524) int local524 = arg0.anInt4960;
			@Pc(532) boolean local532 = (local16 & 0x8000) != 0;
			if (arg1.aString18 != null && arg1.aClass248_1 != null) {
				@Pc(540) boolean local540 = false;
				if (local177 <= 1) {
					if (!local532 && (Static260.aBoolean605 && !Static143.aBoolean200 || Static411.aBoolean519)) {
						local540 = true;
					} else if (Static359.method5523(arg1.aString18)) {
						local540 = true;
					}
				}
				if (!local540 && Static98.anInt2245 == 0) {
					Static483.aClass5_Sub3_16.anInt4960 = 0;
					arg0.method4177(Static483.aClass5_Sub3_16.aByteArray66, local186);
					Static483.aClass5_Sub3_16.anInt4960 = 0;
					@Pc(584) int local584 = -1;
					@Pc(592) String local592;
					if (local532) {
						local16 &= 0x7FFF;
						@Pc(602) Class26 local602 = Static284.method4803(Static483.aClass5_Sub3_16);
						local584 = local602.anInt642;
						local592 = local602.aClass5_Sub2_Sub10_1.method1998(Static483.aClass5_Sub3_16);
					} else {
						local592 = Static144.method2730(Static115.method2243(Static483.aClass5_Sub3_16));
					}
					arg1.aString47 = local592.trim();
					arg1.anInt4676 = local16 >> 8;
					arg1.anInt4733 = local16 & 0xFF;
					arg1.anInt4751 = 150;
					@Pc(640) int local640;
					if (local177 == 1 || local177 == 2) {
						local640 = local532 ? 17 : 1;
					} else {
						local640 = local532 ? 17 : 2;
					}
					if (local177 == 2) {
						Static81.method1437(local592, 0, null, "<img=1>" + arg1.method806(), local584, "<img=1>" + arg1.method802(), local640);
					} else if (local177 == 1) {
						Static81.method1437(local592, 0, null, "<img=0>" + arg1.method806(), local584, "<img=0>" + arg1.method802(), local640);
					} else {
						Static81.method1437(local592, 0, null, arg1.method806(), local584, arg1.method802(), local640);
					}
				}
			}
			arg0.anInt4960 = local186 + local524;
		}
		if ((arg2 & 0x200) != 0) {
			arg1.aString47 = arg0.method4234();
			if (arg1.aString47.charAt(0) == '~') {
				arg1.aString47 = arg1.aString47.substring(1);
				Static328.method5200(arg1.method806(), 0, 2, arg1.aString47, arg1.method802());
			} else if (Static35.aClass15_Sub2_Sub1_Sub1_1 == arg1) {
				Static328.method5200(arg1.method806(), 0, 2, arg1.aString47, arg1.method802());
			}
			arg1.anInt4733 = 0;
			arg1.anInt4751 = 150;
			arg1.anInt4676 = 0;
		}
		if ((arg2 & 0x100) != 0) {
			arg1.aBoolean33 = arg0.method4171() == 1;
		}
		if ((arg2 & 0x2) != 0) {
			local16 = arg0.method4232();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg1.anInt4720 = local16;
		}
		if (!arg1.aBoolean31) {
			return;
		}
		if (local40 == 127) {
			arg1.method800(arg1.anInt846, arg1.anInt840);
			return;
		}
		@Pc(850) byte local850;
		if (local40 == -1) {
			local850 = Static444.aByteArray110[arg3];
		} else {
			local850 = local40;
		}
		arg1.method798(local850, arg1.anInt846, arg1.anInt840);
	}
}
