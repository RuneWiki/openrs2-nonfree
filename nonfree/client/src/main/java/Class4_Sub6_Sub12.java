import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class4_Sub6_Sub12 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
	private int anInt1705 = 32768;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub12() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(29) int[] local29 = this.method4372(1, arg0);
			@Pc(35) int[] local35 = this.method4372(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static2.anInt19; local37++) {
				@Pc(52) int local52 = local29[local37] >> 4 & 0xFF;
				@Pc(61) int local61 = local35[local37] * this.anInt1705 >> 12;
				@Pc(69) int local69 = local61 * Static79.anIntArray165[local52] >> 12;
				@Pc(77) int local77 = Static168.anInt3337 & local37 + (local69 >> 12);
				@Pc(85) int local85 = Static53.anIntArray123[local52] * local61 >> 12;
				@Pc(94) int local94 = arg0 + (local85 >> 12) & Static137.anInt2812;
				@Pc(100) int[] local100 = this.method4372(0, local94);
				local11[local37] = local100[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(28) int[] local28 = this.method4372(1, arg0);
			@Pc(34) int[] local34 = this.method4372(2, arg0);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			for (@Pc(48) int local48 = 0; local48 < Static2.anInt19; local48++) {
				@Pc(61) int local61 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = this.anInt1705 * local34[local48] >> 12;
				@Pc(78) int local78 = Static53.anIntArray123[local61] * local70 >> 12;
				@Pc(86) int local86 = Static137.anInt2812 & (local78 >> 12) + arg0;
				@Pc(94) int local94 = Static79.anIntArray165[local61] * local70 >> 12;
				@Pc(102) int local102 = Static168.anInt3337 & (local94 >> 12) + local48;
				@Pc(108) int[][] local108 = this.method4377(local86, 0);
				local38[local48] = local108[0][local102];
				local42[local48] = local108[1][local102];
				local46[local48] = local108[2][local102];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1705 = arg0.method1837() << 4;
		} else if (arg1 == 1) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		Static197.method3082();
	}
}
