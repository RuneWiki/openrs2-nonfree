import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!co", name = "I", descriptor = "I")
	private int anInt1145 = 3072;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "I")
	private int anInt1143 = 1024;

	@OriginalMember(owner = "client!co", name = "P", descriptor = "I")
	private int anInt1151 = 2048;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(29) int[] local29 = this.method5654(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static251.anInt6509; local31++) {
				local19[local31] = this.anInt1143 + (this.anInt1151 * local29[local31] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		this.anInt1151 = this.anInt1145 - this.anInt1143;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(26) int[][] local26 = this.method5659(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static251.anInt6509; local52++) {
				local42[local52] = (local30[local52] * this.anInt1151 >> 12) + this.anInt1143;
				local46[local52] = this.anInt1143 + (local34[local52] * this.anInt1151 >> 12);
				local50[local52] = (local38[local52] * this.anInt1151 >> 12) + this.anInt1143;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1143 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt1145 = arg1.method3115();
		} else if (arg0 == 2) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}
}
