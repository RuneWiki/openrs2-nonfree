import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			for (@Pc(24) int local24 = 0; local24 < Static22.anInt596; local24++) {
				local18[local24] = Static167.anIntArray417[local24];
			}
		}
		return local18;
	}
}
