import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!eda", name = "D", descriptor = "I")
	private int anInt2562 = 1;

	@OriginalMember(owner = "client!eda", name = "H", descriptor = "I")
	private int anInt2563 = 1;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(23) int local23 = this.anInt2562 + this.anInt2562 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt2563 + this.anInt2563 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(68) int local68;
			@Pc(70) int local70;
			for (@Pc(48) int local48 = arg0 - this.anInt2562; local48 <= arg0 + this.anInt2562; local48++) {
				@Pc(60) int[][] local60 = this.method9212(0, local48 & Static599.anInt9773);
				@Pc(64) int[][] local64 = new int[3][Static636.anInt10302];
				@Pc(66) int local66 = 0;
				local68 = 0;
				local70 = 0;
				@Pc(74) int[] local74 = local60[0];
				@Pc(78) int[] local78 = local60[1];
				@Pc(82) int[] local82 = local60[2];
				for (@Pc(86) int local86 = -this.anInt2563; local86 <= this.anInt2563; local86++) {
					@Pc(94) int local94 = Static144.anInt2744 & local86;
					local66 += local74[local94];
					local68 += local78[local94];
					local70 += local82[local94];
				}
				@Pc(121) int[] local121 = local64[0];
				@Pc(125) int[] local125 = local64[1];
				@Pc(129) int[] local129 = local64[2];
				@Pc(133) int local133 = 0;
				while (local133 < Static636.anInt10302) {
					local121[local133] = local66 * local39 >> 16;
					local125[local133] = local39 * local68 >> 16;
					local129[local133] = local70 * local39 >> 16;
					@Pc(169) int local169 = Static144.anInt2744 & local133 - this.anInt2563;
					local70 -= local82[local169];
					local68 -= local78[local169];
					local66 -= local74[local169];
					local133++;
					@Pc(195) int local195 = this.anInt2563 + local133 & Static144.anInt2744;
					local66 += local74[local195];
					local70 += local82[local195];
					local68 += local78[local195];
				}
				local42[local48 + this.anInt2562 - arg0] = local64;
			}
			@Pc(241) int[] local241 = local11[0];
			@Pc(245) int[] local245 = local11[1];
			@Pc(251) int[] local251 = local11[2];
			for (local68 = 0; local68 < Static636.anInt10302; local68++) {
				local70 = 0;
				@Pc(259) int local259 = 0;
				@Pc(261) int local261 = 0;
				for (@Pc(263) int local263 = 0; local263 < local23; local263++) {
					@Pc(269) int[][] local269 = local42[local263];
					local259 += local269[1][local68];
					local261 += local269[2][local68];
					local70 += local269[0][local68];
				}
				local241[local68] = local70 * local27 >> 16;
				local245[local68] = local259 * local27 >> 16;
				local251[local68] = local261 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt2563 = arg1.method5322(-94);
		} else if (arg0 == 1) {
			this.anInt2562 = arg1.method5322(-41);
		} else if (arg0 == 2) {
			super.aBoolean794 = arg1.method5322(-95) == 1;
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(29) int local29 = this.anInt2562 + this.anInt2562 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt2563 + this.anInt2563 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt2562; local54 <= arg0 + this.anInt2562; local54++) {
				@Pc(64) int[] local64 = this.method9204(Static599.anInt9773 & local54, 0);
				@Pc(67) int[] local67 = new int[Static636.anInt10302];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt2563; local73 <= this.anInt2563; local73++) {
					local69 += local64[local73 & Static144.anInt2744];
				}
				@Pc(94) int local94 = 0;
				while (Static636.anInt10302 > local94) {
					local67[local94] = local69 * local46 >> 16;
					local69 -= local64[Static144.anInt2744 & local94 - this.anInt2563];
					local94++;
					local69 += local64[Static144.anInt2744 & local94 + this.anInt2563];
				}
				local49[local54 + this.anInt2562 - arg0] = local67;
			}
			for (@Pc(161) int local161 = 0; local161 < Static636.anInt10302; local161++) {
				@Pc(165) int local165 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local165 += local49[local69][local161];
				}
				local11[local161] = local165 * local33 >> 16;
			}
		}
		return local11;
	}
}
