import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class6_Sub1_Sub21_Sub1 extends Class6_Sub1_Sub21 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(22) int[][] local22 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429 && this.method5487()) {
			@Pc(34) int[] local34 = local22[0];
			@Pc(38) int[] local38 = local22[1];
			@Pc(42) int[] local42 = local22[2];
			@Pc(50) int local50 = arg0 % super.anInt6085 * super.anInt6085;
			for (@Pc(52) int local52 = 0; local52 < Static299.anInt5659; local52++) {
				@Pc(64) int local64 = super.anIntArray694[local52 % super.anInt6088 + local50];
				local42[local52] = (local64 & 0xFF) << 4;
				local38[local52] = local64 >> 4 & 0xFF0;
				local34[local52] = local64 >> 12 & 0xFF0;
			}
		}
		return local22;
	}
}
