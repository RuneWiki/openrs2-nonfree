import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(34) int[] local34 = this.method3012(0, this.aBoolean231 ? Static93.anInt2716 - arg0 : arg0);
			if (this.aBoolean232) {
				for (@Pc(47) int local47 = 0; local47 < Static65.anInt1933; local47++) {
					local17[local47] = local34[Static64.anInt1922 - local47];
				}
			} else {
				Static193.method2482(local34, 0, local17, 0, Static65.anInt1933);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(25) int[][] local25 = this.method3013(this.aBoolean231 ? Static93.anInt2716 - arg0 : arg0, 0);
			@Pc(29) int[] local29 = local7[2];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local25[0];
			@Pc(41) int[] local41 = local25[1];
			@Pc(45) int[] local45 = local25[2];
			@Pc(49) int[] local49 = local7[1];
			@Pc(54) int local54;
			if (this.aBoolean232) {
				for (local54 = 0; local54 < Static65.anInt1933; local54++) {
					local33[local54] = local37[Static64.anInt1922 - local54];
					local49[local54] = local41[Static64.anInt1922 - local54];
					local29[local54] = local45[Static64.anInt1922 - local54];
				}
			} else {
				for (local54 = 0; local54 < Static65.anInt1933; local54++) {
					local33[local54] = local37[local54];
					local49[local54] = local41[local54];
					local29[local54] = local45[local54];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean232 = arg1.method1607() == 1;
		} else if (arg0 == 1) {
			this.aBoolean231 = arg1.method1607() == 1;
		} else if (arg0 == 2) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}
}
