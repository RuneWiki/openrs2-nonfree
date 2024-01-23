import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
	private int anInt3830 = 32768;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub24() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		Static216.method3645();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(28) int[] local28 = this.method4946(arg0, 1);
			@Pc(34) int[] local34 = this.method4946(arg0, 2);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			for (@Pc(48) int local48 = 0; local48 < Static114.anInt1359; local48++) {
				@Pc(60) int local60 = this.anInt3830 * local34[local48] >> 12;
				@Pc(70) int local70 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(78) int local78 = local60 * Static198.anIntArray344[local70] >> 12;
				@Pc(86) int local86 = Static201.anIntArray347[local70] * local60 >> 12;
				@Pc(95) int local95 = local48 + (local86 >> 12) & Static129.anInt2676;
				@Pc(103) int local103 = arg0 + (local78 >> 12) & Static39.anInt939;
				@Pc(109) int[][] local109 = this.method4937(0, local103);
				local38[local48] = local109[0][local95];
				local42[local48] = local109[1][local95];
				local46[local48] = local109[2][local95];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(27) int[] local27 = this.method4946(arg0, 1);
			@Pc(33) int[] local33 = this.method4946(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static114.anInt1359; local35++) {
				@Pc(46) int local46 = local27[local35] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt3830 * local33[local35] >> 12;
				@Pc(63) int local63 = Static201.anIntArray347[local46] * local55 >> 12;
				@Pc(71) int local71 = Static198.anIntArray344[local46] * local55 >> 12;
				@Pc(79) int local79 = (local63 >> 12) + local35 & Static129.anInt2676;
				@Pc(87) int local87 = arg0 + (local71 >> 12) & Static39.anInt939;
				@Pc(93) int[] local93 = this.method4946(local87, 0);
				local17[local35] = local93[local79];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3830 = arg0.method4242() << 4;
		} else if (arg1 == 1) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}
}
