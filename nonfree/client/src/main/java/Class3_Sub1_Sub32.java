import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class3_Sub1_Sub32 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qw", name = "I", descriptor = "Z")
	private boolean aBoolean576 = true;

	@OriginalMember(owner = "client!qw", name = "J", descriptor = "Z")
	private boolean aBoolean577 = true;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(29) int[] local29 = this.method7765(0, this.aBoolean576 ? Static469.anInt7679 - arg0 : arg0);
			if (this.aBoolean577) {
				for (@Pc(34) int local34 = 0; local34 < Static206.anInt4182; local34++) {
					local11[local34] = local29[Static439.anInt7283 - local34];
				}
			} else {
				Static604.method5911(local29, 0, local11, 0, Static206.anInt4182);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(28) int[][] local28 = this.method7766(0, this.aBoolean576 ? Static469.anInt7679 - arg0 : arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(57) int local57;
			if (this.aBoolean577) {
				for (local57 = 0; local57 < Static206.anInt4182; local57++) {
					local44[local57] = local32[Static439.anInt7283 - local57];
					local48[local57] = local36[Static439.anInt7283 - local57];
					local52[local57] = local40[Static439.anInt7283 - local57];
				}
			} else {
				for (local57 = 0; local57 < Static206.anInt4182; local57++) {
					local44[local57] = local32[local57];
					local48[local57] = local36[local57];
					local52[local57] = local40[local57];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean577 = arg0.method3118() == 1;
		} else if (arg1 == 1) {
			this.aBoolean576 = arg0.method3118() == 1;
		} else if (arg1 == 2) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}
}
