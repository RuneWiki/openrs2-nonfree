import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Z")
	private boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "Z")
	private boolean aBoolean9 = true;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(36) int[] local36 = this.method4954(this.aBoolean9 ? Static148.anInt2810 - arg0 : arg0, 0);
			if (this.aBoolean7) {
				for (@Pc(41) int local41 = 0; local41 < Static22.anInt421; local41++) {
					local17[local41] = local36[Static84.anInt1566 - local41];
				}
			} else {
				Static326.method4269(local36, 0, local17, 0, Static22.anInt421);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(36) int[][] local36 = this.method4965(this.aBoolean9 ? Static148.anInt2810 - arg0 : arg0, 0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[2];
			@Pc(48) int[] local48 = local36[1];
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[2];
			@Pc(60) int[] local60 = local11[1];
			@Pc(65) int local65;
			if (this.aBoolean7) {
				for (local65 = 0; local65 < Static22.anInt421; local65++) {
					local52[local65] = local40[Static84.anInt1566 - local65];
					local60[local65] = local48[Static84.anInt1566 - local65];
					local56[local65] = local44[Static84.anInt1566 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static22.anInt421; local65++) {
					local52[local65] = local40[local65];
					local60[local65] = local48[local65];
					local56[local65] = local44[local65];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.aBoolean7 = arg1.method3915() == 1;
		} else if (arg0 == 1) {
			this.aBoolean9 = arg1.method3915() == 1;
		} else if (arg0 == 2) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}
}
