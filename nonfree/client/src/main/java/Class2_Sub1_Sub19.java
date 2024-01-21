import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			for (@Pc(22) int local22 = 0; local22 < Static129.anInt3118; local22++) {
				local7[local22] = Static163.anIntArray577[local22];
			}
		}
		return local7;
	}
}
