import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub2_Sub27_Sub1 extends Class1_Sub2_Sub27 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523 && this.method3868()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(45) int local45 = super.anInt4345 * (arg0 % super.anInt4345);
			for (@Pc(47) int local47 = 0; local47 < Static158.anInt2658; local47++) {
				@Pc(59) int local59 = super.anIntArray530[local47 % super.anInt4347 + local45];
				local37[local47] = (local59 & 0xFF) << 4;
				local33[local47] = local59 >> 4 & 0xFF0;
				local29[local47] = local59 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
