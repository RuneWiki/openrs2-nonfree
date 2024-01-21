import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jg", name = "Y", descriptor = "Z")
	private boolean aBoolean100;

	@OriginalMember(owner = "client!jg", name = "fb", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(29) int[][] local29 = this.method3390(this.aBoolean101 ? Static14.anInt436 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local29[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean100) {
				for (local58 = 0; local58 < Static22.anInt596; local58++) {
					local41[local58] = local33[Static28.anInt833 - local58];
					local45[local58] = local49[Static28.anInt833 - local58];
					local53[local58] = local37[Static28.anInt833 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static22.anInt596; local58++) {
					local41[local58] = local33[local58];
					local45[local58] = local49[local58];
					local53[local58] = local37[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(35) int[] local35 = this.method3401(this.aBoolean101 ? Static14.anInt436 - arg0 : arg0, 0);
			if (this.aBoolean100) {
				for (@Pc(48) int local48 = 0; local48 < Static22.anInt596; local48++) {
					local17[local48] = local35[Static28.anInt833 - local48];
				}
			} else {
				Static188.method2302(local35, 0, local17, 0, Static22.anInt596);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.aBoolean100 = arg1.method1234() == 1;
		} else if (arg0 == 1) {
			this.aBoolean101 = arg1.method1234() == 1;
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1234() == 1;
		}
	}
}
