import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!c", name = "V", descriptor = "I")
	private int anInt482;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt482 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt484 = arg1.method1461();
		} else if (arg0 == 2) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(31) int local31 = this.anInt484 + this.anInt484 + 1;
			@Pc(39) int local39 = this.anInt482 + this.anInt482 + 1;
			@Pc(42) int[][] local42 = new int[local31][];
			@Pc(65) int local65;
			for (@Pc(48) int local48 = arg0 - this.anInt484; local48 <= this.anInt484 + arg0; local48++) {
				@Pc(60) int[] local60 = this.method2573(local48 & Static75.anInt1778, 0);
				@Pc(63) int[] local63 = new int[Static149.anInt3233];
				local65 = 0;
				for (@Pc(69) int local69 = -this.anInt482; local69 <= this.anInt482; local69++) {
					local65 += local60[Static145.anInt2636 & local69];
				}
				@Pc(86) int local86 = 0;
				while (local86 < Static149.anInt3233) {
					local63[local86] = local65 / local39;
					local65 -= local60[Static145.anInt2636 & local86 - this.anInt482];
					local86++;
					local65 += local60[Static145.anInt2636 & this.anInt482 + local86];
				}
				local42[local48 + this.anInt484 - arg0] = local63;
			}
			for (@Pc(143) int local143 = 0; local143 < Static149.anInt3233; local143++) {
				@Pc(147) int local147 = 0;
				for (local65 = 0; local65 < local31; local65++) {
					local147 += local42[local65][local143];
				}
				local15[local143] = local147 / local31;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(28) int local28 = this.anInt484 + this.anInt484 + 1;
			@Pc(36) int local36 = this.anInt482 + this.anInt482 + 1;
			@Pc(39) int[][][] local39 = new int[local28][][];
			@Pc(59) int local59;
			@Pc(65) int local65;
			for (@Pc(45) int local45 = arg0 - this.anInt484; local45 <= arg0 + this.anInt484; local45++) {
				@Pc(55) int[][] local55 = this.method2582(0, Static75.anInt1778 & local45);
				@Pc(57) int local57 = 0;
				local59 = 0;
				@Pc(63) int[][] local63 = new int[3][Static149.anInt3233];
				local65 = 0;
				@Pc(69) int[] local69 = local55[0];
				@Pc(73) int[] local73 = local55[1];
				@Pc(77) int[] local77 = local55[2];
				for (@Pc(81) int local81 = -this.anInt482; local81 <= this.anInt482; local81++) {
					@Pc(87) int local87 = local81 & Static145.anInt2636;
					local59 += local73[local87];
					local57 += local69[local87];
					local65 += local77[local87];
				}
				@Pc(114) int[] local114 = local63[0];
				@Pc(118) int[] local118 = local63[2];
				@Pc(122) int[] local122 = local63[1];
				@Pc(124) int local124 = 0;
				while (local124 < Static149.anInt3233) {
					local114[local124] = local57 / local36;
					local122[local124] = local59 / local36;
					local118[local124] = local65 / local36;
					@Pc(151) int local151 = local124 - this.anInt482 & Static145.anInt2636;
					local65 -= local77[local151];
					local57 -= local69[local151];
					local124++;
					local59 -= local73[local151];
					@Pc(178) int local178 = Static145.anInt2636 & local124 + this.anInt482;
					local57 += local69[local178];
					local65 += local77[local178];
					local59 += local73[local178];
				}
				local39[this.anInt484 + local45 - arg0] = local63;
			}
			@Pc(224) int[] local224 = local7[2];
			@Pc(228) int[] local228 = local7[1];
			@Pc(232) int[] local232 = local7[0];
			for (local59 = 0; local59 < Static149.anInt3233; local59++) {
				local65 = 0;
				@Pc(240) int local240 = 0;
				@Pc(242) int local242 = 0;
				for (@Pc(244) int local244 = 0; local244 < local28; local244++) {
					@Pc(250) int[][] local250 = local39[local244];
					local240 += local250[1][local59];
					local65 += local250[0][local59];
					local242 += local250[2][local59];
				}
				local232[local59] = local65 / local28;
				local228[local59] = local240 / local28;
				local224[local59] = local242 / local28;
			}
		}
		return local7;
	}
}
