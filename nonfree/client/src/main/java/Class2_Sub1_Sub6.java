import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(29) int[][] local29 = this.method4600(this.aBoolean85 ? Static107.anInt2459 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[1];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local11[1];
			@Pc(58) int local58;
			if (this.aBoolean86) {
				for (local58 = 0; local58 < Static281.anInt5558; local58++) {
					local45[local58] = local33[Static226.anInt6054 - local58];
					local53[local58] = local41[Static226.anInt6054 - local58];
					local49[local58] = local37[Static226.anInt6054 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static281.anInt5558; local58++) {
					local45[local58] = local33[local58];
					local53[local58] = local41[local58];
					local49[local58] = local37[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(39) int[] local39 = this.method4601(this.aBoolean85 ? Static107.anInt2459 - arg0 : arg0, 0);
			if (this.aBoolean86) {
				for (@Pc(44) int local44 = 0; local44 < Static281.anInt5558; local44++) {
					local18[local44] = local39[Static226.anInt6054 - local44];
				}
			} else {
				Static323.method3550(local39, 0, local18, 0, Static281.anInt5558);
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean86 = arg0.method2146() == 1;
		} else if (arg1 == 1) {
			this.aBoolean85 = arg0.method2146() == 1;
		} else if (arg1 == 2) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}
}
