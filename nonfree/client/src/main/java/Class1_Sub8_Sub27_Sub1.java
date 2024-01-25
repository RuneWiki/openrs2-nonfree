import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub8_Sub27_Sub1 extends Class1_Sub8_Sub27 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246 && this.method5505()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(39) int local39 = super.anInt7232 * (arg0 % super.anInt7232);
			for (@Pc(41) int local41 = 0; local41 < Static18.anInt439; local41++) {
				@Pc(53) int local53 = super.anIntArray690[local39 + local41 % super.anInt7233];
				local31[local41] = (local53 & 0xFF) << 4;
				local27[local41] = local53 >> 4 & 0xFF0;
				local23[local41] = local53 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
