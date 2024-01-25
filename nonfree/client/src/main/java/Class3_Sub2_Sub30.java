import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
	private int anInt6053 = 0;

	@OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
	private int anInt6055 = 4096;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(21) int[][] local21 = this.method5899(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static406.anInt6694; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local53 < this.anInt6053) {
					local37[local47] = this.anInt6053;
				} else if (this.anInt6055 >= local53) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt6055;
				}
				if (this.anInt6053 > local57) {
					local41[local47] = this.anInt6053;
				} else if (this.anInt6055 < local57) {
					local41[local47] = this.anInt6055;
				} else {
					local41[local47] = local57;
				}
				if (this.anInt6053 > local61) {
					local45[local47] = this.anInt6053;
				} else if (this.anInt6055 >= local61) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt6055;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6053 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt6055 = arg0.method2588();
		} else if (arg1 == 2) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(25) int[] local25 = this.method5894(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static406.anInt6694; local27++) {
				@Pc(33) int local33 = local25[local27];
				if (local33 < this.anInt6053) {
					local11[local27] = this.anInt6053;
				} else if (local33 <= this.anInt6055) {
					local11[local27] = local33;
				} else {
					local11[local27] = this.anInt6055;
				}
			}
		}
		return local11;
	}
}
