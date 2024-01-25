import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	static {
		new Class114("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static236.anInt4609; local34++) {
				this.method7331(local34, arg0);
				@Pc(47) int[][] local47 = this.method7910(0, Static522.anInt8862);
				local24[local34] = local47[0][Static496.anInt8444];
				local28[local34] = local47[1][Static496.anInt8444];
				local32[local34] = local47[2][Static496.anInt8444];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
	private void method7331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static201.anIntArray324[arg0];
		@Pc(13) int local13 = Static305.anIntArray416[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static496.anInt8444 = arg0;
			Static522.anInt8862 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static496.anInt8444 = arg1;
			Static522.anInt8862 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static522.anInt8862 = arg0;
			Static496.anInt8444 = Static236.anInt4609 - arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static496.anInt8444 = arg0;
			Static522.anInt8862 = Static95.anInt2365 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static522.anInt8862 = Static95.anInt2365 - arg1;
			Static496.anInt8444 = Static236.anInt4609 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static522.anInt8862 = Static95.anInt2365 - arg0;
			Static496.anInt8444 = Static236.anInt4609 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static522.anInt8862 = Static95.anInt2365 - arg0;
			Static496.anInt8444 = arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static522.anInt8862 = arg1;
			Static496.anInt8444 = Static236.anInt4609 - arg0;
		}
		Static522.anInt8862 &= Static226.anInt4534;
		Static496.anInt8444 &= Static36.anInt1319;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			for (@Pc(22) int local22 = 0; local22 < Static236.anInt4609; local22++) {
				this.method7331(local22, arg0);
				@Pc(35) int[] local35 = this.method7911(Static522.anInt8862, 0);
				local16[local22] = local35[Static496.anInt8444];
			}
		}
		return local16;
	}
}
