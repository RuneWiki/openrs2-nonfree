import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class6_Sub4_Sub6_Sub1 extends Class6_Sub4_Sub6 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54 && this.method1743()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(47) int local47 = arg0 % super.anInt1848 * super.anInt1848;
			for (@Pc(49) int local49 = 0; local49 < Static408.anInt7209; local49++) {
				@Pc(61) int local61 = super.anIntArray153[local47 + local49 % super.anInt1847];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
