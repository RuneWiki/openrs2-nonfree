import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class3_Sub1_Sub9_Sub1 extends Class3_Sub1_Sub9 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(22) int[][] local22 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1 && this.method1396()) {
			@Pc(34) int[] local34 = local22[0];
			@Pc(42) int local42 = arg0 % super.anInt1743 * super.anInt1743;
			@Pc(46) int[] local46 = local22[2];
			@Pc(50) int[] local50 = local22[1];
			for (@Pc(52) int local52 = 0; local52 < Static129.anInt3285; local52++) {
				@Pc(65) int local65 = super.anIntArray303[local42 + local52 % super.anInt1752];
				local46[local52] = (local65 & 0xFF) << 4;
				local50[local52] = local65 >> 4 & 0xFF0;
				local34[local52] = local65 >> 12 & 0xFF0;
			}
		}
		return local22;
	}
}
