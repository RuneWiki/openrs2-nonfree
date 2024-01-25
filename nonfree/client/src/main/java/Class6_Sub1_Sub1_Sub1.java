import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class6_Sub1_Sub1_Sub1 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81 && this.method170()) {
			@Pc(27) int[] local27 = local15[0];
			@Pc(31) int[] local31 = local15[1];
			@Pc(35) int[] local35 = local15[2];
			@Pc(43) int local43 = super.anInt154 * (arg0 % super.anInt154);
			for (@Pc(45) int local45 = 0; local45 < Static479.anInt8231; local45++) {
				@Pc(57) int local57 = super.anIntArray3[local45 % super.anInt156 + local43];
				local35[local45] = (local57 & 0xFF) << 4;
				local31[local45] = local57 >> 4 & 0xFF0;
				local27[local45] = local57 >> 12 & 0xFF0;
			}
		}
		return local15;
	}
}
