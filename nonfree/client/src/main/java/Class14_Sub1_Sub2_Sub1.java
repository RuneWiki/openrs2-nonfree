import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class14_Sub1_Sub2_Sub1 extends Class14_Sub1_Sub2 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571 && this.method7753()) {
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			@Pc(46) int local46 = arg0 % super.anInt9376 * super.anInt9376;
			for (@Pc(48) int local48 = 0; local48 < Static371.anInt6835; local48++) {
				@Pc(60) int local60 = super.anIntArray690[local48 % super.anInt9383 + local46];
				local38[local48] = (local60 & 0xFF) << 4;
				local34[local48] = local60 >> 4 & 0xFF0;
				local30[local48] = local60 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
