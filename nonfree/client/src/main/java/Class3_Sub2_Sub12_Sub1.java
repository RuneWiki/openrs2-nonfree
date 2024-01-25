import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class3_Sub2_Sub12_Sub1 extends Class3_Sub2_Sub12 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577 && this.method3684()) {
			@Pc(32) int[] local32 = local20[0];
			@Pc(36) int[] local36 = local20[1];
			@Pc(40) int[] local40 = local20[2];
			@Pc(48) int local48 = arg0 % super.anInt4295 * super.anInt4295;
			for (@Pc(50) int local50 = 0; local50 < Static164.anInt8839; local50++) {
				@Pc(63) int local63 = super.anIntArray236[local48 + local50 % super.anInt4302];
				local40[local50] = (local63 & 0xFF) << 4;
				local36[local50] = local63 >> 4 & 0xFF0;
				local32[local50] = local63 >> 12 & 0xFF0;
			}
		}
		return local20;
	}
}
