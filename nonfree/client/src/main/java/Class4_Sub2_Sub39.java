import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class4_Sub2_Sub39 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
	private int anInt10396 = 0;

	@OriginalMember(owner = "client!wea", name = "N", descriptor = "I")
	private int anInt10399 = 16;

	@OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
	private int anInt10389 = 4096;

	@OriginalMember(owner = "client!wea", name = "G", descriptor = "I")
	private int anInt10392 = 0;

	@OriginalMember(owner = "client!wea", name = "E", descriptor = "I")
	private int anInt10390 = 2000;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt10392 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt10390 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt10399 = arg1.method8865();
		} else if (arg0 == 3) {
			this.anInt10396 = arg1.method8859();
		} else if (arg0 == 4) {
			this.anInt10389 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		Static282.method4074();
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(24) int local24 = this.anInt10389 >> 1;
			@Pc(29) int[][] local29 = super.aClass271_41.method6063();
			@Pc(36) Random local36 = new Random((long) this.anInt10392);
			for (@Pc(38) int local38 = 0; local38 < this.anInt10390; local38++) {
				@Pc(58) int local58 = this.anInt10389 <= 0 ? this.anInt10396 : this.anInt10396 + Static149.method2598(local36, this.anInt10389) - local24;
				@Pc(64) int local64 = local58 >> 4 & 0xFF;
				@Pc(69) int local69 = Static149.method2598(local36, Static269.anInt4330);
				@Pc(74) int local74 = Static149.method2598(local36, Static355.anInt5410);
				@Pc(85) int local85 = local69 + (this.anInt10399 * Static190.anIntArray170[local64] >> 12);
				@Pc(96) int local96 = (this.anInt10399 * Static181.anIntArray229[local64] >> 12) + local74;
				@Pc(101) int local101 = local96 - local74;
				@Pc(106) int local106 = local85 - local69;
				if (local106 != 0 || local101 != 0) {
					if (local101 < 0) {
						local101 = -local101;
					}
					if (local106 < 0) {
						local106 = -local106;
					}
					@Pc(137) boolean local137 = local106 < local101;
					@Pc(141) int local141;
					@Pc(145) int local145;
					if (local137) {
						local141 = local69;
						local69 = local74;
						local145 = local85;
						local85 = local96;
						local74 = local141;
						local96 = local145;
					}
					if (local85 < local69) {
						local141 = local69;
						local145 = local74;
						local69 = local85;
						local74 = local96;
						local85 = local141;
						local96 = local145;
					}
					local141 = local74;
					local145 = local85 - local69;
					@Pc(182) int local182 = local96 - local74;
					@Pc(187) int local187 = -local145 / 2;
					@Pc(191) int local191 = 2048 / local145;
					@Pc(203) int local203 = 1024 - (Static149.method2598(local36, 4096) >> 2);
					@Pc(214) int local214 = local96 <= local74 ? -1 : 1;
					if (local182 < 0) {
						local182 = -local182;
					}
					for (@Pc(224) int local224 = local69; local224 < local85; local224++) {
						@Pc(237) int local237 = (local224 - local69) * local191 + local203 + 1024;
						@Pc(241) int local241 = local224 & Static215.anInt3481;
						@Pc(245) int local245 = local141 & Static489.anInt7677;
						local187 += local182;
						if (local137) {
							local29[local245][local241] = local237;
						} else {
							local29[local241][local245] = local237;
						}
						if (local187 > 0) {
							local141 += local214;
							local187 += -local145;
						}
					}
				}
			}
		}
		return local15;
	}
}
