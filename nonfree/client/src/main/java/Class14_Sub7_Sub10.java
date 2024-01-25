import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class14_Sub7_Sub10 extends Class14_Sub7 {

	@OriginalMember(owner = "client!eka", name = "M", descriptor = "I")
	private int anInt2169 = 1;

	@OriginalMember(owner = "client!eka", name = "N", descriptor = "I")
	private int anInt2171 = 1;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(31) int local31 = this.anInt2169 + this.anInt2169 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt2171 + this.anInt2171 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local31][][];
			@Pc(76) int local76;
			@Pc(78) int local78;
			for (@Pc(56) int local56 = arg0 - this.anInt2169; local56 <= arg0 + this.anInt2169; local56++) {
				@Pc(68) int[][] local68 = this.method9384(Static660.anInt6757 & local56, 0);
				@Pc(72) int[][] local72 = new int[3][Static613.anInt10114];
				@Pc(74) int local74 = 0;
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local68[0];
				@Pc(86) int[] local86 = local68[1];
				@Pc(90) int[] local90 = local68[2];
				for (@Pc(94) int local94 = -this.anInt2171; local94 <= this.anInt2171; local94++) {
					@Pc(102) int local102 = Static677.anInt11036 & local94;
					local74 += local82[local102];
					local78 += local90[local102];
					local76 += local86[local102];
				}
				@Pc(129) int[] local129 = local72[0];
				@Pc(133) int[] local133 = local72[1];
				@Pc(137) int[] local137 = local72[2];
				@Pc(141) int local141 = 0;
				while (Static613.anInt10114 > local141) {
					local129[local141] = local74 * local48 >> 16;
					local133[local141] = local76 * local48 >> 16;
					local137[local141] = local48 * local78 >> 16;
					@Pc(177) int local177 = local141 - this.anInt2171 & Static677.anInt11036;
					local74 -= local82[local177];
					local78 -= local90[local177];
					local76 -= local86[local177];
					local141++;
					@Pc(203) int local203 = this.anInt2171 + local141 & Static677.anInt11036;
					local74 += local82[local203];
					local76 += local86[local203];
					local78 += local90[local203];
				}
				local51[local56 + this.anInt2169 - arg0] = local72;
			}
			@Pc(253) int[] local253 = local11[0];
			@Pc(257) int[] local257 = local11[1];
			@Pc(263) int[] local263 = local11[2];
			for (local76 = 0; local76 < Static613.anInt10114; local76++) {
				local78 = 0;
				@Pc(271) int local271 = 0;
				@Pc(273) int local273 = 0;
				for (@Pc(275) int local275 = 0; local275 < local31; local275++) {
					@Pc(281) int[][] local281 = local51[local275];
					local78 += local281[0][local76];
					local271 += local281[1][local76];
					local273 += local281[2][local76];
				}
				local253[local76] = local78 * local35 >> 16;
				local257[local76] = local271 * local35 >> 16;
				local263[local76] = local35 * local273 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(29) int local29 = this.anInt2169 + this.anInt2169 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt2171 + this.anInt2171 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt2169; local55 <= arg0 + this.anInt2169; local55++) {
				@Pc(65) int[] local65 = this.method9379(0, local55 & Static660.anInt6757);
				@Pc(68) int[] local68 = new int[Static613.anInt10114];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt2171; local74 <= this.anInt2171; local74++) {
					local70 += local65[Static677.anInt11036 & local74];
				}
				@Pc(95) int local95 = 0;
				while (Static613.anInt10114 > local95) {
					local68[local95] = local46 * local70 >> 16;
					local70 -= local65[local95 - this.anInt2171 & Static677.anInt11036];
					local95++;
					local70 += local65[this.anInt2171 + local95 & Static677.anInt11036];
				}
				local49[this.anInt2169 + local55 - arg0] = local68;
			}
			for (@Pc(166) int local166 = 0; local166 < Static613.anInt10114; local166++) {
				@Pc(170) int local170 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local170 += local49[local70][local166];
				}
				local17[local166] = local33 * local170 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt2171 = arg1.method7695(103);
		} else if (arg0 == 1) {
			this.anInt2169 = arg1.method7695(127);
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method7695(118) == 1;
		}
	}
}
