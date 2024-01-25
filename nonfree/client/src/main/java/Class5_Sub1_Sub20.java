import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class5_Sub1_Sub20 extends Class5_Sub1 {

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(21) int[] local21 = this.method7160(0, arg0);
			@Pc(27) int[] local27 = this.method7160(1, arg0);
			@Pc(33) int[] local33 = this.method7160(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static147.anInt3075; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local27[local35] * (4096 - local41) + local41 * local21[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[] local29 = this.method7160(2, arg0);
			@Pc(35) int[][] local35 = this.method7154(0, arg0);
			@Pc(41) int[][] local41 = this.method7154(1, arg0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static147.anInt3075; local79++) {
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
					@Pc(115) int local115 = 4096 - local85;
					local45[local79] = local57[local79] * local85 + local115 * local69[local79] >> 12;
					local49[local79] = local61[local79] * local85 + local73[local79] * local115 >> 12;
					local53[local79] = local65[local79] * local85 + local115 * local77[local79] >> 12;
				}
			}
		}
		return local11;
	}
}
