import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class2_Sub15_Sub10 extends Class2_Sub15 {

	@OriginalMember(owner = "client!gs", name = "F", descriptor = "Z")
	private boolean aBoolean325 = true;

	@OriginalMember(owner = "client!gs", name = "K", descriptor = "Z")
	private boolean aBoolean326 = true;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(36) int[] local36 = this.method9725(0, this.aBoolean326 ? Static426.anInt11132 - arg0 : arg0);
			if (this.aBoolean325) {
				for (@Pc(49) int local49 = 0; local49 < Static329.anInt6017; local49++) {
					local11[local49] = local36[Static386.anInt7302 - local49];
				}
			} else {
				Static679.method4128(local36, 0, local11, 0, Static329.anInt6017);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(34) int[][] local34 = this.method9727(0, this.aBoolean326 ? Static426.anInt11132 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean325) {
				for (local63 = 0; local63 < Static329.anInt6017; local63++) {
					local50[local63] = local38[Static386.anInt7302 - local63];
					local54[local63] = local42[Static386.anInt7302 - local63];
					local58[local63] = local46[Static386.anInt7302 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static329.anInt6017; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean325 = arg1.method5203() == 1;
		} else if (arg0 == 1) {
			this.aBoolean326 = arg1.method5203() == 1;
		} else if (arg0 == 2) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}
}
