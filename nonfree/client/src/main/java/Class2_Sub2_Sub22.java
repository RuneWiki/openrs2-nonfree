import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "Z")
	private boolean aBoolean103;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "Z")
	private boolean aBoolean104;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(36) int[] local36 = this.method2573(this.aBoolean104 ? Static75.anInt1778 - arg0 : arg0, 0);
			if (this.aBoolean103) {
				for (@Pc(49) int local49 = 0; local49 < Static149.anInt3233; local49++) {
					local19[local49] = local36[Static145.anInt2636 - local49];
				}
			} else {
				Static182.method1347(local36, 0, local19, 0, Static149.anInt3233);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(29) int[][] local29 = this.method2582(0, this.aBoolean104 ? Static75.anInt1778 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean103) {
				for (local58 = 0; local58 < Static149.anInt3233; local58++) {
					local49[local58] = local33[Static145.anInt2636 - local58];
					local45[local58] = local37[Static145.anInt2636 - local58];
					local53[local58] = local41[Static145.anInt2636 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static149.anInt3233; local58++) {
					local49[local58] = local33[local58];
					local45[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean103 = arg1.method1461() == 1;
		} else if (arg0 == 1) {
			this.aBoolean104 = arg1.method1461() == 1;
		} else if (arg0 == 2) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}
}
