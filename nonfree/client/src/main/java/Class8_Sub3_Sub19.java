import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class8_Sub3_Sub19 extends Class8_Sub3 {

	@OriginalMember(owner = "client!je", name = "M", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!je", name = "J", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean211 = arg1.method2334() == 1;
		} else if (arg0 == 1) {
			this.aBoolean210 = arg1.method2334() == 1;
		} else if (arg0 == 2) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(35) int[] local35 = this.method4230(this.aBoolean210 ? Static51.anInt1120 - arg0 : arg0, 0);
			if (this.aBoolean211) {
				for (@Pc(40) int local40 = 0; local40 < Static239.anInt4789; local40++) {
					local11[local40] = local35[Static214.anInt4402 - local40];
				}
			} else {
				Static301.method494(local35, 0, local11, 0, Static239.anInt4789);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(38) int[][] local38 = this.method4224(this.aBoolean210 ? Static51.anInt1120 - arg0 : arg0, 0);
			@Pc(42) int[] local42 = local38[0];
			@Pc(46) int[] local46 = local38[2];
			@Pc(50) int[] local50 = local13[0];
			@Pc(54) int[] local54 = local38[1];
			@Pc(58) int[] local58 = local13[1];
			@Pc(62) int[] local62 = local13[2];
			@Pc(67) int local67;
			if (this.aBoolean211) {
				for (local67 = 0; local67 < Static239.anInt4789; local67++) {
					local50[local67] = local42[Static214.anInt4402 - local67];
					local58[local67] = local54[Static214.anInt4402 - local67];
					local62[local67] = local46[Static214.anInt4402 - local67];
				}
			} else {
				for (local67 = 0; local67 < Static239.anInt4789; local67++) {
					local50[local67] = local42[local67];
					local58[local67] = local54[local67];
					local62[local67] = local46[local67];
				}
			}
		}
		return local13;
	}
}
