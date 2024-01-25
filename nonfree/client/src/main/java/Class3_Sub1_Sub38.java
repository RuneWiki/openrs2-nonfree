import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class3_Sub1_Sub38 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
	private void method5393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static187.anIntArray379[arg1];
		@Pc(13) int local13 = Static351.anIntArray371[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static48.anInt1055 = arg0;
			Static189.anInt3426 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static48.anInt1055 = arg1;
			Static189.anInt3426 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static189.anInt3426 = Static238.anInt4221 - arg0;
			Static48.anInt1055 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static48.anInt1055 = Static220.anInt3914 - arg0;
			Static189.anInt3426 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static48.anInt1055 = Static220.anInt3914 - arg0;
			Static189.anInt3426 = Static238.anInt4221 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static48.anInt1055 = Static220.anInt3914 - arg1;
			Static189.anInt3426 = Static238.anInt4221 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static48.anInt1055 = Static220.anInt3914 - arg1;
			Static189.anInt3426 = arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static189.anInt3426 = Static238.anInt4221 - arg1;
			Static48.anInt1055 = arg0;
		}
		Static48.anInt1055 &= Static300.anInt5187;
		Static189.anInt3426 &= Static171.anInt3000;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static238.anInt4221; local34++) {
				this.method5393(arg0, local34);
				@Pc(47) int[][] local47 = this.method5551(0, Static48.anInt1055);
				local24[local34] = local47[0][Static189.anInt3426];
				local28[local34] = local47[1][Static189.anInt3426];
				local32[local34] = local47[2][Static189.anInt3426];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			for (@Pc(19) int local19 = 0; local19 < Static238.anInt4221; local19++) {
				this.method5393(arg0, local19);
				@Pc(32) int[] local32 = this.method5547(Static48.anInt1055, 0);
				local13[local19] = local32[Static189.anInt3426];
			}
		}
		return local13;
	}
}
