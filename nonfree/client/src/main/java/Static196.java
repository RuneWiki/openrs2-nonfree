import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hk", name = "D", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIJIILclient!ga;I)V")
	public static void method5896(@OriginalArg(0) int arg0, @OriginalArg(3) long arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class111 arg3) {
		Static289.anInt5335 = 10000;
		Static85.aLong89 = arg1;
		Static456.anInt7778 = arg2;
		Static250.aClass111_52 = arg3;
		Static564.aBoolean671 = false;
		Static352.anInt6186 = 1;
		Static69.anInt1589 = arg0;
		Static507.anInt8455 = 10000;
		Static21.anInt620 = 0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z[[[Lclient!se;)V")
	public static void method5897(@OriginalArg(1) Class293[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(25) Class293[][] local25 = arg0[local7];
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				for (@Pc(31) int local31 = 0; local31 < local25[local27].length; local31++) {
					@Pc(39) Class293 local39 = local25[local27][local31];
					if (local39 != null) {
						if (local39.aClass20_Sub2_Sub3_1 instanceof Interface7) {
							((Interface7) local39.aClass20_Sub2_Sub3_1).method7273();
						}
						if (local39.aClass20_Sub2_Sub1_1 instanceof Interface7) {
							((Interface7) local39.aClass20_Sub2_Sub1_1).method7273();
						}
						if (local39.aClass20_Sub2_Sub1_2 instanceof Interface7) {
							((Interface7) local39.aClass20_Sub2_Sub1_2).method7273();
						}
						if (local39.aClass20_Sub2_Sub2_2 instanceof Interface7) {
							((Interface7) local39.aClass20_Sub2_Sub2_2).method7273();
						}
						if (local39.aClass20_Sub2_Sub2_1 instanceof Interface7) {
							((Interface7) local39.aClass20_Sub2_Sub2_1).method7273();
						}
						for (@Pc(89) Class285 local89 = local39.aClass285_6; local89 != null; local89 = local89.aClass285_5) {
							@Pc(94) Class20_Sub2_Sub4 local94 = local89.aClass20_Sub2_Sub4_1;
							if (local94 instanceof Interface7) {
								((Interface7) local94).method7273();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method5898(@OriginalArg(0) Class20_Sub2_Sub4_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static81.anInt1910 == arg0.anInt6387 || arg0.anInt6438 == -1 || arg0.anInt6455 != 0) {
			local5 = true;
		} else {
			@Pc(32) Class131 local32 = Static594.aClass311_2.method7009(arg0.anInt6438);
			if (local32.aBoolean306 || arg0.anInt6447 + 1 > local32.anIntArray204[arg0.anInt6392]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(56) int local56 = arg0.anInt6387 - arg0.anInt6429;
			@Pc(62) int local62 = Static81.anInt1910 - arg0.anInt6429;
			@Pc(73) int local73 = arg0.anInt6440 * 512 + arg0.method5349() * 256;
			@Pc(84) int local84 = arg0.anInt6449 * 512 + arg0.method5349() * 256;
			@Pc(95) int local95 = arg0.anInt6426 * 512 + arg0.method5349() * 256;
			@Pc(106) int local106 = arg0.anInt6431 * 512 + arg0.method5349() * 256;
			arg0.anInt8795 = ((local56 - local62) * local84 + local62 * local106) / local56;
			arg0.anInt8796 = (local95 * local62 + (local56 - local62) * local73) / local56;
		}
		arg0.anInt6467 = 0;
		if (arg0.anInt6456 == 0) {
			arg0.method5353(false, 8192);
		}
		if (arg0.anInt6456 == 1) {
			arg0.method5353(false, 12288);
		}
		if (arg0.anInt6456 == 2) {
			arg0.method5353(false, 0);
		}
		if (arg0.anInt6456 == 3) {
			arg0.method5353(false, 4096);
		}
	}
}
