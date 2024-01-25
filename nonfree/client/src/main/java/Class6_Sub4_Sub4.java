import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class6_Sub4_Sub4 extends Class6_Sub4 {

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			for (@Pc(25) int local25 = 0; local25 < Static408.anInt7209; local25++) {
				this.method967(local25, arg0);
				@Pc(38) int[] local38 = this.method7748(0, Static526.anInt8810);
				local11[local25] = local38[Static510.anInt8649];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static408.anInt7209; local29++) {
				this.method967(local29, arg0);
				@Pc(42) int[][] local42 = this.method7747(Static526.anInt8810, 0);
				local19[local29] = local42[0][Static510.anInt8649];
				local23[local29] = local42[1][Static510.anInt8649];
				local27[local29] = local42[2][Static510.anInt8649];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZI)V")
	private void method967(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static398.anIntArray514[arg0];
		@Pc(13) int local13 = Static501.anIntArray637[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static510.anInt8649 = arg0;
			Static526.anInt8810 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static526.anInt8810 = arg0;
			Static510.anInt8649 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static510.anInt8649 = Static408.anInt7209 - arg1;
			Static526.anInt8810 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static510.anInt8649 = arg0;
			Static526.anInt8810 = Static88.anInt1743 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static526.anInt8810 = Static88.anInt1743 - arg1;
			Static510.anInt8649 = Static408.anInt7209 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static510.anInt8649 = Static408.anInt7209 - arg1;
			Static526.anInt8810 = Static88.anInt1743 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static526.anInt8810 = Static88.anInt1743 - arg0;
			Static510.anInt8649 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static510.anInt8649 = Static408.anInt7209 - arg0;
			Static526.anInt8810 = arg1;
		}
		Static510.anInt8649 &= Static368.anInt6505;
		Static526.anInt8810 &= Static457.anInt7873;
	}
}
