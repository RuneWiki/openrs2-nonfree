import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!op", name = "N", descriptor = "I")
	private int anInt5147 = 0;

	@OriginalMember(owner = "client!op", name = "P", descriptor = "I")
	private int anInt5149 = 16;

	@OriginalMember(owner = "client!op", name = "M", descriptor = "I")
	private int anInt5146 = 0;

	@OriginalMember(owner = "client!op", name = "R", descriptor = "I")
	private int anInt5151 = 4096;

	@OriginalMember(owner = "client!op", name = "T", descriptor = "I")
	private int anInt5153 = 2000;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(20) int local20 = this.anInt5151 >> 1;
			@Pc(25) int[][] local25 = super.aClass172_41.method3959();
			@Pc(32) Random local32 = new Random((long) this.anInt5147);
			for (@Pc(34) int local34 = 0; local34 < this.anInt5153; local34++) {
				@Pc(54) int local54 = this.anInt5151 > 0 ? this.anInt5146 + Static301.method3334(this.anInt5151, local32) - local20 : this.anInt5146;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(65) int local65 = Static301.method3334(Static347.anInt5974, local32);
				@Pc(70) int local70 = Static301.method3334(Static241.anInt4307, local32);
				@Pc(81) int local81 = local65 + (Static292.anIntArray372[local60] * this.anInt5149 >> 12);
				@Pc(93) int local93 = local70 + (this.anInt5149 * Static12.anIntArray19[local60] >> 12);
				@Pc(98) int local98 = local93 - local70;
				@Pc(103) int local103 = local81 - local65;
				if (local103 != 0 || local98 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local98 < 0) {
						local98 = -local98;
					}
					@Pc(134) boolean local134 = local103 < local98;
					@Pc(138) int local138;
					@Pc(140) int local140;
					if (local134) {
						local138 = local65;
						local140 = local81;
						local65 = local70;
						local70 = local138;
						local81 = local93;
						local93 = local140;
					}
					if (local65 > local81) {
						local138 = local65;
						local65 = local81;
						local140 = local70;
						local70 = local93;
						local81 = local138;
						local93 = local140;
					}
					local138 = local70;
					local140 = local81 - local65;
					@Pc(178) int local178 = local93 - local70;
					@Pc(183) int local183 = -local140 / 2;
					@Pc(187) int local187 = 2048 / local140;
					@Pc(196) int local196 = 1024 - (Static301.method3334(4096, local32) >> 2);
					@Pc(203) int local203 = local70 < local93 ? 1 : -1;
					if (local178 < 0) {
						local178 = -local178;
					}
					for (@Pc(210) int local210 = local65; local210 < local81; local210++) {
						@Pc(223) int local223 = (local210 - local65) * local187 + local196 + 1024;
						@Pc(227) int local227 = Static307.anInt5524 & local210;
						@Pc(231) int local231 = local138 & Static274.anInt4887;
						local183 += local178;
						if (local134) {
							local25[local231][local227] = local223;
						} else {
							local25[local227][local231] = local223;
						}
						if (local183 > 0) {
							local183 += -local140;
							local138 += local203;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5147 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt5153 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt5149 = arg0.method4130();
		} else if (arg1 == 3) {
			this.anInt5146 = arg0.method4093();
		} else if (arg1 == 4) {
			this.anInt5151 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		Static443.method5895();
	}
}
