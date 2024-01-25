import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class6_Sub4_Sub19 extends Class6_Sub4 {

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			for (@Pc(33) int local33 = 0; local33 < Static6.anInt111; local33++) {
				this.method4760(arg0, local33);
				@Pc(46) int[][] local46 = this.method8319(0, Static539.anInt9301);
				local23[local33] = local46[0][Static169.anInt3514];
				local27[local33] = local46[1][Static169.anInt3514];
				local31[local33] = local46[2][Static169.anInt3514];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)V")
	private void method4760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static284.anIntArray482[arg1];
		@Pc(16) int local16 = Static629.anIntArray635[arg0];
		@Pc(27) float local27 = (float) Math.atan2((double) (local9 - 2048), (double) (local16 - 2048));
		if ((double) local27 >= -3.141592653589793D && (double) local27 <= -2.356194490192345D) {
			Static169.anInt3514 = arg1;
			Static539.anInt9301 = arg0;
		} else if ((double) local27 <= -1.5707963267948966D && (double) local27 >= -2.356194490192345D) {
			Static539.anInt9301 = arg1;
			Static169.anInt3514 = arg0;
		} else if ((double) local27 <= -0.7853981633974483D && (double) local27 >= -1.5707963267948966D) {
			Static539.anInt9301 = arg1;
			Static169.anInt3514 = Static6.anInt111 - arg0;
		} else if (local27 <= 0.0F && (double) local27 >= -0.7853981633974483D) {
			Static169.anInt3514 = arg1;
			Static539.anInt9301 = Static429.anInt7811 - arg0;
		} else if (local27 >= 0.0F && (double) local27 <= 0.7853981633974483D) {
			Static539.anInt9301 = Static429.anInt7811 - arg0;
			Static169.anInt3514 = Static6.anInt111 - arg1;
		} else if ((double) local27 >= 0.7853981633974483D && (double) local27 <= 1.5707963267948966D) {
			Static539.anInt9301 = Static429.anInt7811 - arg1;
			Static169.anInt3514 = Static6.anInt111 - arg0;
		} else if ((double) local27 >= 1.5707963267948966D && (double) local27 <= 2.356194490192345D) {
			Static169.anInt3514 = arg0;
			Static539.anInt9301 = Static429.anInt7811 - arg1;
		} else if ((double) local27 >= 2.356194490192345D && (double) local27 <= 3.141592653589793D) {
			Static169.anInt3514 = Static6.anInt111 - arg1;
			Static539.anInt9301 = arg0;
		}
		Static169.anInt3514 &= Static325.anInt6209;
		Static539.anInt9301 &= Static2.anInt12;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			for (@Pc(22) int local22 = 0; local22 < Static6.anInt111; local22++) {
				this.method4760(arg0, local22);
				@Pc(35) int[] local35 = this.method8313(Static539.anInt9301, 0);
				local16[local22] = local35[Static169.anInt3514];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}
}
