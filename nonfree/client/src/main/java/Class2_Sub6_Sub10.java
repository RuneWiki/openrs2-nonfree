import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class2_Sub6_Sub10 extends Class2_Sub6 {

	@OriginalMember(owner = "client!go", name = "O", descriptor = "[Lclient!hr;")
	private Class104[] aClass104Array1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			this.method2191(super.aClass166_41.method3990());
		}
		return local9;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass104Array1 = new Class104[arg0.method4240()];
			for (@Pc(32) int local32 = 0; local32 < this.aClass104Array1.length; local32++) {
				@Pc(38) int local38 = arg0.method4240();
				if (local38 == 0) {
					this.aClass104Array1[local32] = Static191.method3066(arg0);
				} else if (local38 == 1) {
					this.aClass104Array1[local32] = Static141.method2444(arg0);
				} else if (local38 == 2) {
					this.aClass104Array1[local32] = Static259.method4046(arg0);
				} else if (local38 == 3) {
					this.aClass104Array1[local32] = Static184.method5414(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(22) int local22 = Static151.anInt2711;
			@Pc(24) int local24 = Static372.anInt6520;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass208_41.method4985();
			this.method2191(local28);
			for (@Pc(39) int local39 = 0; local39 < Static372.anInt6520; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static151.anInt2711; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B[[I)V")
	private void method2191(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static151.anInt2711;
		@Pc(9) int local9 = Static372.anInt6520;
		Static221.method3735(arg0);
		Static239.method3880(Static71.anInt1349, Static274.anInt1078);
		if (this.aClass104Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass104Array1.length; local27++) {
			@Pc(34) Class104 local34 = this.aClass104Array1[local27];
			@Pc(37) int local37 = local34.anInt5808;
			@Pc(40) int local40 = local34.anInt5807;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method5084(local9, local7);
				}
			} else if (local40 >= 0) {
				local34.method5080(local9, local7);
			} else {
				local34.method5079(local7, local9);
			}
		}
	}
}
