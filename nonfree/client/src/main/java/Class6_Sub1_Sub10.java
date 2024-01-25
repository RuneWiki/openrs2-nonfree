import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class6_Sub1_Sub10 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "[Lclient!so;")
	private Class77[] aClass77Array1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			this.method2627(super.aClass187_41.method4592());
		}
		return local9;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([[II)V")
	private void method2627(@OriginalArg(0) int[][] arg0) {
		@Pc(11) int local11 = Static289.anInt5549;
		@Pc(13) int local13 = Static468.anInt8642;
		Static519.method7598(arg0);
		Static136.method2552(Static574.anInt9711, Static153.anInt3343);
		if (this.aClass77Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass77Array1.length; local27++) {
			@Pc(34) Class77 local34 = this.aClass77Array1[local27];
			@Pc(37) int local37 = local34.anInt6155;
			@Pc(40) int local40 = local34.anInt6157;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method5254(local11, local13);
				}
			} else if (local40 >= 0) {
				local34.method5253(local11, local13);
			} else {
				local34.method5256(local11, local13);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(23) int local23 = Static289.anInt5549;
			@Pc(25) int local25 = Static468.anInt8642;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass184_41.method4581();
			this.method2627(local29);
			for (@Pc(40) int local40 = 0; local40 < Static468.anInt8642; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static289.anInt5549; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.aClass77Array1 = new Class77[arg1.method4966()];
			for (@Pc(38) int local38 = 0; local38 < this.aClass77Array1.length; local38++) {
				@Pc(44) int local44 = arg1.method4966();
				if (local44 == 0) {
					this.aClass77Array1[local38] = Static422.method6535(arg1);
				} else if (local44 == 1) {
					this.aClass77Array1[local38] = Static300.method4866(arg1);
				} else if (local44 == 2) {
					this.aClass77Array1[local38] = Static297.method4043(arg1);
				} else if (local44 == 3) {
					this.aClass77Array1[local38] = Static474.method7264(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean719 = arg1.method4966() == 1;
			return;
		}
	}
}
