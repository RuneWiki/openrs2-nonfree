import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class6_Sub1_Sub23 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
	private int anInt3759 = 1;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	private int anInt3758 = 1;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(31) int local31 = this.anInt3758 + this.anInt3758 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt3759 + this.anInt3759 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt3758; local55 <= arg0 + this.anInt3758; local55++) {
				@Pc(65) int[] local65 = this.method5609(0, local55 & Static113.anInt2099);
				@Pc(68) int[] local68 = new int[Static299.anInt5659];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt3759; local74 <= this.anInt3759; local74++) {
					local70 += local65[Static76.anInt2850 & local74];
				}
				@Pc(91) int local91 = 0;
				while (Static299.anInt5659 > local91) {
					local68[local91] = local47 * local70 >> 16;
					local70 -= local65[local91 - this.anInt3759 & Static76.anInt2850];
					local91++;
					local70 += local65[Static76.anInt2850 & this.anInt3759 + local91];
				}
				local50[local55 + this.anInt3758 - arg0] = local68;
			}
			for (@Pc(148) int local148 = 0; local148 < Static299.anInt5659; local148++) {
				@Pc(152) int local152 = 0;
				for (local70 = 0; local70 < local31; local70++) {
					local152 += local50[local70][local148];
				}
				local19[local148] = local152 * local35 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(33) int local33 = this.anInt3758 + this.anInt3758 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(45) int local45 = this.anInt3759 + this.anInt3759 + 1;
			@Pc(49) int local49 = 65536 / local45;
			@Pc(52) int[][][] local52 = new int[local33][][];
			@Pc(76) int local76;
			@Pc(78) int local78;
			for (@Pc(58) int local58 = arg0 - this.anInt3758; local58 <= arg0 + this.anInt3758; local58++) {
				@Pc(68) int[][] local68 = this.method5618(Static113.anInt2099 & local58, 0);
				@Pc(72) int[][] local72 = new int[3][Static299.anInt5659];
				@Pc(74) int local74 = 0;
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[1];
				@Pc(90) int[] local90 = local68[2];
				for (@Pc(94) int local94 = -this.anInt3759; local94 <= this.anInt3759; local94++) {
					@Pc(100) int local100 = Static76.anInt2850 & local94;
					local74 += local82[local100];
					local76 += local86[local100];
					local78 += local90[local100];
				}
				@Pc(131) int[] local131 = local72[0];
				@Pc(135) int[] local135 = local72[1];
				@Pc(139) int[] local139 = local72[2];
				@Pc(141) int local141 = 0;
				while (Static299.anInt5659 > local141) {
					local131[local141] = local74 * local49 >> 16;
					local135[local141] = local76 * local49 >> 16;
					local139[local141] = local49 * local78 >> 16;
					@Pc(175) int local175 = local141 - this.anInt3759 & Static76.anInt2850;
					local74 -= local82[local175];
					local78 -= local90[local175];
					local141++;
					local76 -= local86[local175];
					@Pc(201) int local201 = Static76.anInt2850 & this.anInt3759 + local141;
					local76 += local86[local201];
					local74 += local82[local201];
					local78 += local90[local201];
				}
				local52[local58 + this.anInt3758 - arg0] = local72;
			}
			@Pc(248) int[] local248 = local21[0];
			@Pc(252) int[] local252 = local21[1];
			@Pc(256) int[] local256 = local21[2];
			for (local76 = 0; local76 < Static299.anInt5659; local76++) {
				local78 = 0;
				@Pc(264) int local264 = 0;
				@Pc(266) int local266 = 0;
				for (@Pc(268) int local268 = 0; local268 < local33; local268++) {
					@Pc(274) int[][] local274 = local52[local268];
					local78 += local274[0][local76];
					local266 += local274[2][local76];
					local264 += local274[1][local76];
				}
				local248[local76] = local37 * local78 >> 16;
				local252[local76] = local264 * local37 >> 16;
				local256[local76] = local266 * local37 >> 16;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3759 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt3758 = arg0.method3972();
		} else if (arg1 == 2) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}
}
