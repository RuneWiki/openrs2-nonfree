import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class3_Sub9_Sub3_Sub1 extends Class3_Sub9_Sub3 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748 && this.method8196()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = arg0 % super.anInt9371 * super.anInt9371;
			for (@Pc(41) int local41 = 0; local41 < Static62.anInt1251; local41++) {
				@Pc(54) int local54 = super.anIntArray808[local39 + local41 % super.anInt9373];
				local31[local41] = (local54 & 0xFF) << 4;
				local27[local41] = local54 >> 4 & 0xFF0;
				local23[local41] = local54 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
