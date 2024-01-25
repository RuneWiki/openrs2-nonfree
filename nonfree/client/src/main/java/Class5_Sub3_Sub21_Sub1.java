import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class5_Sub3_Sub21_Sub1 extends Class5_Sub3_Sub21 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83 && this.method3261()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = super.anInt3613 * (arg0 % super.anInt3613);
			for (@Pc(41) int local41 = 0; local41 < Static7.anInt129; local41++) {
				@Pc(53) int local53 = super.anIntArray360[local41 % super.anInt3602 + local39];
				local31[local41] = (local53 & 0xFF) << 4;
				local27[local41] = local53 >> 4 & 0xFF0;
				local23[local41] = local53 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
