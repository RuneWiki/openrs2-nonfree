import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class5_Sub2_Sub20 extends Class5_Sub2 {

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			for (@Pc(25) int local25 = 0; local25 < Static195.anInt3759; local25++) {
				this.method4899(arg0, local25);
				@Pc(38) int[] local38 = this.method8945(Static30.anInt408, 0);
				local19[local25] = local38[Static676.anInt10855];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static195.anInt3759; local34++) {
				this.method4899(arg0, local34);
				@Pc(47) int[][] local47 = this.method8952(0, Static30.anInt408);
				local24[local34] = local47[0][Static676.anInt10855];
				local28[local34] = local47[1][Static676.anInt10855];
				local32[local34] = local47[2][Static676.anInt10855];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZ)V")
	private void method4899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static554.anIntArray510[arg1];
		@Pc(17) int local17 = Static369.anIntArray377[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static676.anInt10855 = arg1;
			Static30.anInt408 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static676.anInt10855 = arg0;
			Static30.anInt408 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static30.anInt408 = arg1;
			Static676.anInt10855 = Static195.anInt3759 - arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static30.anInt408 = Static195.anInt3756 - arg0;
			Static676.anInt10855 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static30.anInt408 = Static195.anInt3756 - arg0;
			Static676.anInt10855 = Static195.anInt3759 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static30.anInt408 = Static195.anInt3756 - arg1;
			Static676.anInt10855 = Static195.anInt3759 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static30.anInt408 = Static195.anInt3756 - arg1;
			Static676.anInt10855 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static30.anInt408 = arg0;
			Static676.anInt10855 = Static195.anInt3759 - arg1;
		}
		Static30.anInt408 &= Static115.anInt2379;
		Static676.anInt10855 &= Static388.anInt6925;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean910 = arg0.method7816() == 1;
		}
	}
}
