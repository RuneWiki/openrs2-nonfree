import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class3_Sub1_Sub22 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IBI)V")
	private void method5637(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static361.anIntArray460[arg0];
		@Pc(18) int local18 = Static324.anIntArray440[arg1];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static533.anInt9681 = arg0;
			Static564.anInt10010 = arg1;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static533.anInt9681 = arg1;
			Static564.anInt10010 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static533.anInt9681 = Static131.anInt2935 - arg1;
			Static564.anInt10010 = arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static533.anInt9681 = arg0;
			Static564.anInt10010 = Static331.anInt6903 - arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static533.anInt9681 = Static131.anInt2935 - arg0;
			Static564.anInt10010 = Static331.anInt6903 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static533.anInt9681 = Static131.anInt2935 - arg1;
			Static564.anInt10010 = Static331.anInt6903 - arg0;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static533.anInt9681 = arg1;
			Static564.anInt10010 = Static331.anInt6903 - arg0;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static533.anInt9681 = Static131.anInt2935 - arg0;
			Static564.anInt10010 = arg1;
		}
		Static564.anInt10010 &= Static483.anInt9026;
		Static533.anInt9681 &= Static251.anInt5425;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2935; local22++) {
				this.method5637(local22, arg0);
				@Pc(35) int[] local35 = this.method8362(Static564.anInt10010, 0);
				local16[local22] = local35[Static533.anInt9681];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static131.anInt2935; local37++) {
				this.method5637(local37, arg0);
				@Pc(50) int[][] local50 = this.method8360(0, Static564.anInt10010);
				local27[local37] = local50[0][Static533.anInt9681];
				local31[local37] = local50[1][Static533.anInt9681];
				local35[local37] = local50[2][Static533.anInt9681];
			}
		}
		return local11;
	}
}
