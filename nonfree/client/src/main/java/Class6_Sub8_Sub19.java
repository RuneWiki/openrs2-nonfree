import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class6_Sub8_Sub19 extends Class6_Sub8 {

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(27) int[][] local27 = this.method8928(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static83.anInt1268; local53++) {
				local43[local53] = 4096 - local31[local53];
				local47[local53] = 4096 - local35[local53];
				local51[local53] = 4096 - local39[local53];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(29) int[] local29 = this.method8930(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static83.anInt1268; local31++) {
				local11[local31] = 4096 - local29[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}
}
