import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class3_Sub1_Sub31_Sub1 extends Class3_Sub1_Sub31 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87 && this.method2573()) {
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[0];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = arg0 % super.anInt3562 * super.anInt3562;
			for (@Pc(49) int local49 = 0; local49 < Static141.anInt3261; local49++) {
				@Pc(61) int local61 = super.anIntArray405[local49 % super.anInt3560 + local47];
				local39[local49] = (local61 & 0xFF) << 4;
				local31[local49] = local61 >> 4 & 0xFF0;
				local35[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
