import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class4_Sub2_Sub16_Sub1 extends Class4_Sub2_Sub16 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154 && this.method4711()) {
			@Pc(32) int[] local32 = local13[0];
			@Pc(36) int[] local36 = local13[1];
			@Pc(40) int[] local40 = local13[2];
			@Pc(48) int local48 = super.anInt5965 * (arg0 % super.anInt5965);
			for (@Pc(50) int local50 = 0; local50 < Static417.anInt5248; local50++) {
				@Pc(62) int local62 = super.anIntArray324[local48 + local50 % super.anInt5962];
				local40[local50] = (local62 & 0xFF) << 4;
				local36[local50] = local62 >> 4 & 0xFF0;
				local32[local50] = local62 >> 12 & 0xFF0;
			}
		}
		return local13;
	}
}
