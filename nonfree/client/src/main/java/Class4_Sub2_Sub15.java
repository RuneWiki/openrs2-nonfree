import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class4_Sub2_Sub15 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "Z")
	private boolean aBoolean229 = true;

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "Z")
	private boolean aBoolean228 = true;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.aBoolean229 = arg1.method4864() == 1;
		} else if (arg0 == 1) {
			this.aBoolean228 = arg1.method4864() == 1;
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(35) int[] local35 = this.method5847(0, this.aBoolean228 ? Static323.anInt5763 - arg0 : arg0);
			if (this.aBoolean229) {
				for (@Pc(40) int local40 = 0; local40 < Static350.anInt6330; local40++) {
					local11[local40] = local35[Static144.anInt2707 - local40];
				}
			} else {
				Static457.method1218(local35, 0, local11, 0, Static350.anInt6330);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(34) int[][] local34 = this.method5848(0, this.aBoolean228 ? Static323.anInt5763 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local17[0];
			@Pc(54) int[] local54 = local17[1];
			@Pc(58) int[] local58 = local17[2];
			@Pc(63) int local63;
			if (this.aBoolean229) {
				for (local63 = 0; local63 < Static350.anInt6330; local63++) {
					local50[local63] = local38[Static144.anInt2707 - local63];
					local54[local63] = local42[Static144.anInt2707 - local63];
					local58[local63] = local46[Static144.anInt2707 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static350.anInt6330; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local17;
	}
}
