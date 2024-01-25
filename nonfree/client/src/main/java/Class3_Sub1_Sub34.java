import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class3_Sub1_Sub34 extends Class3_Sub1 {

	@OriginalMember(owner = "client!st", name = "O", descriptor = "[Lclient!kba;")
	private Class43[] aClass43Array1;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			this.method7451(super.aClass313_41.method7615());
		}
		return local9;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([[II)V")
	private void method7451(@OriginalArg(0) int[][] arg0) {
		@Pc(12) int local12 = Static131.anInt2935;
		@Pc(14) int local14 = Static331.anInt6903;
		Static514.method7668(arg0);
		Static292.method6326(Static251.anInt5425, Static483.anInt9026);
		if (this.aClass43Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass43Array1.length; local28++) {
			@Pc(35) Class43 local35 = this.aClass43Array1[local28];
			@Pc(38) int local38 = local35.anInt8583;
			@Pc(41) int local41 = local35.anInt8586;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method7030(local14, local12);
				}
			} else if (local41 >= 0) {
				local35.method7034(local12, local14);
			} else {
				local35.method7033(local12, local14);
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(25) int local25 = Static131.anInt2935;
			@Pc(27) int local27 = Static331.anInt6903;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass220_41.method5789();
			this.method7451(local31);
			for (@Pc(42) int local42 = 0; local42 < Static331.anInt6903; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static131.anInt2935; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.aClass43Array1 = new Class43[arg1.method6538()];
			for (@Pc(11) int local11 = 0; local11 < this.aClass43Array1.length; local11++) {
				@Pc(19) int local19 = arg1.method6538();
				if (local19 == 0) {
					this.aClass43Array1[local11] = Static242.method4279(arg1);
				} else if (local19 == 1) {
					this.aClass43Array1[local11] = Static342.method5822(arg1);
				} else if (local19 == 2) {
					this.aClass43Array1[local11] = Static340.method5814(arg1);
				} else if (local19 == 3) {
					this.aClass43Array1[local11] = Static404.method6581(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}
}
