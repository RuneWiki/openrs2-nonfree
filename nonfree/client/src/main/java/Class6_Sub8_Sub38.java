import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class6_Sub8_Sub38 extends Class6_Sub8 {

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub38() {
		super(3, false);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(30) int[] local30 = this.method8930(arg0, 2);
			@Pc(38) int[][] local38 = this.method8928(0, arg0);
			@Pc(44) int[][] local44 = this.method8928(1, arg0);
			@Pc(48) int[] local48 = local11[0];
			@Pc(52) int[] local52 = local11[1];
			@Pc(56) int[] local56 = local11[2];
			@Pc(60) int[] local60 = local38[0];
			@Pc(64) int[] local64 = local38[1];
			@Pc(68) int[] local68 = local38[2];
			@Pc(72) int[] local72 = local44[0];
			@Pc(76) int[] local76 = local44[1];
			@Pc(80) int[] local80 = local44[2];
			for (@Pc(82) int local82 = 0; local82 < Static83.anInt1268; local82++) {
				@Pc(88) int local88 = local30[local82];
				if (local88 == 4096) {
					local48[local82] = local60[local82];
					local52[local82] = local64[local82];
					local56[local82] = local68[local82];
				} else if (local88 == 0) {
					local48[local82] = local72[local82];
					local52[local82] = local76[local82];
					local56[local82] = local80[local82];
				} else {
					@Pc(121) int local121 = 4096 - local88;
					local48[local82] = local60[local82] * local88 + local121 * local72[local82] >> 12;
					local52[local82] = local64[local82] * local88 + local121 * local76[local82] >> 12;
					local56[local82] = local68[local82] * local88 + local80[local82] * local121 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(21) int[] local21 = this.method8930(arg0, 0);
			@Pc(27) int[] local27 = this.method8930(arg0, 1);
			@Pc(33) int[] local33 = this.method8930(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static83.anInt1268; local35++) {
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
}
