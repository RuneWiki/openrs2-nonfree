import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class5_Sub3_Sub18 extends Class5_Sub3 {

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "Z")
	private boolean aBoolean263 = true;

	@OriginalMember(owner = "client!kk", name = "S", descriptor = "Z")
	private boolean aBoolean264 = true;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(34) int[] local34 = this.method6020(0, this.aBoolean264 ? Static221.anInt4359 - arg0 : arg0);
			if (this.aBoolean263) {
				for (@Pc(39) int local39 = 0; local39 < Static7.anInt129; local39++) {
					local11[local39] = local34[Static177.anInt3515 - local39];
				}
			} else {
				Static368.method5425(local34, 0, local11, 0, Static7.anInt129);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(29) int[][] local29 = this.method6023(0, this.aBoolean264 ? Static221.anInt4359 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean263) {
				for (local58 = 0; local58 < Static7.anInt129; local58++) {
					local45[local58] = local33[Static177.anInt3515 - local58];
					local49[local58] = local37[Static177.anInt3515 - local58];
					local53[local58] = local41[Static177.anInt3515 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static7.anInt129; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean263 = arg0.method5115() == 1;
		} else if (arg1 == 1) {
			this.aBoolean264 = arg0.method5115() == 1;
		} else if (arg1 == 2) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}
}
