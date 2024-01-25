import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class1_Sub2_Sub23_Sub1 extends Class1_Sub2_Sub23 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401 && this.method5799()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(45) int local45 = super.anInt7529 * (arg0 % super.anInt7529);
			for (@Pc(47) int local47 = 0; local47 < Static410.anInt7198; local47++) {
				@Pc(60) int local60 = super.anIntArray565[local45 + local47 % super.anInt7523];
				local37[local47] = (local60 & 0xFF) << 4;
				local33[local47] = local60 >> 4 & 0xFF0;
				local29[local47] = local60 >> 12 & 0xFF0;
			}
		}
		return local17;
	}
}
