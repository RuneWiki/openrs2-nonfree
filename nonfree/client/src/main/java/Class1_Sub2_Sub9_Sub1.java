import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub2_Sub9_Sub1 extends Class1_Sub2_Sub9 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54 && this.method628()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(40) int local40 = arg0 % super.anInt821 * super.anInt821;
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static22.anInt596; local46++) {
				@Pc(59) int local59 = super.anIntArray53[local40 + local46 % super.anInt817];
				local44[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
