import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405 && this.method4759()) {
			@Pc(30) int[] local30 = local15[0];
			@Pc(34) int[] local34 = local15[1];
			@Pc(42) int local42 = arg0 % this.anInt5934 * this.anInt5934;
			@Pc(46) int[] local46 = local15[2];
			for (@Pc(48) int local48 = 0; local48 < Static114.anInt1359; local48++) {
				@Pc(66) int local66 = this.anIntArray511[local42 + local48 % this.anInt5944];
				local46[local48] = (local66 & 0xFF) << 4;
				local34[local48] = local66 >> 4 & 0xFF0;
				local30[local48] = local66 >> 12 & 0xFF0;
			}
		}
		return local15;
	}
}
