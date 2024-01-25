import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class14_Sub7_Sub16 extends Class14_Sub7 {

	@OriginalMember(owner = "client!hq", name = "N", descriptor = "Z")
	private boolean aBoolean340 = true;

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "Z")
	private boolean aBoolean341 = true;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(40) int[] local40 = this.method9379(0, this.aBoolean341 ? Static660.anInt6757 - arg0 : arg0);
			if (this.aBoolean340) {
				for (@Pc(45) int local45 = 0; local45 < Static613.anInt10114; local45++) {
					local11[local45] = local40[Static677.anInt11036 - local45];
				}
			} else {
				Static691.method84(local40, 0, local11, 0, Static613.anInt10114);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.aBoolean340 = arg1.method7695(104) == 1;
		} else if (arg0 == 1) {
			this.aBoolean341 = arg1.method7695(100) == 1;
		} else if (arg0 == 2) {
			super.aBoolean773 = arg1.method7695(113) == 1;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(42) int[][] local42 = this.method9384(this.aBoolean341 ? Static660.anInt6757 - arg0 : arg0, 0);
			@Pc(46) int[] local46 = local42[0];
			@Pc(50) int[] local50 = local42[1];
			@Pc(54) int[] local54 = local42[2];
			@Pc(58) int[] local58 = local21[0];
			@Pc(62) int[] local62 = local21[1];
			@Pc(66) int[] local66 = local21[2];
			@Pc(71) int local71;
			if (this.aBoolean340) {
				for (local71 = 0; local71 < Static613.anInt10114; local71++) {
					local58[local71] = local46[Static677.anInt11036 - local71];
					local62[local71] = local50[Static677.anInt11036 - local71];
					local66[local71] = local54[Static677.anInt11036 - local71];
				}
			} else {
				for (local71 = 0; local71 < Static613.anInt10114; local71++) {
					local58[local71] = local46[local71];
					local62[local71] = local50[local71];
					local66[local71] = local54[local71];
				}
			}
		}
		return local21;
	}
}
