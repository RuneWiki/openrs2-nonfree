import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class3_Sub2_Sub22_Sub1 extends Class3_Sub2_Sub22 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358 && this.method6745()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = super.anInt7778 * (arg0 % super.anInt7778);
			for (@Pc(41) int local41 = 0; local41 < Static491.anInt8519; local41++) {
				@Pc(54) int local54 = super.anIntArray477[local39 + local41 % super.anInt7777];
				local31[local41] = (local54 & 0xFF) << 4;
				local27[local41] = local54 >> 4 & 0xFF0;
				local23[local41] = local54 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
