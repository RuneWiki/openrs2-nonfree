import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class5_Sub1_Sub31 extends Class5_Sub1 {

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZ)V")
	private void method3997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static224.anIntArray234[arg1];
		@Pc(18) int local18 = Static346.anIntArray401[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static114.anInt1940 = arg0;
			Static359.anInt5856 = arg1;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static114.anInt1940 = arg1;
			Static359.anInt5856 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static114.anInt1940 = arg1;
			Static359.anInt5856 = Static148.anInt2666 - arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static114.anInt1940 = Static458.anInt7496 - arg0;
			Static359.anInt5856 = arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static359.anInt5856 = Static148.anInt2666 - arg1;
			Static114.anInt1940 = Static458.anInt7496 - arg0;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static114.anInt1940 = Static458.anInt7496 - arg1;
			Static359.anInt5856 = Static148.anInt2666 - arg0;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static359.anInt5856 = arg0;
			Static114.anInt1940 = Static458.anInt7496 - arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static359.anInt5856 = Static148.anInt2666 - arg1;
			Static114.anInt1940 = arg0;
		}
		Static359.anInt5856 &= Static273.anInt4299;
		Static114.anInt1940 &= Static157.anInt2733;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static148.anInt2666; local29++) {
				this.method3997(arg0, local29);
				@Pc(42) int[][] local42 = this.method5764(0, Static114.anInt1940);
				local19[local29] = local42[0][Static359.anInt5856];
				local23[local29] = local42[1][Static359.anInt5856];
				local27[local29] = local42[2][Static359.anInt5856];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			for (@Pc(25) int local25 = 0; local25 < Static148.anInt2666; local25++) {
				this.method3997(arg0, local25);
				@Pc(38) int[] local38 = this.method5772(0, Static114.anInt1940);
				local19[local25] = local38[Static359.anInt5856];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}
}
