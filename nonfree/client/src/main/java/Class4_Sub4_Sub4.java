import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class4_Sub4_Sub4 extends Class4_Sub4 {

	@OriginalMember(owner = "client!cga", name = "H", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!cga", name = "N", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(29) int[] local29 = this.method7890(0, this.aBoolean91 ? Static360.anInt6375 - arg0 : arg0);
			if (this.aBoolean92) {
				for (@Pc(34) int local34 = 0; local34 < Static560.anInt9394; local34++) {
					local11[local34] = local29[Static571.anInt9405 - local34];
				}
			} else {
				Static602.method1582(local29, 0, local11, 0, Static560.anInt9394);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.aBoolean92 = arg1.method6015() == 1;
		} else if (arg0 == 1) {
			this.aBoolean91 = arg1.method6015() == 1;
		} else if (arg0 == 2) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(34) int[][] local34 = this.method7892(0, this.aBoolean91 ? Static360.anInt6375 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean92) {
				for (local63 = 0; local63 < Static560.anInt9394; local63++) {
					local50[local63] = local38[Static571.anInt9405 - local63];
					local54[local63] = local42[Static571.anInt9405 - local63];
					local58[local63] = local46[Static571.anInt9405 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static560.anInt9394; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}
}
