import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(29) int[] local29 = this.method3569(arg0, 2);
			@Pc(35) int[][] local35 = this.method3557(arg0, 0);
			@Pc(41) int[][] local41 = this.method3557(arg0, 1);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[1];
			@Pc(73) int[] local73 = local41[2];
			@Pc(77) int[] local77 = local41[0];
			for (@Pc(79) int local79 = 0; local79 < Static106.anInt3045; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local77[local79];
					local49[local79] = local69[local79];
					local53[local79] = local73[local79];
				} else {
					@Pc(137) int local137 = 4096 - local85;
					local45[local79] = local77[local79] * local137 + local57[local79] * local85 >> 12;
					local49[local79] = local61[local79] * local85 + local69[local79] * local137 >> 12;
					local53[local79] = local85 * local65[local79] + local137 * local73[local79] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(26) int[] local26 = this.method3569(arg0, 0);
			@Pc(32) int[] local32 = this.method3569(arg0, 1);
			@Pc(38) int[] local38 = this.method3569(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static106.anInt3045; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local26[local40] * local46 + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local16;
	}
}
