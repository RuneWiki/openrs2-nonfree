import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class3_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326 && this.method525()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = super.anInt662 * (arg0 % super.anInt662);
			for (@Pc(41) int local41 = 0; local41 < Static206.anInt4182; local41++) {
				@Pc(54) int local54 = super.anIntArray63[local39 + local41 % super.anInt664];
				local31[local41] = (local54 & 0xFF) << 4;
				local27[local41] = local54 >> 4 & 0xFF0;
				local23[local41] = local54 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
