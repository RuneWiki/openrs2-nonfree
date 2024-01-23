import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class1_Sub4_Sub29 extends Class1_Sub4 {

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(28) int[] local28 = this.method4750(arg0, 0);
			@Pc(34) int[] local34 = this.method4750(arg0, 1);
			@Pc(40) int[] local40 = this.method4750(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static182.anInt3492; local42++) {
				@Pc(49) int local49 = local40[local42];
				if (local49 == 4096) {
					local11[local42] = local28[local42];
				} else if (local49 == 0) {
					local11[local42] = local34[local42];
				} else {
					local11[local42] = local49 * local28[local42] + local34[local42] * (4096 - local49) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(26) int[] local26 = this.method4750(arg0, 2);
			@Pc(32) int[][] local32 = this.method4749(0, arg0);
			@Pc(38) int[][] local38 = this.method4749(1, arg0);
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local32[1];
			@Pc(50) int[] local50 = local12[0];
			@Pc(54) int[] local54 = local12[2];
			@Pc(58) int[] local58 = local32[2];
			@Pc(62) int[] local62 = local32[0];
			@Pc(66) int[] local66 = local38[1];
			@Pc(70) int[] local70 = local38[0];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static182.anInt3492; local76++) {
				@Pc(83) int local83 = local26[local76];
				if (local83 == 4096) {
					local50[local76] = local62[local76];
					local42[local76] = local46[local76];
					local54[local76] = local58[local76];
				} else if (local83 == 0) {
					local50[local76] = local70[local76];
					local42[local76] = local66[local76];
					local54[local76] = local74[local76];
				} else {
					@Pc(98) int local98 = 4096 - local83;
					local50[local76] = local62[local76] * local83 + local70[local76] * local98 >> 12;
					local42[local76] = local46[local76] * local83 + local98 * local66[local76] >> 12;
					local54[local76] = local74[local76] * local98 + local58[local76] * local83 >> 12;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}
}
