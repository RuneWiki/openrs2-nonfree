import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			for (@Pc(22) int local22 = 0; local22 < Static158.anInt2658; local22++) {
				this.method4556(arg0, local22);
				@Pc(35) int[] local35 = this.method5510(Static179.anInt3200, 0);
				local11[local22] = local35[Static64.anInt1268];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(23) int[] local23 = local15[0];
			@Pc(27) int[] local27 = local15[1];
			@Pc(31) int[] local31 = local15[2];
			for (@Pc(33) int local33 = 0; local33 < Static158.anInt2658; local33++) {
				this.method4556(arg0, local33);
				@Pc(46) int[][] local46 = this.method5514(Static179.anInt3200, 0);
				local23[local33] = local46[0][Static64.anInt1268];
				local27[local33] = local46[1][Static64.anInt1268];
				local31[local33] = local46[2][Static64.anInt1268];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(BII)V")
	private void method4556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static87.anIntArray211[arg1];
		@Pc(13) int local13 = Static394.anIntArray751[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static179.anInt3200 = arg0;
			Static64.anInt1268 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static64.anInt1268 = arg0;
			Static179.anInt3200 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static64.anInt1268 = Static158.anInt2658 - arg0;
			Static179.anInt3200 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static179.anInt3200 = Static91.anInt1665 - arg0;
			Static64.anInt1268 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static179.anInt3200 = Static91.anInt1665 - arg0;
			Static64.anInt1268 = Static158.anInt2658 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static64.anInt1268 = Static158.anInt2658 - arg0;
			Static179.anInt3200 = Static91.anInt1665 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static64.anInt1268 = arg0;
			Static179.anInt3200 = Static91.anInt1665 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static64.anInt1268 = Static158.anInt2658 - arg1;
			Static179.anInt3200 = arg0;
		}
		Static64.anInt1268 &= Static271.anInt4721;
		Static179.anInt3200 &= Static13.anInt189;
	}
}
