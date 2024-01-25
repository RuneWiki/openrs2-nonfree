import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class5_Sub1_Sub9_Sub1 extends Class5_Sub1_Sub9 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662 && this.method3286()) {
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			@Pc(47) int local47 = super.anInt3765 * (arg0 % super.anInt3765);
			for (@Pc(49) int local49 = 0; local49 < Static648.anInt9588; local49++) {
				@Pc(61) int local61 = super.anIntArray213[local49 % super.anInt3770 + local47];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local17;
	}
}
