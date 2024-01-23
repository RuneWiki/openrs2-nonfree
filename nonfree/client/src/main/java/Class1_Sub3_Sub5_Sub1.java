import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub3_Sub5_Sub1 extends Class1_Sub3_Sub5 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48 && this.method787()) {
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[0];
			@Pc(43) int local43 = super.anInt1181 * (arg0 % super.anInt1181);
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static110.anInt2934; local49++) {
				@Pc(61) int local61 = super.anIntArray92[local49 % super.anInt1175 + local43];
				local47[local49] = (local61 & 0xFF) << 4;
				local31[local49] = local61 >> 4 & 0xFF0;
				local35[local49] = local61 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
