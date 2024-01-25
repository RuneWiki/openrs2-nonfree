import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class3_Sub9_Sub13 extends Class3_Sub9 {

	@OriginalMember(owner = "client!fga", name = "C", descriptor = "I")
	private int anInt3209 = 1;

	@OriginalMember(owner = "client!fga", name = "P", descriptor = "I")
	private int anInt3215 = 1;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(23) int local23 = this.anInt3215 + this.anInt3215 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt3209 + this.anInt3209 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(62) int local62;
			for (@Pc(47) int local47 = arg0 - this.anInt3215; local47 <= this.anInt3215 + arg0; local47++) {
				@Pc(57) int[] local57 = this.method9162(Static636.anInt10126 & local47, 0);
				@Pc(60) int[] local60 = new int[Static62.anInt1251];
				local62 = 0;
				for (@Pc(66) int local66 = -this.anInt3209; local66 <= this.anInt3209; local66++) {
					local62 += local57[local66 & Static302.anInt5067];
				}
				@Pc(87) int local87 = 0;
				while (local87 < Static62.anInt1251) {
					local60[local87] = local39 * local62 >> 16;
					local62 -= local57[Static302.anInt5067 & local87 - this.anInt3209];
					local87++;
					local62 += local57[Static302.anInt5067 & local87 + this.anInt3209];
				}
				local42[this.anInt3215 + local47 - arg0] = local60;
			}
			for (@Pc(143) int local143 = 0; local143 < Static62.anInt1251; local143++) {
				@Pc(147) int local147 = 0;
				for (local62 = 0; local62 < local23; local62++) {
					local147 += local42[local62][local143];
				}
				local11[local143] = local27 * local147 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(31) int local31 = this.anInt3215 + this.anInt3215 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt3209 + this.anInt3209 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(76) int local76;
			@Pc(78) int local78;
			for (@Pc(56) int local56 = arg0 - this.anInt3215; local56 <= arg0 + this.anInt3215; local56++) {
				@Pc(68) int[][] local68 = this.method9167(0, Static636.anInt10126 & local56);
				@Pc(72) int[][] local72 = new int[3][Static62.anInt1251];
				@Pc(74) int local74 = 0;
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[1];
				@Pc(90) int[] local90 = local68[2];
				for (@Pc(94) int local94 = -this.anInt3209; local94 <= this.anInt3209; local94++) {
					@Pc(100) int local100 = Static302.anInt5067 & local94;
					local74 += local82[local100];
					local76 += local86[local100];
					local78 += local90[local100];
				}
				@Pc(131) int[] local131 = local72[0];
				@Pc(135) int[] local135 = local72[1];
				@Pc(139) int[] local139 = local72[2];
				@Pc(141) int local141 = 0;
				while (local141 < Static62.anInt1251) {
					local131[local141] = local47 * local74 >> 16;
					local135[local141] = local76 * local47 >> 16;
					local139[local141] = local47 * local78 >> 16;
					@Pc(174) int local174 = Static302.anInt5067 & local141 - this.anInt3209;
					local141++;
					local78 -= local90[local174];
					local74 -= local82[local174];
					local76 -= local86[local174];
					@Pc(200) int local200 = Static302.anInt5067 & this.anInt3209 + local141;
					local74 += local82[local200];
					local76 += local86[local200];
					local78 += local90[local200];
				}
				local50[local56 + this.anInt3215 - arg0] = local72;
			}
			@Pc(249) int[] local249 = local19[0];
			@Pc(253) int[] local253 = local19[1];
			@Pc(257) int[] local257 = local19[2];
			for (local76 = 0; local76 < Static62.anInt1251; local76++) {
				local78 = 0;
				@Pc(265) int local265 = 0;
				@Pc(267) int local267 = 0;
				for (@Pc(269) int local269 = 0; local269 < local31; local269++) {
					@Pc(275) int[][] local275 = local50[local269];
					local78 += local275[0][local76];
					local267 += local275[2][local76];
					local265 += local275[1][local76];
				}
				local249[local76] = local35 * local78 >> 16;
				local253[local76] = local35 * local265 >> 16;
				local257[local76] = local267 * local35 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3209 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt3215 = arg0.method8632();
		} else if (arg1 == 2) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}
}
