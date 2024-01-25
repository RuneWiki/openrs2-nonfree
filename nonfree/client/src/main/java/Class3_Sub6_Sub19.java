import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class3_Sub6_Sub19 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "Z")
	private boolean aBoolean336 = true;

	@OriginalMember(owner = "client!ju", name = "G", descriptor = "Z")
	private boolean aBoolean337 = true;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(29) int[] local29 = this.method7769(this.aBoolean336 ? Static68.anInt1579 - arg0 : arg0, 0);
			if (this.aBoolean337) {
				for (@Pc(42) int local42 = 0; local42 < Static521.anInt8383; local42++) {
					local11[local42] = local29[Static296.anInt5049 - local42];
				}
			} else {
				Static601.method2818(local29, 0, local11, 0, Static521.anInt8383);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean337 = arg0.method5175() == 1;
		} else if (arg1 == 1) {
			this.aBoolean336 = arg0.method5175() == 1;
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(29) int[][] local29 = this.method7773(0, this.aBoolean336 ? Static68.anInt1579 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean337) {
				for (local58 = 0; local58 < Static521.anInt8383; local58++) {
					local45[local58] = local33[Static296.anInt5049 - local58];
					local49[local58] = local37[Static296.anInt5049 - local58];
					local53[local58] = local41[Static296.anInt5049 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static521.anInt8383; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}
}
