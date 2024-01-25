import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class5_Sub3_Sub31 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
	private int anInt5888 = 0;

	@OriginalMember(owner = "client!ss", name = "U", descriptor = "I")
	private int anInt5893 = 4096;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5888 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt5893 = arg0.method5106();
		} else if (arg1 == 2) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[][] local21 = this.method6023(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static7.anInt129; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt5888 > local53) {
					local37[local47] = this.anInt5888;
				} else if (this.anInt5893 < local53) {
					local37[local47] = this.anInt5893;
				} else {
					local37[local47] = local53;
				}
				if (local57 < this.anInt5888) {
					local41[local47] = this.anInt5888;
				} else if (this.anInt5893 < local57) {
					local41[local47] = this.anInt5893;
				} else {
					local41[local47] = local57;
				}
				if (local61 < this.anInt5888) {
					local45[local47] = this.anInt5888;
				} else if (this.anInt5893 < local61) {
					local45[local47] = this.anInt5893;
				} else {
					local45[local47] = local61;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(29) int[] local29 = this.method6020(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static7.anInt129; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt5888 > local37) {
					local19[local31] = this.anInt5888;
				} else if (this.anInt5893 >= local37) {
					local19[local31] = local37;
				} else {
					local19[local31] = this.anInt5893;
				}
			}
		}
		return local19;
	}
}
