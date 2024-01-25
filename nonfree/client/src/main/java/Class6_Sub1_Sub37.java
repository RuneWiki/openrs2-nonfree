import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class6_Sub1_Sub37 extends Class6_Sub1 {

	@OriginalMember(owner = "client!tq", name = "H", descriptor = "[Lclient!fa;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[[I)V")
	private void method5278(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int local15 = Static299.anInt5659;
		@Pc(17) int local17 = Static273.anInt6145;
		Static61.method997(arg0);
		Static305.method5241(Static76.anInt2850, Static113.anInt2099);
		if (this.aClass43Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass43Array1.length; local31++) {
			@Pc(38) Class43 local38 = this.aClass43Array1[local31];
			@Pc(41) int local41 = local38.anInt5692;
			@Pc(44) int local44 = local38.anInt5696;
			if (local41 >= 0) {
				if (local44 < 0) {
					local38.method5174(local15, local17);
				} else {
					local38.method5169(local15, local17);
				}
			} else if (local44 >= 0) {
				local38.method5170(local17, local15);
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass43Array1 = new Class43[arg0.method3972()];
			for (@Pc(26) int local26 = 0; local26 < this.aClass43Array1.length; local26++) {
				@Pc(32) int local32 = arg0.method3972();
				if (local32 == 0) {
					this.aClass43Array1[local26] = Static34.method512(arg0);
				} else if (local32 == 1) {
					this.aClass43Array1[local26] = Static326.method5432(arg0);
				} else if (local32 == 2) {
					this.aClass43Array1[local26] = Static154.method3113(arg0);
				} else if (local32 == 3) {
					this.aClass43Array1[local26] = Static317.method5313(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			this.method5278(super.aClass140_41.method3662());
		}
		return local9;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(22) int local22 = Static299.anInt5659;
			@Pc(24) int local24 = Static273.anInt6145;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass220_41.method5815();
			this.method5278(local28);
			for (@Pc(39) int local39 = 0; local39 < Static273.anInt6145; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static299.anInt5659; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
