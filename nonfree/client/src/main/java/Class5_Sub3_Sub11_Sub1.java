import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class5_Sub3_Sub11_Sub1 extends Class5_Sub3_Sub11 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592 && this.method6603()) {
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			@Pc(47) int local47 = super.anInt7582 * (arg0 % super.anInt7582);
			for (@Pc(49) int local49 = 0; local49 < Static7.anInt102; local49++) {
				@Pc(61) int local61 = super.anIntArray448[local47 + local49 % super.anInt7584];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local17;
	}
}
