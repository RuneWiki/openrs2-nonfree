import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class3_Sub2_Sub11_Sub1 extends Class3_Sub2_Sub11 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319 && this.method1661()) {
			@Pc(29) int[] local29 = local7[0];
			@Pc(37) int local37 = this.anInt1904 * (arg0 % this.anInt1904);
			@Pc(41) int[] local41 = local7[2];
			@Pc(45) int[] local45 = local7[1];
			for (@Pc(47) int local47 = 0; local47 < Static22.anInt421; local47++) {
				@Pc(60) int local60 = this.anIntArray190[local47 % this.anInt1907 + local37];
				local41[local47] = (local60 & 0xFF) << 4;
				local45[local47] = local60 >> 4 & 0xFF0;
				local29[local47] = local60 >> 12 & 0xFF0;
			}
		}
		return local7;
	}
}
