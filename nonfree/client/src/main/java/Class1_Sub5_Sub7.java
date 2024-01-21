import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub5_Sub7 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(37) int[] local37 = this.method3145(0, this.aBoolean39 ? Static151.anInt3420 - arg0 : arg0);
			if (this.aBoolean38) {
				for (@Pc(42) int local42 = 0; local42 < Static177.anInt4018; local42++) {
					local17[local42] = local37[Static47.anInt1130 - local42];
				}
			} else {
				Static190.method1386(local37, 0, local17, 0, Static177.anInt4018);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3144(this.aBoolean39 ? Static151.anInt3420 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local11[1];
			@Pc(58) int local58;
			if (this.aBoolean38) {
				for (local58 = 0; local58 < Static177.anInt4018; local58++) {
					local45[local58] = local33[Static47.anInt1130 - local58];
					local53[local58] = local37[Static47.anInt1130 - local58];
					local49[local58] = local41[Static47.anInt1130 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static177.anInt4018; local58++) {
					local45[local58] = local33[local58];
					local53[local58] = local37[local58];
					local49[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean38 = arg0.method336() == 1;
		} else if (arg1 == 1) {
			this.aBoolean39 = arg0.method336() == 1;
		} else if (arg1 == 2) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}
}
