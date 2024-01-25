import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class4_Sub2_Sub33 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static269.anInt4330; local37++) {
				this.method7933(arg0, local37);
				@Pc(50) int[][] local50 = this.method8772(Static664.anInt10421, 0);
				local27[local37] = local50[0][Static482.anInt7595];
				local31[local37] = local50[1][Static482.anInt7595];
				local35[local37] = local50[2][Static482.anInt7595];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			for (@Pc(24) int local24 = 0; local24 < Static269.anInt4330; local24++) {
				this.method7933(arg0, local24);
				@Pc(37) int[] local37 = this.method8768(0, Static664.anInt10421);
				local18[local24] = local37[Static482.anInt7595];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)V")
	private void method7933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static312.anIntArray370[arg1];
		@Pc(13) int local13 = Static429.anIntArray465[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static482.anInt7595 = arg1;
			Static664.anInt10421 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static664.anInt10421 = arg1;
			Static482.anInt7595 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static664.anInt10421 = arg1;
			Static482.anInt7595 = Static269.anInt4330 - arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static482.anInt7595 = arg1;
			Static664.anInt10421 = Static355.anInt5410 - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static482.anInt7595 = Static269.anInt4330 - arg1;
			Static664.anInt10421 = Static355.anInt5410 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static482.anInt7595 = Static269.anInt4330 - arg0;
			Static664.anInt10421 = Static355.anInt5410 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static482.anInt7595 = arg0;
			Static664.anInt10421 = Static355.anInt5410 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static664.anInt10421 = arg0;
			Static482.anInt7595 = Static269.anInt4330 - arg1;
		}
		Static664.anInt10421 &= Static489.anInt7677;
		Static482.anInt7595 &= Static215.anInt3481;
	}
}
