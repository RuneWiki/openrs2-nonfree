import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class4_Sub3_Sub17_Sub1 extends Class4_Sub3_Sub17 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189 && this.method4947()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = super.anInt5971 * (arg0 % super.anInt5971);
			for (@Pc(49) int local49 = 0; local49 < Static304.anInt5637; local49++) {
				@Pc(62) int local62 = super.anIntArray486[local47 + local49 % super.anInt5972];
				local39[local49] = (local62 & 0xFF) << 4;
				local35[local49] = local62 >> 4 & 0xFF0;
				local31[local49] = local62 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
