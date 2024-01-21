import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub2_Sub20_Sub1 extends Class2_Sub2_Sub20 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177 && this.method2237()) {
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			@Pc(39) int[] local39 = local19[0];
			@Pc(47) int local47 = arg0 % super.anInt2803 * super.anInt2803;
			for (@Pc(49) int local49 = 0; local49 < Static106.anInt3045; local49++) {
				@Pc(61) int local61 = super.anIntArray321[local49 % super.anInt2797 + local47];
				local35[local49] = (local61 & 0xFF) << 4;
				local31[local49] = local61 >> 4 & 0xFF0;
				local39[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
