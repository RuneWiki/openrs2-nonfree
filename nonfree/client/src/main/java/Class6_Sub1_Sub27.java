import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class6_Sub1_Sub27 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static53.anInt1787; local34++) {
				this.method6523(arg0, local34);
				@Pc(47) int[][] local47 = this.method8725(Static259.anInt6991, 0);
				local24[local34] = local47[0][Static386.anInt7278];
				local28[local34] = local47[1][Static386.anInt7278];
				local32[local34] = local47[2][Static386.anInt7278];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			for (@Pc(22) int local22 = 0; local22 < Static53.anInt1787; local22++) {
				this.method6523(arg0, local22);
				@Pc(37) int[] local37 = this.method8731(Static259.anInt6991, 0);
				local16[local22] = local37[Static386.anInt7278];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean842 = arg1.method8246() == 1;
		}
	}

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "(III)V")
	private void method6523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static12.anIntArray15[arg1];
		@Pc(13) int local13 = Static603.anIntArray549[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static259.anInt6991 = arg0;
			Static386.anInt7278 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static259.anInt6991 = arg1;
			Static386.anInt7278 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static259.anInt6991 = arg1;
			Static386.anInt7278 = Static53.anInt1787 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static386.anInt7278 = arg1;
			Static259.anInt6991 = Static123.anInt3099 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static386.anInt7278 = Static53.anInt1787 - arg1;
			Static259.anInt6991 = Static123.anInt3099 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static386.anInt7278 = Static53.anInt1787 - arg0;
			Static259.anInt6991 = Static123.anInt3099 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static259.anInt6991 = Static123.anInt3099 - arg1;
			Static386.anInt7278 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static386.anInt7278 = Static53.anInt1787 - arg1;
			Static259.anInt6991 = arg0;
		}
		Static259.anInt6991 &= Static117.anInt3013;
		Static386.anInt7278 &= Static564.anInt9697;
	}
}
