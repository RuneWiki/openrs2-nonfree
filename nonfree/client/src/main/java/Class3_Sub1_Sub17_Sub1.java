import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class3_Sub1_Sub17_Sub1 extends Class3_Sub1_Sub17 {

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587 && this.method4776()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(47) int local47 = super.anInt5802 * (arg0 % super.anInt5802);
			for (@Pc(49) int local49 = 0; local49 < Static131.anInt2935; local49++) {
				@Pc(61) int local61 = super.anIntArray347[local49 % super.anInt5803 + local47];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
