import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class6_Sub3_Sub33 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
	private int anInt8567 = 0;

	@OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
	private int anInt8565 = 4096;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(21) int[][] local21 = this.method7961(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static35.anInt670; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (this.anInt8567 > local53) {
					local37[local47] = this.anInt8567;
				} else if (this.anInt8565 >= local53) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt8565;
				}
				if (local57 < this.anInt8567) {
					local41[local47] = this.anInt8567;
				} else if (local57 <= this.anInt8565) {
					local41[local47] = local57;
				} else {
					local41[local47] = this.anInt8565;
				}
				if (this.anInt8567 > local61) {
					local45[local47] = this.anInt8567;
				} else if (this.anInt8565 >= local61) {
					local45[local47] = local61;
				} else {
					local45[local47] = this.anInt8565;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt8567 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt8565 = arg1.method6044();
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(21) int[] local21 = this.method7950(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static35.anInt670; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt8567) {
					local11[local23] = this.anInt8567;
				} else if (local29 <= this.anInt8565) {
					local11[local23] = local29;
				} else {
					local11[local23] = this.anInt8565;
				}
			}
		}
		return local11;
	}
}
