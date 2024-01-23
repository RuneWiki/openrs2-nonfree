import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub1_Sub13_Sub1 extends Class1_Sub1_Sub13 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221 && this.method2041()) {
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[0];
			@Pc(35) int local35 = super.anInt2606 * (arg0 % super.anInt2606);
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static11.anInt294; local41++) {
				@Pc(54) int local54 = super.anIntArray234[local35 + local41 % super.anInt2601];
				local39[local41] = (local54 & 0xFF) << 4;
				local23[local41] = local54 >> 4 & 0xFF0;
				local27[local41] = local54 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
