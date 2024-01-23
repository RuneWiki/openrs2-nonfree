import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
	private int anInt3954 = 32768;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		Static66.method1029();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3954 = arg1.method3948() << 4;
		} else if (arg0 == 1) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(28) int[] local28 = this.method4954(arg0, 1);
			@Pc(34) int[] local34 = this.method4954(arg0, 2);
			@Pc(38) int[] local38 = local18[1];
			@Pc(42) int[] local42 = local18[0];
			@Pc(46) int[] local46 = local18[2];
			for (@Pc(48) int local48 = 0; local48 < Static22.anInt421; local48++) {
				@Pc(61) int local61 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt3954 * local34[local48] >> 12;
				@Pc(78) int local78 = local70 * Static220.anIntArray542[local61] >> 12;
				@Pc(86) int local86 = Static122.anIntArray279[local61] * local70 >> 12;
				@Pc(94) int local94 = Static148.anInt2810 & (local86 >> 12) + arg0;
				@Pc(103) int local103 = Static84.anInt1566 & local48 + (local78 >> 12);
				@Pc(109) int[][] local109 = this.method4965(local94, 0);
				local42[local48] = local109[0][local103];
				local38[local48] = local109[1][local103];
				local46[local48] = local109[2][local103];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(27) int[] local27 = this.method4954(arg0, 1);
			@Pc(33) int[] local33 = this.method4954(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static22.anInt421; local35++) {
				@Pc(50) int local50 = local27[local35] >> 4 & 0xFF;
				@Pc(59) int local59 = this.anInt3954 * local33[local35] >> 12;
				@Pc(67) int local67 = Static220.anIntArray542[local50] * local59 >> 12;
				@Pc(75) int local75 = local59 * Static122.anIntArray279[local50] >> 12;
				@Pc(83) int local83 = (local67 >> 12) + local35 & Static84.anInt1566;
				@Pc(91) int local91 = Static148.anInt2810 & (local75 >> 12) + arg0;
				@Pc(97) int[] local97 = this.method4954(local91, 0);
				local17[local35] = local97[local83];
			}
		}
		return local17;
	}
}
