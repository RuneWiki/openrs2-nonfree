import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
	public static int anInt6413;

	@OriginalMember(owner = "client!mha", name = "z", descriptor = "I")
	public static int anInt6416 = -1;

	@OriginalMember(owner = "client!mha", name = "B", descriptor = "I")
	public static int anInt6417 = -2;

	@OriginalMember(owner = "client!mha", name = "L", descriptor = "[I")
	public static final int[] anIntArray362 = new int[8];

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)V")
	public static void method5391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class5_Sub38 local6 = (Class5_Sub38) Static351.aClass124_58.method2572(); local6 != null; local6 = (Class5_Sub38) Static351.aClass124_58.method2569()) {
			Static27.method371(local6, arg2, arg0, arg1, arg3);
		}
		@Pc(185) boolean local185;
		for (@Pc(31) Class5_Sub38 local31 = (Class5_Sub38) Static511.aClass124_97.method2572(); local31 != null; local31 = (Class5_Sub38) Static511.aClass124_97.method2569()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class201 local40 = local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.method7933();
			if (local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 == -1 || local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.aBoolean690) {
				local35 = 0;
			} else if (local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 == local40.anInt4759 || local40.anInt4786 == local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 || local40.anInt4776 == local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 || local40.anInt4761 == local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484) {
				local35 = 2;
			} else if (local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 == local40.anInt4781 || local40.anInt4779 == local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 || local40.anInt4765 == local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 || local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt9484 == local40.anInt4753) {
				local35 = 3;
			}
			if (local35 != local31.anInt6693) {
				@Pc(133) int local133 = Static594.method8045(local31.aClass41_Sub1_Sub1_Sub3_Sub1_2);
				@Pc(137) Class311 local137 = local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.aClass311_1;
				if (local137.anIntArray476 != null) {
					local137 = local137.method7325(Static413.aClass63_1);
				}
				if (local137 == null || local133 == -1) {
					local31.anInt6677 = -1;
					local31.anInt6693 = local35;
					local31.aBoolean478 = false;
				} else if (local133 == local31.anInt6677 && local137.aBoolean622 == local31.aBoolean478) {
					local31.anInt6693 = local35;
					local31.anInt6684 = local137.anInt8663;
				} else {
					local185 = false;
					if (local31.aClass5_Sub14_Sub1_3 == null) {
						local185 = true;
					} else {
						local31.anInt6684 -= 512;
						if (local31.anInt6684 <= 0) {
							Static229.aClass5_Sub14_Sub3_1.method2294(local31.aClass5_Sub14_Sub1_3);
							local185 = true;
							local31.aClass5_Sub14_Sub1_3 = null;
						}
					}
					if (local185) {
						local31.anInt6684 = local137.anInt8663;
						local31.aBoolean478 = local137.aBoolean622;
						local31.anInt6693 = local35;
						local31.anInt6677 = local133;
						local31.aClass5_Sub54_2 = null;
						local31.aClass5_Sub9_Sub1_3 = null;
					}
				}
			}
			local31.anInt6691 = local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt10366;
			local31.anInt6685 = local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt10366 + (local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.method7917() << 8);
			local31.anInt6680 = local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt10367;
			local31.anInt6695 = local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.anInt10367 + (local31.aClass41_Sub1_Sub1_Sub3_Sub1_2.method7917() << 8);
			Static27.method371(local31, arg2, arg0, arg1, arg3);
		}
		for (@Pc(300) Class5_Sub38 local300 = (Class5_Sub38) Static337.aClass335_25.method7768(); local300 != null; local300 = (Class5_Sub38) Static337.aClass335_25.method7777()) {
			@Pc(304) byte local304 = 1;
			@Pc(311) Class201 local311 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.method7933();
			if (local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 == -1 || local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.aBoolean690) {
				local304 = 0;
			} else if (local311.anInt4759 == local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 || local311.anInt4786 == local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 || local311.anInt4776 == local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 || local311.anInt4761 == local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484) {
				local304 = 2;
			} else if (local311.anInt4781 == local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 || local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 == local311.anInt4779 || local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 == local311.anInt4765 || local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9484 == local311.anInt4753) {
				local304 = 3;
			}
			if (local300.anInt6693 != local304) {
				@Pc(404) int local404 = Static166.method2457(local300.aClass41_Sub1_Sub1_Sub3_Sub2_2);
				if (local300.anInt6677 == local404 && local300.aBoolean478 == local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.aBoolean699) {
					local300.anInt6693 = local304;
					local300.anInt6684 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9533;
				} else {
					local185 = false;
					if (local300.aClass5_Sub14_Sub1_3 == null) {
						local185 = true;
					} else {
						local300.anInt6684 -= 512;
						if (local300.anInt6684 <= 0) {
							Static229.aClass5_Sub14_Sub3_1.method2294(local300.aClass5_Sub14_Sub1_3);
							local185 = true;
							local300.aClass5_Sub14_Sub1_3 = null;
						}
					}
					if (local185) {
						local300.aClass5_Sub54_2 = null;
						local300.aBoolean478 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.aBoolean699;
						local300.aClass5_Sub9_Sub1_3 = null;
						local300.anInt6693 = local304;
						local300.anInt6677 = local404;
						local300.anInt6684 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt9533;
					}
				}
			}
			local300.anInt6691 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt10366;
			local300.anInt6685 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt10366 + (local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.method7917() << 8);
			local300.anInt6680 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt10367;
			local300.anInt6695 = local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.anInt10367 + (local300.aClass41_Sub1_Sub1_Sub3_Sub2_2.method7917() << 8);
			Static27.method371(local300, arg2, arg0, arg1, arg3);
		}
	}
}
