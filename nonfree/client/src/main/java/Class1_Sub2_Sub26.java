import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub26() {
		super(3, false);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(23) int[] local23 = this.method5654(0, arg0);
			@Pc(29) int[] local29 = this.method5654(1, arg0);
			@Pc(37) int[] local37 = this.method5654(2, arg0);
			for (@Pc(39) int local39 = 0; local39 < Static251.anInt6509; local39++) {
				@Pc(45) int local45 = local37[local39];
				if (local45 == 4096) {
					local11[local39] = local23[local39];
				} else if (local45 == 0) {
					local11[local39] = local29[local39];
				} else {
					local11[local39] = local23[local39] * local45 + (4096 - local45) * local29[local39] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(30) int[] local30 = this.method5654(2, arg0);
			@Pc(36) int[][] local36 = this.method5659(arg0, 0);
			@Pc(42) int[][] local42 = this.method5659(arg0, 1);
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			@Pc(58) int[] local58 = local36[0];
			@Pc(62) int[] local62 = local36[1];
			@Pc(66) int[] local66 = local36[2];
			@Pc(70) int[] local70 = local42[0];
			@Pc(74) int[] local74 = local42[1];
			@Pc(78) int[] local78 = local42[2];
			for (@Pc(80) int local80 = 0; local80 < Static251.anInt6509; local80++) {
				@Pc(86) int local86 = local30[local80];
				if (local86 == 4096) {
					local46[local80] = local58[local80];
					local50[local80] = local62[local80];
					local54[local80] = local66[local80];
				} else if (local86 == 0) {
					local46[local80] = local70[local80];
					local50[local80] = local74[local80];
					local54[local80] = local78[local80];
				} else {
					@Pc(118) int local118 = 4096 - local86;
					local46[local80] = local86 * local58[local80] + local70[local80] * local118 >> 12;
					local50[local80] = local118 * local74[local80] + local62[local80] * local86 >> 12;
					local54[local80] = local86 * local66[local80] + local78[local80] * local118 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}
}
