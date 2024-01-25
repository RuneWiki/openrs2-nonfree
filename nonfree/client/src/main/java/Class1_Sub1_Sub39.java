import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wca", name = "D", descriptor = "Z")
	private boolean aBoolean738 = true;

	@OriginalMember(owner = "client!wca", name = "K", descriptor = "Z")
	private boolean aBoolean739 = true;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(29) int[] local29 = this.method7709(this.aBoolean738 ? Static171.anInt3020 - arg0 : arg0, 0);
			if (this.aBoolean739) {
				for (@Pc(42) int local42 = 0; local42 < Static279.anInt4906; local42++) {
					local11[local42] = local29[Static216.anInt4134 - local42];
				}
			} else {
				Static598.method1174(local29, 0, local11, 0, Static279.anInt4906);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(34) int[][] local34 = this.method7700(this.aBoolean738 ? Static171.anInt3020 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean739) {
				for (local63 = 0; local63 < Static279.anInt4906; local63++) {
					local50[local63] = local38[Static216.anInt4134 - local63];
					local54[local63] = local42[Static216.anInt4134 - local63];
					local58[local63] = local46[Static216.anInt4134 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static279.anInt4906; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean739 = arg0.method5750() == 1;
		} else if (arg1 == 1) {
			this.aBoolean738 = arg0.method5750() == 1;
		} else if (arg1 == 2) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}
}
