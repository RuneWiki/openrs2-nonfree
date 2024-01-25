import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class3_Sub9_Sub22 extends Class3_Sub9 {

	@OriginalMember(owner = "client!iu", name = "F", descriptor = "Z")
	private boolean aBoolean342 = true;

	@OriginalMember(owner = "client!iu", name = "I", descriptor = "Z")
	private boolean aBoolean344 = true;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(33) int[] local33 = this.method9162(this.aBoolean342 ? Static636.anInt10126 - arg0 : arg0, 0);
			if (this.aBoolean344) {
				for (@Pc(38) int local38 = 0; local38 < Static62.anInt1251; local38++) {
					local16[local38] = local33[Static302.anInt5067 - local38];
				}
			} else {
				Static684.method5326(local33, 0, local16, 0, Static62.anInt1251);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean344 = arg0.method8632() == 1;
		} else if (arg1 == 1) {
			this.aBoolean342 = arg0.method8632() == 1;
		} else if (arg1 == 2) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(34) int[][] local34 = this.method9167(0, this.aBoolean342 ? Static636.anInt10126 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local17[0];
			@Pc(54) int[] local54 = local17[1];
			@Pc(58) int[] local58 = local17[2];
			@Pc(63) int local63;
			if (this.aBoolean344) {
				for (local63 = 0; local63 < Static62.anInt1251; local63++) {
					local50[local63] = local38[Static302.anInt5067 - local63];
					local54[local63] = local42[Static302.anInt5067 - local63];
					local58[local63] = local46[Static302.anInt5067 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static62.anInt1251; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local17;
	}
}
