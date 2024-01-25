import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class6_Sub3_Sub28 extends Class6_Sub3 {

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
	private int anInt6709 = 1;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
	private int anInt6710 = 1;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6710 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt6709 = arg1.method6019();
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(29) int local29 = this.anInt6709 + this.anInt6709 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt6710 + this.anInt6710 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt6709; local55 <= arg0 + this.anInt6709; local55++) {
				@Pc(65) int[] local65 = this.method7950(0, Static132.anInt2511 & local55);
				@Pc(68) int[] local68 = new int[Static35.anInt670];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt6710; local74 <= this.anInt6710; local74++) {
					local70 += local65[local74 & Static147.anInt2781];
				}
				@Pc(91) int local91 = 0;
				while (Static35.anInt670 > local91) {
					local68[local91] = local70 * local46 >> 16;
					local70 -= local65[Static147.anInt2781 & local91 - this.anInt6710];
					local91++;
					local70 += local65[Static147.anInt2781 & local91 + this.anInt6710];
				}
				local49[local55 + this.anInt6709 - arg0] = local68;
			}
			for (@Pc(150) int local150 = 0; local150 < Static35.anInt670; local150++) {
				@Pc(154) int local154 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local154 += local49[local70][local150];
				}
				local11[local150] = local154 * local33 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(23) int local23 = this.anInt6709 + this.anInt6709 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt6710 + this.anInt6710 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(66) int local66;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt6709; local48 <= this.anInt6709 + arg0; local48++) {
				@Pc(58) int[][] local58 = this.method7961(local48 & Static132.anInt2511, 0);
				@Pc(62) int[][] local62 = new int[3][Static35.anInt670];
				@Pc(64) int local64 = 0;
				local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt6710; local84 <= this.anInt6710; local84++) {
					@Pc(90) int local90 = Static147.anInt2781 & local84;
					local66 += local76[local90];
					local64 += local72[local90];
					local68 += local80[local90];
				}
				@Pc(121) int[] local121 = local62[0];
				@Pc(125) int[] local125 = local62[1];
				@Pc(129) int[] local129 = local62[2];
				@Pc(131) int local131 = 0;
				while (Static35.anInt670 > local131) {
					local121[local131] = local64 * local39 >> 16;
					local125[local131] = local39 * local66 >> 16;
					local129[local131] = local68 * local39 >> 16;
					@Pc(164) int local164 = Static147.anInt2781 & local131 - this.anInt6710;
					local131++;
					local68 -= local80[local164];
					local64 -= local72[local164];
					local66 -= local76[local164];
					@Pc(190) int local190 = Static147.anInt2781 & this.anInt6710 + local131;
					local66 += local76[local190];
					local68 += local80[local190];
					local64 += local72[local190];
				}
				local42[this.anInt6709 + local48 - arg0] = local62;
			}
			@Pc(236) int[] local236 = local11[0];
			@Pc(240) int[] local240 = local11[1];
			@Pc(244) int[] local244 = local11[2];
			for (local66 = 0; local66 < Static35.anInt670; local66++) {
				local68 = 0;
				@Pc(252) int local252 = 0;
				@Pc(254) int local254 = 0;
				for (@Pc(256) int local256 = 0; local256 < local23; local256++) {
					@Pc(262) int[][] local262 = local42[local256];
					local68 += local262[0][local66];
					local252 += local262[1][local66];
					local254 += local262[2][local66];
				}
				local236[local66] = local68 * local27 >> 16;
				local240[local66] = local252 * local27 >> 16;
				local244[local66] = local27 * local254 >> 16;
			}
		}
		return local11;
	}
}
