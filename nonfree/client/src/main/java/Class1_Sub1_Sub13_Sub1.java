import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class1_Sub1_Sub13_Sub1 extends Class1_Sub1_Sub13 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76 && this.method5961()) {
			@Pc(30) int[] local30 = local13[0];
			@Pc(34) int[] local34 = local13[1];
			@Pc(38) int[] local38 = local13[2];
			@Pc(46) int local46 = super.anInt7495 * (arg0 % super.anInt7495);
			for (@Pc(48) int local48 = 0; local48 < Static279.anInt4906; local48++) {
				@Pc(61) int local61 = super.anIntArray575[local46 + local48 % super.anInt7491];
				local38[local48] = (local61 & 0xFF) << 4;
				local34[local48] = local61 >> 4 & 0xFF0;
				local30[local48] = local61 >> 12 & 0xFF0;
			}
		}
		return local13;
	}
}
