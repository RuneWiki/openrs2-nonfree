import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "[Lclient!ee;")
	private Class28[] aClass28Array1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass28Array1 = new Class28[arg0.method209()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass28Array1.length; local11++) {
				@Pc(19) int local19 = arg0.method209();
				if (local19 == 0) {
					this.aClass28Array1[local11] = Static71.method1301(arg0);
				} else if (local19 == 1) {
					this.aClass28Array1[local11] = Static128.method2081(arg0);
				} else if (local19 == 2) {
					this.aClass28Array1[local11] = Static11.method286(arg0);
				} else if (local19 == 3) {
					this.aClass28Array1[local11] = Static74.method1380(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			this.method2002(super.aClass73_41.method2246());
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(17) int local17 = Static62.anInt1675;
			@Pc(19) int local19 = Static25.anInt4767;
			@Pc(24) int[][][] local24 = super.aClass99_41.method3150();
			@Pc(28) int[][] local28 = new int[local19][local17];
			this.method2002(local28);
			for (@Pc(34) int local34 = 0; local34 < Static25.anInt4767; local34++) {
				@Pc(40) int[] local40 = local28[local34];
				@Pc(44) int[][] local44 = local24[local34];
				@Pc(48) int[] local48 = local44[1];
				@Pc(52) int[] local52 = local44[2];
				@Pc(56) int[] local56 = local44[0];
				for (@Pc(58) int local58 = 0; local58 < Static62.anInt1675; local58++) {
					@Pc(64) int local64 = local40[local58];
					local52[local58] = (local64 & 0xFF) << 4;
					local48[local58] = local64 >> 4 & 0xFF0;
					local56[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([[IB)V")
	private void method2002(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static62.anInt1675;
		@Pc(9) int local9 = Static25.anInt4767;
		Static20.method428(arg0);
		Static211.method3252(Static195.anInt4423, Static41.anInt1259);
		if (this.aClass28Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass28Array1.length; local27++) {
			@Pc(34) Class28 local34 = this.aClass28Array1[local27];
			@Pc(37) int local37 = local34.anInt4139;
			@Pc(40) int local40 = local34.anInt4140;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method2857(local7, local9);
				}
			} else if (local40 < 0) {
				local34.method2853(local9, local7);
			} else {
				local34.method2851(local7, local9);
			}
		}
	}
}
