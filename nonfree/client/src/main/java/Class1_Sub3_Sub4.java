import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIZ)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static384.anIntArray551[arg1];
		@Pc(18) int local18 = Static342.anIntArray469[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local14 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static437.anInt7556 = arg1;
			Static41.anInt7071 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static41.anInt7071 = arg1;
			Static437.anInt7556 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static41.anInt7071 = arg1;
			Static437.anInt7556 = Static347.anInt5974 - arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static437.anInt7556 = arg1;
			Static41.anInt7071 = Static241.anInt4307 - arg0;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static41.anInt7071 = Static241.anInt4307 - arg0;
			Static437.anInt7556 = Static347.anInt5974 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static437.anInt7556 = Static347.anInt5974 - arg0;
			Static41.anInt7071 = Static241.anInt4307 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static437.anInt7556 = arg0;
			Static41.anInt7071 = Static241.anInt4307 - arg1;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static41.anInt7071 = arg0;
			Static437.anInt7556 = Static347.anInt5974 - arg1;
		}
		Static437.anInt7556 &= Static307.anInt5524;
		Static41.anInt7071 &= Static274.anInt4887;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			for (@Pc(22) int local22 = 0; local22 < Static347.anInt5974; local22++) {
				this.method644(arg0, local22);
				@Pc(35) int[] local35 = this.method6076(0, Static41.anInt7071);
				local16[local22] = local35[Static437.anInt7556];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static347.anInt5974; local29++) {
				this.method644(arg0, local29);
				@Pc(42) int[][] local42 = this.method6072(0, Static41.anInt7071);
				local19[local29] = local42[0][Static437.anInt7556];
				local23[local29] = local42[1][Static437.anInt7556];
				local27[local29] = local42[2][Static437.anInt7556];
			}
		}
		return local11;
	}
}
