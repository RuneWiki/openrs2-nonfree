import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(29) int[] local29 = this.method4450(2, arg0);
			@Pc(35) int[][] local35 = this.method4455(0, arg0);
			@Pc(41) int[][] local41 = this.method4455(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[2];
			@Pc(65) int[] local65 = local41[0];
			@Pc(69) int[] local69 = local41[1];
			@Pc(73) int[] local73 = local35[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static227.anInt4511; local79++) {
				@Pc(86) int local86 = local29[local79];
				if (local86 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local73[local79];
					local53[local79] = local61[local79];
				} else if (local86 == 0) {
					local45[local79] = local65[local79];
					local49[local79] = local69[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(119) int local119 = 4096 - local86;
					local45[local79] = local57[local79] * local86 + local65[local79] * local119 >> 12;
					local49[local79] = local119 * local69[local79] + local86 * local73[local79] >> 12;
					local53[local79] = local86 * local61[local79] + local119 * local77[local79] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(27) int[] local27 = this.method4450(0, arg0);
			@Pc(33) int[] local33 = this.method4450(1, arg0);
			@Pc(39) int[] local39 = this.method4450(2, arg0);
			for (@Pc(41) int local41 = 0; local41 < Static227.anInt4511; local41++) {
				@Pc(52) int local52 = local39[local41];
				if (local52 == 4096) {
					local11[local41] = local27[local41];
				} else if (local52 == 0) {
					local11[local41] = local33[local41];
				} else {
					local11[local41] = local52 * local27[local41] + local33[local41] * (4096 - local52) >> 12;
				}
			}
		}
		return local11;
	}
}
