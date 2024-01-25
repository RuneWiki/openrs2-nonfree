import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class1_Sub3_Sub6_Sub1 extends Class1_Sub3_Sub6 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439 && this.method1892()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(47) int local47 = super.anInt1954 * (arg0 % super.anInt1954);
			for (@Pc(49) int local49 = 0; local49 < Static236.anInt4609; local49++) {
				@Pc(61) int local61 = super.anIntArray167[local47 + local49 % super.anInt1952];
				local39[local49] = (local61 & 0xFF) << 4;
				local35[local49] = local61 >> 4 & 0xFF0;
				local31[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
