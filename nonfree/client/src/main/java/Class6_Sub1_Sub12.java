import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class6_Sub1_Sub12 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub12() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(21) int[] local21 = this.method8731(arg0, 2);
			@Pc(27) int[][] local27 = this.method8725(arg0, 0);
			@Pc(33) int[][] local33 = this.method8725(arg0, 1);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static53.anInt1787; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(107) int local107 = 4096 - local77;
					local37[local71] = local77 * local49[local71] + local61[local71] * local107 >> 12;
					local41[local71] = local53[local71] * local77 + local107 * local65[local71] >> 12;
					local45[local71] = local69[local71] * local107 + local57[local71] * local77 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(29) int[] local29 = this.method8731(arg0, 0);
			@Pc(35) int[] local35 = this.method8731(arg0, 1);
			@Pc(41) int[] local41 = this.method8731(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static53.anInt1787; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local35[local43] * (4096 - local49) + local49 * local29[local43] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}
}
