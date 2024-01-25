import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class6_Sub3_Sub13 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ica", name = "C", descriptor = "[Lclient!vca;")
	private Class38[] aClass38Array1;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(25) int local25 = Static447.anInt8568;
			@Pc(27) int local27 = Static495.anInt8251;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass103_41.method2139();
			this.method3035(local31);
			for (@Pc(42) int local42 = 0; local42 < Static495.anInt8251; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static447.anInt8568; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			this.method3035(super.aClass174_41.method3727());
		}
		return local17;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.aClass38Array1 = new Class38[arg1.method6041()];
			for (@Pc(22) int local22 = 0; local22 < this.aClass38Array1.length; local22++) {
				@Pc(28) int local28 = arg1.method6041();
				if (local28 == 0) {
					this.aClass38Array1[local22] = Static433.method6259(arg1);
				} else if (local28 == 1) {
					this.aClass38Array1[local22] = Static396.method5852(arg1);
				} else if (local28 == 2) {
					this.aClass38Array1[local22] = Static510.method6880(arg1);
				} else if (local28 == 3) {
					this.aClass38Array1[local22] = Static506.method6957(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I[[I)V")
	private void method3035(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static447.anInt8568;
		@Pc(9) int local9 = Static495.anInt8251;
		Static95.method1492(arg0);
		Static247.method3534(Static252.anInt4135, Static392.anInt6966);
		if (this.aClass38Array1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < this.aClass38Array1.length; local25++) {
			@Pc(32) Class38 local32 = this.aClass38Array1[local25];
			@Pc(35) int local35 = local32.anInt6087;
			@Pc(38) int local38 = local32.anInt6088;
			if (local35 >= 0) {
				if (local38 < 0) {
					local32.method5174(local9, local7);
				} else {
					local32.method5175(local7, local9);
				}
			} else if (local38 >= 0) {
				local32.method5171(local9, local7);
			}
		}
	}
}
