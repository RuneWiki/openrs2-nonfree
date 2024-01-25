import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class2_Sub1_Sub38 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZI)V")
	private void method5766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static252.anIntArray323[arg1];
		@Pc(13) int local13 = Static373.anIntArray55[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static86.anInt2008 = arg0;
			Static174.anInt3372 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static174.anInt3372 = arg0;
			Static86.anInt2008 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static86.anInt2008 = arg1;
			Static174.anInt3372 = Static131.anInt2581 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static174.anInt3372 = arg1;
			Static86.anInt2008 = Static266.anInt4930 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static86.anInt2008 = Static266.anInt4930 - arg0;
			Static174.anInt3372 = Static131.anInt2581 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static174.anInt3372 = Static131.anInt2581 - arg0;
			Static86.anInt2008 = Static266.anInt4930 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static86.anInt2008 = Static266.anInt4930 - arg1;
			Static174.anInt3372 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static174.anInt3372 = Static131.anInt2581 - arg1;
			Static86.anInt2008 = arg0;
		}
		Static86.anInt2008 &= Static36.anInt893;
		Static174.anInt3372 &= Static287.anInt5227;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(21) int[] local21 = local13[0];
			@Pc(25) int[] local25 = local13[1];
			@Pc(29) int[] local29 = local13[2];
			for (@Pc(31) int local31 = 0; local31 < Static131.anInt2581; local31++) {
				this.method5766(arg0, local31);
				@Pc(44) int[][] local44 = this.method6031(0, Static86.anInt2008);
				local21[local31] = local44[0][Static174.anInt3372];
				local25[local31] = local44[1][Static174.anInt3372];
				local29[local31] = local44[2][Static174.anInt3372];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2581; local22++) {
				this.method5766(arg0, local22);
				@Pc(35) int[] local35 = this.method6037(Static86.anInt2008, 0);
				local11[local22] = local35[Static174.anInt3372];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}
}
