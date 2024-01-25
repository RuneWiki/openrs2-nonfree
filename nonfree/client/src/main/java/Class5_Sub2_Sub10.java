import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	private void method1488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static257.anIntArray386[arg1];
		@Pc(13) int local13 = Static287.anIntArray413[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static27.anInt5302 = arg0;
			Static299.anInt5761 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static299.anInt5761 = arg0;
			Static27.anInt5302 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static299.anInt5761 = Static15.anInt493 - arg0;
			Static27.anInt5302 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static299.anInt5761 = arg1;
			Static27.anInt5302 = Static88.anInt1584 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static27.anInt5302 = Static88.anInt1584 - arg0;
			Static299.anInt5761 = Static15.anInt493 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static27.anInt5302 = Static88.anInt1584 - arg1;
			Static299.anInt5761 = Static15.anInt493 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static27.anInt5302 = Static88.anInt1584 - arg1;
			Static299.anInt5761 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static299.anInt5761 = Static15.anInt493 - arg1;
			Static27.anInt5302 = arg0;
		}
		Static299.anInt5761 &= Static317.anInt6151;
		Static27.anInt5302 &= Static19.anInt547;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static15.anInt493; local37++) {
				this.method1488(arg0, local37);
				@Pc(50) int[][] local50 = this.method5818(Static27.anInt5302, 0);
				local27[local37] = local50[0][Static299.anInt5761];
				local31[local37] = local50[1][Static299.anInt5761];
				local35[local37] = local50[2][Static299.anInt5761];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			for (@Pc(19) int local19 = 0; local19 < Static15.anInt493; local19++) {
				this.method1488(arg0, local19);
				@Pc(32) int[] local32 = this.method5808(0, Static27.anInt5302);
				local13[local19] = local32[Static299.anInt5761];
			}
		}
		return local13;
	}
}
