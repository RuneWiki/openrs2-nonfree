import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!di", name = "V", descriptor = "[Lclient!v;")
	private Class33[] aClass33Array1;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass33Array1 = new Class33[arg0.method3010()];
			for (@Pc(28) int local28 = 0; local28 < this.aClass33Array1.length; local28++) {
				@Pc(34) int local34 = arg0.method3010();
				if (local34 == 0) {
					this.aClass33Array1[local28] = Static70.method1084(arg0);
				} else if (local34 == 1) {
					this.aClass33Array1[local28] = Static39.method719(arg0);
				} else if (local34 == 2) {
					this.aClass33Array1[local28] = Static168.method2631(arg0);
				} else if (local34 == 3) {
					this.aClass33Array1[local28] = Static27.method493(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(22) int local22 = Static107.anInt2321;
			@Pc(24) int local24 = Static123.anInt2607;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass75_41.method2103();
			this.method707(local28);
			for (@Pc(39) int local39 = 0; local39 < Static123.anInt2607; local39++) {
				@Pc(45) int[][] local45 = local33[local39];
				@Pc(49) int[] local49 = local28[local39];
				@Pc(53) int[] local53 = local45[0];
				@Pc(57) int[] local57 = local45[1];
				@Pc(61) int[] local61 = local45[2];
				for (@Pc(63) int local63 = 0; local63 < Static107.anInt2321; local63++) {
					@Pc(69) int local69 = local49[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			this.method707(super.aClass43_41.method1182());
		}
		return local9;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([[IB)V")
	private void method707(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static107.anInt2321;
		@Pc(17) int local17 = Static123.anInt2607;
		Static149.method2263(arg0);
		Static8.method158(Static15.anInt388, Static144.anInt2893);
		if (this.aClass33Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass33Array1.length; local31++) {
			@Pc(38) Class33 local38 = this.aClass33Array1[local31];
			@Pc(41) int local41 = local38.anInt3057;
			@Pc(44) int local44 = local38.anInt3058;
			if (local44 < 0) {
				if (local41 >= 0) {
					local38.method2269(local7, local17);
				}
			} else if (local41 >= 0) {
				local38.method2267(local17, local7);
			} else {
				local38.method2270(local7, local17);
			}
		}
	}
}
