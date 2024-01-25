import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class10_Sub2_Sub13_Sub1 extends Class10_Sub2_Sub13 {

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216 && this.method2028()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = arg0 % super.anInt2350 * super.anInt2350;
			for (@Pc(41) int local41 = 0; local41 < Static121.anInt2458; local41++) {
				@Pc(53) int local53 = super.anIntArray213[local39 + local41 % super.anInt2351];
				local31[local41] = (local53 & 0xFF) << 4;
				local27[local41] = local53 >> 4 & 0xFF0;
				local23[local41] = local53 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
