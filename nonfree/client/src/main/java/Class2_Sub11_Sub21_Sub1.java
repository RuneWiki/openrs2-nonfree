import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class2_Sub11_Sub21_Sub1 extends Class2_Sub11_Sub21 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846 && this.method7240()) {
			@Pc(35) int[] local35 = local21[0];
			@Pc(39) int[] local39 = local21[1];
			@Pc(43) int[] local43 = local21[2];
			@Pc(51) int local51 = super.anInt8108 * (arg0 % super.anInt8108);
			for (@Pc(53) int local53 = 0; local53 < Static301.anInt10214; local53++) {
				@Pc(65) int local65 = super.anIntArray579[local53 % super.anInt8106 + local51];
				local43[local53] = (local65 & 0xFF) << 4;
				local39[local53] = local65 >> 4 & 0xFF0;
				local35[local53] = local65 >> 12 & 0xFF0;
			}
		}
		return local21;
	}
}
