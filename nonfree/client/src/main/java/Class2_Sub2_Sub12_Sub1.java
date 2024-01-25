import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class2_Sub2_Sub12_Sub1 extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180 && this.method4271()) {
			@Pc(30) int[] local30 = local18[0];
			@Pc(34) int[] local34 = local18[1];
			@Pc(38) int[] local38 = local18[2];
			@Pc(46) int local46 = super.anInt5361 * (arg0 % super.anInt5361);
			for (@Pc(48) int local48 = 0; local48 < Static398.anInt6955; local48++) {
				@Pc(61) int local61 = super.anIntArray456[local46 + local48 % super.anInt5362];
				local38[local48] = (local61 & 0xFF) << 4;
				local34[local48] = local61 >> 4 & 0xFF0;
				local30[local48] = local61 >> 12 & 0xFF0;
			}
		}
		return local18;
	}
}
