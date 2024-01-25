import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class6_Sub8_Sub34 extends Class6_Sub8 {

	@OriginalMember(owner = "client!uea", name = "F", descriptor = "I")
	private int anInt9660 = 1024;

	@OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
	private int anInt9665 = 3072;

	@OriginalMember(owner = "client!uea", name = "J", descriptor = "I")
	private int anInt9659 = 2048;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(34) int[][] local34 = this.method8928(0, arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local22[0];
			@Pc(54) int[] local54 = local22[1];
			@Pc(58) int[] local58 = local22[2];
			for (@Pc(60) int local60 = 0; local60 < Static83.anInt1268; local60++) {
				local50[local60] = this.anInt9660 + (local38[local60] * this.anInt9659 >> 12);
				local54[local60] = this.anInt9660 + (this.anInt9659 * local42[local60] >> 12);
				local58[local60] = this.anInt9660 + (this.anInt9659 * local46[local60] >> 12);
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(21) int[] local21 = this.method8930(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static83.anInt1268; local23++) {
				local11[local23] = (this.anInt9659 * local21[local23] >> 12) + this.anInt9660;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9660 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt9665 = arg1.method3018();
		} else if (arg0 == 2) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		this.anInt9659 = this.anInt9665 - this.anInt9660;
	}
}
