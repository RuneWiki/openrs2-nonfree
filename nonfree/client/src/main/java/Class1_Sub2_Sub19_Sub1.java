import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub2_Sub19_Sub1 extends Class1_Sub2_Sub19 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175 && this.method2546()) {
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[0];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = arg0 % super.anInt3331 * super.anInt3331;
			for (@Pc(49) int local49 = 0; local49 < Static105.anInt2391; local49++) {
				@Pc(61) int local61 = super.anIntArray430[local49 % super.anInt3332 + local47];
				local39[local49] = (local61 & 0xFF) << 4;
				local31[local49] = local61 >> 4 & 0xFF0;
				local35[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
