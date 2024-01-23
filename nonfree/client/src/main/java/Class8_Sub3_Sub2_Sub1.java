import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class8_Sub3_Sub2_Sub1 extends Class8_Sub3_Sub2 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451 && this.method257()) {
			@Pc(31) int[] local31 = local18[0];
			@Pc(35) int[] local35 = local18[1];
			@Pc(39) int[] local39 = local18[2];
			@Pc(47) int local47 = arg0 % this.anInt348 * this.anInt348;
			for (@Pc(49) int local49 = 0; local49 < Static239.anInt4789; local49++) {
				@Pc(63) int local63 = this.anIntArray13[local47 + local49 % this.anInt353];
				local39[local49] = (local63 & 0xFF) << 4;
				local35[local49] = local63 >> 4 & 0xFF0;
				local31[local49] = local63 >> 12 & 0xFF0;
			}
		}
		return local18;
	}
}
