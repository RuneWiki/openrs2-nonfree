import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class2_Sub6_Sub22 extends Class2_Sub6 {

	@OriginalMember(owner = "client!pha", name = "M", descriptor = "Z")
	private boolean aBoolean525 = true;

	@OriginalMember(owner = "client!pha", name = "O", descriptor = "Z")
	private boolean aBoolean526 = true;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(36) int[] local36 = this.method8461(0, this.aBoolean525 ? Static53.anInt1098 - arg0 : arg0);
			if (this.aBoolean526) {
				for (@Pc(41) int local41 = 0; local41 < Static51.anInt1085; local41++) {
					local13[local41] = local36[Static332.anInt5256 - local41];
				}
			} else {
				Static653.method5397(local36, 0, local13, 0, Static51.anInt1085);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(33) int[][] local33 = this.method8465(0, this.aBoolean525 ? Static53.anInt1098 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			@Pc(62) int local62;
			if (this.aBoolean526) {
				for (local62 = 0; local62 < Static51.anInt1085; local62++) {
					local49[local62] = local37[Static332.anInt5256 - local62];
					local53[local62] = local41[Static332.anInt5256 - local62];
					local57[local62] = local45[Static332.anInt5256 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static51.anInt1085; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.aBoolean526 = arg1.method8547() == 1;
		} else if (arg0 == 1) {
			this.aBoolean525 = arg1.method8547() == 1;
		} else if (arg0 == 2) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}
}
