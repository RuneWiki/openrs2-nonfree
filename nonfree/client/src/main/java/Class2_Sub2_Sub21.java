import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
	private int anInt3185 = 1;

	@OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
	private int anInt3178 = 1;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3185 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt3178 = arg0.method2122();
		} else if (arg1 == 2) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(31) int local31 = this.anInt3178 + this.anInt3178 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(38) int[][][] local38 = new int[local31][][];
			@Pc(46) int local46 = this.anInt3185 + this.anInt3185 + 1;
			@Pc(50) int local50 = 65536 / local46;
			@Pc(84) int local84;
			@Pc(74) int local74;
			for (@Pc(56) int local56 = arg0 - this.anInt3178; local56 <= arg0 + this.anInt3178; local56++) {
				@Pc(66) int[][] local66 = this.method3952(0, local56 & Static156.anInt3604);
				@Pc(68) int local68 = 0;
				@Pc(72) int[][] local72 = new int[3][Static54.anInt953];
				local74 = 0;
				@Pc(78) int[] local78 = local66[0];
				@Pc(82) int[] local82 = local66[2];
				local84 = 0;
				@Pc(88) int[] local88 = local66[1];
				for (@Pc(92) int local92 = -this.anInt3185; local92 <= this.anInt3185; local92++) {
					@Pc(98) int local98 = local92 & Static74.anInt1601;
					local84 += local88[local98];
					local68 += local78[local98];
					local74 += local82[local98];
				}
				@Pc(129) int[] local129 = local72[0];
				@Pc(133) int[] local133 = local72[1];
				@Pc(137) int[] local137 = local72[2];
				@Pc(139) int local139 = 0;
				while (Static54.anInt953 > local139) {
					local129[local139] = local50 * local68 >> 16;
					local133[local139] = local84 * local50 >> 16;
					local137[local139] = local50 * local74 >> 16;
					@Pc(173) int local173 = local139 - this.anInt3185 & Static74.anInt1601;
					local68 -= local78[local173];
					local139++;
					local74 -= local82[local173];
					local84 -= local88[local173];
					@Pc(199) int local199 = local139 + this.anInt3185 & Static74.anInt1601;
					local74 += local82[local199];
					local84 += local88[local199];
					local68 += local78[local199];
				}
				local38[this.anInt3178 + local56 - arg0] = local72;
			}
			@Pc(246) int[] local246 = local19[0];
			@Pc(250) int[] local250 = local19[1];
			@Pc(254) int[] local254 = local19[2];
			for (local84 = 0; local84 < Static54.anInt953; local84++) {
				local74 = 0;
				@Pc(262) int local262 = 0;
				@Pc(264) int local264 = 0;
				for (@Pc(266) int local266 = 0; local266 < local31; local266++) {
					@Pc(272) int[][] local272 = local38[local266];
					local264 += local272[1][local84];
					local262 += local272[2][local84];
					local74 += local272[0][local84];
				}
				local246[local84] = local35 * local74 >> 16;
				local250[local84] = local264 * local35 >> 16;
				local254[local84] = local262 * local35 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(29) int local29 = this.anInt3178 + this.anInt3178 + 1;
			@Pc(37) int local37 = this.anInt3185 + this.anInt3185 + 1;
			@Pc(41) int local41 = 65536 / local29;
			@Pc(45) int local45 = 65536 / local37;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(58) int local58;
			for (@Pc(54) int local54 = arg0 - this.anInt3178; local54 <= this.anInt3178 + arg0; local54++) {
				local58 = 0;
				@Pc(66) int[] local66 = this.method3955(0, Static156.anInt3604 & local54);
				for (@Pc(70) int local70 = -this.anInt3185; local70 <= this.anInt3185; local70++) {
					local58 += local66[local70 & Static74.anInt1601];
				}
				@Pc(88) int[] local88 = new int[Static54.anInt953];
				@Pc(90) int local90 = 0;
				while (Static54.anInt953 > local90) {
					local88[local90] = local45 * local58 >> 16;
					local58 -= local66[Static74.anInt1601 & local90 - this.anInt3185];
					local90++;
					local58 += local66[local90 + this.anInt3185 & Static74.anInt1601];
				}
				local48[this.anInt3178 + local54 - arg0] = local88;
			}
			for (@Pc(151) int local151 = 0; local151 < Static54.anInt953; local151++) {
				@Pc(155) int local155 = 0;
				for (local58 = 0; local58 < local29; local58++) {
					local155 += local48[local58][local151];
				}
				local16[local151] = local155 * local41 >> 16;
			}
		}
		return local16;
	}
}
