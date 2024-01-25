import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub3_Sub11_Sub1 extends Class1_Sub3_Sub11 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456 && this.method3479()) {
			@Pc(33) int[] local33 = local21[0];
			@Pc(37) int[] local37 = local21[1];
			@Pc(41) int[] local41 = local21[2];
			@Pc(49) int local49 = arg0 % super.anInt3973 * super.anInt3973;
			for (@Pc(51) int local51 = 0; local51 < Static452.anInt7734; local51++) {
				@Pc(63) int local63 = super.anIntArray339[local49 + local51 % super.anInt3978];
				local41[local51] = (local63 & 0xFF) << 4;
				local37[local51] = local63 >> 4 & 0xFF0;
				local33[local51] = local63 >> 12 & 0xFF0;
			}
		}
		return local21;
	}
}
