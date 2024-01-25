import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class4_Sub1_Sub18_Sub1 extends Class4_Sub1_Sub18 {

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194 && this.method8397()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = arg0 % super.anInt10284 * super.anInt10284;
			for (@Pc(49) int local49 = 0; local49 < Static376.anInt7260; local49++) {
				@Pc(61) int local61 = super.anIntArray556[local49 % super.anInt10286 + local47];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
