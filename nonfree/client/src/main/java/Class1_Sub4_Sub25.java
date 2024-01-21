import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class1_Sub4_Sub25 extends Class1_Sub4 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			for (@Pc(17) int local17 = 0; local17 < Static73.anInt1888; local17++) {
				local11[local17] = Static171.anIntArray421[local17];
			}
		}
		return local11;
	}
}
