import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class1_Sub3_Sub33 extends Class1_Sub3 {

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(21) int[] local21 = local13[0];
			@Pc(25) int[] local25 = local13[1];
			@Pc(29) int[] local29 = local13[2];
			for (@Pc(31) int local31 = 0; local31 < Static254.anInt4973; local31++) {
				this.method7509(arg0, local31);
				@Pc(44) int[][] local44 = this.method8199(0, Static183.anInt3824);
				local21[local31] = local44[0][Static202.anInt4052];
				local25[local31] = local44[1][Static202.anInt4052];
				local29[local31] = local44[2][Static202.anInt4052];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIB)V")
	private void method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static457.anIntArray732[arg1];
		@Pc(17) int local17 = Static392.anIntArray673[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static202.anInt4052 = arg1;
			Static183.anInt3824 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static202.anInt4052 = arg0;
			Static183.anInt3824 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static183.anInt3824 = arg1;
			Static202.anInt4052 = Static254.anInt4973 - arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static202.anInt4052 = arg1;
			Static183.anInt3824 = Static426.anInt7423 - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static202.anInt4052 = Static254.anInt4973 - arg1;
			Static183.anInt3824 = Static426.anInt7423 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static202.anInt4052 = Static254.anInt4973 - arg0;
			Static183.anInt3824 = Static426.anInt7423 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static183.anInt3824 = Static426.anInt7423 - arg1;
			Static202.anInt4052 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static183.anInt3824 = arg0;
			Static202.anInt4052 = Static254.anInt4973 - arg1;
		}
		Static183.anInt3824 &= Static109.anInt2298;
		Static202.anInt4052 &= Static184.anInt3830;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			for (@Pc(25) int local25 = 0; local25 < Static254.anInt4973; local25++) {
				this.method7509(arg0, local25);
				@Pc(38) int[] local38 = this.method8201(0, Static183.anInt3824);
				local11[local25] = local38[Static202.anInt4052];
			}
		}
		return local11;
	}
}
