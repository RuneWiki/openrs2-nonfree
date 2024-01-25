import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
	private int anInt2121 = 1;

	@OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
	private int anInt2129 = 1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2121 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt2129 = arg0.method4548();
		} else if (arg1 == 2) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(29) int local29 = this.anInt2129 + this.anInt2129 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt2121 + this.anInt2121 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local29][][];
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(54) int local54 = arg0 - this.anInt2129; local54 <= this.anInt2129 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method5867(0, Static421.anInt7373 & local54);
				@Pc(68) int[][] local68 = new int[3][Static410.anInt7198];
				@Pc(70) int local70 = 0;
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local64[0];
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt2121; local90 <= this.anInt2121; local90++) {
					@Pc(96) int local96 = Static301.anInt5026 & local90;
					local74 += local86[local96];
					local70 += local78[local96];
					local72 += local82[local96];
				}
				@Pc(127) int[] local127 = local68[0];
				@Pc(131) int[] local131 = local68[1];
				@Pc(135) int[] local135 = local68[2];
				@Pc(137) int local137 = 0;
				while (local137 < Static410.anInt7198) {
					local127[local137] = local70 * local45 >> 16;
					local131[local137] = local72 * local45 >> 16;
					local135[local137] = local45 * local74 >> 16;
					@Pc(171) int local171 = Static301.anInt5026 & local137 - this.anInt2121;
					local137++;
					local70 -= local78[local171];
					local72 -= local82[local171];
					local74 -= local86[local171];
					@Pc(197) int local197 = this.anInt2121 + local137 & Static301.anInt5026;
					local74 += local86[local197];
					local70 += local78[local197];
					local72 += local82[local197];
				}
				local48[this.anInt2129 + local54 - arg0] = local68;
			}
			@Pc(239) int[] local239 = local17[0];
			@Pc(243) int[] local243 = local17[1];
			@Pc(247) int[] local247 = local17[2];
			for (local72 = 0; local72 < Static410.anInt7198; local72++) {
				local74 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local29; local259++) {
					@Pc(265) int[][] local265 = local48[local259];
					local74 += local265[0][local72];
					local257 += local265[2][local72];
					local255 += local265[1][local72];
				}
				local239[local72] = local74 * local33 >> 16;
				local243[local72] = local255 * local33 >> 16;
				local247[local72] = local257 * local33 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(29) int local29 = this.anInt2129 + this.anInt2129 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt2121 + this.anInt2121 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt2129; local54 <= arg0 + this.anInt2129; local54++) {
				@Pc(64) int[] local64 = this.method5872(0, Static421.anInt7373 & local54);
				@Pc(67) int[] local67 = new int[Static410.anInt7198];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt2121; local73 <= this.anInt2121; local73++) {
					local69 += local64[local73 & Static301.anInt5026];
				}
				@Pc(90) int local90 = 0;
				while (Static410.anInt7198 > local90) {
					local67[local90] = local45 * local69 >> 16;
					local69 -= local64[local90 - this.anInt2121 & Static301.anInt5026];
					local90++;
					local69 += local64[Static301.anInt5026 & local90 + this.anInt2121];
				}
				local48[this.anInt2129 + local54 - arg0] = local67;
			}
			for (@Pc(151) int local151 = 0; local151 < Static410.anInt7198; local151++) {
				@Pc(155) int local155 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local155 += local48[local69][local151];
				}
				local11[local151] = local155 * local33 >> 16;
			}
		}
		return local11;
	}
}
