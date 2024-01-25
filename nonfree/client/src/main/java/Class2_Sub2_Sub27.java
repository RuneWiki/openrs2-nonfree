import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(III)V")
	private void method4600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static427.anIntArray587[arg0];
		@Pc(13) int local13 = Static168.anIntArray524[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static326.anInt5843 = arg0;
			Static97.anInt1555 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static326.anInt5843 = arg1;
			Static97.anInt1555 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static326.anInt5843 = Static398.anInt6955 - arg1;
			Static97.anInt1555 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static97.anInt1555 = Static271.anInt4925 - arg1;
			Static326.anInt5843 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static97.anInt1555 = Static271.anInt4925 - arg1;
			Static326.anInt5843 = Static398.anInt6955 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static326.anInt5843 = Static398.anInt6955 - arg1;
			Static97.anInt1555 = Static271.anInt4925 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static97.anInt1555 = Static271.anInt4925 - arg0;
			Static326.anInt5843 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static326.anInt5843 = Static398.anInt6955 - arg0;
			Static97.anInt1555 = arg1;
		}
		Static326.anInt5843 &= Static210.anInt3600;
		Static97.anInt1555 &= Static71.anInt1203;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			for (@Pc(22) int local22 = 0; local22 < Static398.anInt6955; local22++) {
				this.method4600(local22, arg0);
				@Pc(35) int[] local35 = this.method6266(0, Static97.anInt1555);
				local16[local22] = local35[Static326.anInt5843];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static398.anInt6955; local29++) {
				this.method4600(local29, arg0);
				@Pc(42) int[][] local42 = this.method6276(0, Static97.anInt1555);
				local19[local29] = local42[0][Static326.anInt5843];
				local23[local29] = local42[1][Static326.anInt5843];
				local27[local29] = local42[2][Static326.anInt5843];
			}
		}
		return local11;
	}
}
