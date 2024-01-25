import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class14_Sub7_Sub29_Sub1 extends Class14_Sub7_Sub29 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655 && this.method7427()) {
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(51) int local51 = super.anInt8517 * (arg0 % super.anInt8517);
			for (@Pc(53) int local53 = 0; local53 < Static613.anInt10114; local53++) {
				@Pc(65) int local65 = super.anIntArray436[local53 % super.anInt8514 + local51];
				local43[local53] = (local65 & 0xFF) << 4;
				local39[local53] = local65 >> 4 & 0xFF0;
				local35[local53] = local65 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
