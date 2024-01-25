import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(26) int[] local26 = this.method8201(0, arg0);
			@Pc(32) int[] local32 = this.method8201(1, arg0);
			@Pc(38) int[] local38 = this.method8201(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static254.anInt4973; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = (4096 - local46) * local32[local40] + local46 * local26[local40] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(29) int[] local29 = this.method8201(2, arg0);
			@Pc(35) int[][] local35 = this.method8199(0, arg0);
			@Pc(41) int[][] local41 = this.method8199(1, arg0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static254.anInt4973; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(95) int local95 = 4096 - local85;
					local45[local79] = local85 * local57[local79] + local95 * local69[local79] >> 12;
					local49[local79] = local61[local79] * local85 + local73[local79] * local95 >> 12;
					local53[local79] = local65[local79] * local85 + local77[local79] * local95 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}
}
