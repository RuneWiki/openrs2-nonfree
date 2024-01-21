import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			for (@Pc(22) int local22 = 0; local22 < Static86.anInt1942; local22++) {
				local16[local22] = Static165.anIntArray17[local22];
			}
		}
		return local16;
	}
}
