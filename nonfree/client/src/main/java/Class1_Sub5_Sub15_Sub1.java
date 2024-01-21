import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class1_Sub5_Sub15_Sub1 extends Class1_Sub5_Sub15 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90 && this.method1571()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(47) int local47 = super.anInt2052 * (arg0 % super.anInt2052);
			for (@Pc(49) int local49 = 0; local49 < Static177.anInt4018; local49++) {
				@Pc(61) int local61 = super.anIntArray231[local47 + local49 % super.anInt2047];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
