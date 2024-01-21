import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub5_Sub23 extends Class1_Sub5 {

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
	private int anInt2666;

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
	private int anInt2673;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(31) int local31 = this.anInt2673 + this.anInt2673 + 1;
			@Pc(39) int local39 = this.anInt2666 + this.anInt2666 + 1;
			@Pc(42) int[][] local42 = new int[local31][];
			@Pc(62) int local62;
			for (@Pc(48) int local48 = arg0 - this.anInt2673; local48 <= this.anInt2673 + arg0; local48++) {
				@Pc(60) int[] local60 = this.method3145(0, local48 & Static151.anInt3420);
				local62 = 0;
				@Pc(65) int[] local65 = new int[Static177.anInt4018];
				for (@Pc(69) int local69 = -this.anInt2666; local69 <= this.anInt2666; local69++) {
					local62 += local60[Static47.anInt1130 & local69];
				}
				@Pc(90) int local90 = 0;
				while (Static177.anInt4018 > local90) {
					local65[local90] = local62 / local39;
					local62 -= local60[Static47.anInt1130 & local90 - this.anInt2666];
					local90++;
					local62 += local60[local90 + this.anInt2666 & Static47.anInt1130];
				}
				local42[local48 + this.anInt2673 - arg0] = local65;
			}
			for (@Pc(144) int local144 = 0; local144 < Static177.anInt4018; local144++) {
				@Pc(148) int local148 = 0;
				for (local62 = 0; local62 < local31; local62++) {
					local148 += local42[local62][local144];
				}
				local19[local144] = local148 / local31;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(31) int local31 = this.anInt2673 + this.anInt2673 + 1;
			@Pc(39) int local39 = this.anInt2666 + this.anInt2666 + 1;
			@Pc(42) int[][][] local42 = new int[local31][][];
			@Pc(60) int local60;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt2673; local48 <= this.anInt2673 + arg0; local48++) {
				@Pc(58) int[][] local58 = this.method3144(Static151.anInt3420 & local48, 0);
				local60 = 0;
				@Pc(64) int[][] local64 = new int[3][Static177.anInt4018];
				@Pc(66) int local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt2666; local84 <= this.anInt2666; local84++) {
					@Pc(90) int local90 = local84 & Static47.anInt1130;
					local66 += local72[local90];
					local68 += local80[local90];
					local60 += local76[local90];
				}
				@Pc(121) int[] local121 = local64[0];
				@Pc(125) int[] local125 = local64[1];
				@Pc(129) int[] local129 = local64[2];
				@Pc(131) int local131 = 0;
				while (Static177.anInt4018 > local131) {
					local121[local131] = local66 / local39;
					local125[local131] = local60 / local39;
					local129[local131] = local68 / local39;
					@Pc(159) int local159 = Static47.anInt1130 & local131 - this.anInt2666;
					local68 -= local80[local159];
					local131++;
					local66 -= local72[local159];
					local60 -= local76[local159];
					@Pc(185) int local185 = Static47.anInt1130 & this.anInt2666 + local131;
					local68 += local80[local185];
					local66 += local72[local185];
					local60 += local76[local185];
				}
				local42[this.anInt2673 + local48 - arg0] = local64;
			}
			@Pc(234) int[] local234 = local19[0];
			@Pc(238) int[] local238 = local19[1];
			@Pc(242) int[] local242 = local19[2];
			for (local60 = 0; local60 < Static177.anInt4018; local60++) {
				local68 = 0;
				@Pc(250) int local250 = 0;
				@Pc(252) int local252 = 0;
				for (@Pc(254) int local254 = 0; local254 < local31; local254++) {
					@Pc(260) int[][] local260 = local42[local254];
					local250 += local260[1][local60];
					local252 += local260[2][local60];
					local68 += local260[0][local60];
				}
				local234[local60] = local68 / local31;
				local238[local60] = local250 / local31;
				local242[local60] = local252 / local31;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2666 = arg0.method336();
		} else if (arg1 == 1) {
			this.anInt2673 = arg0.method336();
		} else if (arg1 == 2) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}
}
