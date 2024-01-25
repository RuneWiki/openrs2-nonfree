import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static85.anInt1910; local35++) {
				this.method2457(arg0, local35);
				@Pc(48) int[][] local48 = this.method6006(0, Static31.anInt786);
				local25[local35] = local48[0][Static59.anInt1473];
				local29[local35] = local48[1][Static59.anInt1473];
				local33[local35] = local48[2][Static59.anInt1473];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)V")
	private void method2457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static273.anIntArray414[arg1];
		@Pc(13) int local13 = Static60.anIntArray122[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static31.anInt786 = arg0;
			Static59.anInt1473 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static31.anInt786 = arg1;
			Static59.anInt1473 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static31.anInt786 = arg1;
			Static59.anInt1473 = Static85.anInt1910 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static59.anInt1473 = arg1;
			Static31.anInt786 = Static208.anInt4105 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static59.anInt1473 = Static85.anInt1910 - arg1;
			Static31.anInt786 = Static208.anInt4105 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static59.anInt1473 = Static85.anInt1910 - arg0;
			Static31.anInt786 = Static208.anInt4105 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static31.anInt786 = Static208.anInt4105 - arg1;
			Static59.anInt1473 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static31.anInt786 = arg0;
			Static59.anInt1473 = Static85.anInt1910 - arg1;
		}
		Static59.anInt1473 &= Static346.anInt6542;
		Static31.anInt786 &= Static279.anInt5435;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			for (@Pc(22) int local22 = 0; local22 < Static85.anInt1910; local22++) {
				this.method2457(arg0, local22);
				@Pc(35) int[] local35 = this.method6013(Static31.anInt786, 0);
				local16[local22] = local35[Static59.anInt1473];
			}
		}
		return local16;
	}
}
