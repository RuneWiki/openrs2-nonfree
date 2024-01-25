import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(28) int[] local28 = this.method9204(arg0, 0);
			@Pc(34) int[] local34 = this.method9204(arg0, 1);
			@Pc(40) int[] local40 = this.method9204(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static636.anInt10302; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local11[local42] = local28[local42];
				} else if (local48 == 0) {
					local11[local42] = local34[local42];
				} else {
					local11[local42] = local48 * local28[local42] + (4096 - local48) * local34[local42] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			super.aBoolean794 = arg1.method5322(-64) == 1;
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(31) int[] local31 = this.method9204(arg0, 2);
			@Pc(39) int[][] local39 = this.method9212(0, arg0);
			@Pc(45) int[][] local45 = this.method9212(1, arg0);
			@Pc(49) int[] local49 = local19[0];
			@Pc(53) int[] local53 = local19[1];
			@Pc(57) int[] local57 = local19[2];
			@Pc(61) int[] local61 = local39[0];
			@Pc(65) int[] local65 = local39[1];
			@Pc(69) int[] local69 = local39[2];
			@Pc(73) int[] local73 = local45[0];
			@Pc(77) int[] local77 = local45[1];
			@Pc(81) int[] local81 = local45[2];
			for (@Pc(83) int local83 = 0; local83 < Static636.anInt10302; local83++) {
				@Pc(89) int local89 = local31[local83];
				if (local89 == 4096) {
					local49[local83] = local61[local83];
					local53[local83] = local65[local83];
					local57[local83] = local69[local83];
				} else if (local89 == 0) {
					local49[local83] = local73[local83];
					local53[local83] = local77[local83];
					local57[local83] = local81[local83];
				} else {
					@Pc(124) int local124 = 4096 - local89;
					local49[local83] = local61[local83] * local89 + local73[local83] * local124 >> 12;
					local53[local83] = local124 * local77[local83] + local89 * local65[local83] >> 12;
					local57[local83] = local89 * local69[local83] + local81[local83] * local124 >> 12;
				}
			}
		}
		return local19;
	}
}
