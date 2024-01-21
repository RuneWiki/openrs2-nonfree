import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class2_Sub4_Sub13 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(34) int[][] local34 = this.method3130(this.aBoolean85 ? Static167.anInt3559 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[1];
			@Pc(42) int[] local42 = local34[0];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[2];
			@Pc(58) int[] local58 = local16[1];
			@Pc(63) int local63;
			if (this.aBoolean84) {
				for (local63 = 0; local63 < Static118.anInt2608; local63++) {
					local50[local63] = local42[Static82.anInt1734 - local63];
					local58[local63] = local38[Static82.anInt1734 - local63];
					local54[local63] = local46[Static82.anInt1734 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static118.anInt2608; local63++) {
					local50[local63] = local42[local63];
					local58[local63] = local38[local63];
					local54[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(28) int[] local28 = this.method3129(0, this.aBoolean85 ? Static167.anInt3559 - arg0 : arg0);
			if (this.aBoolean84) {
				for (@Pc(41) int local41 = 0; local41 < Static118.anInt2608; local41++) {
					local7[local41] = local28[Static82.anInt1734 - local41];
				}
			} else {
				Static220.method1003(local28, 0, local7, 0, Static118.anInt2608);
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean84 = arg1.method1534() == 1;
		} else if (arg0 == 1) {
			this.aBoolean85 = arg1.method1534() == 1;
		} else if (arg0 == 2) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}
}
