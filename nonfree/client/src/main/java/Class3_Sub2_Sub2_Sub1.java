import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class3_Sub2_Sub2_Sub1 extends Class3_Sub2_Sub2 {

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233 && this.method1366()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(47) int local47 = arg0 % super.anInt1398 * super.anInt1398;
			for (@Pc(49) int local49 = 0; local49 < Static30.anInt908; local49++) {
				@Pc(61) int local61 = super.anIntArray59[local47 + local49 % super.anInt1401];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
