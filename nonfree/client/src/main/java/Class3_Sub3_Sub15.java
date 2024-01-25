import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class3_Sub3_Sub15 extends Class3_Sub3 {

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
	private int anInt2401 = 0;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
	private int anInt2404 = 0;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
	private int anInt2408 = 16;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
	private int anInt2411 = 2000;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	private int anInt2406 = 4096;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		Static336.method5504();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(20) int local20 = this.anInt2406 >> 1;
			@Pc(25) int[][] local25 = super.aClass217_41.method5706();
			@Pc(32) Random local32 = new Random((long) this.anInt2404);
			for (@Pc(34) int local34 = 0; local34 < this.anInt2411; local34++) {
				@Pc(54) int local54 = this.anInt2406 > 0 ? this.anInt2401 + Static54.method915(this.anInt2406, local32) - local20 : this.anInt2401;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(67) int local67 = Static54.method915(Static131.anInt2755, local32);
				@Pc(72) int local72 = Static54.method915(Static182.anInt3888, local32);
				@Pc(84) int local84 = local67 + (Static113.anIntArray534[local60] * this.anInt2408 >> 12);
				@Pc(95) int local95 = local72 + (Static290.anIntArray474[local60] * this.anInt2408 >> 12);
				@Pc(99) int local99 = local95 - local72;
				@Pc(103) int local103 = local84 - local67;
				if (local103 != 0 || local99 != 0) {
					if (local99 < 0) {
						local99 = -local99;
					}
					if (local103 < 0) {
						local103 = -local103;
					}
					@Pc(134) boolean local134 = local99 > local103;
					@Pc(138) int local138;
					@Pc(142) int local142;
					if (local134) {
						local138 = local67;
						local67 = local72;
						local142 = local84;
						local84 = local95;
						local72 = local138;
						local95 = local142;
					}
					if (local67 > local84) {
						local138 = local67;
						local67 = local84;
						local142 = local72;
						local84 = local138;
						local72 = local95;
						local95 = local142;
					}
					local138 = local72;
					local142 = local84 - local67;
					@Pc(174) int local174 = local95 - local72;
					@Pc(179) int local179 = -local142 / 2;
					@Pc(183) int local183 = 2048 / local142;
					@Pc(194) int local194 = 1024 - (Static54.method915(4096, local32) >> 2);
					if (local174 < 0) {
						local174 = -local174;
					}
					@Pc(206) int local206 = local95 > local72 ? 1 : -1;
					for (@Pc(208) int local208 = local67; local208 < local84; local208++) {
						@Pc(221) int local221 = local194 + (-local67 + local208) * local183 + 1024;
						@Pc(225) int local225 = local208 & Static167.anInt3460;
						@Pc(229) int local229 = Static351.anInt6821 & local138;
						if (local134) {
							local25[local229][local225] = local221;
						} else {
							local25[local225][local229] = local221;
						}
						local179 += local174;
						if (local179 > 0) {
							local138 += local206;
							local179 -= local142;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2404 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt2411 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt2408 = arg0.method3643();
		} else if (arg1 == 3) {
			this.anInt2401 = arg0.method3649();
		} else if (arg1 == 4) {
			this.anInt2406 = arg0.method3649();
		}
	}
}
