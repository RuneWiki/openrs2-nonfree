import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class1_Sub4_Sub22_Sub1 extends Class1_Sub4_Sub22 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47 && this.method4275()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = arg0 % super.anInt5159 * super.anInt5159;
			for (@Pc(41) int local41 = 0; local41 < Static66.anInt1511; local41++) {
				@Pc(54) int local54 = super.anIntArray445[local39 + local41 % super.anInt5152];
				local31[local41] = (local54 & 0xFF) << 4;
				local27[local41] = local54 >> 4 & 0xFF0;
				local23[local41] = local54 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
