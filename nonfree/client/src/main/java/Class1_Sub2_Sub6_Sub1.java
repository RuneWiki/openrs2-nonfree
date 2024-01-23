import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub2_Sub6_Sub1 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344 && this.method964()) {
			@Pc(27) int[] local27 = local13[1];
			@Pc(35) int local35 = arg0 % this.anInt1086 * this.anInt1086;
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[2];
			for (@Pc(45) int local45 = 0; local45 < Static299.anInt5670; local45++) {
				@Pc(63) int local63 = this.anIntArray92[local35 + local45 % this.anInt1088];
				local43[local45] = (local63 & 0xFF) << 4;
				local27[local45] = local63 >> 4 & 0xFF0;
				local39[local45] = local63 >> 12 & 0xFF0;
			}
		}
		return local13;
	}
}
