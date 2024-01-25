import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
	private int anInt6138 = 1;

	@OriginalMember(owner = "client!rs", name = "V", descriptor = "I")
	private int anInt6143 = 1;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6138 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt6143 = arg1.method3737();
		} else if (arg0 == 2) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(29) int local29 = this.anInt6143 + this.anInt6143 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt6138 + this.anInt6138 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt6143; local55 <= this.anInt6143 + arg0; local55++) {
				@Pc(65) int[] local65 = this.method6037(local55 & Static36.anInt893, 0);
				@Pc(68) int[] local68 = new int[Static131.anInt2581];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt6138; local74 <= this.anInt6138; local74++) {
					local70 += local65[local74 & Static287.anInt5227];
				}
				@Pc(95) int local95 = 0;
				while (local95 < Static131.anInt2581) {
					local68[local95] = local70 * local46 >> 16;
					local70 -= local65[Static287.anInt5227 & local95 - this.anInt6138];
					local95++;
					local70 += local65[Static287.anInt5227 & this.anInt6138 + local95];
				}
				local49[local55 + this.anInt6143 - arg0] = local68;
			}
			for (@Pc(150) int local150 = 0; local150 < Static131.anInt2581; local150++) {
				@Pc(154) int local154 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local154 += local49[local70][local150];
				}
				local11[local150] = local154 * local33 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(24) int local24 = this.anInt6143 + this.anInt6143 + 1;
			@Pc(28) int local28 = 65536 / local24;
			@Pc(37) int local37 = this.anInt6138 + this.anInt6138 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][][] local44 = new int[local24][][];
			@Pc(68) int local68;
			@Pc(70) int local70;
			for (@Pc(50) int local50 = arg0 - this.anInt6143; local50 <= arg0 + this.anInt6143; local50++) {
				@Pc(60) int[][] local60 = this.method6031(0, Static36.anInt893 & local50);
				@Pc(64) int[][] local64 = new int[3][Static131.anInt2581];
				@Pc(66) int local66 = 0;
				local68 = 0;
				local70 = 0;
				@Pc(74) int[] local74 = local60[0];
				@Pc(78) int[] local78 = local60[1];
				@Pc(82) int[] local82 = local60[2];
				for (@Pc(86) int local86 = -this.anInt6138; local86 <= this.anInt6138; local86++) {
					@Pc(92) int local92 = Static287.anInt5227 & local86;
					local66 += local74[local92];
					local70 += local82[local92];
					local68 += local78[local92];
				}
				@Pc(123) int[] local123 = local64[0];
				@Pc(127) int[] local127 = local64[1];
				@Pc(131) int[] local131 = local64[2];
				@Pc(133) int local133 = 0;
				while (Static131.anInt2581 > local133) {
					local123[local133] = local41 * local66 >> 16;
					local127[local133] = local41 * local68 >> 16;
					local131[local133] = local70 * local41 >> 16;
					@Pc(167) int local167 = local133 - this.anInt6138 & Static287.anInt5227;
					local66 -= local74[local167];
					local68 -= local78[local167];
					local133++;
					local70 -= local82[local167];
					@Pc(193) int local193 = Static287.anInt5227 & this.anInt6138 + local133;
					local70 += local82[local193];
					local68 += local78[local193];
					local66 += local74[local193];
				}
				local44[this.anInt6143 + local50 - arg0] = local64;
			}
			@Pc(239) int[] local239 = local11[0];
			@Pc(243) int[] local243 = local11[1];
			@Pc(247) int[] local247 = local11[2];
			for (local68 = 0; local68 < Static131.anInt2581; local68++) {
				local70 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local24; local259++) {
					@Pc(265) int[][] local265 = local44[local259];
					local255 += local265[1][local68];
					local70 += local265[0][local68];
					local257 += local265[2][local68];
				}
				local239[local68] = local70 * local28 >> 16;
				local243[local68] = local255 * local28 >> 16;
				local247[local68] = local257 * local28 >> 16;
			}
		}
		return local11;
	}
}
