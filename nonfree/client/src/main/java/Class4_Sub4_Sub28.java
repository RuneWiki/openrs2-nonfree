import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class4_Sub4_Sub28 extends Class4_Sub4 {

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(21) int[] local21 = this.method5386(0, arg0);
			@Pc(27) int[] local27 = this.method5386(1, arg0);
			@Pc(33) int[] local33 = this.method5386(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static124.anInt3576; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = (4096 - local41) * local27[local35] + local41 * local21[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(29) int[] local29 = this.method5386(2, arg0);
			@Pc(35) int[][] local35 = this.method5384(0, arg0);
			@Pc(41) int[][] local41 = this.method5384(1, arg0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static124.anInt3576; local79++) {
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
					@Pc(97) int local97 = 4096 - local85;
					local45[local79] = local85 * local57[local79] + local97 * local69[local79] >> 12;
					local49[local79] = local61[local79] * local85 + local73[local79] * local97 >> 12;
					local53[local79] = local77[local79] * local97 + local85 * local65[local79] >> 12;
				}
			}
		}
		return local11;
	}
}
