import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class8_Sub3_Sub10 extends Class8_Sub3 {

	@OriginalMember(owner = "client!em", name = "Q", descriptor = "[Lclient!ab;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([[IZ)V")
	private void method1131(@OriginalArg(0) int[][] arg0) {
		@Pc(3) int local3 = Static239.anInt4789;
		@Pc(9) int local9 = Static86.anInt1852;
		Static245.method3660(arg0);
		Static40.method619(Static51.anInt1120, Static214.anInt4402);
		if (this.aClass3Array1 == null) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < this.aClass3Array1.length; local24++) {
			@Pc(34) Class3 local34 = this.aClass3Array1[local24];
			@Pc(37) int local37 = local34.anInt4883;
			@Pc(40) int local40 = local34.anInt4886;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method3663(local3, local9);
				}
			} else if (local40 < 0) {
				local34.method3667(local9, local3);
			} else {
				local34.method3668(local3, local9);
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.aClass3Array1 = new Class3[arg1.method2334()];
			for (@Pc(36) int local36 = 0; local36 < this.aClass3Array1.length; local36++) {
				@Pc(45) int local45 = arg1.method2334();
				if (local45 == 0) {
					this.aClass3Array1[local36] = Static179.method2738(arg1);
				} else if (local45 == 1) {
					this.aClass3Array1[local36] = Static58.method1724(arg1);
				} else if (local45 == 2) {
					this.aClass3Array1[local36] = Static178.method2733(arg1);
				} else if (local45 == 3) {
					this.aClass3Array1[local36] = Static236.method3592(arg1);
				}
			}
		} else if (arg0 == 1) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(27) int local27 = Static239.anInt4789;
			@Pc(29) int local29 = Static86.anInt1852;
			@Pc(34) int[][][] local34 = this.aClass166_41.method4034();
			@Pc(38) int[][] local38 = new int[local29][local27];
			this.method1131(local38);
			for (@Pc(44) int local44 = 0; local44 < Static86.anInt1852; local44++) {
				@Pc(55) int[] local55 = local38[local44];
				@Pc(59) int[][] local59 = local34[local44];
				@Pc(63) int[] local63 = local59[1];
				@Pc(67) int[] local67 = local59[0];
				@Pc(71) int[] local71 = local59[2];
				for (@Pc(73) int local73 = 0; local73 < Static239.anInt4789; local73++) {
					@Pc(84) int local84 = local55[local73];
					local71[local73] = (local84 & 0xFF) << 4;
					local63[local73] = local84 >> 4 & 0xFF0;
					local67[local73] = local84 >> 12 & 0xFF0;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			this.method1131(this.aClass59_41.method1363());
		}
		return local15;
	}
}
