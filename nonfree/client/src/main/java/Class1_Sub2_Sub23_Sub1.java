import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class1_Sub2_Sub23_Sub1 extends Class1_Sub2_Sub23 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338 && this.method3534()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = super.anInt3748 * (arg0 % super.anInt3748);
			for (@Pc(46) int local46 = 0; local46 < Static251.anInt6509; local46++) {
				@Pc(59) int local59 = super.anIntArray438[local44 + local46 % super.anInt3744];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
