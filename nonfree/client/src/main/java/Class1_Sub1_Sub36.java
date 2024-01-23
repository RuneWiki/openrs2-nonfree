import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
	private int anInt5454 = 0;

	@OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
	private int anInt5460 = 4096;

	@OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
	private int anInt5458 = 0;

	@OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
	private int anInt5462 = 16;

	@OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
	private int anInt5461 = 2000;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5458 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt5461 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt5462 = arg0.method2199();
		} else if (arg1 == 3) {
			this.anInt5454 = arg0.method2244();
		} else if (arg1 == 4) {
			this.anInt5460 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		Static275.method4162();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(28) int local28 = this.anInt5460 >> 1;
			@Pc(33) int[][] local33 = this.aClass194_41.method4740();
			@Pc(40) Random local40 = new Random((long) this.anInt5458);
			for (@Pc(42) int local42 = 0; local42 < this.anInt5461; local42++) {
				@Pc(65) int local65 = this.anInt5460 > 0 ? this.anInt5454 + Static207.method3275(this.anInt5460, local40) - local28 : this.anInt5454;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static207.method3275(Static62.anInt1350, local40);
				@Pc(81) int local81 = Static207.method3275(Static265.anInt5306, local40);
				@Pc(93) int local93 = local76 + (this.anInt5462 * Static170.anIntArray340[local71] >> 12);
				@Pc(105) int local105 = local81 + (this.anInt5462 * Static170.anIntArray341[local71] >> 12);
				@Pc(110) int local110 = local93 - local76;
				@Pc(115) int local115 = local105 - local81;
				if (local110 != 0 || local115 != 0) {
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local115 < 0) {
						local115 = -local115;
					}
					@Pc(148) boolean local148 = local110 < local115;
					@Pc(153) int local153;
					@Pc(157) int local157;
					if (local148) {
						local153 = local76;
						local76 = local81;
						local157 = local93;
						local81 = local153;
						local93 = local105;
						local105 = local157;
					}
					if (local76 > local93) {
						local153 = local76;
						local76 = local93;
						local157 = local81;
						local93 = local153;
						local81 = local105;
						local105 = local157;
					}
					local153 = local81;
					@Pc(186) int local186 = local105 - local81;
					if (local186 < 0) {
						local186 = -local186;
					}
					local157 = local93 - local76;
					@Pc(200) int local200 = 2048 / local157;
					@Pc(212) int local212 = 1024 - (Static207.method3275(4096, local40) >> 2);
					@Pc(223) int local223 = local81 >= local105 ? -1 : 1;
					@Pc(228) int local228 = -local157 / 2;
					for (@Pc(230) int local230 = local76; local230 < local93; local230++) {
						@Pc(241) int local241 = Static279.anInt5616 & local153;
						@Pc(252) int local252 = local200 * (local230 - local76) + local212 + 1024;
						@Pc(256) int local256 = local230 & Static302.anInt6003;
						if (local148) {
							local33[local241][local256] = local252;
						} else {
							local33[local256][local241] = local252;
						}
						local228 += local186;
						if (local228 > 0) {
							local228 += -local157;
							local153 += local223;
						}
					}
				}
			}
		}
		return local13;
	}
}
