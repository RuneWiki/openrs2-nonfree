import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt683 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt676 = arg0.method2353();
		} else if (arg1 == 2) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(21) int[][] local21 = this.method2991(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[2];
			@Pc(41) int[] local41 = local21[2];
			@Pc(45) int[] local45 = local11[1];
			for (@Pc(47) int local47 = 0; local47 < Static129.anInt3118; local47++) {
				@Pc(53) int local53 = local41[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local25[local47];
				if (local61 < this.anInt683) {
					local33[local47] = this.anInt683;
				} else if (this.anInt676 < local61) {
					local33[local47] = this.anInt676;
				} else {
					local33[local47] = local61;
				}
				if (local57 < this.anInt683) {
					local45[local47] = this.anInt683;
				} else if (this.anInt676 < local57) {
					local45[local47] = this.anInt676;
				} else {
					local45[local47] = local57;
				}
				if (local53 < this.anInt683) {
					local37[local47] = this.anInt683;
				} else if (local53 <= this.anInt676) {
					local37[local47] = local53;
				} else {
					local37[local47] = this.anInt676;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(29) int[] local29 = this.method2980(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static129.anInt3118; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt683) {
					local19[local31] = this.anInt683;
				} else if (this.anInt676 < local37) {
					local19[local31] = this.anInt676;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}
}
