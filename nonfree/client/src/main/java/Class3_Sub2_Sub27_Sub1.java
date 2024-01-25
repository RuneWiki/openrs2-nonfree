import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class3_Sub2_Sub27_Sub1 extends Class3_Sub2_Sub27 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75 && this.method8714()) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			@Pc(43) int local43 = arg0 % super.anInt10416 * super.anInt10416;
			for (@Pc(45) int local45 = 0; local45 < Static636.anInt10302; local45++) {
				@Pc(57) int local57 = super.anIntArray587[local45 % super.anInt10415 + local43];
				local35[local45] = (local57 & 0xFF) << 4;
				local31[local45] = local57 >> 4 & 0xFF0;
				local27[local45] = local57 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
