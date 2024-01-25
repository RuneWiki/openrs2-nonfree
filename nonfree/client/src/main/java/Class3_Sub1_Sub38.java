import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class3_Sub1_Sub38 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub38() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(28) int[] local28 = this.method9577(0, arg0);
			@Pc(34) int[] local34 = this.method9577(1, arg0);
			@Pc(40) int[] local40 = this.method9577(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Static379.anInt5859; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local18[local42] = local28[local42];
				} else if (local48 == 0) {
					local18[local42] = local34[local42];
				} else {
					local18[local42] = local28[local42] * local48 + (4096 - local48) * local34[local42] >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(24) int[][] local24 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(34) int[] local34 = this.method9577(2, arg0);
			@Pc(40) int[][] local40 = this.method9576(arg0, 0);
			@Pc(46) int[][] local46 = this.method9576(arg0, 1);
			@Pc(50) int[] local50 = local24[0];
			@Pc(54) int[] local54 = local24[1];
			@Pc(58) int[] local58 = local24[2];
			@Pc(62) int[] local62 = local40[0];
			@Pc(66) int[] local66 = local40[1];
			@Pc(70) int[] local70 = local40[2];
			@Pc(74) int[] local74 = local46[0];
			@Pc(78) int[] local78 = local46[1];
			@Pc(82) int[] local82 = local46[2];
			for (@Pc(84) int local84 = 0; local84 < Static379.anInt5859; local84++) {
				@Pc(90) int local90 = local34[local84];
				if (local90 == 4096) {
					local50[local84] = local62[local84];
					local54[local84] = local66[local84];
					local58[local84] = local70[local84];
				} else if (local90 == 0) {
					local50[local84] = local74[local84];
					local54[local84] = local78[local84];
					local58[local84] = local82[local84];
				} else {
					@Pc(102) int local102 = 4096 - local90;
					local50[local84] = local90 * local62[local84] + local102 * local74[local84] >> 12;
					local54[local84] = local90 * local66[local84] + local102 * local78[local84] >> 12;
					local58[local84] = local82[local84] * local102 + local70[local84] * local90 >> 12;
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean773 = arg1.method2048(255) == 1;
		}
	}
}
