import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class7_Sub3_Sub19 extends Class7_Sub3 {

	@OriginalMember(owner = "client!ku", name = "I", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!ku", name = "K", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.aBoolean240 = arg1.method3981() == 1;
		} else if (arg0 == 1) {
			this.aBoolean239 = arg1.method3981() == 1;
		} else if (arg0 == 2) {
			super.aBoolean490 = arg1.method3981() == 1;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(34) int[] local34 = this.method5591(0, this.aBoolean239 ? Static25.anInt366 - arg0 : arg0);
			if (this.aBoolean240) {
				for (@Pc(47) int local47 = 0; local47 < Static58.anInt1052; local47++) {
					local11[local47] = local34[Static410.anInt6497 - local47];
				}
			} else {
				Static464.method3636(local34, 0, local11, 0, Static58.anInt1052);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(35) int[][] local35 = this.method5597(0, this.aBoolean239 ? Static25.anInt366 - arg0 : arg0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local35[1];
			@Pc(47) int[] local47 = local35[2];
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[1];
			@Pc(59) int[] local59 = local17[2];
			@Pc(64) int local64;
			if (this.aBoolean240) {
				for (local64 = 0; local64 < Static58.anInt1052; local64++) {
					local51[local64] = local39[Static410.anInt6497 - local64];
					local55[local64] = local43[Static410.anInt6497 - local64];
					local59[local64] = local47[Static410.anInt6497 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static58.anInt1052; local64++) {
					local51[local64] = local39[local64];
					local55[local64] = local43[local64];
					local59[local64] = local47[local64];
				}
			}
		}
		return local17;
	}
}
