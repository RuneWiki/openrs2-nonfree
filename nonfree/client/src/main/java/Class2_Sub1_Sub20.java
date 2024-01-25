import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "Z")
	private boolean aBoolean286 = true;

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "Z")
	private boolean aBoolean288 = true;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(34) int[][] local34 = this.method6061(0, this.aBoolean288 ? Static67.anInt1510 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean286) {
				for (local63 = 0; local63 < Static391.anInt7118; local63++) {
					local50[local63] = local38[Static235.anInt4676 - local63];
					local54[local63] = local42[Static235.anInt4676 - local63];
					local58[local63] = local46[Static235.anInt4676 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static391.anInt7118; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.aBoolean286 = arg1.method5732() == 1;
		} else if (arg0 == 1) {
			this.aBoolean288 = arg1.method5732() == 1;
		} else if (arg0 == 2) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(34) int[] local34 = this.method6069(0, this.aBoolean288 ? Static67.anInt1510 - arg0 : arg0);
			if (this.aBoolean286) {
				for (@Pc(47) int local47 = 0; local47 < Static391.anInt7118; local47++) {
					local16[local47] = local34[Static235.anInt4676 - local47];
				}
			} else {
				Static394.method2438(local34, 0, local16, 0, Static391.anInt7118);
			}
		}
		return local16;
	}
}
