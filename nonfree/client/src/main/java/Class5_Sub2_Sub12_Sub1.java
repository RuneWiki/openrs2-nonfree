import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class5_Sub2_Sub12_Sub1 extends Class5_Sub2_Sub12 {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819 && this.method5098()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(47) int local47 = arg0 % super.anInt5721 * super.anInt5721;
			for (@Pc(49) int local49 = 0; local49 < Static314.anInt6320; local49++) {
				@Pc(61) int local61 = super.anIntArray423[local49 % super.anInt5718 + local47];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local19;
	}
}
