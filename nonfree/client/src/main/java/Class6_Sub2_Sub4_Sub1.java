import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class6_Sub2_Sub4_Sub1 extends Class6_Sub2_Sub4 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230 && this.method404()) {
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			@Pc(46) int local46 = super.anInt496 * (arg0 % super.anInt496);
			for (@Pc(48) int local48 = 0; local48 < Static185.anInt4925; local48++) {
				@Pc(60) int local60 = super.anIntArray41[local48 % super.anInt488 + local46];
				local38[local48] = (local60 & 0xFF) << 4;
				local34[local48] = local60 >> 4 & 0xFF0;
				local30[local48] = local60 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
