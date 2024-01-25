import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_151 = new Class319(1, 4);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZI)V")
	public static void method7032(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class1_Sub46 local8 = Static365.method5363(arg1, arg0);
		if (local8 != null) {
			local8.method7878();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!kba;Lclient!jd;BI)V")
	public static void method7033(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2_Sub4_Sub1_Sub1 arg1, @OriginalArg(2) Class1_Sub20_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16;
		if ((arg0 & 0x10) != 0) {
			local16 = arg2.method4417();
			if (local16 == 65535) {
				local16 = -1;
			}
			arg1.anInt6436 = local16;
		}
		@Pc(26) byte local26 = -1;
		if ((arg0 & 0x1000) != 0) {
			arg1.aBoolean378 = arg2.method4408() == 1;
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		if ((arg0 & 0x20000) != 0) {
			local16 = Static81.anInt1910;
			local55 = arg2.method4427();
			local59 = arg2.method4372();
			arg1.method5344(local16, local59, local55);
		}
		if ((arg0 & 0x200) != 0) {
			local26 = arg2.method4433();
		}
		if ((arg0 & 0x10000) != 0) {
			arg1.aByte91 = arg2.method4387();
			arg1.aByte90 = arg2.method4374();
			arg1.aByte89 = arg2.method4432();
			arg1.aByte88 = (byte) arg2.method4382();
			arg1.anInt6413 = Static81.anInt1910 + arg2.method4426();
			arg1.anInt6461 = Static81.anInt1910 + arg2.method4394();
		}
		if ((arg0 & 0x2000) != 0) {
			arg1.anInt6440 = arg2.method4432();
			arg1.anInt6449 = arg2.method4432();
			arg1.anInt6426 = arg2.method4432();
			arg1.anInt6431 = arg2.method4387();
			arg1.anInt6429 = arg2.method4424() + Static81.anInt1910;
			arg1.anInt6387 = arg2.method4424() + Static81.anInt1910;
			arg1.anInt6456 = arg2.method4408();
			if (arg1.aBoolean377) {
				arg1.anInt6449 += arg1.anInt4942;
				arg1.anInt6426 += arg1.anInt4927;
				arg1.anInt6469 = 0;
				arg1.anInt6431 += arg1.anInt4942;
				arg1.anInt6440 += arg1.anInt4927;
			} else {
				arg1.anInt6440 += arg1.anIntArray437[0];
				arg1.anInt6469 = 1;
				arg1.anInt6426 += arg1.anIntArray437[0];
				arg1.anInt6431 += arg1.anIntArray436[0];
				arg1.anInt6449 += arg1.anIntArray436[0];
			}
			arg1.anInt6466 = 0;
		}
		if ((arg0 & 0x80) != 0) {
			Static444.aByteArray57[arg3] = arg2.method4387();
		}
		if ((arg0 & 0x4000) != 0) {
			local16 = arg2.method4426();
			if (local16 == 65535) {
				local16 = -1;
			}
			local55 = arg2.method4398();
			local59 = arg2.method4382();
			arg1.method5345(local55, local59, true, local16);
		}
		if ((arg0 & 0x2) != 0) {
			local16 = arg2.method4382();
			@Pc(291) byte[] local291 = new byte[local16];
			@Pc(296) Class1_Sub20 local296 = new Class1_Sub20(local291);
			arg2.method4419(local16, local291);
			Static137.aClass1_Sub20Array1[arg3] = local296;
			arg1.method4152(local296);
		}
		if ((arg0 & 0x20) != 0) {
			@Pc(320) int[] local320 = new int[4];
			for (local55 = 0; local55 < 4; local55++) {
				local320[local55] = arg2.method4417();
				if (local320[local55] == 65535) {
					local320[local55] = -1;
				}
			}
			local59 = arg2.method4393();
			Static256.method4041(local59, arg1, local320);
		}
		if ((arg0 & 0x100) != 0) {
			local16 = arg2.method4382();
			@Pc(369) int[] local369 = new int[local16];
			@Pc(372) int[] local372 = new int[local16];
			@Pc(375) int[] local375 = new int[local16];
			for (@Pc(377) int local377 = 0; local377 < local16; local377++) {
				@Pc(383) int local383 = arg2.method4417();
				if (local383 == 65535) {
					local383 = -1;
				}
				local369[local377] = local383;
				local372[local377] = arg2.method4393();
				local375[local377] = arg2.method4417();
			}
			Static501.method6981(local369, arg1, local375, local372);
		}
		if ((arg0 & 0x8) != 0) {
			arg1.anInt4932 = arg2.method4424();
			if (arg1.anInt6469 == 0) {
				arg1.method5341(arg1.anInt4932);
				arg1.anInt4932 = -1;
			}
		}
		if ((arg0 & 0x40) != 0) {
			local16 = arg2.method4427();
			local55 = arg2.method4372();
			arg1.method5344(Static81.anInt1910, local55, local16);
			arg1.anInt6425 = Static81.anInt1910 + 300;
			arg1.anInt6395 = arg2.method4393();
		}
		if ((arg0 & 0x4) != 0) {
			local16 = arg2.method4426();
			if (local16 == 65535) {
				local16 = -1;
			}
			local55 = arg2.method4398();
			local59 = arg2.method4393();
			arg1.method5345(local55, local59, false, local16);
		}
		if ((arg0 & 0x8000) != 0) {
			local16 = arg2.method4417();
			arg1.anInt6462 = arg2.method4393();
			arg1.anInt6464 = arg2.method4408();
			arg1.aBoolean459 = (local16 & 0x8000) != 0;
			arg1.anInt6437 = local16 & 0x7FFF;
			arg1.anInt6390 = arg1.anInt6437 + Static81.anInt1910 + arg1.anInt6462;
		}
		if ((arg0 & 0x400) != 0) {
			arg1.aString66 = arg2.method4388();
			if (arg1.aString66.charAt(0) == '~') {
				arg1.aString66 = arg1.aString66.substring(1);
				Static114.method1983(arg1.method4153(), arg1.method4151(), arg1.aString50, 0, arg1.aString66, 2);
			} else if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == arg1) {
				Static114.method1983(arg1.method4153(), arg1.method4151(), arg1.aString50, 0, arg1.aString66, 2);
			}
			arg1.anInt6463 = 150;
			arg1.anInt6414 = 0;
			arg1.anInt6458 = 0;
		}
		if (!arg1.aBoolean377) {
			return;
		}
		if (local26 == 127) {
			arg1.method4147(arg1.anInt4927, arg1.anInt4942);
			return;
		}
		@Pc(629) byte local629;
		if (local26 == -1) {
			local629 = Static444.aByteArray57[arg3];
		} else {
			local629 = local26;
		}
		arg1.method4150(arg1.anInt4927, arg1.anInt4942, local629);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public static void method7036() {
		Static419.aClass326_41.method7234();
		Static478.aClass326_48.method7234();
		Static171.aClass326_13.method7234();
		Static399.aClass326_37.method7234();
	}
}
