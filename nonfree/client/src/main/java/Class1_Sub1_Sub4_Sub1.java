import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134 && this.method3358()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[2];
			@Pc(31) int[] local31 = local11[1];
			@Pc(39) int local39 = super.anInt4325 * (arg0 % super.anInt4325);
			for (@Pc(41) int local41 = 0; local41 < Static157.anInt3431; local41++) {
				@Pc(53) int local53 = super.anIntArray327[local39 + local41 % super.anInt4319];
				local27[local41] = (local53 & 0xFF) << 4;
				local31[local41] = local53 >> 4 & 0xFF0;
				local23[local41] = local53 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
