import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class6_Sub8_Sub8_Sub1 extends Class6_Sub8_Sub8 {

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331 && this.method3631()) {
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			@Pc(47) int local47 = super.anInt3930 * (arg0 % super.anInt3930);
			for (@Pc(49) int local49 = 0; local49 < Static83.anInt1268; local49++) {
				@Pc(62) int local62 = super.anIntArray205[local47 + local49 % super.anInt3926];
				local39[local49] = (local62 & 0xFF) << 4;
				local35[local49] = local62 >> 4 & 0xFF0;
				local31[local49] = local62 >> 12 & 0xFF0;
			}
		}
		return local17;
	}
}
