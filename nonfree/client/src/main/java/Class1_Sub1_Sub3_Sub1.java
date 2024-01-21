import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166 && this.method2346()) {
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			@Pc(31) int[] local31 = local11[0];
			@Pc(39) int local39 = super.anInt3170 * (arg0 % super.anInt3170);
			for (@Pc(41) int local41 = 0; local41 < Static107.anInt2321; local41++) {
				@Pc(54) int local54 = super.anIntArray281[local39 + local41 % super.anInt3176];
				local27[local41] = (local54 & 0xFF) << 4;
				local23[local41] = local54 >> 4 & 0xFF0;
				local31[local41] = local54 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
