import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class3_Sub5_Sub16_Sub1 extends Class3_Sub5_Sub16 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160 && this.method2209()) {
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[0];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = arg0 % super.anInt3069 * super.anInt3069;
			for (@Pc(46) int local46 = 0; local46 < Static104.anInt2195; local46++) {
				@Pc(59) int local59 = super.anIntArray393[local44 + local46 % super.anInt3075];
				local36[local46] = (local59 & 0xFF) << 4;
				local28[local46] = local59 >> 4 & 0xFF0;
				local32[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
