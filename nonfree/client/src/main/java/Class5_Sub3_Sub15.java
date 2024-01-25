import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class5_Sub3_Sub15 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
	private int anInt2966 = 1;

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
	private int anInt2970 = 1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(23) int local23 = this.anInt2966 + this.anInt2966 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt2970 + this.anInt2970 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(66) int local66;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt2966; local48 <= arg0 + this.anInt2966; local48++) {
				@Pc(58) int[][] local58 = this.method6023(0, local48 & Static221.anInt4359);
				@Pc(62) int[][] local62 = new int[3][Static7.anInt129];
				@Pc(64) int local64 = 0;
				local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt2970; local84 <= this.anInt2970; local84++) {
					@Pc(90) int local90 = local84 & Static177.anInt3515;
					local66 += local76[local90];
					local64 += local72[local90];
					local68 += local80[local90];
				}
				@Pc(121) int[] local121 = local62[0];
				@Pc(125) int[] local125 = local62[1];
				@Pc(129) int[] local129 = local62[2];
				@Pc(131) int local131 = 0;
				while (local131 < Static7.anInt129) {
					local121[local131] = local64 * local39 >> 16;
					local125[local131] = local66 * local39 >> 16;
					local129[local131] = local39 * local68 >> 16;
					@Pc(165) int local165 = local131 - this.anInt2970 & Static177.anInt3515;
					local131++;
					local64 -= local72[local165];
					local66 -= local76[local165];
					local68 -= local80[local165];
					@Pc(191) int local191 = this.anInt2970 + local131 & Static177.anInt3515;
					local64 += local72[local191];
					local66 += local76[local191];
					local68 += local80[local191];
				}
				local42[local48 + this.anInt2966 - arg0] = local62;
			}
			@Pc(239) int[] local239 = local11[0];
			@Pc(243) int[] local243 = local11[1];
			@Pc(247) int[] local247 = local11[2];
			for (local66 = 0; local66 < Static7.anInt129; local66++) {
				local68 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local23; local259++) {
					@Pc(265) int[][] local265 = local42[local259];
					local255 += local265[1][local66];
					local257 += local265[2][local66];
					local68 += local265[0][local66];
				}
				local239[local66] = local27 * local68 >> 16;
				local243[local66] = local27 * local255 >> 16;
				local247[local66] = local257 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2970 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt2966 = arg0.method5115();
		} else if (arg1 == 2) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(28) int local28 = this.anInt2966 + this.anInt2966 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt2970 + this.anInt2970 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(70) int local70;
			for (@Pc(53) int local53 = arg0 - this.anInt2966; local53 <= this.anInt2966 + arg0; local53++) {
				@Pc(65) int[] local65 = this.method6020(0, Static221.anInt4359 & local53);
				@Pc(68) int[] local68 = new int[Static7.anInt129];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt2970; local74 <= this.anInt2970; local74++) {
					local70 += local65[local74 & Static177.anInt3515];
				}
				@Pc(91) int local91 = 0;
				while (local91 < Static7.anInt129) {
					local68[local91] = local44 * local70 >> 16;
					local70 -= local65[local91 - this.anInt2970 & Static177.anInt3515];
					local91++;
					local70 += local65[Static177.anInt3515 & local91 + this.anInt2970];
				}
				local47[local53 + this.anInt2966 - arg0] = local68;
			}
			for (@Pc(155) int local155 = 0; local155 < Static7.anInt129; local155++) {
				@Pc(159) int local159 = 0;
				for (local70 = 0; local70 < local28; local70++) {
					local159 += local47[local70][local155];
				}
				local16[local155] = local32 * local159 >> 16;
			}
		}
		return local16;
	}
}
