import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nu", name = "J", descriptor = "Z")
	private boolean aBoolean368 = true;

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "Z")
	private boolean aBoolean369 = true;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(35) int[] local35 = this.method5872(0, this.aBoolean369 ? Static421.anInt7373 - arg0 : arg0);
			if (this.aBoolean368) {
				for (@Pc(40) int local40 = 0; local40 < Static410.anInt7198; local40++) {
					local11[local40] = local35[Static301.anInt5026 - local40];
				}
			} else {
				Static459.method1548(local35, 0, local11, 0, Static410.anInt7198);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean368 = arg0.method4548() == 1;
		} else if (arg1 == 1) {
			this.aBoolean369 = arg0.method4548() == 1;
		} else if (arg1 == 2) {
			super.aBoolean645 = arg0.method4548() == 1;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(34) int[][] local34 = this.method5867(0, this.aBoolean369 ? Static421.anInt7373 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean368) {
				for (local63 = 0; local63 < Static410.anInt7198; local63++) {
					local50[local63] = local38[Static301.anInt5026 - local63];
					local54[local63] = local42[Static301.anInt5026 - local63];
					local58[local63] = local46[Static301.anInt5026 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static410.anInt7198; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}
}
