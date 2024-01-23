import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub3_Sub3_Sub1 extends Class1_Sub3_Sub3 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144 && this.method1449()) {
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			@Pc(49) int local49 = arg0 % this.anInt1862 * this.anInt1862;
			for (@Pc(51) int local51 = 0; local51 < Static227.anInt4511; local51++) {
				@Pc(65) int local65 = this.anIntArray172[local49 + local51 % this.anInt1867];
				local41[local51] = (local65 & 0xFF) << 4;
				local37[local51] = local65 >> 4 & 0xFF0;
				local33[local51] = local65 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
