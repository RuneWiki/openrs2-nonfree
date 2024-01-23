import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!in", name = "I", descriptor = "I")
	private int anInt2950 = 1;

	@OriginalMember(owner = "client!in", name = "T", descriptor = "I")
	private int anInt2959 = 1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2950 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt2959 = arg0.method2146();
		} else if (arg1 == 2) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(30) int local30 = this.anInt2959 + this.anInt2959 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt2950 + this.anInt2950 + 1;
			@Pc(45) int[][] local45 = new int[local30][];
			@Pc(49) int local49 = 65536 / local42;
			@Pc(55) int local55;
			for (local55 = arg0 - this.anInt2959; local55 <= arg0 + this.anInt2959; local55++) {
				@Pc(73) int[] local73 = this.method4601(local55 & Static107.anInt2459, 0);
				@Pc(75) int local75 = 0;
				@Pc(78) int[] local78 = new int[Static281.anInt5558];
				@Pc(82) int local82;
				for (local82 = -this.anInt2950; local82 <= this.anInt2950; local82++) {
					local75 += local73[local82 & Static226.anInt6054];
				}
				local82 = 0;
				while (local82 < Static281.anInt5558) {
					local78[local82] = local75 * local49 >> 16;
					local75 -= local73[Static226.anInt6054 & local82 - this.anInt2950];
					local82++;
					local75 += local73[local82 + this.anInt2950 & Static226.anInt6054];
				}
				local45[this.anInt2959 + local55 - arg0] = local78;
			}
			for (local55 = 0; local55 < Static281.anInt5558; local55++) {
				@Pc(161) int local161 = 0;
				for (@Pc(163) int local163 = 0; local163 < local30; local163++) {
					local161 += local45[local163][local55];
				}
				local17[local55] = local161 * local34 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(23) int local23 = this.anInt2959 + this.anInt2959 + 1;
			@Pc(31) int local31 = this.anInt2950 + this.anInt2950 + 1;
			@Pc(35) int local35 = 65536 / local23;
			@Pc(39) int local39 = 65536 / local31;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(84) int local84;
			@Pc(72) int local72;
			@Pc(74) int local74;
			for (@Pc(48) int local48 = arg0 - this.anInt2959; local48 <= this.anInt2959 + arg0; local48++) {
				@Pc(66) int[][] local66 = this.method4600(local48 & Static107.anInt2459, 0);
				@Pc(70) int[][] local70 = new int[3][Static281.anInt5558];
				local72 = 0;
				local74 = 0;
				@Pc(78) int[] local78 = local66[0];
				@Pc(82) int[] local82 = local66[2];
				local84 = 0;
				@Pc(88) int[] local88 = local66[1];
				for (@Pc(92) int local92 = -this.anInt2950; local92 <= this.anInt2950; local92++) {
					@Pc(100) int local100 = local92 & Static226.anInt6054;
					local84 += local78[local100];
					local74 += local82[local100];
					local72 += local88[local100];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (local135 < Static281.anInt5558) {
					local125[local135] = local84 * local39 >> 16;
					local129[local135] = local39 * local72 >> 16;
					local133[local135] = local74 * local39 >> 16;
					@Pc(174) int local174 = local135 - this.anInt2950 & Static226.anInt6054;
					local72 -= local88[local174];
					local74 -= local82[local174];
					local135++;
					local84 -= local78[local174];
					@Pc(201) int local201 = local135 + this.anInt2950 & Static226.anInt6054;
					local74 += local82[local201];
					local84 += local78[local201];
					local72 += local88[local201];
				}
				local42[local48 + this.anInt2959 - arg0] = local70;
			}
			@Pc(238) int[] local238 = local11[0];
			@Pc(242) int[] local242 = local11[1];
			@Pc(246) int[] local246 = local11[2];
			for (local84 = 0; local84 < Static281.anInt5558; local84++) {
				local72 = 0;
				local74 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local23; local259++) {
					@Pc(266) int[][] local266 = local42[local259];
					local257 += local266[2][local84];
					local74 += local266[1][local84];
					local72 += local266[0][local84];
				}
				local238[local84] = local35 * local72 >> 16;
				local242[local84] = local35 * local74 >> 16;
				local246[local84] = local257 * local35 >> 16;
			}
		}
		return local11;
	}
}
