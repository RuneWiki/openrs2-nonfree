import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub6_Sub31 extends Class2_Sub6 {

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			for (@Pc(25) int local25 = 0; local25 < Static51.anInt1085; local25++) {
				this.method7725(arg0, local25);
				@Pc(38) int[] local38 = this.method8461(0, Static247.anInt3970);
				local19[local25] = local38[Static364.anInt5766];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(28) int[] local28 = local20[0];
			@Pc(32) int[] local32 = local20[1];
			@Pc(36) int[] local36 = local20[2];
			for (@Pc(38) int local38 = 0; local38 < Static51.anInt1085; local38++) {
				this.method7725(arg0, local38);
				@Pc(51) int[][] local51 = this.method8465(0, Static247.anInt3970);
				local28[local38] = local51[0][Static364.anInt5766];
				local32[local38] = local51[1][Static364.anInt5766];
				local36[local38] = local51[2][Static364.anInt5766];
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZII)V")
	private void method7725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static586.anIntArray653[arg1];
		@Pc(13) int local13 = Static564.anIntArray630[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static247.anInt3970 = arg0;
			Static364.anInt5766 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static364.anInt5766 = arg0;
			Static247.anInt3970 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static247.anInt3970 = arg1;
			Static364.anInt5766 = Static51.anInt1085 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static247.anInt3970 = Static262.anInt5589 - arg0;
			Static364.anInt5766 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static364.anInt5766 = Static51.anInt1085 - arg1;
			Static247.anInt3970 = Static262.anInt5589 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static247.anInt3970 = Static262.anInt5589 - arg1;
			Static364.anInt5766 = Static51.anInt1085 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static247.anInt3970 = Static262.anInt5589 - arg1;
			Static364.anInt5766 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static247.anInt3970 = arg0;
			Static364.anInt5766 = Static51.anInt1085 - arg1;
		}
		Static247.anInt3970 &= Static53.anInt1098;
		Static364.anInt5766 &= Static332.anInt5256;
	}
}
