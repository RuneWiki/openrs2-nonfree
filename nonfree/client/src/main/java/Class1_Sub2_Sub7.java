import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!el", name = "M", descriptor = "I")
	private int anInt1235 = 1024;

	@OriginalMember(owner = "client!el", name = "S", descriptor = "I")
	private int anInt1241 = 2048;

	@OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
	private int anInt1247 = 3072;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(27) int[] local27 = this.method4570(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static299.anInt5670; local29++) {
				local11[local29] = (local27[local29] * this.anInt1241 >> 12) + this.anInt1235;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(22) int[][] local22 = this.method4575(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local22[1];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[2];
			for (@Pc(48) int local48 = 0; local48 < Static299.anInt5670; local48++) {
				local42[local48] = (local26[local48] * this.anInt1241 >> 12) + this.anInt1235;
				local34[local48] = this.anInt1235 + (local38[local48] * this.anInt1241 >> 12);
				local46[local48] = (local30[local48] * this.anInt1241 >> 12) + this.anInt1235;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		this.anInt1241 = this.anInt1247 - this.anInt1235;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1235 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt1247 = arg0.method2593();
		} else if (arg1 == 2) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}
}
