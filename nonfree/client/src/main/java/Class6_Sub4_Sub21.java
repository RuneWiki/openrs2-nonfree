import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class6_Sub4_Sub21 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	private int anInt5634 = 0;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
	private int anInt5630 = 16;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
	private int anInt5637 = 0;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	private int anInt5638 = 4096;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
	private int anInt5639 = 2000;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt5634 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt5639 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt5630 = arg1.method8604();
		} else if (arg0 == 3) {
			this.anInt5637 = arg1.method8571();
		} else if (arg0 == 4) {
			this.anInt5638 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(25) int local25 = this.anInt5638 >> 1;
			@Pc(30) int[][] local30 = super.aClass372_41.method8735();
			@Pc(37) Random local37 = new Random((long) this.anInt5634);
			for (@Pc(39) int local39 = 0; local39 < this.anInt5639; local39++) {
				@Pc(59) int local59 = this.anInt5638 <= 0 ? this.anInt5637 : this.anInt5637 + Static588.method8281(local37, this.anInt5638) - local25;
				@Pc(65) int local65 = local59 >> 4 & 0xFF;
				@Pc(70) int local70 = Static588.method8281(local37, Static6.anInt111);
				@Pc(75) int local75 = Static588.method8281(local37, Static429.anInt7811);
				@Pc(86) int local86 = (Static407.anIntArray406[local65] * this.anInt5630 >> 12) + local70;
				@Pc(97) int local97 = local75 + (this.anInt5630 * Static343.anIntArray404[local65] >> 12);
				@Pc(102) int local102 = local97 - local75;
				@Pc(106) int local106 = local86 - local70;
				if (local106 != 0 || local102 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local102 < 0) {
						local102 = -local102;
					}
					@Pc(130) boolean local130 = local102 > local106;
					@Pc(134) int local134;
					@Pc(138) int local138;
					if (local130) {
						local134 = local70;
						local70 = local75;
						local138 = local86;
						local86 = local97;
						local75 = local134;
						local97 = local138;
					}
					if (local70 > local86) {
						local134 = local70;
						local138 = local75;
						local70 = local86;
						local86 = local134;
						local75 = local97;
						local97 = local138;
					}
					local134 = local75;
					local138 = local86 - local70;
					@Pc(175) int local175 = local97 - local75;
					@Pc(180) int local180 = -local138 / 2;
					@Pc(184) int local184 = 2048 / local138;
					@Pc(194) int local194 = 1024 - (Static588.method8281(local37, 4096) >> 2);
					@Pc(205) int local205 = local75 < local97 ? 1 : -1;
					if (local175 < 0) {
						local175 = -local175;
					}
					for (@Pc(212) int local212 = local70; local212 < local86; local212++) {
						@Pc(225) int local225 = local194 + local184 * (local212 + -local70) + 1024;
						@Pc(229) int local229 = local212 & Static325.anInt6209;
						@Pc(233) int local233 = local134 & Static2.anInt12;
						if (local130) {
							local30[local233][local229] = local225;
						} else {
							local30[local229][local233] = local225;
						}
						local180 += local175;
						if (local180 > 0) {
							local134 -= -local205;
							local180 += -local138;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		Static381.method5939();
	}
}
