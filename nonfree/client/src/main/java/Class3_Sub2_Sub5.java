import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(3, false);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(29) int[] local29 = this.method8669(arg0, 0);
			@Pc(35) int[] local35 = this.method8669(arg0, 1);
			@Pc(41) int[] local41 = this.method8669(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static201.anInt3738; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local49 * local29[local43] + (4096 - local49) * local35[local43] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(21) int[] local21 = this.method8669(arg0, 2);
			@Pc(27) int[][] local27 = this.method8672(0, arg0);
			@Pc(33) int[][] local33 = this.method8672(1, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static201.anInt3738; local71++) {
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
					@Pc(129) int local129 = 4096 - local77;
					local37[local71] = local61[local71] * local129 + local77 * local49[local71] >> 12;
					local41[local71] = local129 * local65[local71] + local77 * local53[local71] >> 12;
					local45[local71] = local69[local71] * local129 + local77 * local57[local71] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}
}
