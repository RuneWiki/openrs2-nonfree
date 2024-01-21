import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "Z")
	private boolean aBoolean10;

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(34) int[] local34 = this.method2796(0, this.aBoolean11 ? Static180.anInt4192 - arg0 : arg0);
			if (this.aBoolean10) {
				for (@Pc(47) int local47 = 0; local47 < Static120.anInt2812; local47++) {
					local16[local47] = local34[Static49.anInt1370 - local47];
				}
			} else {
				Static184.method165(local34, 0, local16, 0, Static120.anInt2812);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean10 = arg0.method1402() == 1;
		} else if (arg1 == 1) {
			this.aBoolean11 = arg0.method1402() == 1;
		} else if (arg1 == 2) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(33) int[][] local33 = this.method2794(0, this.aBoolean11 ? Static180.anInt4192 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local16[0];
			@Pc(45) int[] local45 = local33[1];
			@Pc(49) int[] local49 = local33[2];
			@Pc(53) int[] local53 = local16[1];
			@Pc(57) int[] local57 = local16[2];
			@Pc(62) int local62;
			if (this.aBoolean10) {
				for (local62 = 0; local62 < Static120.anInt2812; local62++) {
					local41[local62] = local37[Static49.anInt1370 - local62];
					local53[local62] = local45[Static49.anInt1370 - local62];
					local57[local62] = local49[Static49.anInt1370 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static120.anInt2812; local62++) {
					local41[local62] = local37[local62];
					local53[local62] = local45[local62];
					local57[local62] = local49[local62];
				}
			}
		}
		return local16;
	}
}
