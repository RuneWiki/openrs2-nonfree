import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
	private int anInt2427;

	@OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
	private int anInt2429;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt2427 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt2429 = arg1.method1234();
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(23) int local23 = this.anInt2429 + this.anInt2429 + 1;
			@Pc(32) int local32 = this.anInt2427 + this.anInt2427 + 1;
			@Pc(35) int[][] local35 = new int[local23][];
			@Pc(53) int local53;
			for (@Pc(41) int local41 = arg0 - this.anInt2429; local41 <= arg0 + this.anInt2429; local41++) {
				@Pc(51) int[] local51 = this.method3401(local41 & Static14.anInt436, 0);
				local53 = 0;
				@Pc(56) int[] local56 = new int[Static22.anInt596];
				for (@Pc(60) int local60 = -this.anInt2427; local60 <= this.anInt2427; local60++) {
					local53 += local51[local60 & Static28.anInt833];
				}
				@Pc(81) int local81 = 0;
				while (local81 < Static22.anInt596) {
					local56[local81] = local53 / local32;
					local53 -= local51[local81 - this.anInt2427 & Static28.anInt833];
					local81++;
					local53 += local51[Static28.anInt833 & local81 + this.anInt2427];
				}
				local35[this.anInt2429 + local41 - arg0] = local56;
			}
			for (@Pc(140) int local140 = 0; local140 < Static22.anInt596; local140++) {
				@Pc(144) int local144 = 0;
				for (local53 = 0; local53 < local23; local53++) {
					local144 += local35[local53][local140];
				}
				local11[local140] = local144 / local23;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(31) int local31 = this.anInt2429 + this.anInt2429 + 1;
			@Pc(34) int[][][] local34 = new int[local31][][];
			@Pc(43) int local43 = this.anInt2427 + this.anInt2427 + 1;
			@Pc(81) int local81;
			@Pc(67) int local67;
			for (@Pc(49) int local49 = arg0 - this.anInt2429; local49 <= arg0 + this.anInt2429; local49++) {
				@Pc(59) int[][] local59 = this.method3390(Static14.anInt436 & local49, 0);
				@Pc(61) int local61 = 0;
				@Pc(65) int[][] local65 = new int[3][Static22.anInt596];
				local67 = 0;
				@Pc(71) int[] local71 = local59[1];
				@Pc(75) int[] local75 = local59[2];
				@Pc(79) int[] local79 = local59[0];
				local81 = 0;
				for (@Pc(85) int local85 = -this.anInt2427; local85 <= this.anInt2427; local85++) {
					@Pc(91) int local91 = local85 & Static28.anInt833;
					local81 += local71[local91];
					local61 += local79[local91];
					local67 += local75[local91];
				}
				@Pc(122) int[] local122 = local65[0];
				@Pc(126) int[] local126 = local65[1];
				@Pc(130) int[] local130 = local65[2];
				@Pc(132) int local132 = 0;
				while (Static22.anInt596 > local132) {
					local122[local132] = local61 / local43;
					local126[local132] = local81 / local43;
					local130[local132] = local67 / local43;
					@Pc(159) int local159 = local132 - this.anInt2427 & Static28.anInt833;
					local61 -= local79[local159];
					local81 -= local71[local159];
					local132++;
					local67 -= local75[local159];
					@Pc(185) int local185 = Static28.anInt833 & this.anInt2427 + local132;
					local67 += local75[local185];
					local61 += local79[local185];
					local81 += local71[local185];
				}
				local34[local49 + this.anInt2429 - arg0] = local65;
			}
			@Pc(236) int[] local236 = local19[0];
			@Pc(240) int[] local240 = local19[1];
			@Pc(244) int[] local244 = local19[2];
			for (local81 = 0; local81 < Static22.anInt596; local81++) {
				local67 = 0;
				@Pc(252) int local252 = 0;
				@Pc(254) int local254 = 0;
				for (@Pc(256) int local256 = 0; local256 < local31; local256++) {
					@Pc(262) int[][] local262 = local34[local256];
					local67 += local262[0][local81];
					local254 += local262[2][local81];
					local252 += local262[1][local81];
				}
				local236[local81] = local67 / local31;
				local240[local81] = local252 / local31;
				local244[local81] = local254 / local31;
			}
		}
		return local19;
	}
}
