import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class14_Sub3_Sub19 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
	private int anInt2972 = 0;

	@OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
	private int anInt2975 = 4096;

	@OriginalMember(owner = "client!ir", name = "W", descriptor = "I")
	private int anInt2980 = 2000;

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
	private int anInt2973 = 0;

	@OriginalMember(owner = "client!ir", name = "Q", descriptor = "I")
	private int anInt2977 = 16;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(20) int local20 = this.anInt2975 >> 1;
			@Pc(25) int[][] local25 = super.aClass157_41.method4023();
			@Pc(32) Random local32 = new Random((long) this.anInt2972);
			for (@Pc(34) int local34 = 0; local34 < this.anInt2980; local34++) {
				@Pc(58) int local58 = this.anInt2975 > 0 ? this.anInt2973 + Static193.method3664(local32, this.anInt2975) - local20 : this.anInt2973;
				@Pc(64) int local64 = local58 >> 4 & 0xFF;
				@Pc(69) int local69 = Static193.method3664(local32, Static294.anInt5657);
				@Pc(74) int local74 = Static193.method3664(local32, Static65.anInt5731);
				@Pc(85) int local85 = local69 + (this.anInt2977 * Static153.anIntArray287[local64] >> 12);
				@Pc(96) int local96 = local74 + (Static345.anIntArray635[local64] * this.anInt2977 >> 12);
				@Pc(101) int local101 = local96 - local74;
				@Pc(105) int local105 = local85 - local69;
				if (local105 != 0 || local101 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local101 < 0) {
						local101 = -local101;
					}
					@Pc(142) boolean local142 = local105 < local101;
					@Pc(146) int local146;
					@Pc(148) int local148;
					if (local142) {
						local146 = local69;
						local148 = local85;
						local69 = local74;
						local85 = local96;
						local74 = local146;
						local96 = local148;
					}
					if (local85 < local69) {
						local146 = local69;
						local69 = local85;
						local148 = local74;
						local74 = local96;
						local85 = local146;
						local96 = local148;
					}
					local146 = local74;
					local148 = local85 - local69;
					@Pc(187) int local187 = local96 - local74;
					@Pc(192) int local192 = -local148 / 2;
					@Pc(196) int local196 = 2048 / local148;
					@Pc(206) int local206 = 1024 - (Static193.method3664(local32, 4096) >> 2);
					@Pc(213) int local213 = local96 <= local74 ? -1 : 1;
					if (local187 < 0) {
						local187 = -local187;
					}
					for (@Pc(223) int local223 = local69; local223 < local85; local223++) {
						@Pc(236) int local236 = (local223 - local69) * local196 + local206 + 1024;
						@Pc(240) int local240 = Static329.anInt6352 & local223;
						@Pc(244) int local244 = Static179.anInt3689 & local146;
						local192 += local187;
						if (local142) {
							local25[local244][local240] = local236;
						} else {
							local25[local240][local244] = local236;
						}
						if (local192 > 0) {
							local146 -= -local213;
							local192 += -local148;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2972 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt2980 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt2977 = arg0.method2548();
		} else if (arg1 == 3) {
			this.anInt2973 = arg0.method2498();
		} else if (arg1 == 4) {
			this.anInt2975 = arg0.method2498();
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		Static74.method4762();
	}
}
